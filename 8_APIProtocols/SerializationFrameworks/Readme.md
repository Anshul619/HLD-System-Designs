# Serialization Frameworks
- [Data serialization](https://devopedia.org/data-serialization) is the process of converting structured data to a format that allows sharing or storage of the data in a form that allows recovery of its original structure. 
- Data De-serialization is the exact opposite.
- Various Data Serialization formats include [Protobuf](ProtocolBuffers.md), [Thrift](Thrift.md), [Avro](Avro.md) etc.

![](https://devopedia.org/images/article/155/1595.1550594816.jpg)

# Features
- [Interface Description Language (IDL)](InterfaceDescriptionLanguage.md)
- Performance (better than JSON/XML)
- Versioning (through field identifier)
- Binary Format

# Modeling Steps
- Write down a bunch of struct-like message formats in an [IDL-like language](InterfaceDescriptionLanguage.md).
- Run a tool to generate boilerplate code.
- Link against the boilerplate code when building the application.

# Example Code

![](https://image.slidesharecdn.com/pbvsthriftvsavro-120917080012-phpapp02/75/thrift-vs-protocol-buffers-vs-avro-biased-comparison-23-2048.jpg)

# Read more
- [Thrift vs Protocol Buffers vs Avro - Biased Comparison](https://www.slideshare.net/IgorAnishchenko/pb-vs-thrift-vs-avro)