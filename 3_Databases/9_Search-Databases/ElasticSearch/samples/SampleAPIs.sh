curl -X PUT "localhost:9200/books?pretty" 
curl -XGET 'localhost:9200/books/_mapping?&pretty'
curl -XPOST 'localhost:9200/books/_doc?pretty' -d @books.json -H 'Content-Type: application/json'
curl -XDELETE 'localhost:9200/books?pretty'