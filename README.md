<h2>Prerequirements</h2>
- Java version 17.0.10
- Apache Maven 3.9.5 (Bundled version in IntelliJ) 

<h2>Running the application</h2>

To run the application, use the following command: 

```diff
./mvnw spring-boot:run
```

To run using local H2 Database use either option:
- state the profile as <i>spring.profiles.active=local</i> in the application.properties 
- run <i>mvn spring-boot:run -Dspring-boot.run.profiles=local</i>


- The application will be served on [localhost:8080](http://localhost:8080/)
- To access the H2 database console, simply navigate to [localhost:8080/h2-console](http://localhost:8080/h2-console/)

To run using AWS DynamoDB use either option:
- state the profile as <i>spring.profiles.active=dynamodb</i> in the application.properties
- run <i>mvn spring-boot:run -Dspring-boot.run.profiles=dynamodb</i>

<br/>

Running from a jar/war file:

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

<h2>Backend Architecture</h2>

Resources for AWS Lambda (Creates Lambda, API Gateway):
- https://www.youtube.com/watch?v=HQQD4dndDpE&ab_channel=JamesEastham
- https://github.com/aws/serverless-java-container/wiki/Quick-start---Spring-Boot3


- Creating the "StreamLambdaHandler" class 
- Creating template.yaml file


Resources for AWS DynamoDB:
- https://www.youtube.com/watch?v=Q9hLQfBBbhU&t=2s&ab_channel=SimpleProgramming


- Creating the access key and secret
- Creating the DynamoDBConfig class
- Modifying entity classes
- Service and repository layer for dynamo

<h2>Deploying the application</h2>

Create an access key from > Account Settings > Security Credentials
- add key id and access key to: /Users/{User}/.aws/credentials


To deploy the application to AWS Lambda server install aws sam (https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/install-sam-cli.html) and follow below:
- sam build
- sam deploy --guided

$${\color{red}Red xyz}$$


