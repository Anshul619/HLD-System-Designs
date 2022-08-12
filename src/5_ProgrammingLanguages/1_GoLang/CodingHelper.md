
# Basic Guidelines
- Type is defined at the end of declaration.
- Return variables ( multiple variables ) would be defined at the end.
- Multiple variables can be defined by `,`.
- Initialisation can be skipped with `:=`.
- Semicolon is not needed at the end.
- Trailing comma is needed while initializing struct.
- Go does not support inheritance, however, it does support composition.
- `In Go's philosophy, it is better to avoid unnecessary branches and indentation of code. It is also considered better to return as early as possible.`


```go
package main // folder name is generally specified as package name

import "log"

// Private method since starting character is small case
func findNumber(list []int) {

	var1, var2 := 1, 2 // multiple variables, separated by comma

	log.Println(var1)
	log.Println(var2)
}

// Public method since starting character is capital case
func FindNumber(list []int) (bool, error) {
	return false, nil
}

func main() { // first calling function
}
```

# Different constructs

| Purpose                            | Function                |
|------------------------------------|-------------------------|
| Check if x string contains y string | strings.Contains(x, y)  |
| Compare two bytes array            | bytes.Compare(sl1, sl2) |
| Length of array                    | len(array)              |
|                                    |                         |

# Multi-Threading
````
go X() // asynchrnously call X() function
````

# Important Links
- [Structs Instead of Classes - OOP in Go](SampleCode/oop/employee/employees.go)

# Error Interface
````
type error interface {  
    Error() string
}
````

# [Different ways to extract more information from the error](https://golangbot.com/custom-errors/)
- Asserting the underlying struct type and getting more information from the struct fields.
- Asserting the underlying struct type and getting more information using methods
- Direct comparison
````go
package main

var ErrBadPattern = errors.New("syntax error in pattern")
````

# [Panic & Recover](https://golangbot.com/panic-and-recover/)

# Method Pointers
```
func (s *MyStruct) pointerMethod() { } // method on pointer. Does the method need to modify the receiver? If it does, the receiver must be a pointer. 
func (s MyStruct)  valueMethod()   { } // method on value
```

# [Why does Go have type parameters?](https://go.dev/doc/faq#overloading)
- Type parameters permit what is known as generic programming, in which functions and data structures are defined in terms of types that are specified later, when those functions and data structures are used. 
- For example, they make it possible to write a function that returns the minimum of two values of any ordered type, without having to write a separate version for each possible type.

# Go Tutorials
- [Frequently Asked Questions (FAQ) - Go](https://go.dev/doc/faq#overloading)
- https://golangbot.com/learn-golang-series/
- https://yourbasic.org/golang/implement-fifo-queue/
- https://dave.cheney.net/2016/08/20/solid-go-design


