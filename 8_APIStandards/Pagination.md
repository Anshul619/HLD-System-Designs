# Types of Pagination

# Offset based pagination

## Drawbacks of Offset based pagination
- Using LIMIT OFFSET doesn’t scale well for large datasets. 
- As the offset increases the farther you go within the dataset, the database still has to read up to offset + count rows from disk, before discarding the offset and only returning count rows.

# Cursor based pagination
- [Cursor based pagination](https://www.sitepoint.com/paginating-real-time-data-cursor-based-pagination/) requires at least one column with unique sequential values, similar to Twitter’s max_id parameter or Facebook’s after parameter. 
- It is generally more efficient and reliable than offset-based pagination, especially for real-time data or large datasets.
- Cursor-based pagination works by returning a pointer to a specific item in the dataset.