
# Protocol Buffers vs Thrift

|                                     | [Protocol Buffers](ProtocolBuffers.md) | [Thrift](Thrift.md) |
|-------------------------------------|----------------------------------------|---------------------|
| RPC Interface                       | Yes                                    | Yes                 |
| RPC Implementation                  | :x: No (used in gPRC)                  | Yes                 |
| Documentation                       | :+1: Good docs                         | Lack of docs        |
| Performance (serialization objects) | 30% smaller than thrift                | :rocket: Faster     |

# Read more
- [Biggest differences of Thrift vs Protocol Buffers?](https://stackoverflow.com/questions/69316/biggest-differences-of-thrift-vs-protocol-buffers)
- [Thrift vs Protocol Buffers vs Avro - Biased Comparison](https://www.slideshare.net/IgorAnishchenko/pb-vs-thrift-vs-avro)
- [The best serialization strategy for Event Sourcing](https://blog.softwaremill.com/the-best-serialization-strategy-for-event-sourcing-9321c299632b)