# Introduction
- [gRPC](https://grpc.io) is a modern open source high performance [Remote Procedure Call](https://www.geeksforgeeks.org/remote-procedure-call-rpc-in-operating-system/) framework that can run in any environment.
- It supports streams, where a call consists of not just one request and one response, but a series of requests and responses over time.

# Key Links

| Links                                                                                                                              |
|------------------------------------------------------------------------------------------------------------------------------------|
| [gRPC - Performance Multi-language Dashboard](https://performance-dot-grpc-testing.appspot.com/explore?dashboard=5180705743044608) |
| [gRPC in Go - Basic Tutorial](https://grpc.io/docs/languages/go/basics/)                                                           |

# gRPC is contract-based (Protobuf)
- A Contract needs to be available on both sides of communication to make sense of data going between them. 
- To define the contracts, gRPC uses a declarative language called [Protocol Buffers (Protobuf)](https://github.com/Anshul619/Serialization-Data/blob/main/Frameworks/ProtocolBuffers.md).

# :thumbsup: Advantages of gRPC

## Built on HTTP 2 Instead of HTTP 1.1 
- In HTTP 2, when a microservice receives multiple requests from more than one client, it achieves multiplexing by serving many requests and responses simultaneously.

## :rocket: gRPC is faster than REST API
- Its reported that [GPRC is 7 to 10 times faster than REST](https://blog.dreamfactory.com/grpc-vs-rest-how-does-grpc-compare-with-traditional-rest-apis/).
- According to widely-cited tests, gRPC API connections are considerably faster than REST API connections.

# :thumbsdown: Disadvantages of gRPC
- gRPC is currently much less popular than REST, and experienced developers are harder to find.
- gRPC is not a native solution for customer-facing web applications because it requires **HTTP/2, which is not fully supported by browsers**. 
- For example, client streaming and bidirectional streaming are not supported in browsers at all.
- However, there’s a gRPC-Web project that enables using browser-to-backend communication over gRPC without creating a REST proxy.

# Streaming using gRPC

|         | Source Code      |
|---------|------------------|
| Type    | stream           |
| Send    | stream.Send()    |
| Receive | stream.Receive() |

# Reference
- [What is RPC? gRPC Introduction?](https://www.youtube.com/watch?v=gnchfOojMk4)
- [GPRC is 7 to 10 times faster than REST](https://blog.dreamfactory.com/grpc-vs-rest-how-does-grpc-compare-with-traditional-rest-apis/)
- [Is gRPC(HTTP/2) faster than REST with HTTP/2?](https://stackoverflow.com/questions/44877606/is-grpchttp-2-faster-than-rest-with-http-2)
- [Blog - gPRC and ProtoBuf](https://clement-jean.github.io/)
