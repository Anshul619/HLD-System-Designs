
# Basic Guidelines
- `In Go's philosophy, it is better to avoid unnecessary branches and indentation of code. It is also considered better to return as early as possible.`
- Type is defined at the end of declaration.
- Return variables ( multiple variables ) would be defined at the end.
- Multiple variables can be defined by `,`.
- Initialisation can be skipped with `:=`. 
  - Hence, practice to use `:=` mostly, instead of `var =`
  - Nil can’t be initialised to the variable without explicit type.
- Trailing comma is not needed while initializing struct.
- Semicolon is not needed at the end.
- Brackets are not needed in `for or if` constructs.
- Don't use Math functions since those work on float only. Hence, typecasting would be needed.
- [Slices](https://stackoverflow.com/questions/38731467/pass-array-by-reference-in-golang) are passed by reference in the function call, so no need to specify pointers.

## Array vs Slice
- Slice with dynamic length ( like arraylist in Java ) while Array with constant length.
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

# Various Go Constructs

| Purpose                                          | Data Structure | Function                                                                                                                         |
|--------------------------------------------------|--------------|----------------------------------------------------------------------------------------------------------------------------------|
| :star: Initialize Empty Slice                    | Slice   | slice := []int{}<br>var slice []int                                                                                              |
| :star: Initialize Slice with non-constant length | Slice        | slice := make([]int, len(nums))                                                                                                  |
| :star: Append element to the list                | Array, Slice | output := []int{10}<br>output = append(output, 5) // append 5 to output array                                                    |
| :star: Append multiple elements to the list      | Array, Slice | output = append(output, input[:5]...)                                                                                            |
| Get elements from start to end index, from slice | Array, Slice | output[:5] // 0th to 5th index<br> output[1:] // 1st to last index<br> output[1,5] // 1st to 5th index                           |
| :star: Length of array or slice                  | Array, Slice | len(array)                                                                                                                       |
| :star: Sort array or slice                       | Array, Slice | sort.Ints(seats)                                                                                                                 |
| :star: Create Map object                         | Hash Map     | m := make(map[int]int)<br>m := map[int]int                                                                                       |
| :star: Get value from Map                        | Hash Map     | val, ok := m[key]                                                                                                                |
| :star: Create object of the struct               | Struct       | obj := new(ListNode) // without all variables initialized <br>obj := ListNode{5, 10} // with all variables of struct initialized |
| Copy one slice to another                        | Slice        | copy(dest, src)                                                                                                                  |
| Compare two bytes array                          | Slice        | bytes.Compare(sl1, sl2)                                                                                                          |
| While loop in GoLang                             | Looping      | for n!=0 {}                                                                                                                      |
| Check if x string contains y string              | String       | strings.Contains(x, y)                                                                                                           |

## Sample Go Code

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
theme := new(Theme) // Pointer to new Theme object
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
- Panic is like exception in GoLang



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

# OOPs
- Go does not support inheritance, however, it does support composition.

# Go Tutorials
- [Frequently Asked Questions (FAQ) - Go](https://go.dev/doc/faq#overloading)
- https://golangbot.com/learn-golang-series/
- https://yourbasic.org/golang/implement-fifo-queue/
- https://dave.cheney.net/2016/08/20/solid-go-design


