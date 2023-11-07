# [Hibernate & JPA](https://www.javatpoint.com/jpa-vs-hibernate)

## What is JPA?
- JPA is just a specification that facilitates object-relational mapping to manage relational data in Java applications.
- It provides a platform to work directly with objects instead of using SQL statements.

## What is Hibernate?
- Hibernate is a Java framework which is used to store the Java objects in the relational database system.
- It is an open-source, lightweight, ORM (Object Relational Mapping) tool.

## [Hibernate example using JPA, MySQL](https://www.geeksforgeeks.org/hibernate-example-using-jpa-and-mysql/)

## [Eager/Lazy Loading In Hibernate](https://www.baeldung.com/hibernate-lazy-eager-loading)
- Lazy Loading is a design pattern that we use to defer initialization of an object as long as it's possible.
- Eager Loading is a design pattern in which data initialization occurs on the spot.

## [Difference Between First level cache and Second level cache in Hibernate](https://www.tutorialspoint.com/difference-between-first-level-cache-and-second-level-cache-in-hibernate)
- First level cache is a session level cache & it is always associated with `session level object`. This type of cache is used for minimizing Db interaction by caching the state of the object. That is instead of updating after every modification done in the transaction, it updates the transaction only at the end of the transaction.
- Second level cache is a session factory level cache & it is available across all sessions. While running the transactions, in between it loads the objects at the `Session Factory level`, so that those objects will be available to the entire application, not bound to a single user. By default, it is disabled in hibernate.

## [Difference Between save and saveOrUpdate in Hibernate](https://www.javaguides.net/2019/12/hibernate-difference-between-save-and-saveorupdate-method.html)
- `session.save()` generates a new identifier and INSERT record into a database while `Session.saveOrUpdate()` can either INSERT or UPDATE based upon existence of a record.

## [Difference b/w get() & load()](https://www.journaldev.com/3472/hibernate-session-get-vs-load-difference-with-examples)
- `get()` loads the data as soon as it’s called whereas `load()` returns a proxy object and loads data only when it’s actually required, so `load()` is better because it supports `lazy loading`.
- Since `load()` throws exception when data is not found, we should use it only when we know data exists.
- We should use `get()` when we want to make sure data exists in the database.

## [Session vs SessionFactory](https://stackoverflow.com/questions/22470968/differences-between-session-vs-session-factory-hibernate)
- `SessionFactory` is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction.
- `Session` is short-lived while `SessionFactory` objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.
- The `SessionFactory` is a heavyweight object; it is usually created during application start up and kept for later use. 
- The SessionFactory is a thread safe object and used by all the threads of an application.

## When to implement RAW query in hibernate?
- When it's a complex logic to be implemented, we should implement RAW in Hibernate.
- Hibernate supports [HQL language][https://www.tutorialspoint.com/hibernate/hibernate_query_language.htm]

