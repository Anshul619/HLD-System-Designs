
# Basic Guidelines
- Type is defined at the end of declaration.
- Return variables ( multiple variables ) would be defined at the end.
- Multiple variables can be defined by `,`.
- Initialisation can be skipped with `:=`.
- Semicolon is not needed at the end.
- Trailing comma is needed while initializing struct.
- Go does not support inheritance, however, it does support composition.
- `In Go's philosophy, it is better to avoid unnecessary branches and indentation of code. It is also considered better to return as early as possible.`
- Don't use Math functions since those work on float only. Hence typecasting would be needed.

| Purpose                            | Function                |
|------------------------------------|-------------------------|
| Check if x string contains y string | strings.Contains(x, y)  |
| Compare two bytes array            | bytes.Compare(sl1, sl2) |
| Length of array                    | len(array)              |
| Sort array                                   | sort.Ints(seats)                        |
|Slice with non-constant length|array := make([]int, len(nums))|
|Copy one slice array to another|copy(dest, src)|
|Create Map|m := make(map[int]int)|
|Get value from Map|mIndex, ok := m[val]|
|Create object of a struct|node := new(TreeNode)|
|Get elements from start to end index, from slice|output[:5] // 0th to 5th index<br> output[1:] // 1st to last index<br> output[1,5] // 1st to 5th index|
|Append element to the list|output := []int{10}<br>append(output, 5) // append 5 to output array|
|Append multiple elements to the list|append(output, input[:5]...)|


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
- TBD

# Method Pointers
- Does the method need to modify the receiver? If it does, the receiver must be a pointer.
```
func (s *MyStruct) pointerMethod() { } // method on pointer. 
func (s MyStruct)  valueMethod()   { } // method on value
```

# [Why does Go have type parameters?](https://go.dev/doc/faq#overloading)
- Type parameters permit what is known as generic programming, in which functions and data structures are defined in terms of types that are specified later, when those functions and data structures are used. 
- For example, they make it possible to write a function that returns the minimum of two values of any ordered type, without having to write a separate version for each possible type.

# [Difference b/w make & new](https://stackoverflow.com/questions/9320862/why-would-i-make-or-new)
- The make built-in function allocates and initializes an object of type slice, map, or chan (only). 
- Like new, the first argument is a type, not a value. 
- Unlike new, make's return type is the same as the type of its argument, not a pointer to it. 
- The specification of the result depends on the type.

```
themes := make([]*Template, 0)
theme := new(Theme)
```

# [How to run the app server in GoLang?](https://go.dev/doc/articles/wiki/)

````go
//go:build ignore

package main

import (
    "fmt"
    "log"
    "net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
    fmt.Fprintf(w, "Hi there, I love %s!", r.URL.Path[1:])
}

func main() {
	http.HandleFunc("/", handler)
	log.Fatal(http.ListenAndServe(":8080", nil)) // Run app server on 8080 port
}
````

# Go Tutorials
- [Frequently Asked Questions (FAQ) - Go](https://go.dev/doc/faq#overloading)
- https://golangbot.com/learn-golang-series/
- https://yourbasic.org/golang/implement-fifo-queue/
- https://dave.cheney.net/2016/08/20/solid-go-design


