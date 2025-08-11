# Two phase commit protocol
- In transaction processing, databases, and computer networking, the [two-phase commit protocol (2PC, tupac)](https://en.wikipedia.org/wiki/Two-phase_commit_protocol) is a type of atomic commitment protocol (ACP). 
- It is a distributed algorithm that coordinates all the processes that participate in a distributed atomic transaction on whether to commit or abort (roll back) the transaction. 

````sql
BEGIN;

UPDATE users SET name = 'sample';

COMMIT; // if everything worked fine
ROLLBACK; // in case of error
````