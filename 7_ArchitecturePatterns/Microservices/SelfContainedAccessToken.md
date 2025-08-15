# Self-contained JWT Pattern 
- Self-contained JWT Pattern means all the information a [microservice](../../3_MicroServices/Readme.md) needs about the request (identity, roles, permissions, metadata) is baked directly into the JWT payload.
- In [microservices](../../3_MicroServices/Readme.md), this often pairs with the [API Gateway](../../3_MicroServices/1_APIGateway/Readme.md) or Identity Provider minting the self-contained JWT and all downstream services just verifying it.

# Key characteristics:

| Title                        | Description                                                                 |
|------------------------------|-----------------------------------------------------------------------------|
| No central session DB lookup | the token is the source of truth for that request.                          |
| Stateless services           | any service can validate the token independently using the signing key.     |
| Claim hold all context       | Claims hold all the required context (user ID, org ID, roles, scopes, etc.) |
| Fast                         | avoids network hops to a central auth/session store                         |

# Trade-offs

| Title                | Description                                                                                                           |
|----------------------|-----------------------------------------------------------------------------------------------------------------------|
| Token size           | Token size can grow large if you pack in too many claims.                                                             |
| Revocation is tricky | Since services don’t check a central source, a token is valid until it expires unless you add a revocation mechanism. |
| Security             | Must sign (and ideally encrypt) tokens<br/>- keep key rotation in mind.                                               |
