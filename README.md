# CloudHub Enhanched Logging Java API

A simple Java API based in Retrofit HTTP client.

## How to use
### How to install
`mvn clean install` and then add to your project POM: 

```xml
<dependency>
  <groupId>com.mulesoft.cloudhub</groupId>
  <artifactId>cloudhub-enhanced-logging-api</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

### Using the client
#### Creating the client:
```java
CloudHubLoggingClient cloudHubLoggingClient = new CloudHubLoggingClient(USERNAME, PASSWORD);
Call<List<ApplicationDescription>> applications = cloudHubLoggingClient.getApplications();
```
#### Listing applications:
```java
Call<List<ApplicationDescription>> applications = cloudHubLoggingClient.getApplications();
```

#### Listing application deployments:
```java
cloudHubLoggingClient.domain(DOMAIN_NAME).getDeployments();
```

#### Retrieving deployment logs:
*Required parameter*: deployment ID
*Optional parameters*: limit and limitMsglen
```java
cloudHubLoggingClient.domain(DOMAIN_NAME).getDeploymentLogs(DEPLOYMENT_ID,100,1000);
```
