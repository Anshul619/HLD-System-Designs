
# Generic Cache Module:

## Problem statement
- You are required to implement an in-memory cache module/library which you will embed in your application to improve the application performance, by holding heavily accessed (read/written) application specific objects. 
- To start, we would begin with following minimal requirements.

## Functional Requirements:

1. Your cache module should be generic, re-usable and easy to integrate across various modules within your production/organization.
2. The cache will be bounded by a fixed capacity (number of items) for holding the objects, which will be mentioned during early initialization of the program.
3. Upon hitting the capacity, the cache module can invoke one of various cache eviction strategies to make room for newer objects.
   You are required to incorporate cache eviction in your code to handle aforementioned condition.
4. You could choose to implement various cache eviction strategies such as 'Least recently used', 'Least frequently used', 'time based expiration' et.al
5. In one of our unique use cases, we would like to change the eviction policy of the cache during runtime and the cache should start evicting keys based on the new eviction policy set.

## Non functional requirements:

7. We are looking for production grade implementation with a judicious mix of code modularity, extensibility and test coverage.
8. Usage of 3rd party libraries is not permitted.

9. We would love to see a complete running program; however, if you feel time is a constraint, you can choose to implement a subset of functionality (but technically functionally complete), which can be demonstrated at the end of the discussion.
10. Needless to say, we highly appreciate a modular, extensible implementation supported with good quality test coverage.

## To-Dos/Open Items in Implementation:
- Generic object implementation in CacheObjImpl
- Consider 5th point in the Cache Implementation & implement `changeEvictionPolicy()`

## References
- Asked in Gojek interview, 8-June-2022
- LRU Cache - https://leetcode.com/problems/lru-cache/
- LFU Cache - https://leetcode.com/problems/lfu-cache/
- https://www.geeksforgeeks.org/generics-in-java/
