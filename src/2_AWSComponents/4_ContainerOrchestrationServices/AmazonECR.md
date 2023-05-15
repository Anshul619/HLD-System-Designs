# Amazon Elastic Container Registry (Amazon ECR)
- [Amazon Elastic Container Registry (Amazon ECR)](https://aws.amazon.com/ecr/) is a fully managed container registry offering high-performance hosting, so you can reliably deploy application images and artifacts anywhere. (store, manage, deploy Docker container images)
- Amazon ECR store, manage & deploy [Docker container images](../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Docker/Readme.md).
- ECR is integrated with [ECS](../3_ComputeServices) & [EKS](AmazonEKS.md), simplifying our development to production workflow.
- ECR hosts our images in [highly available](../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) and [scalable architecture](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability).

![](https://play.whizlabs.com/frontend/web/media/task_id_199/ecr_lab.png)

# Steps
- A [docker image can be uploaded in Amazon ECR](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-push-ecr-image.html).
- And then it can be accessed through ARN. (by [ECS](../3_ComputeServices), [EKS](AmazonEKS.md) or On-Perm)

# Terminologies

| Term                | Description                                                                                                                 |
|---------------------|-----------------------------------------------------------------------------------------------------------------------------|
| Registry            | An ECR registry is provided to each AWS account, we can create image repositories in our registry and store images in them. |
| Repository          | An ECR image repository contains our Docker images.                                                                                                                            |
| Repository policy   | We can control access to our repositories and the images within them with repository policies.                                                                                                                            |
| Authorization token | Our Docker client must authenticate to Amazon ECR registries as an AWS user before it can push and pull images. The AWS CLI get-login command provides us with authentication credentials to pass to Docker.                                                                                                                            |
| Image               | We can push and pull container images to our repositories. We can use these images locally on your development system, or we can use them in Amazon ECS task definitions.                                                                                                                                                                                                                                                                                                                                        |

# Other Points
- Amazon ECR is an alternative to [Docker Hub](https://hub.docker.com/).