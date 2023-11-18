# Configure a Pod to Use a ConfigMap
- [ConfigMaps](https://kubernetes.io/docs/concepts/configuration/configmap/) are the Kubernetes way to inject application pods with configuration data.
- [ConfigMaps]() allow you to decouple configuration artifacts from image content to keep containerized applications portable

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