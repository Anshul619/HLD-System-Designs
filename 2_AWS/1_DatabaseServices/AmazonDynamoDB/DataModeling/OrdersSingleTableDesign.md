# Single Table Design

| Access Pattern                                                           | Table/GSI | PK condition | PK Example | SK condition                               | SK Example                          |
|--------------------------------------------------------------------------|-----------|--------------|------------|--------------------------------------------|-------------------------------------|
| Get customer for a given customerId                                      | Table     | customerId   | c#12345    | customerId                                 | c#12345                             |
| Get product for a given productId                                        | Table     | productId    | p#12345    | productId                                  | p#12345                             |
| Get warehouse for a given warehouseId                                    | Table     | warehouseId  | w#12345    | warehouseId                                | w#12345                             |
| Get product inventory for all warehouses by a productId                  | Table     | productId    | p#12345    | begins with "w#"                           |                                     |
| Get order for a given orderId                                            | Table     | orderId      | o#12345    | orderId                                    | o#12345                             |
| Get all shipments for a given orderId                                    | Table     | orderId      | o#12345    | begins with "sh#"                          |                                     |
| Get invoice for a given orderId                                          | Table     | orderId      | o#12345    | begins with "i#"                           |                                     |
| Get all products for a given orderId                                     | Table     | orderId      | o#12345    | begins with "p#"                           |                                     |
| Get all orders for a given productId during a given date range           | GSI1      | productId    | p#12345    | between date1 and date2                    | between "2020-06-10" & "2020-10-10" |
| Get invoice for a given invoiceId                                        | GSI1      | invoiceId    | i#12345    | invoiceId                                  | i#12345                             |
| Get all payments for a given invoiceId                                   | GSI1      | invoiceId    | i#12345    | invoiceId                                  | i#12345                             |
| Get shipment detail for a given shipmentId                               | GSI1      | shipmentId   | sh#12345   | shipmentId                                 | sh#12345                            |
| Get all shipments for a given warehouseId                                | GSI2      | warehouseId  | w#12345    | begins with "sh#"                          |                                     |
| Get inventory for all products for a given warehouseId                   | GSI2      | warehouseId  | w#12345    | begins with "p#"                           |                                     |
| Get all invoices for a given customer during a given date range          | GSI2      | customerId   | c#12345    | begins with "i#" & between date1 and date2 |                                     |
| Get all products ordered by a given customerId during a given date range | GSI2      | customerId   | c#12345    | begins with "p#" & between date1 and date2 |                                     |

# Read more
- [Fundamentals of Amazon DynamoDB Single Table Design with Rick Houlihan](https://www.youtube.com/watch?v=KYy8X8t4MB8)