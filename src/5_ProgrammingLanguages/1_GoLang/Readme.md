# What is Golang?
- Go is a high level, general-purpose programming language that is [very strongly and statically typed](StaticTypedGo.md) by providing support for garbage collection and [concurrent programming](GoRoutines.md).
- Go technically is [pass by value](https://stackoverflow.com/questions/47296325/passing-by-reference-and-value-in-go-to-functions).
- Go is a [case-sensitive language](https://en.wikipedia.org/wiki/Case_sensitivity).

# :star: Why is Golang fast compared to other languages?
- Golang is faster than other programming languages because of its simple and efficient memory management and [concurrency model](GoRoutines.md).
- The compilation process to machine code is very fast and efficient.
- Additionally, the dependencies are linked to a `single binary file thereby putting off dependencies on servers`.
- It also uses a compile-link model for generating executable binaries from the source code.

# Key Features

| Title                                                                                                | Remarks |
|------------------------------------------------------------------------------------------------------|---------|
| :star: [Go Coding Helpers & Guidelines](CodingHelpers&GuidelinesGo.md)                               | -       |
| [Go - Statically Typed](StaticTypedGo.md)                                                            | -       |
| [Slices in GoLang](SlicesGo.md)                                                                      | -       |
| [Pointers in GoLang](PointersGo.md)                                                                  | -       |
| [OOPs in GoLang](OOPsGo.md)                                                                          | -       |
| [Concurrency in GoLang](GoRoutines.md)                                                            | -       |
| [DB Transaction in GoLang](DBTransactionGo.md)                                                       | -       |
| [Panic & Recover](Panics&Recover.md)                                                                 | -       |
| [How to write unit tests in GoLang?](https://blog.alexellis.io/golang-writing-unit-tests/)           | -       |
| [Labels in Go](https://medium.com/golangspec/labels-in-go-4ffd81932339)                              | -       |
| [How to Work With SQL in Go?](https://betterprogramming.pub/how-to-work-with-sql-in-go-ca8bc0b30722) | -       |

# :+1: What are the advantages of Golang over other languages?

| Advantage                   | Description                                                                                                                                                    |
|-----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Simple and Understandable   | Go was developed by keeping simplicity, maintainability and readability in mind.                                                                               |
| Standard Powerful Library   | Go supports all standard libraries and packages that help in writing code easily and efficiently.                                                              |
| Support for concurrency     | Go provides very good support for [concurrency using  Go Routines or channels](GoRoutines.md).                                                              |
| Static Type Checking        | Go is a very strong and [statically typed programming language.](StaticTypedGo.md)<br/>- This ensures that the code is type-safe and all type conversions are handled efficiently. |
| Easy to install binaries    | Go provides support for generating binaries for the applications with all required dependencies.                                                                                                                                                             |
| Good Testing Support        | Go has good support for writing unit test cases along with our code.                                                                                                                                                               |

# How to build and install Go Programs?
- Go does have an extensive library, called [the runtime](https://pkg.go.dev/runtime), that is part of every Go program. 
- The runtime library implements garbage collection, [concurrency](GoRoutines.md), stack management, and other critical features of the Go language.
- It is important to understand, however, that Go's runtime does not include a virtual machine, such as is provided by the Java runtime. 
- Go programs are compiled ahead of time to native machine code.

| Title                                | Command                                                                                                                                         | Remarks |
|--------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| Run Go Program                       | go run <goFileName.go>                                                                                                                          | -       |
| Run a folder with go programs        | go run .                                                                                                                                        |
| Create a Go Module to build a Go Binary | go mod init <moduleName>                                                                                                                        | -       |
| Creating Go Binaries                 | go build // Build with the same name as moduleName in pwd directory<br/><br/>go build -o bin/hello // Build with "hello" name in bin/ directory | -       |
| Run Go Binaries                      | ./moduleName                                                                                                                                    | -       |
| Install Go Programs                  | go install // This will build the binary and place it in $GOPATH/bin.                                                                           | -       |

[Read more](https://www.digitalocean.com/community/tutorials/how-to-build-and-install-go-programs)

# Who uses GoLang?

| Title                                                | Remarks |
|------------------------------------------------------|---------|
| Docker and Kubernates are developed in GoLang        | -       |
| Google's download server (dl.google.com), golang.org | -       |

# What are Golang packages?
- In Go, the programs are built by using packages that help in managing the dependencies efficiently.
- The package is declared at the top of the Go source file as `package <package_name>`.
- The packages can be imported to our source file by writing: `import <package_name>`.

![img.png](assests/gopackages_img.png)

# What do you understand by Golang string literals?
- String literals are those variables storing string constants that can be a single character or that can be obtained as a result of the concatenation of a sequence of characters. 
- Go provides two types of string literals - Raw & Interpreted string literals.

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

# What do you understand by the scope of variables in Go?

## Local variables
- These are declared inside a function or a block and is accessible only within these entities.

## Global variables
- These are declared outside function or block and is accessible by the whole source file.

# How can we check if the Go map contains a key?

![img.png](assests/go_map_img.png)

```go
if val, isExists := map_obj["foo"]; isExists {
    //do steps needed here
}
```

# Can you format a string without printing?

```go
return fmt.Sprintf ("Size: %d MB.", 50)
```

# References
- [Frequently Asked Questions (FAQ)](https://go.dev/doc/faq)
- [Golang Interview Questions](https://www.interviewbit.com/golang-interview-questions/)