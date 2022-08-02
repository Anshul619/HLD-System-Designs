
# App Provisioning
- We use Docker containers on Mesos to run our microservices with consistent configurations scalably, with help from Aurora for long-running services and cron jobs.
- One of our infrastructure teams, Application Platform, produced a template library that builds services into shippable Docker images.

# Statelessness - REST APIs
- A system without state is much easier to scale. Imagine you have a web server serving requests. If you follow RESTful principles, these servers will be stateless. That means that you scale up horizontally by adding extra instances. You send traffic to each by putting a load balancer in front. That’s a proven and effective strategy that will take you far.
- To name another example, let’s consider containers. Container technologies, such as Docker and Kubernetes, are everywhere. Spinning up a ton of containers based on automated triggers is something that Kubernetes excels at, especially if there’s no need to hold state.

# [Docker Compose]( https://docs.docker.com/get-started/08_using_compose/)
- Specify image, environment variables etc.
- It should create the corresponding micro containers for those different micro-services.

## Up
- Start up the application stack using the docker-compose up command. We’ll add the -d flag to run everything in the background. 

````
docker-compose -f docker-compose.yaml -f service-credit/docker-compose.service-credit.yaml up -d
````

## Down
- When you’re ready to tear it all down, simply run docker-compose down or hit the trash can on the Docker Dashboard for the entire app. The containers will stop and the network will be removed.

````
docker-compose -f docker-compose.yaml -f service-credit/docker-compose.service-credit.yaml down
````

## Logs
- Let’s look at the logs using the docker-compose logs -f command. You’ll see the logs from each of the services interleaved into a single stream. This is incredibly useful when you want to watch for timing-related issues. The -f flag “follows” the log, so will give you live output as it’s generated.

````
docker-compose -f docker-compose.yaml -f service-credit/docker-compose.service-credit.yaml`  logs -f
````

### Docker command

````
reflex -r "\.go$$" -s -- sh -c "go run ./cmd/api/"
````


# [Kubernates](https://www.techtarget.com/searchitoperations/tutorial/A-step-by-step-tutorial-for-Kubernetes-implementation)
- TBD

# References
- [The Uber Engineering Tech Stack, Part I: The Foundation](https://eng.uber.com/tech-stack-part-one-foundation/)