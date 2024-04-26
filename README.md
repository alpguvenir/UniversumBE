Prerequirements:
- Java version 17.0.10
- Apache Maven 3.9.5 (Bundled version in IntelliJ) 

<br/>

To run the application, use the following command: 

```diff
./mvnw spring-boot:run
```

- The application will be served on [localhost:8080](http://localhost:8080/)
- To access the H2 database console, simply navigate to [localhost:8080/h2-console](http://localhost:8080/h2-console/)

<br/>

To create a jar/war file, use the following command:
Based on the value between the packaging tags in the pom.xml we are able to create either of the 
```diff
./mvnw clean package
```

To tun a jar/war file, use the following command:
```diff
java -jar "name-of-jar-file".jar
java -jar "name-of-war-file".war 
```

Resources for AWS Lambda (Creates Lambda, API Gateway):
- https://www.youtube.com/watch?v=HQQD4dndDpE&ab_channel=JamesEastham
- https://github.com/aws/serverless-java-container/wiki/Quick-start---Spring-Boot3

Creating the "StreamLambdaHandler" class
Creating template.yaml file

To deploy the application to AWS Lambda server follow below:
- sam build
- sam deploy --guided

Resources for AWS DynamoDB:
- https://www.youtube.com/watch?v=Q9hLQfBBbhU&t=2s&ab_channel=SimpleProgramming

Creating the access key and secret
Creating the DynamoDBConfig class
Modifying entity classes
Service and repository layer for dynamo

$${\color{red}Red xyz}$$


