# Dockerfile vs Docker-compose

| Component      | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Sample file                                                              |
|----------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| Dockerfile     | A Dockerfile is a simple text file that contains the commands a user could call to assemble an image whereas Docker Compose is a tool for defining and running multi-container Docker applications.                                                                                                                                                                                                                                                                                                          | [SampleDockerFile](SampleDockerFile)                                     |
| Docker Compose | Docker Compose define the services that make up your app in docker-compose.yml so they can be run together in an isolated environment. <br/>- It gets an app running in one command by just running docker-compose up. <br/>- Docker compose uses the Dockerfile if you add the build command to your project’s docker-compose.yml. <br/>- Your Docker workflow should be to build a suitable Dockerfile for each image you wish to create, then use compose to assemble the images using the build command. | [docker-compose.sample-service.yaml](docker-compose.sample-service.yaml) |

# Docker Compose
- In [docker compose](https://docs.docker.com/get-started/08_using_compose/), you can specify image, environment variables etc.
- It should create the corresponding micro containers for those different microservices.

## Up
- Start up the application stack using the `docker-compose up` command. 
- We’ll add the -d flag to run everything in the background.

````shell
docker-compose -f docker-compose.sample-service.yaml -f service/docker-compose.service.yaml up -d
````

## Down
- When you’re ready to tear it all down, simply run `docker-compose down` or hit the trash can on the Docker Dashboard for the entire app. 
- The containers will stop and the network will be removed.

````shell
docker-compose -f docker-compose.sample-service.yaml -f service/docker-compose.service.yaml down
````

## Logs
- Let’s look at the logs using the `docker-compose logs -f` command. 
- You’ll see the logs from each of the services interleaved into a single stream. 
- This is incredibly useful when you want to watch for timing-related issues. 
- The -f flag “follows” the log, so will give you live output as it’s generated.

````shell
docker-compose -f docker-compose.sample-service.yaml -f service/docker-compose.service.yaml` logs -f
````

## Specify Runtime options with Memory, CPUs, and GPUs

````shell
docker run -it \
--cpu-rt-runtime=950000 \
--ulimit rtprio=99 \
--cap-add=sys_nice \
debian:jessie
````

# Docker Image Layers
- [Each layer is an image itself](https://vsupalov.com/docker-image-layers/), just one without a human-assigned tag.
- [Each instruction in a Dockerfile results in a layer](). (Except for multi-stage builds, where usually only the layers in the final image are pushed, or when an image is squashed to a single layer).
- They have auto-generated IDs though.
- Each layer stores the changes compared to the image it’s based on.
- An image can consist of a single layer (that’s often the case when the squash command was used).
- Layers are used to avoid transferring redundant information and skip build steps which have not changed (according to the Docker cache).

# References
- [Big Misconceptions about Bare Metal, Virtual Machines, and Containers](https://www.youtube.com/watch?v=Jz8Gs4UHTO8)