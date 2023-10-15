
# Postman

![](https://media-exp1.licdn.com/dms/image/C5622AQFIPLeUfeL3eA/feedshare-shrink_2048_1536/0/1669008625365?e=1671667200&v=beta&t=3_TGXTdXU6jGhlWhJwQeGMeaGCAF6-ymfMg3spqZcsE)_

# Postman API testing using NewMan Plugin in Jenkins
- We can install [newman plugin](https://www.tutorialspoint.com/postman-with-newman-and-jenkins) in the jenkins.
- And provide postman API collection in the newman command during jenkins job build configuration.
- `newman -c $WORKSPACE/Bookamo_API_Copy.postman_collection.json -H output_$BUILD_NUMBER.html > output_$BUILD_NUMBER.txt`
- `Newman` will generate the test report in the HTML form, which we can automatically email during nightly builds.