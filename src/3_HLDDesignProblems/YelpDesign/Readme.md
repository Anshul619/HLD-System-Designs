
# Requirements and Goals of the System

## Functional Requirements
- Users should be able to add/delete/update Places.
- Given their location (longitude/latitude), users should be able to find all nearby places within a given radius.
- Users should be able to add feedback/review about a place. The feedback can have pictures, text, and a rating.

## Non-functional Requirements
- Users should have a real-time search experience with minimum latency.
- Our service should support a heavy search load. There will be a lot of search requests compared to adding a new place.

# Capacity Estimation and Constraints
- 500M places
- 100K queries per second (QPS)
- Assume a 20% growth in the number of places and QPS each year.

# Database Schema

| Column      | Table     |
|-------------|-----------|
| LocationID  | Place     |
| Name        | Place     |
| Lat         | Place     |
| Long        | Place     |
| Description | Place     |
| Category    | Place     |
| ReviewID    | Reviews   |
| LocationID  | Reviews   |
| ReviewText  | Reviews   |
| Rating      | Reviews   |

# System APIs

````
search(api_dev_key, search_terms, user_location, radius_filter, maximum_results_to_return, 
    category_filter, sort, page_token)
````

# References
- [System Design: Yelp](https://www.educative.io/courses/grokking-modern-system-design-interview-for-engineers-managers/YMNKJq1rY9K)
