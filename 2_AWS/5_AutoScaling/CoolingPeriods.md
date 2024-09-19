# Cooling Periods
- [Cooldown periods](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-scaling-cooldowns.html) help to prevent the initiation of additional scaling activities before the effects of previous activities are visible.

| Periods          | Description                                                                                                     | Default Value |
|------------------|-----------------------------------------------------------------------------------------------------------------|---------------|
| ScaleOutCooldown | The amount of time, in seconds, to wait for a previous scale-out activity to take effect.                       | 300 seconds   |
| ScaleInCooldown  | The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start. | 300 seconds   |