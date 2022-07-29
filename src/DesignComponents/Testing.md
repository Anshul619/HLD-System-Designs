
# Automated APIs testing

## Postman API testing using NewMan Plugin in Jenkins
- We can install [`newman plugin`](https://www.tutorialspoint.com/postman-with-newman-and-jenkins) in the jenkins.
- And provide postman API collection in the newman command during jenkins job build configuration.
- `newman -c $WORKSPACE/Bookamo_API_Copy.postman_collection.json -H output_$BUILD_NUMBER.html > output_$BUILD_NUMBER.txt`
- `Newman` will generate the test report in the HTML form, which we can automatically email during nightly builds.

# Load Testing Tools

## [JMeter](https://jmeter.apache.org)

## [Flood](https://www.flood.io)

# Java Unit Testing using Junit

## [@BeforeEach](https://howtodoinjava.com/junit5/before-each-annotation-example/)
- `@BeforeEach` annotated method should execute for each invocation of the test method.
- This is used for initializing the classes of the constructor

## @Test
- Test method, which would return void & no inputs

## assertThat
- `assertThat(functionDeclaration or variable).isEqualTo(ExpectedOutput)`

# Test Cases Example - Employee Management System

## Entities/Services
- Organization
- Group/Team
- Members

## Users
- Admin User
- Regular User

## Access Roles
- Regular User - Only view to all groups, members
- Group Admin - View, Update on the groups ( for which they are admin )
- Site Admin - Can create new/update the group

## Positive Test Cases
- Site Admin should be able to create new group
- Site Admin should be able to see the list of all groups
- Site Admin should be able to select and see the group details
- Site Admin should be able to update the group details
- Site Admin should be able to delete the group
- Site Admin should be able to see the members of the group
- Site Admin should be able to add new member
- Site Admin should be able to update the member details
- Site Admin should be able to edit the groups of the members
