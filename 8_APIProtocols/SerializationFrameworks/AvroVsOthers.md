# Avro vs Others
- Avro provides functionality similar to systems such as [Thrift](Thrift.md), [Protocol Buffers](ProtocolBuffers.md), etc.

| Feature            | Avro | Protocol Buffers & Thrift | Remarks                                                |
|--------------------|------|---------------------------|--------------------------------------------------------|
| Dynamic typing     | Yes  | No                        | Avro - No code generation required in Avro.            |
| No need to compile | Yes  | No                        |                                                        |
| Built into Hadoop  | Yes  | No                        |                                                        |
| Schema based       | Yes  | No                        | Avro - Relies on a schema-based system.                |
| IDL Format         | JSON | struct/message            | Avro - JSON is used for declaring the data structures. |
| Declare IDs        | No   | Yes                       | Avro - No need to declare IDs.                         |
