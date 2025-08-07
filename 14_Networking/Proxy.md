# Forward Proxy
- Essentially, a proxy server (aka the forward proxy) is a piece of software or hardware that facilitates the request for resources from other servers on behalf of clients, thus anonymizing the client from the server.
- A forward proxy can hide the identity of the client from the server by sending requests on behalf of the client.
- Consider a request for the same data across several nodes, but the data is not in cache. By routing these requests through the proxy, they can be consolidated into one so that we will only read data from the disk once.

# Reverse Proxy
- A reverse proxy retrieves resources from one or more servers on behalf of a client.
- These resources are then returned to the client, appearing as if they originated from the proxy server itself, thus anonymizing the server.
- Contrary to the forward proxy, which hides the client’s identity, a reverse proxy hides the server’s identity.