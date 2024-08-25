# MySQL Sharding at Pinterest
- MySQL is used to store lot of growing pins data at pinterest.
- [Read more](https://medium.com/pinterest-engineering/sharding-pinterest-how-we-scaled-our-mysql-fleet-3f341e96ca6f)

# Shard Config Table
- It maintains the configuration of which shard on which machine?
- The config lives in [ZooKeeper](../../10_ClusterCoordination/ApacheZookeeper.md) and, on update, is sent to services that maintain the MySQL shard.

````json
[{“range”: (0,511), “master”: “MySQL001A”, “slave”: “MySQL001B”},
 {“range”: (512, 1023), “master”: “MySQL002A”, “slave”: “MySQL002B”},
    ...
 {“range”: (3584, 4095), “master”: “MySQL008A”, “slave”: “MySQL008B”}]
````

# Recommendations

| Title                                          | Remarks                                                      |
|------------------------------------------------|--------------------------------------------------------------|
| Along with sharding, read/write only on master | It simplifies everything and avoids lagged replication bugs. |

# Object ID (Pin ID etc.)
- This is the ID, used for communicating to various systems (like client apps, microservices etc.)

|                                          | Bits                           |
|------------------------------------------|--------------------------------|
| Shard ID                                 | 16 (64k total shards possible) |
| Type ID (whether its PIN, board etc.)    | 10                             |
| Local ID (table ID where data is stored) | 36                             |
| Reserve                                  | 2                              |
| **Total**                                | 64                             |

# PINs Table
- Local ID
- JSON data





