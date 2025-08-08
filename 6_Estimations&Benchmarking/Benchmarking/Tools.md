# Benchmarking tools

# How to Benchmark PostgreSQL Performance Using Sysbench?

````
sysbench 
--db-driver=pgsql 
--report-interval=2 
--oltp-table-size=100000 
--oltp-tables-count=24 
--threads=64 
--time=60 
--pgsql-host=192.168.55.62 
--pgsql-port=5432 
--pgsql-user=sbtest 
--pgsql-password=password 
--pgsql-db=sbtest 
/usr/share/sysbench/tests/include/oltp_legacy/select.lua 
run
````

[Read more](https://severalnines.com/blog/how-benchmark-postgresql-performance-using-sysbench/)