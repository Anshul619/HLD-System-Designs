# Task Definition
- A blueprint for our application and describes one or more containers through attributes.
- To prepare your application to run on [Amazon ECS](Readme.md), you create a task definition.
- The task definition is a text file, in JSON format, that describes one or more containers.
- A task definition is similar to a blueprint that describes the resources you need to run a container, such as CPU, memory, ports, images, storage, and networking information.

| Param                                                                                                               | Required for what launch type? (EC2 vs Fargate)       | Description                                                                                                                                                                                                                                                                                                                                    |
|---------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Task Definition Name                                                                                                | Both                                                  | Name of task definition.                                                                                                                                                                                                                                                                                                                       |
| [Task IAM Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)                    | Both                                                  | [IAM Role](../../2a_IdentityServices/AWSIAM/Readme.md) that tasks can use to make API requests to authorized AWS resources                                                                                                                                                                                              |
| [Task Execution IAM Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html) | Both                                                  | [This IAM role](../../2a_IdentityServices/AWSIAM/Readme.md) is required by tasks to pull container images and publish container logs to [Amazon Cloudwatch](../../8_MonitoringServices/AmazonCloudWatch/Readme.md) on our behalf.                                                                                              |
| Launch Type                                                                                                         | Both                                                  | Whether tasks are hosted on [Amazon EC2](../../3_ComputeServices/AmazonEC2/Readme.md) or [Fargate](../../3_ComputeServices/AWSFargate.md).                                                                                                                                                                                                     |
| [Container Definitions](#container-definition)                                                                      | [Fargate only](../../3_ComputeServices/AWSFargate.md) | [Docker image](../../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Docker/Readme.md) to use with each container in your task. (Stored/Pulled from [Amazon ECR](../AmazonECR.md))                                                                                                                                                   |
| [Task Size (CPU & Memory)](https://docs.aws.amazon.com/AmazonECS/latest/bestpracticesguide/capacity-tasksize.html)  | [Fargate only](../../3_ComputeServices/AWSFargate.md) | How much CPU and Memory to use for each task? <br/>- :star: [Container level memory settings](#container-definition) are optional when task size is set.<br/>- Task size is not supported for Windows containers.                                                                                                                              |
| [Networking Mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)                 | Both                                                  | For [fargate](../../3_ComputeServices/AWSFargate.md), we have only option available is AWS VPC in addition to [Docker Bridge](../../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Docker/Readme.md), [Docker Host Only](../../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Docker/Readme.md) & None networking modes. |
| [Logging Configuration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)        | Both                                                  | -                                                                                                                                                                                                                                                                                                                                              |
| Others                                                                                                              | -                                                     | Data Volumes etc.                                                                                                                                                                                                                                                                                                                              |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html)

# Example task definition

````json
{
  "family": "webserver",
  "containerDefinitions": [{
    "name": "web",
    "image": "nginx",
    "memory": "100",
    "cpu": "99"
  }],
  "requiresCompatibilities": ["FARGATE"],
  "networkMode": "awsvpc",
  "memory": "512",
  "cpu": "256"
}
````

# Launch Type

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679641200/e3b8x-vNw5aXnG1DYUfTwg/tincan/d03722b85f9d2b3a05e4c74bd586ea9b1f52f81a/assets/tEQp6aZrJa_-ZlHv_sTM1AeRlF8LA77Cz.png)

# Amazon ECS task placement strategies

| Strategy   | Description                                                                                                                                                                                                                                     |
|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| binpack    | Tasks are placed on container instances so as to leave the least amount of unused CPU or memory. <br/>- This strategy minimizes the number of container instances in use.                                                                       |
| random     | Tasks are placed randomly.                                                                                                                                                                                                                      |
| spread     | Tasks are placed evenly based on the specified value. Accepted values are instanceId (or host, which has the same effect), or any platform or custom attribute that's applied to a container instance, such as attribute:ecs.availability-zone. |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html)

# Amazon ECS placement constraints

| Constraint         | Description                                                                                                                                              |
|--------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| distinctInstance   | Place each task on a different container instance. This task placement constraint can be specified when either running a task or creating a new service. |
| memberOf           | Place tasks on container instances that satisfy an expression.                                                                                           |
| ecs.os-family      | LINUX or WINDOWS_SERVER_<OS_Release>_<FULL or CORE>.                                                                                                     |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
