# Content Delivery Network (CDN)
- [A content delivery network (CDN)](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/cdns.md) is a globally distributed network of proxy servers, serving [static files/content](StaticContent.md) from locations closer to the user.
- CDNs are a kind of cache that comes into play for [sites serving large amounts of static media](StaticContent.md).
- If the system we are building is not large enough to have its own CDN, we can ease a future transition by serving the static media off a separate subdomain (e.g. static.yourservice.com) using a lightweight HTTP server like Nginx, and cut-over the DNS from your servers to a CDN later.
- [Amazon Cloudfront](https://github.com/Anshul619/AWS-Services/tree/main/16_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonCloudFront.md) is used as CDN in AWS.

![](https://github.com/jeremyyew/tech-prep-jeremy.io/raw/master/.gitbook/assets/image%20%2814%29.png)

# Key Benefits

| Benefit                    | Description                                                                                                                                                                          |
|----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Performance across regions | Users in multiple locations receive content at data centers close to them.                                                                                                           |
| Scalability                | Reduces load on servers by [serving static files](StaticContent.md), which are often a large proportion of the website's data. Helps improve performance particularly during spikes. |
| Improved SEO rankings      | Based on faster load speeds.                                                                                                                                                         |
| Added security             | Some CDNs can mitigate DDOS attacks.                                                                                                                                                 |

# Terminologies

| Terminology                                                                                                      | Description                                                                                                                                                                                                                                             |
|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [A POP (point of presence)](https://www.techtarget.com/searchnetworking/definition/point-of-presence-POP) | [A POP (point of presence)](https://www.techtarget.com/searchnetworking/definition/point-of-presence-POP) is a single physical location that consists of [one or multiple edge servers](https://www.cloudflare.com/learning/cdn/glossary/edge-server/). |
| [Origin servers](https://www.cdnetworks.com/knowledge-center/what-is-origin-server/)                             | [Origin servers](https://www.cdnetworks.com/knowledge-center/what-is-origin-server/) are the origin of data.                                                                                                                                            |
| [Edge servers](https://www.cloudflare.com/learning/cdn/glossary/edge-server/)                                    | [Edge servers](https://www.cloudflare.com/learning/cdn/glossary/edge-server/) get data from the origin server.                                                                                                                                          |

# Source(s) and further reading
- [CDN](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/cdns.md)
- [Caching](https://www.educative.io/courses/grokking-the-system-design-interview/3j6NnJrpp5p)
- [What Is A CDN? How Does It Work?](https://www.youtube.com/watch?v=RI9np1LWzqw)