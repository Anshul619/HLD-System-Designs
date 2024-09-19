# Types of Scaling

| Type            | Description                                                                                                                 | Formula                                                     |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| Dynamic Scaling | Automatically increase or decrease resource capacity in relation to the demand.                                             | Based on demand                                             |
| Fleet Scaling   | Maintain desired number of instances across AZs (for [high availability](../../7a_HighAvailability/Readme.md)) at all time. | Desired-Capacity = Min-Capacity = Max-Capacity = Fleet-Size |