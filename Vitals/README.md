# Patient Vitals Monitoring System
This is a test application that takes a JSON structure of patient vitals and stores them in a database.  The ingest is over HTTP and can allow for numerous sinks, PostGreSQL or MongoDB.  The application is written in Spring and Java.

## Build & Deploy to SCDF

### Build the application
Build a deployable jar file and install to your ~/.m2 repository
```shell
./mvnw clean install
```
### Register the Vitals application with SCDF
```shell
dataflow:>app register --name vitals --type processor --uri maven://io.awesome.stuff:Vitals:0.0.1-SNAPSHOT
Successfully registered application 'processor:vitals```
```
![Vitals - Added Application](./images/Vitals_Added_Application.png)

### 

### Send a Vitals JSON payload
Script will send a JSON payload to the HTTP source.  It will then process that data by normalizing the JSON data and output to log (SCDF server log)
```shell
http | vitals | log
```

### Set the Vitals PORT on deploy to 20120

## Write the JSON output to a data sink

### To MongoDB
 
#### Spin up a MongoDB instance
#### Setup MongoDB sink
#### Test output

#### Send data to MongoDB Atlas
##### Test output

### To PostgreSQL
#### Spin up a PostgreSQL instance
#### Setup PostgreSQL sink
#### Test output

## Connect to SCDF server via SCDF shell
### Download SCDF shell binary
```shell
wget https://repo.spring.io/artifactory/snapshot/org/springframework/cloud/spring-cloud-dataflow-shell/2.11.5-SNAPSHOT/spring-cloud-dataflow-shell-2.11.5-20240905.084208-37.jar
mv spring-cloud-dataflow-shell-2.11.5-20240905.084208-37.jar spring-cloud-dataflow-shell-2.11.5.jar
```
### connect to SCDF server
```shell
java -jar /Users/phopper/Documents/sandbox/spring-cloud-dataflow-demo/spring-cloud-dataflow-shell-2.11.5.jar
```

### list streams
```shell
dataflow:>stream list
╔═══════════════╤═══════════╤═════════════════╤═════════════════════════════════════════╗
║  Stream Name  │Description│Stream Definition│                 Status                  ║
╠═══════════════╪═══════════╪═════════════════╪═════════════════════════════════════════╣
║http_log_events│           │http | log       │The stream has been successfully deployed║
╚═══════════════╧═══════════╧═════════════════╧═════════════════════════════════════════╝
```



