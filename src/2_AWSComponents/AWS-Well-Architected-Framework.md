# AWS Well-Architected Framework
- [AWS Well-Architected](https://aws.amazon.com/architecture/well-architected) helps cloud architects build secure, high-performing, resilient, and efficient infrastructure for a variety of applications and workloads.
- [AWS Well-Architected Tool](https://aws.amazon.com/well-architected-tool/) is designed to help you review the state of your applications and workloads against architectural best practices, identify opportunities for improvement, and track progress over time.
- Primary goal of performing a Well-Architected Framework Review is to help you understand the pros and cons of decisions you make while building systems on AWS.

# Six Pillars

|                | [Operational Excellence Pillar](https://docs.aws.amazon.com/wellarchitected/latest/operational-excellence-pillar/welcome.html) | [Security Pillar](2_SecurityAndIdentityServices/Readme.md)                                                                                | Reliability Pillar                                                                                                                       | Performance Efficiency Pillar                                                                                                                                           | [Cost Optimization Pillar](https://docs.aws.amazon.com/wellarchitected/latest/cost-optimization-pillar/welcome.html)                                                                              |
|----------------|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Description    | The operational excellence pillar focuses on running and monitoring systems, and continually improving processes and procedures. | The security pillar focuses on protecting information and systems.                                                                        | The reliability pillar focuses on workloads performing their intended functions and how to recover quickly from failure to meet demands. | The performance efficiency pillar focuses on structured and streamlined allocation of IT and computing resources.                                                       | The cost optimization pillar focuses on avoiding unnecessary costs.                                                                                                                               |
| Key Topics     | Key topics include automating changes, responding to events, and defining standards to manage daily operations.                | Key topics include confidentiality and integrity of data, managing user permissions, and establishing controls to detect security events. | Key topics include distributed system design, recovery planning, and adapting to changing requirements.                                  | Key topics include selecting resource types and sizes optimized for workload requirements, monitoring performance, and maintaining efficiency as business needs evolve. | Key topics include understanding spending over time and controlling fund allocation, selecting resources of the right type and quantity, and scaling to meet business needs without overspending. |
| Best Practices | [Key Topics](#operation-excellence-pillar)                                                             | -                                                                                                                                         | -                                                                                                                                        | -                                                                                                                                                                       | -                                                                                                                                                                                                 |

# Steps
- Define workload
- Apply one of the AWS Well-Architected lenses or your own custom lens
- Begin your review

# AWS Well-Architected Lenses

Lenses provide additional guidance tailored to specific industry and technology use cases.
- Serverless lens
- SaaS lens
- FTR lens (Foundational Technical Review)
- Machine learning lens
- Analytics lens
- HPC lens (High performance computing)
- IoT lens (Internet of Things)
- [Financial services lens](#financial-services-industry-lens---aws-well-architected-framework)

# Operation Excellence Pillar

| Principal                                               | AWS Service                                                                                      |
|---------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| Design Operation Priorities                             | [AWS Trust Advisor](https://aws.amazon.com/premiumsupport/technology/trusted-advisor/)           |
| Design for Operations                                   | [AWS Cloudformation](9_InfrastructureAsCode/AWSCloudFormation/Readme.md)<br/>- Different environments for dev, staging and production.                  |
| Operational Readiness                                   | [AWS System Manager](2_SecurityAndIdentityServices/2_DataProtectionServices/AWSSystemManager.md) |
| Operational Health                                      | [AWS CloudWatch](8_MonitoringServices/AmazonCloudWatch.md)                                       |
| Event Response                                          | [AWS Lambda](3_ComputeServices/AWSLambda/Readme.md)                                              |
| Use analytics to learn from experience                  | [Amazon OpenSearch](6_DatabaseServices/AmazonOpenSearch.md)                                      |
| Share learnings with libraries, scripts & documentation | [AWS CodeCommit](9_InfrastructureAsCode/AWSCodePipeline.md)                                              |

# Financial Services Industry Lens - AWS Well-Architected Framework
- The financial services industry has a unique set of risks and regulatory requirements. 
- Adding the [FSI Lens](https://docs.aws.amazon.com/wellarchitected/latest/financial-services-industry-lens/welcome.html) to reviews can address these requirements.

## General Design Principles
- Documented operational planning
- Automated infrastructure and application deployment
- Security by design — Financial services institutions must consider a [Security by Design (SbD)](https://docs.aws.amazon.com/wellarchitected/latest/financial-services-industry-lens/general-design-principles.html) approach to implement architectures that are pre-tested from a security perspective.
- Automated Governance — Human working with runbooks and checklists often lead to delays and inaccurate results.

# Tools
- [Stack.New](https://stack.new/) lets you post new snippets for Cloud Stack Configurations (Terraform YAML, Kubernetes, Helm, etc), and share easily. Type your config below and then click 'Create'. You'll get a shortlink that you can send through Slack or emails!
- [AWS Well-Architected Partner Program](https://aws.amazon.com/partners/programs/well-architected/)


