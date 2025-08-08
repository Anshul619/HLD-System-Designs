# Schema Registry
- [Schema Registry](https://kafka.apache.org/documentation.html#multitenancy-more) holds schemas & ensures that schema used by producer and consumer, are identical.
- [Producer](CoreAPIs/ProducerAPI.md) sends schema id while pushing the data and [consumer](CoreAPIs/ConsumerAPI.md) look for schema id to get schema.

# Supported Formats
- [JSON](https://github.com/Anshul619/Serialization-Data/blob/main/Formats/JSON.md)
- [Avro](https://github.com/Anshul619/Serialization-Data/blob/main/Frameworks/Avro.md)
- [Protocol Buffers](https://github.com/Anshul619/Serialization-Data/blob/main/Frameworks/ProtocolBuffers.md)
