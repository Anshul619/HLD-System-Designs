# REST vs GraphQL

![img.png](assests/RESTvsGraphQL.png)

| Feature                                    | GraphQL                                                                                                                                     | [REST](REST.md)                                         |
|--------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------|
| Flexibility                                | :+1: Client specify exact resource & fields in GraphQL schema (query param), it wants.                                                      | Rigid                                                   |
| Speed                                      | :+1: GraphQL is faster than REST because as you can pick the fields you want to query, so the request will always be the smallest possible. |                                                         |
| Prerequisites/Overheads                    | :-1: Extra-tools are needed on both client & server side.                                                                                   | :+1: Standard CURL is supported. No extra tools needed. |
| HTTP Cache (Browsers, CDNs, Proxy Servers) | :-1: Not-Supported                                                                                                                          | :+1: Supported                                          |
| Security                                   | :-1: Un-required table scan can be done, by client. This can be mitigated, but with maintenance overhead.                                   | :+1: Good.                                              |
| Over-fetching                              | No                                                                                                                                          | Yes                                                     |

[Read more](https://www.youtube.com/watch?v=yWzKJPw_VzM)

# Similarities of REST with GraphQL

Both [REST](REST.md) and [GraphQL]() are based on following,
- HTTP
- API URL
- Can return JSON response