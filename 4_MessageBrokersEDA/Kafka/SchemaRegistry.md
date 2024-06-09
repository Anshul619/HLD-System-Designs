# Schema Registry
- [Schema Registry](https://kafka.apache.org/documentation.html#multitenancy-more) holds schemas & ensures that schema used by producer and consumer, are identical.
- [Producer](CoreAPIs/ProducerAPI.md) sends schema id while pushing the data and [consumer](CoreAPIs/ConsumerAPI.md) look for schema id to get schema.

# Supported Formats
- [JSON](../../8_APIStandards/DataInterchangeFormats/JSON.md)
- [Avro](../../8_APIStandards/SerializationFrameworks/Avro.md)
- [Protocol Buffers](../../8_APIStandards/SerializationFrameworks/ProtocolBuffers.md)
