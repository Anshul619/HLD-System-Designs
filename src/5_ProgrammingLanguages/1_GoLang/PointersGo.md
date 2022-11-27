# What is Golang pointers?

| Operator     | Remarks                                                                                                                                                                                         |
|--------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `*` operator | This operator is called a [dereferencing operator](https://en.wikipedia.org/wiki/Dereference_operator) and is used for accessing the value in the address stored by the pointer.                |
| `&` operator | This operator is called the [address operator](https://www.techopedia.com/definition/25580/address-of-operator--c) and is used for returning the address of the variable stored in the pointer. |

```go
x := 100
y := &x // Pointer - stores address of x in y

fmt.Println(*y) // prints x variable 
```

[Read more](https://www.geeksforgeeks.org/pointers-in-golang/)

# What are uses of Pointers?
- Allowing `function to directly mutate value` passed to it.
    - That is achieving `pass by reference` functionality.
- For increasing the performance in the `edge cases in the presence of a large data structure`.
    - Using pointers help to copy large data efficiently.
- Helps in signifying the lack of values.
    - For instance, `while unmarshalling JSON data into a struct`, it is useful to know if the key is present or absent then the key is present with 0 value.

# How to use Pointers?
- [Pointer](https://www.geeksforgeeks.org/pointers-in-golang/) can be created using `new(int)`.
- [Pointer](https://www.geeksforgeeks.org/pointers-in-golang/) can be passed using `func x(output [][]*int)`.
- To access elements of a pointer array, use `(*h)[10]` instead of `*h[10]`.
- If method needs to modify the receiver, receiver must be pointer.

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

# :star: Slices & Pointers
- [Slices are passed by reference in the function call](https://stackoverflow.com/questions/38731467/pass-array-by-reference-in-golang), so no need to specify [pointers](https://www.geeksforgeeks.org/pointers-in-golang/).
- If you pass a slice into a function, the function can modify its contents (*) and the modifications will be visible to the caller once it returns.
- Alternatively, returning a new slice is also efficient - because again, slices are just references and don't take up much memory.
- But [appending an element to the slice, will not reflect in the caller function](https://stackoverflow.com/questions/21035279/why-does-go-slice-append-not-take-a-reference). 
- Hence, [either pointer needs to be used or new slice would have to be returned](https://stackoverflow.com/questions/52565597/cannot-append-to-slice-inside-a-function).
