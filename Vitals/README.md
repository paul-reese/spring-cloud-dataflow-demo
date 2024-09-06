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

### to MondgoDB
 
#### Spin up a MongoDB instance
#### Setup MongoDB sink
#### Test output

#### Send data to MongoDB Atlas
##### Test output

### to PostgreSQL
#### Spin up a PostgreSQL instance
#### Setup PostgreSQL sink
#### Test output


