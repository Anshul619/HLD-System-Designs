
# Extract-Transform-Load (ETL)

![](../../../3_HLDDesignProblemsUC/AWS_ModernDataArchitecture/AWS-Data-Architecture-ETL-OLTP-OLAP-DataLake.png)

|           | Remarks                                                                                                                                                 |
|-----------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| EXTRACT   | EXTRACT data from multiple different data sources ([OLTP-DBs](../../3_DatabaseComponents/1_Glossaries/OLTPvsOTAP.md), third-party-sources etc.).        |
| TRANSFORM | TRANSFORM data by de-duplicating it, combining it, ensuring quality & best suited for analytics.                                                        |
| LOAD      | LOAD data into one, centralized database ([OLAP db](../../3_DatabaseComponents/1_Glossaries/OLTPvsOTAP.md) like [data warehousing](../0_Glossaries/DataStorage/DataWarehouses.md)). |

[Read more](https://aws.amazon.com/what-is/etl/)

# Processing Types

| Processing Type                                 | Stream    | Description                                                                                                         |
|-------------------------------------------------|-----------|---------------------------------------------------------------------------------------------------------------------|
| [Batch Processing](BatchProcessing/Readme.md)   | Bounded   | It involves [MapReduce jobs](../0_Glossaries/MapReduce.md) which runs at certain frequency to transform the data.   |
| [Stream Processing](StreamProcessing/Readme.md) | Unbounded | It involves processing data in near-real time.                                                                      |

# References
- [Batch, Stream, and Micro-batch Processing: A Cheat Sheet](https://www.upsolver.com/blog/batch-stream-a-cheat-sheet)