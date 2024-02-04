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
