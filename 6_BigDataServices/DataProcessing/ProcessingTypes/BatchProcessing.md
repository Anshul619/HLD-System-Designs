# Batch processing systems (offline systems)
- A [batch processing system](https://aws.amazon.com/what-is/batch-processing/) takes a large amount of input data, runs a job to process it, and produces some output data.
- Certain **data processing tasks**, such as backups, filtering, and sorting, can be computed intensive and inefficient to run on individual data transactions.
- Instead, data systems process such tasks in batches, often in off-peak times when computing resources are more commonly available, such as at the end of the day or overnight.

# Order Fulfillment - Example of Batch Processing
- Consider an ecommerce system that receives orders throughout the day.
- Instead of processing every order as it occurs, the system might collect all orders at the end of each day and share them in one batch with the order fulfillment team.