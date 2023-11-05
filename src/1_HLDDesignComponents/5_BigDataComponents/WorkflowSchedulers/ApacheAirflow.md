# Apache Airflows
- [Apache Airflow](https://airflow.apache.org/) is a platform to programmatically author, schedule, and monitor workflows.
- When workflows are defined as code, they become more maintainable, versionable, testable, and collaborative.

# DAGs - Directed Acyclic Graphs
- Use Airflow to author workflows as [directed acyclic graphs (DAGs)](https://github.com/apache/airflow) of tasks. 
- The Airflow scheduler executes your tasks on an array of workers while following the specified dependencies. 
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


# Read more
- [Apache Airflow - Wikipedia](https://en.wikipedia.org/wiki/Apache_Airflow)
- [Airflow: a workflow management platform](https://medium.com/airbnb-engineering/airflow-a-workflow-management-platform-46318b977fd8)