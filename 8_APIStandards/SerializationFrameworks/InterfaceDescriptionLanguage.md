# IDL Language Rules
- Every field must have a unique, positive integer identifier ("=1", "=2" or "1:", "2:")
- Fields may be marked as **required** or **optional**
- structs/messages may contain other structs/messages
- You may specify an optional **default** value for a field
- Multiple structs/messages can be defined and referred to within the same .thrift/.proto file.

````
message SumRequest {
  int32 first_number = 1;
  int32 second_number = 2;
}
````