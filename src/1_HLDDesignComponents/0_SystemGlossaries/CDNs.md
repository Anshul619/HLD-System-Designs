
# Content Delivery Network (CDN)
- A content delivery network (CDN) is a globally distributed network of proxy servers, serving content from locations closer to the user.
- Generally, static files such as `HTML/CSS/JS, photos, and videos are served from CDN`, although some CDNs such as [Amazon CloudFront](../../2_AWSComponents/1_NetworkingAndContentDelivery/AmazonCloudFront.md) support dynamic content.

# Key Benefits
- `Performance across regions`: Users in multiple locations receive content at data centers close to them. 
- `Scalability`: Reduces load on servers by serving static files, which are often a large proportion of the website's data. Helps improve performance particularly during spikes.
- `Improved SEO rankings`: Based on faster load speeds.
- `Added security`: Some CDNs can mitigate DDOS attacks.

![img.png](https://github.com/jeremyyew/tech-prep-jeremy.io/raw/master/.gitbook/assets/image%20%2814%29.png)

# Source(s) and further reading
- [CDN](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/cdns.md)