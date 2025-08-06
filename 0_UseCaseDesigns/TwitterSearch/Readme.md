# Twitter Search

# Requirements and Goals of the System
- Let’s assume Twitter has 1.5 billion total users with 800 million daily active users.
- On average Twitter gets 400 million tweets every day.
- The average size of a tweet is 300 bytes. 
- Let’s assume there will be 500M searches every day. 
- The search query will consist of multiple words combined with AND/OR.

# System APIs
- search(api_dev_key, search_terms, maximum_results_to_return, sort, page_token)

# High Level Design
- At the high level, we need to store all the tweets in a database and also build an index that can keep track of which word appears in which tweet. 
- This index will help us quickly find tweets that the users are trying to search for.

# Sharding based on the tweet object
- While storing, we will pass the TweetID to our hash function to find the server and index all the words of the tweet on that server. 
- While querying for a particular word, we have to query all the servers, and each server will return a set of TweetIDs. 
- A centralized server will aggregate these results to return them to the user.
