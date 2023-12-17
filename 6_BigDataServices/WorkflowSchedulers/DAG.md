# DAGs - Directed Acyclic Graphs
- Use [Airflow](ApacheAirflow.md) to author workflows as [directed acyclic graphs (DAGs)](https://github.com/apache/airflow) of tasks.
- The [Airflow]() scheduler executes your tasks on an array of workers while following the specified dependencies.
- Rich command line utilities make performing complex surgeries on DAGs a snap.
- The rich user interface makes it easy to visualize pipelines running in production, monitor progress, and troubleshoot issues when needed.

# Sample DAG attributes

|                   | Remarks                                                          |
|-------------------|------------------------------------------------------------------|
| ID                | Alphanumeric, Unique id                                          |
| Args              | Email settings, other args                                       |
| Start Date        | When this workflow should start                                  |
| Schedule Interval | How frequently this workflow should execute?                     |
| Start callback    | Script, function which should be executed on start               |
| Failure callback  | Script, function which should be executed on failure of workflow |