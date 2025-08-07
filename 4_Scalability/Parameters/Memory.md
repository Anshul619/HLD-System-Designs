# Memory Bound
- [Memory bound](https://stackoverflow.com/questions/868568/what-do-the-terms-cpu-bound-and-i-o-bound-mean) means the rate at which a process progresses is limited by the amount memory available and the speed of that memory access. 
- A task that processes large amounts of in memory data, for example multiplying large matrices, is likely to be Memory Bound.

# Memory intensive workloads
- Zip/Unzip of large file/folder
- Loading large data in memory, for batch/stream computing
- Image/Video Processing
- Big event payload in webhook processing
- Big API response payload
- Memory Leaks like unclosed channels, db/cache connections etc.
- Big variables in the code
- Big Data workloads like map-reduce etc.

# References
- [What processes are RAM intensive?](https://www.dslreports.com/forum/r29926990-What-processes-are-RAM-intensive)