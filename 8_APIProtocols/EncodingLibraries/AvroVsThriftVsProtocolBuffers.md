# Thrift vs ProtocolBuffers
- Thrift generates code to implement RPC clients and servers where Protocol Buffers seems mostly designed as a data-interchange format alone.
- [Read more](https://stackoverflow.com/questions/69316/biggest-differences-of-thrift-vs-protocol-buffers)

# Avro vs Others
Avro provides functionality similar to systems such as Thrift, Protocol Buffers, etc. Avro differs from these systems in the following fundamental aspects.

## Dynamic typing
- Avro does not require that code be generated. 
- Data is always accompanied by a schema that permits full processing of that data without code generation, static datatypes, etc. 
- This facilitates construction of generic data-processing systems and languages.

## Untagged data
- Since the schema is present when data is read, considerably less type information need be encoded with data, resulting in smaller serialization size.

## No manually-assigned field IDs
- When a schema changes, both the old and new schema are always present when processing data, so differences may be resolved symbolically, using field names.