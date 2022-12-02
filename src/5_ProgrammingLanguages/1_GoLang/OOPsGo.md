# Is Go an object-oriented language?
- Yes and no. 
- Although Go has types and methods and allows an object-oriented style of programming, [there is no type hierarchy](https://staff.fnwi.uva.nl/a.j.p.heck/Courses/JAVAcourse/ch3/s1.html). 
- The concept of [interface](https://medium.com/@ubale.vikas9/interface-in-oops-6eae3731c242) in Go provides a different approach that we believe is easy to use and in some ways more general. 
- There are also ways to embed types in other types to provide something analogous—but not identical—to subclassing.
- Also, the lack of a type hierarchy makes [objects](https://www.techtarget.com/searchapparchitecture/definition/object-oriented-programming-OOP) in Go feel much more lightweight than in languages such as C++ or Java.

# How do I get dynamic dispatch of methods?
- The only way to have dynamically dispatched methods is through an interface. 
- Methods on a struct or any other concrete type are always resolved statically.

# Why is there no type inheritance in Go?
- Object-oriented programming, at least in the best-known languages, involves too much discussion of the relationships between types, relationships that often could be derived automatically. Go takes a different approach.
- Rather than requiring the programmer to declare ahead of time that two types are related, in Go a type automatically satisfies any interface that specifies a subset of its methods. 
- Besides reducing the bookkeeping, this approach has real advantages. 
- [Go types](TypesGo.md) can satisfy many interfaces at once, without the complexities of traditional multiple inheritance. 
- Interfaces can be very lightweight—an interface with one or even zero methods can express a useful concept. 
- Interfaces can be added after the fact if a new idea comes along or for testing—without annotating the original types. 
- Because there are no explicit relationships between types and interfaces, there is no type hierarchy to manage or discuss.
- It takes some getting used to but this implicit style of type dependency is one of the most productive things about Go.

## Example

````go
type Animal struct {
   //..
}

func (a *Animal) Eat() {...}
func (a *Animal) Sleep(){...}
func (a *Animal) Run(){...}

type Dog struct {
    Animal
    //..
}
````

# What are interfaces?
- Interfaces are a special type in Go that define a set of method signatures but do not provide implementations.
- A [Go type](TypesGo.md) satisfies an interface by implementing the methods of that interface, nothing more.
- Interfaces essentially act as placeholders for methods that will have multiple implementations based on what object is using it.
- In Go language, the interface is a collection of method signatures and it is also a type means you can create a variable of an interface type.

````go
type geometry interface {
 area() float64
 perim() float64
}
````

# Embedding interface
- In embedding, [an interface can embed other interfaces or an interface can embed other interface’s method signatures](https://www.geeksforgeeks.org/embedding-interfaces-in-golang/?ref=lbp) in it, the result of both is the same as shown in Example 1 and 2. 
- You are allowed to embed any number of interfaces in a single interface. And when an interface, embed other interfaces in it if we made any changes in the methods of the interfaces, then it will reflect in the embedded interface also.

````go
// Interface 1
type AuthorDetails interface {
	details()
}

// Interface 2
type AuthorArticles interface {
	articles()
}

// Interface 3 embedded with interface 1 and 2
type FinalDetails interface {
	AuthorDetails
	AuthorArticles
}
````

# SOLID principles in GoLang

| SOLID Principle                                                 | GoLang                                                                                                                                                                                                                                     |
|-----------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Single Responsibility Principle                                 | Yes, through struct                                                                                                                                                                                                                        |
| Open/Closed Principle                                           | No concept of generalization (class-based inheritance). Reliability is available through embedding & interfaces.                                                                                                                           |
| Liskov substitution principle                                   | Instead of class-based inheritance, Golang provides a more powerful approach towards polymorphism via Interfaces and Struct Embedding. <br/>- Go polymorphism involves creating many different data types that satisfy a common interface. |
| Interface Segregation                                           | [Interfaces](https://gobyexample.com/interfaces) can be defined in GoLang.                                                                                                                                                                 |
| Dependency inversion principle                                  | Yes, through interfaces in GoLang.                                                                                                                                                                                                         |

## Single Responsibility
- CommandFactory and CommandExecutor are loosely coupled via Command module.

````go
type Command struct {
    commandType string 
    args []string
}

type CommandFactory struct {
    ...
}

// Create decode and validate the command
func (cf CommandFactory) Create(data []byte) (*Command, error) {
    // decode command
    command, err := cf.Decode(data)
    if err != nil {
        return nil, err
    }
    // validate type
    switch cf.Type { 
       case Foo:
       case Bar:
       default:
          return nil, InvalidCommandType    
    }
    return command, nil
}

type CommandExecutor struct {
}

// Execute executes the command 
func (ce CommandExecutor) Execute(command *Command) ([]byte, error) {
   // validate input and execute 
   switch command.Type {
   case Foo: 
       if len(args) == 0 || len(args[0]) == 0 {
           return nil, InvalidInput
       }
       return ExecuteFoo(command)   case Bar: // Bar doesn't take any input
       return ExecuteBar(command)
   }
}
````

## Open/Closed Principle
- In Golang there is no concept of generalization. 
- Reusability is available as a form of embedding. 
- Although a similar pattern could be seen in practice. 
- Let’s take the example of the CommandExecutor, which is responsible for executing Commands. 
- The Execute() and ValidateInput() methods need to handle each command separately. 
- So every time a new command is added Execute() implementation needs to change.

````go
type Command interface {
     Execute() ([]byte, error)
     ValidateInput() bool
}
type CommandExecutor struct {
}

func (c CommandExecutor) Execute(command Command) {
     if command.ValidateInput() {
          command.Execute()
     }
}

type FooCommand struct {
     args []string // need args
}

func (c FooCommand) ValidateInput() {
    // validate args 
    if len(args) >= 1 && len(args[0]) > 0 {
       return true
    }
    return false
}

func (c FooCommand) Execute() ([]byte, error) {
    ...
}

type BarCommand struct {
}

func (c BarCommand) ValidateInput() {
    // does nothing 
    return false
}

func (c BarCommand) Execute() ([]byte, error) {
    ...
}
````

## Liskov substitution principle

````go
type Command interface {
     Execute() ([]byte, error)
}

type CommandWithInput interface {
     Command
     ValidateInput() bool
}
````

## GoLang - Interface segregation principle
- In Golang interfaces are satisfied implicitly, rather than explicitly, which makes it easier to extend a class behaviour by implementing multiple interface based on needs. 
- It also encourages to the design of small and reusable interfaces.

````go
type I1 interface { // consumed by C1
    M1()
    M2()
    M3()       // also defined in I2
}
type I2 interface { // consumed by C2 and C3
    M3()       // here M3 not in a separate interface as no client
               // use an interface with only M3()
    M4()
}
type I3 interface { // consumed by C4
    M5()       // similarly M5() only used along with I1 and I2
               // thus not needed to have it in a separate interface
    I1
    I2
}
````

# References
- [Frequently Asked Questions (FAQ)](https://go.dev/doc/faq)
- [SOLID principle in GO](https://s8sg.medium.com/solid-principle-in-go-e1a624290346)
- [SOLID Go Design](https://dave.cheney.net/2016/08/20/solid-go-design)
