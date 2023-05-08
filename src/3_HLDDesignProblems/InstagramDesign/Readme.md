# Instagram Design

# Requirements

## In Scope
The application should be able to support the following requirements.
- Users should be able to upload photos and view the photos they have uploaded.
- Users should be able to follow other users.
- Users can view feeds containing posts from the users they follow.
- Users should be able to like and comment the posts.

## Out of Scope
- Sending and receiving messages from other users. 
- Generating machine learning based personalized recommendations to discover new people, photos, videos, and stories relevant one’s interest.

# Ball-mark estimations
- [Calculator link](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=230262262)

# Tech Decisions

| Feature                              | Decision                                                                                                                                               |
|--------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| Images Storage                       | [Amazon S3](../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md) or [HDFS](../../1_HLDDesignComponents/5_BigDataComponents/BatchProcessing/ApacheHadoop/ApacheHDFS.md) |
| [Images MetaData]()                  | Postgres (since we need joins)                                                                                                                         |
| Partitioning Key for images metadata | PhotoID                                                                                                                                                |
| User Activity - Data Entities Store  | [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md)                                                        |
| User Activity - RelationShip Store   | [Neo4j](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Neo4j.md)                                                                                                                            |
| User Activity - Data Streaming       | [Amazon Kinesis](../../2_AWSComponents/10_BigDataComponents/StreamProcessing/AmazonKinesis/Readme.md)                                                                |
| App Servers                          | Separate app servers for READ and WRITE. (Since read-write ratio is 100:1)                                                                 |

# Reliability and Redundancy
- If we want to have [high availability](../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) of the system, we need to have multiple replicas of services running in the system so that even if a few services die down, the system remains available and running. 
- Redundancy removes the single point of failure in the system.

# Tech Stack (on AWS)

| Service                                                                                 | Remarks                                                                                                                                                                                                                                                                       |
|-----------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Amazon EC2 Instances - High-CPU Extra-Large machines                                    | Many thousands of instances in EC2 are running, with new ones spinning up every day. Instagram's Load is mostly CPU intensive.                                                                                                                                                |
| Amazon Elastic Load Balancer                                                            | Load Balancing                                                                                                                                                                                                                                                                |
| Amazon Route53                                                                          | DNS Service                                                                                                                                                                                                                                                                   |
| PostgreSQL                                                                              | [Our main shard cluster](https://instagram-engineering.com/sharding-ids-at-instagram-1cf5a71e5a5c) involves [12 Quadruple Extra-Large memory instances (db.m5.4xlarge - 16 vCPUs, 64GB Memory)](https://instances.vantage.sh/rds/) (and twelve replicas in a different zone.) |
| Amazon S3                                                                               | The photos themselves go straight to Amazon S3, which currently stores several terabytes of photo data for us.                                                                                                                                                                |
| Amazon CloudFront                                                                       | We use Amazon CloudFront as our CDN, which helps with image load times from users around the world (like in Japan, our second most-popular country).                                                                                                                          |
| Redis - Main feed, our activity feed, our sessions system                               | All of Redis’ data needs to fit in memory, so we end up running several Quadruple Extra-Large Memory instances for Redis, too, and occasionally shard across a few Redis instances for any given subsystem.                                                                   |
| Apache Solr                                                                             | Go-Search API                                                                                                                                                                                                                                                                 |
| PagerDuty                                                                               | Incident Response Management                                                                                                                                                                                                                                                  |
| Pingdom                                                                                 | External monitoring of the service                                                                                                                                                                                                                                            |
| [Amazon Kinesis](../../2_AWSComponents/10_BigDataComponents/StreamProcessing/AmazonKinesis/Readme.md) | Data Streaming                                                                                                                                                                                                                                                                |

Read more
- [What Powers Instagram: Hundreds of Instances, Dozens of Technologies?](https://instagram-engineering.com/what-powers-instagram-hundreds-of-instances-dozens-of-technologies-adf2e22da2ad)
- [The Instagram Architecture Facebook Bought for a Cool Billion Dollars](http://highscalability.com/blog/2012/4/9/the-instagram-architecture-facebook-bought-for-a-cool-billio.html)

Note
- In 2014, after Facebook bought instagram, it moved its infrastructure from AWS to Facebook own servers. (for easy integration etc.)
- [Read more - Migrating From AWS to FB](https://instagram-engineering.com/migrating-from-aws-to-fb-86b16f6766e2)

# Images MetaData - DB Schema
- We need to store data about users, their uploaded photos, and the people they follow.

Photo table
- PhotoID (key)
- UserID
- PhotoPath
- PhotoLat
- PhotoLong
- UserLat
- UserLong
- CreationDate

Users
- Name
- Email
- DateOfBirth
- CreationDate
- LastLogin

User Follow Table
- FollowerID
- FolloweeID


![](https://cdn-images-1.medium.com/max/533/1*MSRy_GMUFaYK7gwaKUSl7g.png)

## Data Sharding

### Partitioning based on UserID
- Let’s assume we shard based on the ‘UserID’ so that we can keep all photos of a user on the same shard.
- If one DB shard is 1TB, we will need four shards to store 3.7TB of data.
- Let’s assume, for better performance and scalability, we keep 10 shards.
- So we’ll find the shard number by UserID % 10 and then store the data there.
- To uniquely identify any photo in our system, we can append the shard number with each PhotoID.

What are the different issues with "Partitioning based on UserID"?
- How would we handle hot users? Several people follow such hot users, and a lot of other people see any photo they upload.
- Some users will have a lot of photos compared to others, thus making a non-uniform distribution of storage.
- What if we cannot store all pictures of a user on one shard? If we distribute photos of a user onto multiple shards, will it cause higher latencies?
- Storing all photos of a user on one shard can cause issues like unavailability of all the user’s data if that shard is down or higher latency if it is serving high load etc.

### Partitioning based on PhotoID
- If we can generate unique PhotoIDs first and then find a shard number through “PhotoID % 10”, the above problems will have been solved.

#### PhotoID-Server
- We dedicate a separate database instance to generate auto-incrementing IDs. If our PhotoID can fit into 64 bits, we can define a table containing only a 64 bit ID field.
- Whenever we would like to add a photo in our system, we can insert a new row in this table and take that ID to be our PhotoID of the new photo.

# NewsFeed 
- We can have dedicated servers that are continuously generating users’ News Feeds and storing them in a ‘UserNewsFeed’ table.

## Push vs Pull model
- For celebrity user (user with large number of followers), use Pull model.
- For normal user, use Push model (long polling or websocket).

# :star: User Activity Service
- We have chosen this NoSQL based solution like [Neo4j](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Neo4j.md) for relationship, [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) for entity records, over relational databases as it provides the scalability to have hierarchies which go beyond two levels and extensibility due to the schema-less behavior of NoSQL data storage.
- [Read more](http://highscalability.com/blog/2022/1/11/designing-instagram.html)

## Graph Data Models
- The reason we have chosen a [Neo4j](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Neo4j.md) graph data-model is that our data will contain complex relationships between data entities such as users, posts, and comments as nodes of the graph.
- After that, we will use edges of the graph to store relationships such as follows, likes, comments, and so forth.

![](https://live.staticflickr.com/65535/51813972019_ddfbe16c97_z.jpg)

## Wide-column Data Models
- We will use columnar databases like [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) to store information like user feeds, activities, and counters.
- Each row will contain feed/activity information of the user. 
- We can also have a TTL based functionality to evict older posts.
- [Read more - Cassandra at Instagram 2016 (Dikang Gu, Facebook) | Cassandra Summit 2016](https://www.youtube.com/watch?v=_BfMH4GQWnk)

````
User_id -> List
````

![](https://live.staticflickr.com/65535/51813632951_0f0f673287_w.jpg)

## Streaming Data Model
- We can use cloud technologies such as [Amazon Kinesis](../../2_AWSComponents/10_BigDataComponents/StreamProcessing/AmazonKinesis/Readme.md) or Azure Stream Analytics for collecting, processing, and analyzing real-time, streaming data to get timely insights and react quickly to new information (e.g. a new like, comment, etc.).

![](https://live.staticflickr.com/65535/51814358575_69266135f8_z.jpg)

# References
- [Instagram System Architecture](https://medium.com/interviewnoodle/instagram-system-architecture-fdbec22e48ee)
- [Design Instagram](https://www.enjoyalgorithms.com/blog/design-instagram)
- [CodeKarle - Facebook System Design | Instagram System Design | System Design Interview Question](https://www.youtube.com/watch?v=9-hjBGxuiEs)
- https://www.educative.io/courses/grokking-the-system-design-interview/m2yDVZnQ8lG
