# spring-cloud-dataflow-demo
## Pre-requisities
These binaries are needed to but build, run and deploy **Spring Cloud Data Flow** locally.  We will use Docker and Docker Compose to deploy SCDF applications locally as well.
* [docker](https://docs.docker.com/get-docker/)
* [docker-compose](https://docs.docker.com/compose/install/)
* [kubect](https://kubernetes.io/releases/download/)
## Start Pre-req's
1. Launch Docker daemon
2. Launch Docker Dashbarod
3. Start minikube
   ```
   minikube start
   ```
4. Use **kubectl** to access the shiny new cluster
   ```
   kubcectl get po -A
   NAMESPACE     NAME                               READY   STATUS    RESTARTS      AGE
   kube-system   coredns-5dd5756b68-9c2q6           1/1     Running   0             41s
   kube-system   etcd-minikube                      1/1     Running   0             54s
   kube-system   kube-apiserver-minikube            1/1     Running   0             54s
   kube-system   kube-controller-manager-minikube   1/1     Running   0             54s
   kube-system   kube-proxy-gc8mr                   1/1     Running   0             42s
   kube-system   kube-scheduler-minikube            1/1     Running   0             54s
   kube-system   storage-provisioner                1/1     Running   1 (10s ago)   53s   
   ```

## Building
Building all of the projects of **Spring Cloud Data Flow** will take some time, be sure to have a warm beverage handy and crank some tunes.  If running locally, use Docker Deskop to watch the fun and munch on popocorn. **But**, if you want to skip all the tests just add option "-DskipTests" to the command in step 3 below.

1. Clone the project
```
git clone https://github.com/spring-cloud/spring-cloud-dataflow.git
```
2. Change directoy to root of project
```
cd spring-cloud-df
```

3. Build the root project
```
./mvnw -s .settings.xml clean install
```
## Download the Docker Compose Files
Broker = Kafka (other option: rabbitmq)
Database = postgres (other options: mariadb or mysql)
```
wget -O docker-compose.yml https://raw.githubusercontent.com/spring-cloud/spring-cloud-dataflow/main/src/docker-compose/docker-compose.yml
wget -O docker-compose-kafka.yml https://raw.githubusercontent.com/spring-cloud/spring-cloud-dataflow/main/src/docker-compose/docker-compose-kafka.yml
wget -O docker-compose-postgres.yml https://raw.githubusercontent.com/spring-cloud/spring-cloud-dataflow/main/src/docker-compose/docker-compose-postgres.yml
```
## Starting Docker Compose
```
export METADATA_DEFAULT_DOCKERHUB_USER=<your username>
export METADATA_DEFAULT_DOCKERHUB_PASSWORD=<your passwrod>
export DATAFLOW_VERSION=2.11.2
export SKIPPER_VERSION=2.11.2
docker-compose -f docker-compose.yml -f docker-compose-kafka.yml -f docker-compose-postgres.yml up
```
### Modify the version of zookeeper
The default version of Zookeeper in `docker-compose-kafka.yml` is 5, change this to a newer release, say 5.4.0 or LATEST

You will now see the `spring-cloud-dataflow-demo` Docker image running in your Docker Desktop Dashboard
![image](https://github.com/paul-reese/spring-cloud-dataflow-demo/assets/8217170/34c78c4c-7b00-44d4-b57c-67575b2abfe1)

## SCDF Dashboard
The [Spring Cloud Data Flow Dashboard](http://localhost:9393/dashboard/index.html#/apps) will now be made available.  Additionally these ports will be exposed;
* [REST API](http://localhost:9393)
* [Skipper Port](http://localhost:7577/api)
