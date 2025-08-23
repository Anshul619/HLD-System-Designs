# Pages in PostgreSQL
- In PostgreSQL, data is organized in the form of [pages of size 8 KB](https://www.postgresql.org/docs/current/storage-page-layout.html), and every such page can contain multiple tuples (depending on the size of tuple).

![](https://severalnines.com/sites/default/files/blog/node_5997/image2.png)