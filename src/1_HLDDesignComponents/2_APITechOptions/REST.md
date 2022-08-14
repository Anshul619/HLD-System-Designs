
# [REST](https://restfulapi.net/)
- REST (REpresentational State Transfer) is the most mature of the 3 API technology options. 
- REST can be defined as a stateless, cacheable, convention-based architecture for client-server interaction.
- REST aims to follow HTTP semantics closely. 
- REST uses URLs to address resources and HTTP verbs (`GET, POST, PUT, DELETE, PATCH`) to express the action to take.
- REST was described way back in 2000 in Roy Fielding’s doctoral dissertation as the core architectural principle of the World Wide Web.

## REST is [stateless](../0_SystemGlossaries/README.md#stateful-vs-stateless)
- The server never stores the client’s state. 
- When the client makes a request, it includes all information necessary for the server to process that request, and resends the information with subsequent requests if needed.

## REST is cacheable
- REST requires requests to be cacheable whenever possible, and caching is implemented using HTTP’s native caching headers.