
# Kubernates
- [Kubernetes](https://kubernetes.io), also known as K8s, is an `OPEN-SOURCE system for automating deployment, scaling, and management of containerized applications`. 
- Kubernates is a [container orchestration service](../0_SystemGlossaries/ContainerOrchestrationService.md).
- Kubernetes is a Greek word meaning `captain` in English. 
  - Like the captain is responsible for the safe journey of the ship in the seas, Kubernetes is responsible for carrying and delivering those boxes safely to locations where they can be used.
- We can use kubernates to manage, create containers ( through pods, worker nodes ).

![img.png](assests/Kubernates-Architecture.png)

# Components

## Cluster
- When you deploy Kubernetes, you get [a cluster](../0_SystemGlossaries/ServersCluster.md).
- A [Kubernetes cluster](https://kubernetes.io/docs/concepts/overview/components/) consists of a set of worker machines, called [nodes](), that run containerized applications. 
- Every cluster has at least one worker node.

![img.png](https://d33wubrfki0l68.cloudfront.net/2475489eaf20163ec0f54ddc1d92aa8d4c87c96b/e7c81/images/docs/components-of-kubernetes.svg)

## Control Plane (master node)
- [The control plane](https://kubernetes.io/docs/concepts/overview/components/) manages the worker nodes and the Pods in the cluster.
- In production environments, the control plane usually runs across multiple computers and a cluster usually runs multiple nodes, providing fault-tolerance and high availability.
- Nodes with [controlplane]((https://kubernetes.io/docs/concepts/overview/components/)) role run the K8s master components (excluding `etcd`, as its separate role). 
- [Read more](https://kubernetes.io/docs/concepts/overview/components/)

## Worker Nodes
- Each docker/Pod container would run the micro-service (golang, java, python service etc.)
- And a [worker node can have one or multiple pods](https://kubernetes.io/docs/concepts/architecture/nodes/).
- Kubernates would manage the [worker nodes](https://kubernetes.io/docs/concepts/architecture/nodes/) i.e. Create, Update, Delete, Auto-Scale based on the configuration and params.

## Pods
- [Pods](https://kubernetes.io/docs/concepts/workloads/pods/) are the smallest deployable units of computing that you can create and manage in Kubernetes.
- A Pod (as in a pod of whales or pea pod) is a group of one or more containers, with shared storage and network resources, and a specification for how to run the containers.

```
kubectl scale --replicas=5 rc/foo rc/bar rc/baz                   # Scale multiple replication controllers i.e. 5 pods for each of the services
```

## etcd
- Consistent and [highly-available key value store](../0_SystemGlossaries/HighAvailability.md) used as Kubernetes' backing store for all cluster data.
- If your Kubernetes cluster uses etcd as its backing store, make sure you have a back up plan for those data.

## Labels
- [Labels](https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/) are key/value pairs that are attached to objects, such as pods. 
- Labels are intended to be used to specify identifying attributes of objects that are meaningful and relevant to users, but do not directly imply semantics to the core system.

## K8s Networking
- K8s manages its own load balance, service discovery etc.
- [Read more](https://kubernetes.io/docs/concepts/services-networking/_print/)

# Horizontal Pod Autoscaling
- In Kubernetes, [a Horizontal Pod Autoscaler](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/) automatically updates a workload resource (such as a Deployment or StatefulSet), with the aim of automatically scaling the workload to match demand.

## AutoScaling on Container resource metrics

````yaml
type: ContainerResource
containerResource:
  name: cpu
  container: application
  target:
    type: Utilization
    averageUtilization: 60
````

## Stabilization window

````yaml
behavior:
  scaleDown:
    stabilizationWindowSeconds: 300
    policies:
    - type: Percent
      value: 100
      periodSeconds: 15
  scaleUp:
    stabilizationWindowSeconds: 0
    policies:
    - type: Percent
      value: 100
      periodSeconds: 15
    - type: Pods
      value: 4
      periodSeconds: 15
    selectPolicy: Max
````

# kubectl - Cheat Sheet
- `apply` manages applications through files defining Kubernetes resources. It creates and updates resources in a cluster through running `kubectl apply`.
- [Read more](https://kubernetes.io/docs/reference/kubectl/cheatsheet/)

```
kubectl get pods                              # List all pods in the namespace
kubectl get pod my-pod -o yaml                # Get a pod's YAML

kubectl apply -f ./my-manifest.yaml            # create resource(s)
kubectl apply -f ./my1.yaml -f ./my2.yaml      # create from multiple files
kubectl apply -f ./dir                         # create resource(s) in all manifest files in dir
kubectl apply -f https://git.io/vPieo          # create resource(s) from url

kubectl autoscale deployment foo --min=2 --max=10                # Auto scale a deployment "foo"

kubectl logs my-pod                                 # dump pod logs (stdout)
kubectl logs -l name=myLabel                        # dump pod logs, with label name=myLabel (stdout)

kubectl cp /tmp/foo_dir my-pod:/tmp/bar_dir            # Copy /tmp/foo_dir local directory to /tmp/bar_dir in a remote pod in the current namespace
```

# Configure a Pod to Use a ConfigMap
- [ConfigMaps](https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/) are the Kubernetes way to inject application pods with configuration data. 
- ConfigMaps allow you to decouple configuration artifacts from image content to keep containerized applications portable

````yaml
apiVersion: v1
  
kind: Pod
  
metadata:
  
  name: dapi-test-pod
  
spec:
  
  containers:
  
    - name: test-container
  
      image: registry.k8s.io/busybox
  
      command: [ "/bin/sh", "-c", "env" ]
  
      env:
  
        - name: SPECIAL_LEVEL_KEY
  
          valueFrom:
  
            configMapKeyRef:
  
              name: special-config
  
              key: special.how
  
        - name: LOG_LEVEL
  
          valueFrom:
  
            configMapKeyRef:
  
              name: env-config
  
              key: log_level
  
  restartPolicy: Never
````

# Installation Guide
- [Install and Set Up kubectl on macOS](https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/)
- [MiniKube Start](https://minikube.sigs.k8s.io/docs/start/)

# StatefulSets
- [TBD](https://kubernetes.io/docs/concepts/workloads/controllers/statefulset/)

# References
- [Mesos vs. Kubernetes](https://www.baeldung.com/ops/mesos-kubernetes-comparison)
