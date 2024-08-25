# NRQL - Query Language
- [Read more](https://docs.newrelic.com/docs/query-your-data/nrql-new-relic-query-language/get-started/introduction-nrql-how-nrql-works/)

````sql
SELECT function(attribute) [AS 'label'][, ...] 
  FROM data type
  [WHERE attribute [comparison] [AND|OR ...]][AS 'label'][, ...]
  [FACET attribute | function(attribute)]
  [LIMIT number]
  [SINCE time]
  [UNTIL time]
  [WITH TIMEZONE timezone]
  [COMPARE WITH time]
  [TIMESERIES time]
````

# Constructs

| Construct    | Remarks                                                    |
|--------------|------------------------------------------------------------|
| FACET        | Group your data with FACET - supports 1 or multiple FACETs |
| TIMESERIES   |                                                            |
| SINCE        |                                                            |
| UNTIL        |                                                            |
| COMPARE WITH |                                                            |

