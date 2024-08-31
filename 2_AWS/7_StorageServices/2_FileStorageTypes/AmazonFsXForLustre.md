# Amazon FSx for Lustre
- [Amazon FSx for Lustre](https://aws.amazon.com/fsx/lustre/) provides fully managed shared storage with the scalability and performance of the popular [Lustre file system](https://en.wikipedia.org/wiki/Lustre_(file_system)).

![](https://d1.awsstatic.com/pdp-how-it-works-assets/product-page-diagram_Amazon-FSx-for-Lustre.097ed5e5175fa96e8ac77a2470151965774eec32.png)

# Integration with S3
- [FSx for Lustre]() integrates with [Amazon S3](../3_S3ObjectStorage/Readme.md), making it easy to process data sets with the Lustre file system. 
- When linked to an [S3 bucket](../3_S3ObjectStorage/Readme.md), an FSx for Lustre file system transparently presents [S3 objects](../3_S3ObjectStorage/Readme.md) as files and allows you to write changed data back to S3.
- FSx for Lustre provides the ability to both process the `hot data` in a parallel and distributed fashion as well as easily store the `cold data` on [Amazon S3](../3_S3ObjectStorage/Readme.md).