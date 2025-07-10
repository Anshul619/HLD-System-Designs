# Cardinality
- [Cardinality](https://orangematter.solarwinds.com/2020/01/05/what-is-cardinality-in-a-database/) is a mathematical term that refers to the number of unique values in a table column relative to the total number of rows in the table.

# Cardinality Examples

| Partition key value                                                                                            | Cardinality/Uniformity |
|----------------------------------------------------------------------------------------------------------------|------------------------|
| User ID, where the application has many users.                                                                 | High                   |
| Status code, where there are only a few possible status codes.                                                 | Low                    |
| Item creation date, rounded to the nearest time period (for example, day, hour, or minute).                    | Low                    |
| Device ID, where each device accesses data at relatively similar intervals.                                    | High                   |
| Device ID, where even if there are many devices being tracked, one is by far more popular than all the others. | Low                    |