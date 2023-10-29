# Neo4j
- [Neo4j](https://neo4j.com/) is a graph database, which is widely used.
- [Cypher](https://neo4j.com/developer/cypher/) is a declarative query language for property graphs, created for the Neo4j graph database.

# Real world use cases
- [User activity relationship store at Instagram](../../../3_HLDDesignProblems/SocialNetworkFacebookInstagramDesign/Readme.md)

# Terminologies

| Term          | Description                                                                                                                                        |
|---------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| Nodes         | Nodes describe entities (discrete objects) of a domain.<br/>- Nodes can have zero or more labels to define (classify) what kind of nodes they are. |
| Relationships | Relationships describes a connection between a source node and a target node.<br/>- Relationships always has a direction (one direction).<br/>- Relationships must have a type (one type) to define (classify) what type of relationship they are.   |

![](https://neo4j.com/docs/getting-started/current/_images/graph_simple.svg)