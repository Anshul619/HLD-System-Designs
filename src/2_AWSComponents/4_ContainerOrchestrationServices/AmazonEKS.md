
# Amazon EKS - Amazon Elastic Kubernetes Service
- [Amazon Elastic Kubernetes Service (Amazon EKS)](https://aws.amazon.com/eks/) is a managed container service to run and scale [Kubernetes](../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Kubernates.md) applications in the cloud or on-premises.
- Applications running on Amazon EKS are fully compatible with applications running on any standard [Kubernetes](../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Kubernates.md) environment, whether running in on-premises data centers or public clouds. 

![img.png](../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/assets/AWS_Elastic_Load_Balancer.png)

# Components

| Component             | AWS Service                                                                                                                                                                                                                                                                                                  |
|-----------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Networking            | EKS infrastructure uses [Amazon Virtual Private Cloud (VPC)](../1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md) to provide networking between the Kubernetes control plane and worker nodes.                                                                                               |
| Load balancing        | EKS uses [AWS Elastic Load Balancer (ELB)](../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) to distribute traffic between worker nodes.                                                                                                                              |
| Storage               | EKS supports a variety of storage options, including [Amazon Elastic Block Store (EBS)](../7_StorageServices/1_BlockStorageTypes/AmazonEBS/Readme.md), [Amazon Elastic File System (EFS)](../7_StorageServices/2_FileStorageTypes/AmazonEFS.md), and [Amazon S3](../7_StorageServices/3_ObjectStorageS3/Readme.md). |
| Control Plane         | The [EKS control plane](https://docs.aws.amazon.com/eks/latest/userguide/clusters.html) manages the Kubernetes API server and other components required to run Kubernetes on AWS.                                                                                                                            |
| Worker Nodes          | Either [Amazon EC2](../3_ComputeServices/AmazonEC2/Readme.md) or [AWS Fargate](../3_ComputeServices/AWSFargate.md) can be used as worker nodes.                                                                                                                                                              |
| Permission Management | [AWS Identity and Access Management (IAM)](../2a_IdentityServices/AWSIAM/Readme.md) is used to manage access to the EKS control plane and worker nodes.                                                                                                                         |
| Cluster Autoscaler    | The Kubernetes [Horizontal Pod Autoscaler](https://docs.aws.amazon.com/eks/latest/userguide/horizontal-pod-autoscaler.html) automatically scales the number of Pods in a deployment, replication controller, or replica set based on that resource's CPU utilization.                                                                                                                                                                                               |

# Modular and Scalable Amazon EKS Architecture on AWS

![img.png](assets/eks_architecture.png)

[Read more](https://aws.amazon.com/quickstart/architecture/amazon-eks/)

# References
- [Containers on AWS Overview: ECS | EKS | Fargate | ECR](https://www.youtube.com/watch?v=AYAh6YDXuho)
- [Implementing Microservices on AWS](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/microservices.html)
- [EKS cluster for EC2 instances - Cloudformation template](../9_InfrastructureAsCode/AWSCloudFormation/sample_templates/EKS_ECS.yml)
- [How to build a AWS EKS infrastructure?](https://medium.com/@brunorodrigueslopes/how-to-build-a-aws-eks-infrastructure-f4abc080710f)