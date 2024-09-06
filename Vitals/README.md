# Patient Vitals Monitoring System
This is a test application that takes a JSON structure of patient vitals and stores them in a database.  The ingest is over HTTP and can allow for numerous sinks, PostGreSQL or MongoDB.  The application is written in Spring and Java.

## Build & Deploy to SCDF

### Build the application

### Create the application in SCDF namespace

### Deploy the application in SCDF

### Send a Vitals JSON payload
Script will send a JSON payload to the HTTP source.  It will then process that data by normalizing the JSON data and output to log (SCDF server log)
```shell
http | vitals | log
```

### set the Vitals PORT on deploy to 20120

## Write the JSON output to a data sink

### to MongoDB
 
#### Spin up a MongoDB instance
#### Setup MongoDB sink
#### Test output

#### Send data to MongoDB Atlas
##### Test output

### to PostgreSQL
#### Spin up a PostgreSQL instance
#### Setup PostgreSQL sink
#### Test output

## connect to SCDF server via SCDF shell
### download SCDF shell binary
```shell
wget https://repo.spring.io/artifactory/snapshot/org/springframework/cloud/spring-cloud-dataflow-shell/2.11.5-SNAPSHOT/spring-cloud-dataflow-shell-2.11.5-20240905.084208-37.jar
mv spring-cloud-dataflow-shell-2.11.5-20240905.084208-37.jar spring-cloud-dataflow-shell-2.11.5.jar
```
### connect to SCDF server
```shell
java -jar /Users/phopper/Documents/sandbox/spring-cloud-dataflow-demo/spring-cloud-dataflow-shell-2.11.5.jar
```

### list streams
```stream list```
```shell
dataflow:>stream list
╔═══════════════╤═══════════╤═════════════════╤═════════════════════════════════════════╗
║  Stream Name  │Description│Stream Definition│                 Status                  ║
╠═══════════════╪═══════════╪═════════════════╪═════════════════════════════════════════╣
║http_log_events│           │http | log       │The stream has been successfully deployed║
╚═══════════════╧═══════════╧═════════════════╧═════════════════════════════════════════╝
```



