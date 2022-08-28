# Basic Guidelines
- `In Go's philosophy, it is better to avoid unnecessary branches and indentation of code. It is also considered better to return as early as possible.`
- Function Declaration
  - Return variables ( multiple variables ) would be defined at the end.
- Semicolon is not needed at the end of the code statement.
- Brackets are not needed in `for or if` constructs.
- Type casting of the generic interface to the specific type, is done like `.(SpecificTypeObj)`.
- Don't use Math functions since those work on float only. Hence, typecasting would be needed.

# Initialization
- Type is defined at the end of declaration.
- Multiple variables can be assigned by `,`. ( example - `j, k, l := "shark", 2.05, 15`)
- Initialisation can be skipped with `:=`. ( example - `i := 72`)
  - Hence, practice to use `:=` mostly, instead of `var =`.
  - `nil` can’t be initialised to the variable without explicit type (`var =`).
  - Note `:=` doesn't work with the global variables.
- Trailing comma is not needed while initializing struct.
- [Global Variables](https://www.tutorialspoint.com/go/go_scope_rules.htm) can be defined like `var g int = 20`.

# Naming variables
- Variable names are case-sensitive.
  - If a variable starts with an uppercase letter, then that variable is accessible outside the package it was declared in (or exported). 
  - If a variable starts with a lowercase letter, then it is only available within the package it is declared in.
- Conventional style of variable names is `MixedCaps` or `mixedCaps`. (instead of underscore or space )
- Use shorter variable names as possible (`prefer i over index as it is shorter`).
- Acronyms should be capitalized (`serveHTTP` instead of `serveHttp`).

# Pointers
- Pointer can be created using `new(int)`.
- Pointer can be passed using `func x(output [][]*int)`.
- [Slices](https://stackoverflow.com/questions/38731467/pass-array-by-reference-in-golang) are passed by reference in the function call, so no need to specify [pointers](https://www.geeksforgeeks.org/pointers-in-golang/).
- To access elements of a pointer array, use `(*h)[10]` instead of `*h[10]`.
- If method needs to modify the reciever, receiver must be pointer.

```
func (s *MyStruct) pointerMethod() { } // method on pointer. 
func (s MyStruct)  valueMethod()   { } // method on value
```

- Unlike new, [make's return type](https://stackoverflow.com/questions/9320862/why-would-i-make-or-new) is the same as the type of its argument, not a pointer to it.
- The make built-in function allocates and initializes an object of type slice, map, or chan (only).

```
themes := make([]*Template, 0)
theme := new(Theme) // Pointer to new Theme object
```

# Various Go Constructs

| Purpose                                          | Data Structure | Function                                                                                                                                            |
|--------------------------------------------------|----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Initialize Empty Slice                    | Slice          | slice := []int{}<br>var slice []int                                                                                                                 |
| :star: Initialize Slice with non-constant length | Slice          | slice := make([]int, len(nums))                                                                                                                     |
| :star: Append element to the list                | Array, Slice   | output := []int{10}<br>output = append(output, 5) // append 5 to output slice                                                                       |
| :star: Append multiple elements to the list      | Array, Slice   | output = append(output, input[:5]...)                                                                                                               |
| Get elements from start to end index, from slice | Array, Slice   | output[:5] // 0th to 5th index<br> output[1:] // 1st to last index<br> output[1,5] // 1st to 5th index                                              |
| :star: Length of an array or slice               | Array, Slice   | len(array)                                                                                                                                          |
| :star: Sort an array or slice                    | Array, Slice   | sort.Ints(seats)                                                                                                                                    |
| :star: Create a Map object                       | Hash Map       | m := make(map[int]int)<br>m := map[int]int                                                                                                          |
| :star: Get value from Map                        | Hash Map       | val, ok := m[key]                                                                                                                                   |
| :star: Create object of the struct               | Struct         | obj := new(ListNode) // pointer to object, without all variables initialized <br>obj := ListNode{5, 10} // with all variables of struct initialized |
| Copy one slice to another                        | Slice          | copy(dest, src)                                                                                                                                     |
| Compare two bytes array                          | Slice          | bytes.Compare(sl1, sl2)                                                                                                                             |
| While loop in GoLang                             | Looping        | for n!=0 {}                                                                                                                                         |
| Check if x string contains y string              | String         | strings.Contains(x, y)                                                                                                                              |
| Split the string                                 | String         | strings.Split(y, " ")                                                                                                                               |
| Convert byte (i.e. stringArray[i]) to string     | String         | string(x)                                                                                                                                           |
| Compare strings                                  | String         | x==y                                                                                                                                                |

# Array vs Slice
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

# [Why does Go have type parameters?](https://go.dev/doc/faq#overloading)
- Type parameters permit what is known as generic programming, in which functions and data structures are defined in terms of types that are specified later, when those functions and data structures are used.
- For example, they make it possible to write a function that returns the minimum of two values of any ordered type, without having to write a separate version for each possible type.

# How to implement Queue?
- [Reference](https://www.educative.io/answers/how-to-implement-a-queue-in-golang)

## Using Slice

```go
package main
import "fmt"

func enqueue(queue[] int, element int) []int {
  queue = append(queue, element); // Simply append to enqueue.
  fmt.Println("Enqueued:", element);
  return queue
}

func dequeue(queue[] int) ([]int) {
  element := queue[0]; // The first element is the one to be dequeued.
  fmt.Println("Dequeued:", element)
  return queue[1:]; // Slice off the element once it is dequeued.
}

func main() {
  var queue[] int; // Make a queue of ints.

  queue = enqueue(queue, 10);
  queue = enqueue(queue, 20);
  queue = enqueue(queue, 30);

  fmt.Println("Queue:", queue);

  queue = dequeue(queue);
  fmt.Println("Queue:", queue);

  queue = enqueue(queue, 40);
  fmt.Println("Queue:", queue);
}
```

## Using LinkedList
````go
package main
import "container/list"
import "fmt"

func main() {
    // new linked list
    queue := list.New()

    // Simply append to enqueue.
    queue.PushBack(10)
    queue.PushBack(20)
    queue.PushBack(30)

    // Dequeue
    front:=queue.Front()
    fmt.Println(front.Value)
    // This will remove the allocated memory and avoid memory leaks
    queue.Remove(front)
}
````

# How to implement Priority Queue?

````go
package main

import "container/heap"

type task struct {
  name      int
  frequency int
}

// tasksPriorityQueue would have  to implement all methods of heap interface like Len(), Less(), Swap(), Push() etc.
type tasksPriorityQueue []task

func (h tasksPriorityQueue) Len() int {
  return len(h)
}

func (h tasksPriorityQueue) Less(i int, j int) bool {
  return h[i].frequency > h[j].frequency
}

func (h tasksPriorityQueue) Swap(i int, j int) {
  h[i], h[j] = h[j], h[i]
}

func (h *tasksPriorityQueue) Push(a interface{}) {
  *h = append(*h, a.(task))
}

func (h *tasksPriorityQueue) Pop() interface{} {
  l := len(*h)
  res := (*h)[l-1]
  *h = (*h)[:l-1]
  return res
}

func main() {

  pq := new(tasksPriorityQueue)
  temp := task{name: 20, frequency: 1}
  heap.Push(pq, temp)
  
  if pq.Len() > 0 {
	  temp1 := heap.Pop(pq).(task) // typecasting for task
  }
}
````

# How to implement Stack?
````go
type Stack []string

func (s *Stack) IsEmpty() bool {
	return len(*s) == 0
}
func (s *Stack) Push(str string) {
	*s = append(*s, str)
}
func (s *Stack) Len() int {
	return len(*s)
}
func (s *Stack) Pop() (string, bool) {
	if s.IsEmpty() {
		return "", false
	} else {
		index := len(*s) - 1
		elem := (*s)[index]
		*s = (*s)[:index]
		return elem, true
	}
}
````

# Multi-Threading
````
go X() // asynchrnously call X() function
````

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

# OOPs
- Go does not support inheritance, however, it does support composition.

# Go Tutorials
- [Frequently Asked Questions (FAQ) - Go](https://go.dev/doc/faq#overloading)
- [How To Use Variables and Constants in Go](https://www.digitalocean.com/community/tutorials/how-to-use-variables-and-constants-in-go)
- [Practical Go: Real world advice for writing maintainable Go programs](https://dave.cheney.net/practical-go/presentations/qcon-china.html)
- https://golangbot.com/learn-golang-series/
- https://yourbasic.org/golang/implement-fifo-queue/
- https://dave.cheney.net/2016/08/20/solid-go-design


