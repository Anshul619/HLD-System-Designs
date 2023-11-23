# Avro
- [Avro](https://avro.apache.org/docs/1.2.0/) is a data serialization system.

# Features
- Rich data structures.
- A compact, fast, binary data format.
- A container file, to store persistent data.
- Remote procedure call (RPC).
- Simple integration with dynamic languages. 
  - Code generation is not required to read or write data files nor to use or implement RPC protocols. 
  - Code generation as an optional optimization, only worth implementing for statically typed languages.

# Schemas
- [Avro]() relies on schemas. When Avro data is read, the schema used when writing it is always present. This permits each datum to be written with no per-value overheads, making serialization both fast and small. This also facilitates use with dynamic, scripting languages, since data, together with its schema, is fully self-describing.
- When Avro data is stored in a file, its schema is stored with it, so that files may be processed later by any program. If the program reading the data expects a different schema this can be easily resolved, since both schemas are present.
- When Avro is used in RPC, the client and server exchange schemas in the connection handshake. (This can be optimized so that, for most calls, no schemas are actually transmitted.) Since both client and server both have the other's full schema, correspondence between same named fields, missing fields, extra fields, etc. can all be easily resolved.
- Avro schemas are defined with JSON. This facilitates implementation in languages that already have JSON libraries.