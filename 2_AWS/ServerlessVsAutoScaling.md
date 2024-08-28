# Serverless vs Autoscaling

| Feature              | [Serverless](AWS-Serverless-Architecture.md)       | [AutoScaling](3a_AutoScaling/Readme.md)          |
|----------------------|----------------------------------------------------|--------------------------------------------------|
| Scalability          | Automatic, cloud-provider managed                  | Manual configuration required                    |
| Cost                 | Based on function executions and resources         | Based on instance provisioning and usage         |
| Administration       | Reduced administrative burden                      | Requires manual management                       |
| Workload Suitability | Suitable for unpredictable, intermittent workloads | Suitable for predictable, steady-state workloads |