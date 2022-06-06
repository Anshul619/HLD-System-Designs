
## Important Points
- TinyURL is a read-heavy system. 100:1 ratio between read and write.

## KeyGenerationService
- To solve concurrency problems, KeyGenerationService would store unused keys in one table and already used in another table.
- KGS also has to make sure not to give the same key to multiple servers. 
- For that, it must synchronize (or get a lock on) the data structure holding the keys before removing keys from it and giving them to a server.

## Hash-Based Partitioning for URLs DB
- In our case, we can take the hash of the ‘key’ or the short link to determine the partition in which we store the data object.
- This approach can still lead to overloaded partitions, which can be solved using Consistent Hashing.

## How can each cache replica be updated?
- Whenever there is a cache miss, our servers would be hitting a backend database. 
- Whenever this happens, we can update the cache and pass the new entry to all the cache replicas.


## References
- https://www.educative.io/courses/grokking-the-system-design-interview/m2ygV4E81AR
