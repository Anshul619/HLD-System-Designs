# CPU Bound
- [CPU Bound](https://stackoverflow.com/questions/868568/what-do-the-terms-cpu-bound-and-i-o-bound-mean) means the rate at which process progresses is limited by the speed of the CPU. 
- A task that performs calculations on a small set of numbers, for example multiplying small matrices, is likely to be CPU bound.

# CPU Intensive workloads
- Big Time Complexity algorithm like O(n2) etc. 
  - Hence, minimize loops in the code, to decrease time complexity.
- Complex SQL Query joins, sub-query etc.
- Machine learning workloads
- Mathematical calculations like rules, multiplication, plus, subtraction etc.
- Big Data workloads like map-reduce etc.

# CPU Cycle
- Adding two numbers takes a single CPU cycle.
- Every join waste one CPU cycle.

# Why doesn't my program run faster with more CPUs?
Whether a program runs faster with more CPUs depends on the problem it is solving.
- The Go language provides concurrency primitives, such as goroutines and channels, but concurrency only enables parallelism when the underlying problem is intrinsically parallel.
- Problems that are intrinsically sequential cannot be sped up by adding more CPUs, while those that can be broken into pieces that can execute in parallel can be speed up, sometimes dramatically.

Sometimes adding more CPUs can slow a program down.
- In practical terms, programs that spend more time synchronizing or communicating than doing useful computation may experience performance degradation when using multiple OS threads.
- This is because passing data between threads involves switching contexts, which has significant cost, and that cost can increase with more CPUs.

# GoRoutines and CPU Stats
- [Read here](https://github.com/Anshul619/Golang/blob/main/GoRoutines%26Channels/Stats.md)

# References
- [How to run CPU-based Workloads for Deep Learning Using Thousands Of Spot Instances on AWS and GCP Without Getting a Headache](https://towardsdatascience.com/how-to-run-cpu-intensive-workloads-for-deep-learning-with-thousands-of-spot-instances-on-aws-and-85ce9d452f10)