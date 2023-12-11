# Sharding & IDs at Instagram
- [Read more](https://instagram-engineering.com/sharding-ids-at-instagram-1cf5a71e5a5c)

# ID composition

|                  | Remarks                                                                         |
|------------------|---------------------------------------------------------------------------------|
| Time             | 41 bits for time in milliseconds (gives us 41 years of IDs with a custom epoch) |
| Logical Shard ID | 13 bits that represent the logical shard ID                                     |
| Sequence         | 10 bits that represent an auto-incrementing sequence, modulus 1024.             |
