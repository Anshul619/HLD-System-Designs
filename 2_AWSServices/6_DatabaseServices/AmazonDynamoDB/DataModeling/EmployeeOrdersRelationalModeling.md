# Employee-Orders - Relational Modeling
- [Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-modeling-nosql-B.html)

| Table         | Primary key  | Sort Key      |
|---------------|--------------|---------------|
| HR-Employee   | EmployeeID   | Employee Name |
| HR-Region     | RegionID     | Region Name   |
| HR-Country    | CountryId    | Country Name  |
| HR-Location   | LocationID   | Country Name  |
| HR-Job        | JobID        | Job Title     |
| HR-Department | DepartmentID | DepartmentID  |
| OE-Customer   | CustomerID   | AccountRepID  |
| OE-Order      | OrderID      | CustomerID    |
| OE-Product    | ProductID    | Product Name  |
| OE-Warehouse  | WarehouseID  | Region Name   |

# Entity Items

![](https://docs.aws.amazon.com/images/amazondynamodb/latest/developerguide/images/tablegsi.png)

# GSI

![](https://docs.aws.amazon.com/images/amazondynamodb/latest/developerguide/images/tabledesign.png)

# Access Patterns

| Access patterns                                                           | Query conditions                                                                           |
|---------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| Look up Employee Details by Employee ID                                   | Primary Key on table, ID="HR-EMPLOYEE"                                                     |
| Query Employee Details by Employee Name                                   | Use GSI-1, PK="Employee Name"                                                              |
| Get an employee's current job details only                                | Primary Key on table, PK=HR-EMPLOYEE-1, SK starts with "JH"                                |
| Get Orders for a customer for a date range                                | Use GSI-1, PK=CUSTOMER1, SK="STATUS-DATE", for each StatusCode                             |
| Show all Orders in OPEN status for a date range across all customers      | Use GSI-2, PK=query in parallel for the range [0..N], SK between OPEN-Date1 and OPEN-Date2 |
| All Employees hired recently                                              | Use GSI-1, PK="HR-CONFIDENTIAL', SK > date1                                                |
| Find all Employees in specific Warehouse                                  | Use GSI-1, PK=WAREHOUSE1                                                                   |
| Get all Orderitems for a Product including warehouse location inventories | Use GSI-1, PK=PRODUCT1                                                                     |

