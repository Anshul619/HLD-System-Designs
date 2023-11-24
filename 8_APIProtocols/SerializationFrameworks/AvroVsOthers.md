# Avro vs Others
- [Avro](Avro.md) provides functionality similar to systems such as [Thrift](Thrift.md), [Protocol Buffers](ProtocolBuffers.md) etc.

| Feature            | [Avro](Avro.md) | [Protocol Buffers & Thrift](ProtocolBuffers.md) | Remarks                                                |
|--------------------|-----------------|-------------------------------------------------|--------------------------------------------------------|
| Dynamic typing     | Yes             | No                                              |                                                        |
| No need to compile | Yes             | No                                              | Avro - No code generation required in Avro.            |
| Built into Hadoop  | Yes             | No                                              |                                                        |
| Schema based       | Yes             | No                                              | Avro - Relies on a schema-based system.                |
| IDL Format         | JSON            | struct/message                                  | Avro - JSON is used for declaring the data structures. |
| Declare IDs        | No              | Yes                                             | Avro - No need to declare IDs.                         |
