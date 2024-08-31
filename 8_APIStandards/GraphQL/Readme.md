
# GraphQL
- [GraphQL](https://graphql.org) can be used to dynamically get the data columns as needed. (like SQL)
- Client has control of what data it needs from server?
- GraphQL has a schema definition language for defining the types on a query.
- Additionally, with GraphQL, you can enquire multiple entities in one request, and because less bits will be transferred over the wire so your projects will perform faster than while using [REST](../REST.md).

![img.png](../assests/graphql.png)

# Why GraphQL?
- There are some issues with the [REST Architecture](../REST.md) style such as Multiple endpoints, Over-fetching, and Under-fetching of resources.
- There is no efficient way of handling various versions of native applications.
- We can fetch multiple resources in a single endpoint. This reduces the time wasted in multiple round-trips from the browser.
- With GraphQL, the client specifies the data it needs in the form of a query.
- The server sends back the response in the exact same shape.
- This makes it easy to develop applications without making assumptions on the type of fields.

# GraphQL Key Concepts

|                      | Description                                                                                                                                                                                                                                                               |
|----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Queries              | A query is a request for data from the GraphQL API. It’s used to retrieve data from the server. Queries are used to fetch data from the server and are similar to SQL queries.                                                                                            |
| Mutations            | A mutation is a way to modify data on the server. It’s used to create, update, or delete data on the server. Mutations follow the same syntactical structure as queries, but they always need to start with the mutation keyword.                                         |
| Subscriptions        | Subscriptions allow the client to receive real-time updates from the server. This is useful for applications that require immediate updates, such as live updates or notifications.                                                                                       |
| Schema               | It’s a definition of the capabilities of the API and defines how clients can request data. The schema is used to define the types of data that can be retrieved or modified, as well as the relationships between those types.                                            |
| Types                | In GraphQL, types are used to define the structure of the data that can be retrieved or modified. There are two types of types: scalar types (such as Int, String, Boolean, ID, Float) and object types (which define a set of fields that can be retrieved or modified). |
| Resolvers            | Resolvers are functions that are used to retrieve or modify data in the database. <br/>- They’re used to fetch or update data based on the query or mutation received from the client.                                                                                    |
| Fields               |                                                                                                                                                                                                                                                                           |
| Views                |                                                                                                                                                                                                                                                                           |
| Introspection        |                                                                                                                                                                                                                                                                           |
| Protocol             | GraphQL supports only HTTP POST verb with one URL like api.app.com and request body would contain all query params.                                                                                                                                                       |
| API Gateway          | Single API URL (like api.app.com) would act as unified API gateway for all graphQL queries.                                                                                                                                                                               |
| Graceful Degradation |                                                                                                                                                                                                                                                                           |
| Caching              | Client side and server side query caching. (redis caching still need to be implemented for data caching)                                                                                                                                                                  |
| Data Source          | The data source for resolvers can be REST api, DB, redis etc.                                                                                                                                                                                                             |

# Limitations of GraphQL

|                                        | Description                                                                                                                                                                                                                                     |
|----------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Complexity                             | GraphQL can be complex to learn and implement, especially for developers who are used to working with RESTful APIs. The schema-based approach requires a good understanding of the data model and the relationships between different entities. |
| Over-engineering                       | GraphQL can lead to over-engineering, as developers may try to define too many types and fields, which can make the schema difficult to maintain and understand.                                                                                |
| Lack of standardization                | GraphQL is still a relatively new technology, and there is a lack of standardization in terms of how it is implemented and used.                                                                                                                |
| Performance                            | GraphQL can be slower than RESTful APIs, especially for large datasets, because it requires the server to process the query and return the data in the correct format.                                                                          |
| Caching                                | GraphQL does not have built-in caching, which can lead to performance issues if the data is not cached properly.                                                                                                                                |
| Security                               | GraphQL is more vulnerable to security risks than RESTful APIs, as it allows for more flexibility and flexibility in the way data is accessed and manipulated.                                                                                  |
| Scalability                            | GraphQL can be more difficult to scale than RESTful APIs, especially for large and complex datasets, as it requires the server to process the query and return the data in the correct format.                                                  |
| Lack of support for certain data types | GraphQL does not support certain data types, such as JSON, which can make it difficult to work with certain types of data.                                                                                                                      |


# Other links
- [Apollo Federation](https://www.apollographql.com/docs/federation/)
- [Guild Dev](https://the-guild.dev/)

# :star: Real world use cases of GraphQL
- [Zomato - HLD Design](../../0_HLDUseCasesProblems/FoodOrderingZomatoSwiggy/Readme.md)
- [Uber Driver Allocation](../../0_HLDUseCasesProblems/DriverAllocationUberGoJek/Readme.md)
- [GraphQL with ElasticSearch](../../1_TechStacks/Smartive.md)
- Facebook (contributor of GraphQL)
- [GitHub](https://github.com/shurcooL/githubv4)

# Sample Code

## Query
````
query {
  person(id: 1) {
    name
    age
  }
}
````

## Mutation
````
mutation {
  createPerson(name: "John", age: 30) {
    id
    name
    age
  }
}
````

# References
- [What is GraphQL and why Facebook felt the need to build it?](https://buddy.works/tutorials/what-is-graphql-and-why-facebook-felt-the-need-to-build-it#why-facebook-built-graphql)
- [GraphQL vs REST APIs | What's the Best Kind of API?](https://www.youtube.com/watch?v=F0_pkxQMZnc)
- [Using GraphQL with Microservices in Go](https://outcrawl.com/go-graphql-gateway-microservices)
- [GraphQL and Apollo: A Beginner’s Guide](https://krishcdbry.medium.com/graphql-and-apollo-a-beginners-guide-84c60d55dda2)