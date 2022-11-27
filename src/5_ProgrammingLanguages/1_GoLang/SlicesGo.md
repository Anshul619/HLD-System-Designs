# What is "slice" in Go?
- Slice in Go is a lightweight data structure of variable length sequence for storing homogeneous data.
- It is more convenient, powerful and flexible than an array in Go.

```go
package main

import "fmt"

func main() {

    // Creating an array
    arr := [6]string{"This","is", "a","Go","interview","question"}
 
    // Print array
    fmt.Println("Original Array:", arr)
 
    // Create a slice
    slicedArr := arr[1:4]
 
    // Display slice
    fmt.Println("Sliced Array:", slicedArr)
 
    // Length of slice calculated using len()
    fmt.Println("Length of the slice: %d", len(slicedArr))
 
    // Capacity of slice calculated using cap()
    fmt.Println("Capacity of the slice: %d", cap(slicedArr))
}
```

# Array vs Slice
- Slice with dynamic length (like arraylist in Java) while Array with constant length.
- [Sample Code](SampleCode/SampleArraySlice.go)

```go
package main

array := [6]int{1, 2, 3, 4, 5} // array
len(array)
slice := make([]int, 6) // slice
slice_1 := []byte{'G', 'E', 'E', 'K', 'S'} // slice

log.Println(reflect.TypeOf(array).Kind()) // array
log.Println(reflect.TypeOf(slice).Kind()) // slice
log.Println(reflect.TypeOf(slice_1).Kind()) //slice
```