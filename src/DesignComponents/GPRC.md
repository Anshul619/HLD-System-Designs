
# [What is GPRC?](https://grpc.io)
- A high performance, open source universal RPC framework
- gRPC is a `modern open source high performance Remote Procedure Call` framework that can run in any environment.

# Advantages of GPRC
* Built on HTTP 2 Instead of HTTP 1.1 
  - In HTTP 2, when a microservice receives multiple requests from more than one client, it achieves multiplexing by serving many requests and responses simultaneously
* Protobuf Instead of JSON/XML 
  - it allows to generate both client/server out of the box. 
  - `Protobuf` is the contract itself and supports code-generation for many of the most popular programming languages
* According to widely-cited tests, gRPC API connections are considerably faster than REST API connections. 
  * In fact, its reported that `GPRC is 7 to 10 times faster than HTTP`.
