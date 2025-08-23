# B-Tree
- [B-Tree](https://www.geeksforgeeks.org/introduction-of-b-tree-2/) is the most widely used [indexing data structure](Index.md) in almost all relational databases.
- The basic unit of information storage in B-Tree is usually called a [page](Page.md).
- To look up a key, it traces down the range of keys until the actual value is found.

![](https://media.geeksforgeeks.org/wp-content/uploads/20200507002619/output256.png)

# Time Complexity

| Algo   | Time Complexity | Remarks                                                                           |
|--------|-----------------|-----------------------------------------------------------------------------------|
| Search | O(log n)        |                                                                                   |
| Insert | O(log n)        | At every inserts the tree balances itself to keep the nodes in the correct order. |
| Delete | O(log n)        | Similarly, at every delete, the tree need to balance itself.                      |
