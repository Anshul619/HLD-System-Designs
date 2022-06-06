# Requirements
- Lets consider an API - http://some/api/$filename/$multibytedata
- API Inputs - $filename, $multibytedata.
- Check if a file is present
- If not create a file
- Append data to file
- Users can call this api concurrently
- Ensure consistency ( file must be saved, before return true to the API )

# Two Possible Options
- Live Aggregation
- Delayed Aggregation

# Important Points
- Store recently opened files in the local app server cache
  
# Open Questions
- How to archive the logs once aggregation is done? ( Assume logs are coming all 24 hrs, every day. Huge data. )
- How to maintain partition in the Kafka? When there is too much data coming?
- What should be the topics in the Kafka?
  
# Other Points
- Interview Question@FluxOn, 6thJune2022
