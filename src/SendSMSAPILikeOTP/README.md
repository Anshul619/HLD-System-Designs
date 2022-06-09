# Intro
- Consider generate OTP service A
- A service calls B service to send the notification to the user using multiple SMS providers like Twillo, Airtel etc.

# AutoScaling
## App Servers
- Option1 - Use AWS AutoScaling
- Option2 - Based on app server's memory usage/CPU usage, heart beat etc., we can add/delete another app server.

## Message Queues - A to B

Based on Throttling, autoscaling of the queue system can be done
- Based on number of messages in the queue, the workers can keep adding up ( with min, max configuration )
- If max configuration of workers is reached, another queue would be added in the cluster.
- Reference - https://developer.ibm.com/tutorials/auto-scale-rabbitmq-consumers-by-queue-size-on-openshift/