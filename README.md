# spring-cloud-dataflow-demo
## Pre-requisities
These binaries are needed to but build, run and deploy **Spring Cloud Data Flow** locally.  We will use Docker and Docker Compose to deploy SCDF applications locally as well.
docker[https://docs.docker.com/get-docker/]
docker-compose[https://docs.docker.com/compose/install/]
kubectl[https://kubernetes.io/releases/download/]
minikube [https://minikube.sigs.k8s.io/docs/start/]

## Start Pre-req's
1. Launch Docker daemon
2. Launch Docker Dashbarod
3. Start minikube
   ```
   minikube start
   ```

## Building
Building all of the projects of **Spring Cloud Data Flow** will take some time, be sure to have a warm beverage handy and crank some tunes.  If running locally, use Docker Deskop to watch the fun and munch on popocorn.

1. Clone the project
```
git clone https://github.com/spring-cloud/spring-cloud-dataflow.git
```
2. Change directoy to root of project
```
cd spring-cloud-df
```

2. Build the root project
```
./mvnw -s .settings.xml clean install
```
