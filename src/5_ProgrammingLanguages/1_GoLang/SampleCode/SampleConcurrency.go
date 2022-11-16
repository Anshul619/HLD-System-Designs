package main

/*
Output:

Started Main
Inside Sample Goroutine
Finished Main

References
- https://go.dev/tour/concurrency/1
*/
import (
    "fmt"
    "time"
)

func main() { // Main goroutine
    go sampleRoutine() // Run the goroutine concurrently, asynchronously call sampleRoutine() function
    fmt.Println("Started Main")
    time.Sleep(1 * time.Second)
    fmt.Println("Finished Main")
}

func sampleRoutine() {
    fmt.Println("Inside Sample Goroutine")
}