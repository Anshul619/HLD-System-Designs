# Amazon CloudFront
- [Amazon CloudFront](https://aws.amazon.com/cloudfront/) helps to improve website speed and access to cloud-based static data.
- It [securely deliver content with low latency and high transfer speeds](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LatencyThroughput.md).
- CloudFront works as a [global Content Delivery Service (CDN)](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/CDNs.md) to deliver the [static content](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md) efficiently to the end users.

![](https://docs.aws.amazon.com/images/AmazonCloudFront/latest/DeveloperGuide/images/regional-edge-caches.png)

# Features

| Feature                                                                                                                                                                               | Remarks                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Origin](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_Origin.html)                                                                                                  | An origin is the location where content is stored, and from which CloudFront gets content to serve to viewers.                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [Origin Types](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistS3AndCustomOrigins.html)                                                                | [Amazon S3](../../7_StorageServices/3_ObjectStorageS3/Readme.md), [S3 Website type](../../7_StorageServices/3_ObjectStorageS3/Readme.md), [EC2 instance](../../3_ComputeServices/AWSLambda/Readme.md), [Lambda function URL](../../3_ComputeServices/AWSLambda/Readme.md) etc. or Custom Origin for third-party content.                                                                                                                                                                                                                                                                 |
| [Origin group for high availability and failovers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/high_availability_origin_failover.html)                         | You create an origin group with two origins: a primary and a secondary. <br/>- If the primary origin is unavailable or returns specific HTTP response status codes that indicate a failure, CloudFront automatically switches to the secondary origin.                                                                                                                                                                                                                                                                                                                                   |
| [Origin Access Control](https://aws.amazon.com/about-aws/whats-new/2022/08/amazon-cloudfront-origin-access-control/)                                                                  | [OAC](https://aws.amazon.com/about-aws/whats-new/2022/08/amazon-cloudfront-origin-access-control/) enables CloudFront customers to easily secure their [S3 origins](../../7_StorageServices/3_ObjectStorageS3/Readme.md) by permitting only designated CloudFront distributions to access their [S3 buckets](../../7_StorageServices/3_ObjectStorageS3/Readme.md).<br/>- OAC improves upon [Origin Access Identity](https://crishantha.medium.com/securing-s3-with-origin-access-identity-oai-via-cloudfront-147467eae8aa) by strengthening security and deepening feature integrations. |
| :star: [Cache content for faster delivery (i.e. CDN) with Regional cache & edge location](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowCloudFrontWorks.html) | Even though origin server is in another region, users can get low-latency experience using edge locations & regional cache.<br/>- However regional cache doesn't work Proxy methods PUT/POST/PATCH/OPTIONS/DELETE & dynamic content (cache-behavior configured to forward all headers).                                                                                                                                                                                                                                                                                                  |
| :star: [GeoRestriction (also known as geo-blocking)](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GeoRestriction.html)                                              | A complex type that controls the countries in which your content is distributed. <br/>- CloudFront determines the location of your users using MaxMind GeoIP databases.                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [Streaming audio or video](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md)                                                                            | -                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [Manage time-to-live (TTL)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)                                                                       | You can control how long your files stay in a CloudFront cache before CloudFront forwards another request to your origin. <br/>- Reducing the duration allows you to serve dynamic content. <br/>- Increasing the duration means that your users get better performance because your files are more likely to be served directly from the edge cache. <br/>- A longer duration also reduces the load on your origin.                                                                                                                                                                     | 
| [Adding the CloudFront HTTP headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-cloudfront-headers.html)                                                | You can [configure CloudFront to add specific HTTP headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-cloudfront-headers.html) to the requests that CloudFront receives from viewers. The values of these HTTP headers are based on characteristics of the viewer request. <br/>- The headers can provide information about the viewer's device type, IP address, geographic location, request protocol (HTTP or HTTPS), HTTP version, and TLS connection details.                                                                                        |
| [Price Class](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)                                                                                     | To reduce cost, we can specify geographic regions (using [price class](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)) for which the CloudFront edge locations should use (to give low-latency).                                                                                                                                                                                                                                                                                                                                                    |
| [Field level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)                                                              | [Field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html) allows you to enable your users to securely upload sensitive information to your web servers.                                                                                                                                                                                                                                                                                                                                                                   |
| Supported Protocols - HTTP/RTMP protocol                                                                                                                                                                | CloudFront supports HTTP/RTMP protocol based requests.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [Serving private content with signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-overview.html)                       | You can configure CloudFront to require that users access your files using either signed URLs or signed cookies.                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |

# :star: Amazon S3 + Amazon CloudFront: A Match Made in the Cloud
- [Instead of directly accessing the S3 resource](https://aws.amazon.com/blogs/networking-and-content-delivery/amazon-s3-amazon-cloudfront-a-match-made-in-the-cloud/), we should use [CloudFront distribution](AmazonCloudFront.md) in the middle (which acts as a [CDN](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/CDNs.md))

![img.png](https://d2908q01vomqb2.cloudfront.net/5b384ce32d8cdef02bc3a139d4cac0a22bb029e8/2018/06/27/4-v-2.png)

# :star: Real world use cases of Amazon CloudFront

## Design Scalable System on AWS

![img.png](../../../3_HLDDesignProblemsUC/AWS_DesignScalableSystemWithRDMS/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](../../../3_HLDDesignProblemsUC/AWS_DesignScalableSystemWithRDMS/Readme.md)

## Upload Image using Amazon S3 and Lambda

![img.png](../../../3_HLDDesignProblemsUC/AWS_DesignUploadImageLambdaS3/UploadImage-Lambda.drawio.png)

[Read more](../../../3_HLDDesignProblemsUC/AWS_DesignUploadImageLambdaS3/Readme.md)

## Deploy WordPress Site with Amazon CloudFront & S3

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../../../3_HLDDesignProblemsUC/AWSWebsiteSiteUsingCloudFront&S3.md)

# Point-Of-Presence/Edges Footprint in CloudFront

![img.png](https://d2908q01vomqb2.cloudfront.net/5b384ce32d8cdef02bc3a139d4cac0a22bb029e8/2022/06/17/CloudFront_400-1024x580.png)

[Read more about Point of presence](../../AWS-Global-Architecture-Region-AZ.md#points-of-presence)

# CDN Customizations

![](https://jasonstitt.com/images/s3-cloudfront-lambda.png)

## Customizing with CloudFront Functions
- With [CloudFront Functions in Amazon CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-functions.html), lightweight functions can be developed in [JavaScript]() for [high-scale, latency-sensitive CDN customizations](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/CDNs.md). 
- Your functions can manipulate the requests and responses that flow through CloudFront, perform basic authentication and authorization, generate HTTP responses at the edge, and more. 
- The CloudFront Functions runtime environment offers [submillisecond startup times, scales immediately to handle millions of requests per second](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LatencyThroughput.md), and is highly secure. 
- CloudFront Functions is a native feature of CloudFront, which means you can build, test, and deploy your code entirely within CloudFront.
- Generally [CloudFront Functions is more performance and cheaper than Lambda@Edge](https://aws.amazon.com/blogs/aws/introducing-cloudfront-functions-run-your-code-at-the-edge-with-low-latency-at-any-scale/) functions.

![img.png](https://d2908q01vomqb2.cloudfront.net/da4b9237bacccdf19c0760cab7aec4a8359010b0/2021/04/08/cloudfront-function-and-lambda-edge-2-1024x454.png)

### Ideal Use Cases of CloudFront functions
- Cache key normalization
- HTTP Header manipulation
- URL redirects or rewrites based on user's IP address, [cloudfront-viewer-country](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-cloudfront-headers.html) etc.
- Request authorization etc.

## Customizing with Lambda@Edge
- [Lambda@Edge](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-at-the-edge.html) is an extension of [AWS Lambda](../../3_ComputeServices/AWSLambda/Readme.md), a compute service that lets you execute functions that customize the content that CloudFront delivers. 
- You can author Node.js or Python functions in one Region, US East (N. Virginia), and then execute them in AWS locations globally that are closer to the viewer, without provisioning or managing servers. 
- Lambda@Edge scales automatically, from a few requests per day to thousands per second. 
- Processing requests at AWS locations closer to the viewer instead of on [origin servers significantly reduces latency and improves the user experience](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LatencyThroughput.md).

![img.png](https://d2908q01vomqb2.cloudfront.net/da4b9237bacccdf19c0760cab7aec4a8359010b0/2021/04/08/cloudfront-functions-only-lambda-egde-1024x413.png)

### Ideal Use Cases of Lambda@Edge
- Inspect Cookies & Rewrite URLs
- Different Presentation for the Viewer based on `User-Agent header`
- HTTP Header manipulation
- [Geo-Targeting - Personalized Ads, Content etc.](https://aws.amazon.com/blogs/networking-and-content-delivery/leverage-amazon-cloudfront-geolocation-headers-for-state-level-geo-targeting/)
- Additional API Call etc.

# References
- [How do I use CloudFront to serve HTTPS requests for my Amazon S3 bucket?](https://aws.amazon.com/premiumsupport/knowledge-center/cloudfront-https-requests-s3/)
- [400 Amazon CloudFront Points of Presence](https://aws.amazon.com/blogs/networking-and-content-delivery/400-amazon-cloudfront-points-of-presence/)
- [Serving Dynamic Websites with Amazon CloudFront](https://blog.shikisoft.com/serving-dynamic-website-with-amazon-cloudfront/)