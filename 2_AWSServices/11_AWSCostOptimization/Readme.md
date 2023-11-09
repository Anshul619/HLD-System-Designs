# AWS - Cost Exploration Services

| Service                                                                                                              | Description                                                                                                |
|----------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| :star: [AWS Cost Explorer](AWSCostExplorer.md)                                                                       | -                                                                                                          |
| :star: [AWS Budgets](AWSBudgets.md)                                                                                  | Improve planning and cost control with flexible budgeting and forecasting.                                 |
| [Cost Allocation Tags](CostAllocationTags.md)                                                                        | -                                                                                                          |
| [AWS Cloud Tower](https://aws.amazon.com/blogs/aws/aws-control-tower-set-up-govern-a-multi-account-aws-environment/) | -                                                                                                          |
| [AWS Cost Categories](https://aws.amazon.com/aws-cost-management/aws-cost-categories/)                               | -                                                                                                          |
| [AWS pricing calculator](https://calculator.aws/#/)                                                                  | Configure a cost estimate that fits your unique business or personal needs with AWS products and services. |

# Cost Allocation

| Title                                   | Description                                                                                                                    |
|-----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| Identify most important dimensions      | Categorization examples like teams, lines of business, cost center etc.                                                        |
| Define a strategy for accounts and tags | Use separate account for easier tracking i.e. production vs testing.<br/>- Publish, evangelize and enforce a tagging strategy. |
| Allocate shared costs                   | For shared costs (containers, shared services, storage), allocate based on consumption.                                        |

# Cost Visibility

| Title                               | Description                                                                                                                                                                                                   |
|-------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Select a cost visibility tool       | Enable [AWS Cost Explorer](https://aws.amazon.com/aws-cost-management/aws-cost-explorer/) and use [AWS Cost & Usage Report](https://docs.aws.amazon.com/cur/latest/userguide/what-is-cur.html) for more details |
| Define Key Performance Metric (KPI) | Track KPIs using unit costs (EC2 hourly spend, cost per transaction)<br/>- Set KPI goals and alarm on anomalies.                                                                                              |
| Enable stakeholders                 | Provide access to data in appropriate format (i.e. executive summary), provide training to enable usage of visibility tools.                                                                                  |

# Cost optimization techniques

| Technique                                                                                                                                                                                                                                       | Description                                                                                 |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| [Tagging Best Practices](https://docs.aws.amazon.com/whitepapers/latest/tagging-best-practices/tagging-best-practices.html) & [Tag policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html) | -                                                                                           |
| Commitment based discounts                                                                                                                                                                                                                      | Reserved instances provides discounts, compared to On-Demand                                |
| Use [Amazon EC2 Spot instances](../3_ComputeServices/AmazonEC2/Readme.md) for non-production                                                                                                                                                    | -                                                                                           |
| Identify optimization opportunities using audit-based analysis                                                                                                                                                                                  | -                                                                                           |
| Cost aware operational processes                                                                                                                                                                                                                | -                                                                                           |
| Right-size your resources                                                                                                                                                                                                                       | Right-size before making commitments ([Saving plans](https://aws.amazon.com/savingsplans/)) |
| Use automation to cleanup waste                                                                                                                                                                                                                 | Right-size low-utilization resources & shut down unused, idle resources.                    |
| Prioritize high ROI optimizations                                                                                                                                                                                                               | Architect for cost                                                                          |
| Design fault-tolerant systems and use [Amazon EC2 spot instances](../3_ComputeServices/AmazonEC2/Readme.md)                                                                                                                                     | Use Auto-scaling to scale with demand (Amazon EC2, Amazon DynamoDB etc.)                    |
| Implement data lifecycle rules (with S3 storage classes, object lifecycles etc.)                                                                                                                                                                | -                                                                                           |
| Select best scaling strategy                                                                                                                                                                                                                    | -                                                                                           |

# References
- [Drilldown: AWS Budgets vs Cost Explorer](https://www.densify.com/finops/aws-budgets-vs-cost-explorer/)