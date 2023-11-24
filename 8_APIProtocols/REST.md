# REST (REpresentational State Transfer)
- [REST (REpresentational State Transfer)](https://restfulapi.net/) is the most mature of the 3 API technology options. 
- REST can be defined as a stateless, cacheable, convention-based architecture for client-server interaction.
- REST aims to follow [HTTP semantics](https://www.javatpoint.com/computer-network-http) closely. 
- REST uses URLs to address resources and HTTP verbs (**GET, POST, PUT, DELETE, PATCH**) to express the action to take.
- REST was described way back in 2000 in Roy Fielding’s doctoral dissertation as the core architectural principle of the World Wide Web.

# Features

| Feature                                                                                 | Description                                                                                                                                                                                                                                                                           |
|-----------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Stateless nature](../7_PropertiesDistributedSystem/StatefulVsStateless.md)             | Server never stores the client’s state (i.e. No Shared Context or Cookies).<br/>- When the client makes a request, it includes all information necessary for the server to process that request, and resends the information with subsequent requests if needed.                      |
| Cacheable                                                                               | REST requires requests to be cacheable whenever possible, and caching is implemented using HTTP’s native caching headers.                                                                                                                                                             |
| [Link relation](https://restful-api-design.readthedocs.io/en/latest/relationships.html) | To link two resources together i.e. specify relationship between resources.                                                                                                                                                                                                           |
| Idempotent API                                                                          | In the context of REST APIs, when making multiple identical requests has the same effect as making a single request – then that REST API is called idempotent.                                                                                                                        |
| Versioning                                                                              | Academically speaking, it should probably be in a header. However, the version needs to be in the URL to ensure browser explorability of the resources across versions (remember the API requirements specified at the top of this post?) and to have a simpler developer experience. |
| [Speed is a feature](https://www.enchant.com/speed-is-a-feature)                        |                                                                                                                                                                                                                                                                                       |

# HTTP Headers

| Header name                      | Description                                                                                                                                                                                                                                                                                           |
|----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| User-Agent                       | It identifies the client application or SDK.                                                                                                                                                                                                                                                      |
| Accept and Content-Type header   | To add versioning in the API i.e. application/vnd.myapp.v2+json<br/>- To request JSON instead of XML from an API                                                                                                                                                                                  |
| Cache-Control                    | If private, it specifies a response should not be stored in an intermediary cache.<br/>- `Cache-Control: no-store` tells the client and intermediaries that the response is not to be cached anywhere.<br/>- `Cache-Control: max-age=60` - Tell the client that the response is cached for 1 minute |
| Authorization header             | Most secure method to transmit an API key                                                                                                                                                                                                                                                         |

# HTTP API Codes

| Method                         | Description                                                                                                                                                                                                                 |
|--------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 405 Method Not Allowed         | When API resource does no allow method (i.e. DELETE), and a client application attempted to execute the method on the resource (i.e. delete the resource).                                                                  |
| 409 Conflict                   | When unique constraints break, primary key duplication, exceeding limit happens on the resource.                                                                                                                            |
| 403 Forbidden                  | The client does not have access rights to the content; that is, it is unauthorized, so the server is refusing to give the requested resource. <br/>- Unlike 401 Unauthorized, the client's identity is known to the server. |
| 201 Created                    | The request succeeded, and a new resource was created as a result. This is typically the response sent after POST requests, or some PUT requests.                                                                           |
| 429 Too Many Requests          | The user has sent too many requests in a given amount of time ("rate limiting").                                                                                                                                            |
| 202 Accepted                   | The request has been accepted for processing, but the processing has not been completed; in fact, processing may not have started yet.                                                                                      |
| 200 OK                         | The HTTP 200 OK success status response code indicates that the request has succeeded.                                                                                                                                      |

[Read more](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)

# Example URL Patterns

| URL Pattern                                   | Description                                             |
|-----------------------------------------------|---------------------------------------------------------|
| GET /users/{id}                               | To retrieve a specific user                             |
| /companies/{id} and /companies                | Collection of resources                                 |
| /companies/{companyId}/employees/{employeeId} | To access a subresource attached to a specific resource |

# Design Effective & Safe APIs

![](https://media.licdn.com/dms/image/D4E22AQGH_QbG8Jb2TA/feedshare-shrink_2048_1536/0/1696914794100?e=1700092800&v=beta&t=4CvXpMUISwFg4uc8d2Hr4YHr2PyGJ3WpTyGAVyeceK8)

[Read more](https://www.linkedin.com/posts/bytebytego_systemdesign-coding-interviewtips-activity-7117376511090774016-PjMg?utm_source=share&utm_medium=member_desktop)

# Reference
- [Best Practices for Designing a Pragmatic RESTful API](https://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api)
- [Designing robust and predictable APIs with idempotency](https://stripe.com/blog/idempotency)



