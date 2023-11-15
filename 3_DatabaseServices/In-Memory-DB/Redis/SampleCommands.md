# String data type

```
SET newkey "the redis string"
> OK
GET newkey
> "the redis string"
MGET foo bar
> 1. "a"
> 2. "b"
```

# JSON data type

```
JSON.SET example $ '[ true, { "answer": 42 }, null ]'
> OK
JSON.GET example $
"[[true,{\"answer\":42},null]]"
```

# Hashes data type

```
HSET user:1000 username antirez password P1pp0 age 34
HGETALL user:1000
HSET user:1000 password 12345
HGETALL user:1000
```

# Lists data Type

```
LPUSH mylist a   # now the list is "a"
LPUSH mylist b   # now the list is "b","a"
RPUSH mylist c   # now the list is "b","a","c" (RPUSH was used this time)
```

### Sorted sets

```
redis 127.0.0.1:6379> zadd w3resourcelist 0 redis
(integer) 1
redis 127.0.0.1:6379> zadd w3resourcelist 0 mongodb
(integer) 1
redis 127.0.0.1:6379> zadd w3resourcelist 0 rabitmq
(integer) 1
redis 127.0.0.1:6379> zadd w3resourcelist 0 rabitmq
(integer) 0
redis 127.0.0.1:6379> ZRANGEBYSCORE w3resourcelist 0 1000

1) "redis"
2) "mongodb"
3) "rabitmq"
```