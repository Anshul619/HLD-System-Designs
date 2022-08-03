
# What is Golang?

- Go is a high level, general-purpose programming language that is `very strongly and statically typed` by providing support for `garbage collection and concurrent programming`. 
- In Go, the programs are built by using `packages that help in managing the dependencies efficiently`. 
  - It also uses a compile-link model for generating executable binaries from the source code. 
  - Go is a simple language with elegant and easy to understand syntax structures. 
  - It has a built-in collection of powerful standard libraries that helps developers in solving problems without the need for third party packages. 
  - Go has first-class support for Concurrency having the ability to use `multi-core processor architectures` to the advantage of the developer and utilize memory efficiently. 
  - This helps the applications scale in a simpler way.

# What are the advantages of Golang over other languages?

## Simple and Understandable
- Go was developed by keeping simplicity, maintainability and readability in mind.

## Standard Powerful Library
- Go supports all standard libraries and packages that help in writing code easily and efficiently.

## Support for concurrency
- Go provides very good support for concurrency using `Go Routines or channels`.
- They take advantage of efficient memory management strategies and multi-core processor architecture for implementing concurrency.

## Static Type Checking
- Go is a very strong and statically typed programming language.
- This ensures that the `code is type-safe and all type conversions are handled efficiently`. 
- This is done for reducing the chances of errors at runtime.

## Easy to install Binaries
- Go provides support for generating binaries for the applications with all required dependencies.

## Good Testing Support
- Go has good support for `writing unit test cases` along with our code. 
- There are libraries that support checking code coverage and generating code documentation.

# What are Golang packages?
- The package is declared at the top of the Go source file as `package <package_name>`
- The packages can be imported to our source file by writing: `import <package_name>`

![img.png](assests/gopackages_img.png)

# Is Golang case-sensitive or insensitive?
- Go is a `case-sensitive language`.

# [How to build and install Go Programs?](https://www.digitalocean.com/community/tutorials/how-to-build-and-install-go-programs)

## Test Go Program

```go
go run <goFileName.go>
```

## Create a Go Module to build a Go Binary

````go
go mod init <moduleName>
````

## Creating Go Binaries


````go
go build // Build with the same name as moduleName in pwd directory

go build -o bin/hello // Build with "hello" name in bin/ directory
````

## Run Go Binaries

````go
./moduleName
````

## Installing Go Programs

````go
go install // This will build the binary and place it in $GOPATH/bin.
````

# What is Golang pointers?
- `*` operator - This operator is called a `dereferencing operator` and is used for accessing the value in the address stored by the pointer.
- `&` operator - This operator is called the `address operator` and is used for returning the address of the variable stored in the pointer.

```go
x := 100
y := &x // Pointer - stores address of x in y

fmt.Println(*y) // prints x variable 
```

Pointers are used for the following purposes:
- Allowing `function to directly mutate value` passed to it.
  - That is achieving `pass by reference` functionality.
- For increasing the performance in the `edge cases in the presence of a large data structure`. 
  - Using pointers help to copy large data efficiently. 
- Helps in signifying the lack of values. 
  - For instance, `while unmarshalling JSON data into a struct`, it is useful to know if the key is present or absent then the key is present with 0 value.

# What do you understand by Golang string literals?

String literals are those variables storing string constants that can be a single character or that can be obtained as a result of the concatenation of a sequence of characters. 

Go provides two types of string literals.

## Raw string literals

```go
`interviewbit`
```

## Interpreted string literals

```go
"Interviewbit
Website"
```

# What is the syntax used for the for loop in Golang?

```go
for [condition |  ( init; condition; increment ) | Range]  
{  
statement(s);  
//more statements
}  
```

## Initialize For-Loop

```go
package main

import "fmt"

func main() {
    
    // For loop to print numbers from 1 to 5
    for j := 1; j <= 5; j++ {
        fmt.Println(j)
    }

}
```

# What do you understand by the scope of variables in Go?

## Local variables
- These are declared inside a function or a block and is accessible only within these entities.

## Global variables
- These are declared outside function or block and is accessible by the whole source file.

# What do you understand by goroutine in Golang?

```go
package main
import (
    "fmt"
    "time"
)

func main() { // Main goroutine
    go sampleRoutine() // Run the goroutine concurrently
    fmt.Println("Started Main")
    time.Sleep(1 * time.Second)
    fmt.Println("Finished Main")
}

func sampleRoutine() {
    fmt.Println("Inside Sample Goroutine")
}

Output:

Started Main
Inside Sample Goroutine
Finished Main

```

#  Is it possible to return multiple values from a function in Go?

```go

package main
import (
	"fmt"
)

func reverseValues(a,b string)(string, string){
    return b,a    //notice how multiple values are returned
}

func main(){
    val1,val2:= reverseValues("interview","bit")    // notice how multiple values are assigned
    fmt.Println(val1, val2)
}
```

# Is it possible to declare variables of different types in a single line of code in Golang?

```go
var a,b,c= 9, 7.1, "interviewbit"
```

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

# What are Go Interfaces?

```go

package main
 
import "fmt"
 
// "Triangle" data type
type Triangle struct {
	base, height float32
}
 
// "Square" data type
type Square struct {
	length float32
}
 
// "Rectangle" data type
type Rectangle struct {
	length, breadth float32
}
 
// To calculate area of triangle
func (triangle Triangle) Area() float32 {
	return 0.5 * triangle.base * triangle.height
}
 
// To calculate area of square
func (square Square) Area() float32 {
	return square.length * square.length
}
 
// To calculate area of rectangle
func (rect Rectangle) Area() float32 {
	return rect.length * rect.breadth
}
 
// Area interface for achieving abstraction
type Area interface {
	Area() float32
}
 
func main() {
	// Declare and assign values to varaibles
	triangleObject := Triangle{base: 20, height: 10}
	squareobject := Square{length: 25}
	rectObject := Rectangle{length: 15, breadth: 20}
 
	// Define a variable of type interface
	var shapeObject Area
 
	// Assign to "Triangle" type variable to the Area interface
	shapeObject = triangleObject
	fmt.Println("Triangle Area = ", shapeObject.Area())
 
	// Assign to "Square" type variable to the Area interface
	shapeObject = squareobject
	fmt.Println("Square Area = ", shapeObject.Area())
 
	// Assign to "Rectangle" type variable to the Area interface
	shapeObject = rectObject
	fmt.Println("Rectangle Area = ", shapeObject.Area())
}

```

# Why is Golang fast compared to other languages?

- Golang is faster than other programming languages because of its `simple and efficient memory management and concurrency model`. 
- The compilation process to machine code is very fast and efficient. 
- Additionally, the dependencies are linked to a `single binary file thereby putting off dependencies on servers`.

# How can we check if the Go map contains a key?

![img.png](assests/go_map_img.png)

```go
if val, isExists := map_obj["foo"]; isExists {
    //do steps needed here
}
```

# What are Go channels and how are channels used in Golang?

![img.png](assests/gochannel_img.png)

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

# Can you format a string without printing?

```go
return fmt.Sprintf ("Size: %d MB.", 50)
```

# What do you understand by Type Assertion in Go?

```go
t := i.(T)
```

# How to create interfaces in GoLang?
TBD

# How to write unit tests in GoLang?
- https://blog.alexellis.io/golang-writing-unit-tests/

# References
- [Golang Interview Questions](https://www.interviewbit.com/golang-interview-questions/)