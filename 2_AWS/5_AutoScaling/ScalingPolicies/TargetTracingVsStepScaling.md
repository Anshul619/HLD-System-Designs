# Target Tracing vs Step Scaling

|                    | Target Tracing                                                   | Step Scaling                                                        |
|--------------------|------------------------------------------------------------------|---------------------------------------------------------------------|
| Setup              | Setup is simple - No alarms setup, One scaling policy            | Alarms setup needed, separate policies for `scale-in`, `scale-out`. |
| Recommended by AWS | :white_check_mark: Yes                                           | -                                                                   |
| ECS Service Metric | Avg CPU, Avg Memory, ALBRequestCountPerTarget, CustomMetric etc. | Avg/Max CPU, Avg/Max Memory etc.                                    |



