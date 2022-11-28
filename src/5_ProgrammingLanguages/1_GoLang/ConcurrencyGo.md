# Concurrency
- Go provides very good support for concurrency using `Go Routines or channels`.
- They take advantage of efficient memory management strategies and multicore processor architecture for implementing concurrency.

# Go Routine
- A Goroutine is a function or method which executes independently and simultaneously in connection with any other Goroutines present in your program.
- You can consider a Goroutine like a light weighted thread.
- All the Goroutines are working under the main Goroutines if the main Goroutine terminated, then all the goroutine present in the program also terminated. Goroutine always works in the background.
- When a new Goroutine executed, the Goroutine call return immediately. 
- The control does not wait for Goroutine to complete their execution just like normal function they always move forward to the next line after the Goroutine call and ignores the value returned by the Goroutine.
- Goroutines can communicate using the channel and these channels are specially designed to prevent race conditions when accessing shared memory using Goroutines.

````go
// Go program to illustrate the concept of Goroutine
package main

import "fmt"

func display(str string) {
	for w := 0; w < 6; w++ {
        time.Sleep(1 * time.Second)
		fmt.Println(str)
	}
}

func main() {

	// Calling Goroutine
	go display("Welcome")

	// Calling normal function
	display("GeeksforGeeks")
}
````

# Difference between concurrent and parallelism in Golang
- Concurrency is when your program can handle multiple tasks at once while parallelism is when your program can execute multiple tasks at once using multiple processors.
- In other words, concurrency is a property of a program that allows you to have multiple tasks in progress at the same time, but not necessarily executing at the same time. Parallelism is a runtime property where two or more tasks are executed at the same time.

# What are Go channels and how are channels used in Golang?

![img.png](assests/gochannel_img.png)

[Read more](https://www.geeksforgeeks.org/channel-in-golang/)

## Create Channel

```go
var channel_name chan Type

OR 

channel_name:= make(chan Type)
```

## Send data to Channel

```go
channel_name <- element // Send data

element := <-Mychannel // Receive data
```

# References
- [Crack the top 50 Golang interview questions](https://www.educative.io/blog/50-golang-interview-questions)