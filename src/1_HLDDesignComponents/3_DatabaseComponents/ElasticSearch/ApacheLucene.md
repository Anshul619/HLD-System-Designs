
# Apache Lucene
- [Apache Lucene](https://lucene.apache.org/core/) is a text search engine. 
- It stores text in a custom binary format optimized for retrieval purposes. 
- The format is highly optimized and complicated.
- Lucene uses the concept of `indices containing documents`.
    - Internally every index consists of several segments.
    - Segments are saved in several files in the file system.
    - Documents are split up in several lookup structures, residing in the files.
- When you browse the data folder of [ElasticSearch](), you see this lucene index and segment structure.
    - There is no storage of json formatted data on the file system level.
    - The files contain `optimized binary data` and `you need to pass through the elastic API to get a JSON representation of a document`.

# What is tokenizer?
- Tokenizers are used to generate the `tokens from a text string`.
- It breaks down the text string into tokens where it finds whitespace or other punctuation symbols.

## Inverted indexes and Index Terms
- Internally, Lucene stores data in inverted indexes ( term and documents mapped to it ).
- The inverted index maps `terms` to `documents` (and possibly positions in the documents) containing the term.
- Using inverted indexes, lucene internally & efficiently finds documents with given term prefixes.
- For example - find all documents, starting with `c`.

![img.png](assests/inverted_indexes.png)

# Reference
- [How does elasticsearch store data?](https://stackoverflow.com/questions/57328151/how-does-elasticsearch-store-data)