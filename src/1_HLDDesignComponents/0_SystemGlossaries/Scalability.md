
# Scalability

# Types of Scalability

## Horizontal scalability ( Scale Out )
- Generally, the app servers can be scaled out by adding another app server.
- In case of DB, the horizontal scaling is a bit different ( single-master, multi-master ), as explained below.
![img.png](https://dzone.com/storage/temp/5747694-picture1.png)

### DB - Horizontal Scaling Techniques
- Single-Master-Slave Technique
- Multi-Master-Slave Technique ( Sharding )

## Vertical scalability ( Scale Up )
- Generally, it's not recommended to do vertical scalability ( due to cost, license issues ). 
- :star: Horizontal scalability is more preferred. But it needs initial design in-place.

![img.png](https://dzone.com/storage/temp/5747695-picture2.png)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)