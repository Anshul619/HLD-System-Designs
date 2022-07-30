
# App Provisioning
- We use Docker containers on Mesos to run our microservices with consistent configurations scalably, with help from Aurora for long-running services and cron jobs.
- One of our infrastructure teams, Application Platform, produced a template library that builds services into shippable Docker images.

# Statelessness - REST APIs
- A system without state is much easier to scale. Imagine you have a web server serving requests. If you follow RESTful principles, these servers will be stateless. That means that you scale up horizontally by adding extra instances. You send traffic to each by putting a load balancer in front. That’s a proven and effective strategy that will take you far.
- To name another example, let’s consider containers. Container technologies, such as Docker and Kubernetes, are everywhere. Spinning up a ton of containers based on automated triggers is something that Kubernetes excels at, especially if there’s no need to hold state.

# References
- [The Uber Engineering Tech Stack, Part I: The Foundation](https://eng.uber.com/tech-stack-part-one-foundation/)