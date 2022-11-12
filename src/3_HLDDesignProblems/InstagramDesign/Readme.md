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

## Images MetaData - DB Schema
- Photo table
- User table
- User Follow Table

## Partitioning based on PhotoID

## Tech Decisions
- Images Storage - Amazon S3 or HDFS
- Images MetaData - Postgres (since we need joins)

## NewsFeed - Push vs Pull model - Hybrid
- For celebrity user, use Pull model
- For normal user, use Push model (long polling or websocket)

# :star: User Activity Service
- We have chosen this NoSQL based solution like [Neo4j](https://neo4j.com/) for relationship, [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) for entity records, over relational databases as it provides the scalability to have hierarchies which go beyond two levels and extensibility due to the schema-less behavior of NoSQL data storage.
- [Read more](http://highscalability.com/blog/2022/1/11/designing-instagram.html)

## Graph Data Models
- The reason we have chosen a [Neo4j](https://neo4j.com/) graph data-model is that our data will contain complex relationships between data entities such as users, posts, and comments as nodes of the graph.
- After that, we will use edges of the graph to store relationships such as follows, likes, comments, and so forth.

![](https://live.staticflickr.com/65535/51813972019_ddfbe16c97_z.jpg)

## Columnar Data Models
- We will use columnar databases like [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) to store information like user feeds, activities, and counters.
- Each row will contain feed/activity information of the user. 
- We can also have a TTL based functionality to evict older posts.
- [Read more - Cassandra at Instagram 2016 (Dikang Gu, Facebook) | Cassandra Summit 2016](https://www.youtube.com/watch?v=_BfMH4GQWnk)

````
User_id -> List
````

![](https://live.staticflickr.com/65535/51813632951_0f0f673287_w.jpg)

## Streaming Data Model
- We can use cloud technologies such as Amazon Kinesis or Azure Stream Analytics for collecting, processing, and analyzing real-time, streaming data to get timely insights and react quickly to new information (e.g. a new like, comment, etc.).

![](https://live.staticflickr.com/65535/51814358575_69266135f8_z.jpg)

# Tech Stack

| Service                                                   | Remarks                                                                                                                                                                                                                                        |
|-----------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Amazon EC2 Instances - High-CPU Extra-Large machines      | Many thousands of instances in EC2 are running, with new ones spinning up every day. Instagram's Load is mostly CPU intensive.                                                                                                                 |
| Amazon Elastic Load Balancer                              | Load Balancing                                                                                                                                                                                                                                 |
| Amazon Route53                                            | DNS Service                                                                                                                                                                                                                                    |
| PostgreSQL                                                | [Our main shard cluster](https://instagram-engineering.com/sharding-ids-at-instagram-1cf5a71e5a5c) involves [12 Quadruple Extra-Large memory instances](https://aws.amazon.com/rds/instance-types/) (and twelve replicas in a different zone.) |
| Amazon S3                                                 | The photos themselves go straight to Amazon S3, which currently stores several terabytes of photo data for us.                                                                                                                                 |
| Amazon CloudFront                                         | We use Amazon CloudFront as our CDN, which helps with image load times from users around the world (like in Japan, our second most-popular country).                                                                                           |
| Redis - Main feed, our activity feed, our sessions system | All of Redis’ data needs to fit in memory, so we end up running several Quadruple Extra-Large Memory instances for Redis, too, and occasionally shard across a few Redis instances for any given subsystem.                                    |
| Apache Solr                                               | Go-Search API                                                                                                                                                                                                                                  |
| PagerDuty                                                 | Incident Response Management                                                                                                                                                                                                                   |
| Pingdom                                                   | External monitoring of the service                                                                                                                                                                                                             |
| Amazon Kinesis                                            | Data Streaming                                                                                                                                                                                                                                 |

Read more
- [What Powers Instagram: Hundreds of Instances, Dozens of Technologies?](https://instagram-engineering.com/what-powers-instagram-hundreds-of-instances-dozens-of-technologies-adf2e22da2ad)
- [The Instagram Architecture Facebook Bought for a Cool Billion Dollars](http://highscalability.com/blog/2012/4/9/the-instagram-architecture-facebook-bought-for-a-cool-billio.html)

## Instagram's migration from AWS to Facebook Data Centers
- In 2014, after Facebook bought instagram, it moved its infrastructure from AWS to Facebook own servers. (for easy integration etc.)
- [Read more - Migrating From AWS to FB](https://instagram-engineering.com/migrating-from-aws-to-fb-86b16f6766e2)

# References
- https://www.educative.io/courses/grokking-the-system-design-interview/m2yDVZnQ8lG
- https://www.youtube.com/watch?v=QmX2NPkJTKg
