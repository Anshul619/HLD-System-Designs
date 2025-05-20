# Inbox/Outbox pattern
- [Transactional Inbox/Outbox pattern](https://dev.to/ishansoni22/saga-cdc-with-transactional-inboxoutbox-3of7) is a technique used in microservices architecture to ensure reliable and consistent data exchange between different services.
- It works by using a database table as an intermediary between the service that produces the data and the service that consumes it.
- The producer service inserts the data into the outbox table as part of the original business transaction, ensuring atomicity of the database update and the event insertion.

![](https://media2.dev.to/dynamic/image/width=800%2Cheight=%2Cfit=scale-down%2Cgravity=auto%2Cformat=auto/https%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Farticles%2Fe1bqhtzpgcmav5opsr9i.png)