
# Automated APIs testing

## Postman API testing using NewMan Plugin in Jenkins
- We can install `newman plugin` in the jenkins.
- And provide postman API collection in the newman command during jenkins job build configuration.
- `newman -c $WORKSPACE/Bookamo_API_Copy.postman_collection.json -H output_$BUILD_NUMBER.html > output_$BUILD_NUMBER.txt`
- Newman will generate the test report in the HTML form, which we can automatically email during nightly builds.
- Reference - https://www.tutorialspoint.com/postman-with-newman-and-jenkins

# Load Testing using JMeter

# Java Unit Testing using Junit

## [@BeforeEach](https://howtodoinjava.com/junit5/before-each-annotation-example/)
- @BeforeEach annotated method should execute for each invocation of the test method.
- This is used for initializing the classes of the constructor

## @Test
- Test method, which would return void & no inputs

## assertThat
- `assertThat(functionDeclaration or variable).isEqualTo(ExpectedOutput)`