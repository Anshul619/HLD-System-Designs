# Why is Java a platform independent language?
Java language was developed in such a way that it does not depend on any hardware or software due to the fact that the compiler compiles the code and then converts it to *platform-independent byte code* which can be run on multiple systems.
- The only condition to run that byte code is for the machine to have a *runtime environment (JRE)* installed in it.

# Why is Java not a pure object-oriented language?
- Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and hence it is not a pure object oriented language.

# What is Garbage Collection?
- The main objective of this process is to free up the memory space occupied by the unnecessary and unreachable objects during the Java program execution by deleting those unreachable objects.
- This ensures that the memory resource is used efficiently, but it provides no guarantee that there would be sufficient memory for the program execution.
- [Heap memory](https://opendsa-server.cs.vt.edu/ODSA/Books/CS2/html/HeapMem.html) would be cleared on garbage collection.

# Garbage collection impacts to Java performance
- The most common performance problem associated with Java™ relates to the [garbage collection mechanism](https://www.ibm.com/docs/no/aix/7.2?topic=monitoring-garbage-collection-impacts-java-performance).
- If the size of the Java heap is too large, the heap must reside outside main memory. This causes increased paging activity, which affects Java performance.
- Also, a large heap can take several seconds to fill up. This means that even if garbage collection occurs less frequently, pause times associated with garbage collection increase.
- To tune the Java Virtual Machine (JVM) heap, use the java command with the -ms or -mx option. Use the garbage collection statistics to help determine optimal settings.

# How is Java different from C++?

1. No Pointers in Java ( References used )
- Java does not provide low-level programming functionalities like Pointers
- Java makes use of references as these cannot be manipulated, unlike pointers.
- For example, non-primitives are always references in Java.
- So we cannot pass large objects (like we can do in C++) to functions, `we always pass references in Java`.

2. Better Code Maintainability in Java
- Also, Java codes are always written in the form of classes and objects.
- When compared with C++, Java codes are generally more maintainable because Java does not allow many things which may lead to bad/inefficient programming if used incorrectly.
- Java syntax is similar to C/C++.

3. Memory access not possible in Java
- One more example, since there are no pointers, bad memory access is also not possible.

# What is data encapsulation?
- Data Encapsulation is an `Object-Oriented Programming` concept of hiding the data attributes and their behaviours in a single unit. 
- It helps developers to follow modularity while developing software by ensuring that each object is independent of other objects by having its own methods, attributes, and functionalities. 
- It is used for the security of the private properties of an object and hence serves the purpose of data hiding.

<img title="Java - JDK vs JRE vs JVM" alt="Alt text" src="Others/Java - JDK vs JRE vs JVM.drawio.png">

# JRE vs JVM 
- The main function of JRE is to provide a runtime environment to run java applications, whereas JVM converts a byte code to machine code for execution and provides platform independence.
- JRE acts as a container and jvm acts as content.
- JRE is composed of JVM + Libraries to run applications, whereas jvm contains only a runtime environment for executing Java bytecode.

# Just In Time(JIT) compiler
- JIT stands for `Just-In-Time` & it is used for improving the performance during run time. It does the task of compiling parts of byte code having similar functionality at the same time thereby reducing the amount of compilation time for the code to run.
- The compiler is nothing but a translator of source code to machine-executable code. But what is special about the JIT compiler? Let us see how it works:
  - First, the Java source code (`.java`) conversion to byte code (`.class`) occurs with the help of the javac compiler.
  - Then, the .class files are loaded at run time by JVM and with the help of an interpreter, these are converted to machine understandable code.
  - JIT compiler is a part of JVM. 
  - When the JIT compiler is enabled, the JVM analyzes the method calls in the `.class` files and compiles them to get more efficient and native code. 
  - It also ensures that the prioritized method calls are optimized.
  - Once the above step is done, the JVM executes the optimized code directly instead of interpreting the code again.
  - This increases the performance and speed of the execution.

# Can the static methods be overridden?
- No! Declaration of static methods having the same signature can be done in the subclass but run time polymorphism can not take place in such cases.
- Overriding or dynamic polymorphism occurs during the runtime, but the static methods are loaded and looked up at the compile time statically. Hence, these methods can't be overridden.

# Difference between static methods, static variables, and static classes in java.
- Static Methods and Static variables are those methods and variables that belong to the class of the java program, not to the object of the class. 
- This gets memory where the class is loaded. And these can directly be called with the help of class names.
- For example - We have used mathematical functions in the java program like - max(), min(), sqrt(), pow(), etc. 
- And if we notice that, then we will find that we call it directly with the class name. Like - Math.max(), Math.min(), etc. So that is a static method.  And Similarly static variables we have used like (length) for the array to get the length. So that is the static method.
- Static classes - `A class in the java program cannot be static except if it is the inner class`. If it is an inner static class, then it exactly works like other static members of the class.

# What makes a HashSet different from a TreeSet?
- Implementation: For a HashSet, the hash table is utilized for storing the elements in an unordered manner. However, TreeSet makes use of the red-black tree to store the elements in a sorted manner.
- Complexity/ Performance: For adding, retrieving, and deleting elements, the time amortized complexity is O(1) for a HashSet. The time complexity for performing the same operations is a bit higher for TreeSet and is equal to O(log n). Overall, the performance of HashSet is faster in comparison to TreeSet.
- Methods: hashCode() and equals() are the methods utilized by HashSet for making comparisons between the objects. Conversely, compareTo() and compare() methods are utilized by TreeSet to facilitate object comparisons.
- Objects type: Heterogeneous and null objects can be stored with the help of HashSet. In the case of a TreeSet, runtime exception occurs while inserting heterogeneous objects or null objects.

# What are the differences between HashMap and HashTable in Java?
- HashMap is not synchronized thereby making it better for non-threaded applications.
- HashTable is synchronized and hence it is suitable for threaded applications.
- Allows only one null key but any number of null in the values.	This does not allow null in both keys or values.
- Supports order of insertion by making use of its subclass LinkedHashMap.	Order of insertion is not guaranteed in HashTable.

# Can you call a constructor of a class inside the another constructor?
- Yes, the concept can be termed as constructor chaining and can be achieved using this().

# Although inheritance is a popular OOPs concept, it is less advantageous than composition. Explain.

Inheritance lags behind composition in the following scenarios:
- Multiple-inheritance is not possible in Java. Classes can only extend from one superclass. In cases where multiple functionalities are required, for example - to read and write information into the file, the pattern of composition is preferred. The writer, as well as reader functionalities, can be made use of by considering them as the private members.
- Composition assists in attaining high flexibility and prevents breaking of encapsulation.
- Unit testing is possible with composition and not inheritance. When a developer wants to test a class composing a different class, then Mock Object can be created for signifying the composed class to facilitate testing. This technique is not possible with the help of inheritance as the derived class cannot be tested without the help of the superclass in inheritance.
- The loosely coupled nature of composition is preferable over the tightly coupled nature of inheritance.

# Static Variables
- If object changes value of the static variable, would it be changed at the class level? - Yes 
- Can static variables, be accessed using object also? - Yes

# Protected vs Private
- Protected can be used in the same package subclass.
- Private can not be used in the same package subclass

# What is DI?
- Dependency injection is a technique that allows the client code to be independent from the services it is relying on.
- The client does not control how objects of the services are created - it works with an implementation of the service through interface.
- This is somewhat in inverse to trivial programming so dependency injection is also called inversion of control.
- It makes the code *more flexible, extensible, maintainable, testable and reusable* - thus dependency injection is very popular in modern programming.
- In Java, dependency injection is supported since Java EE 6 - called CDI (Contexts and Dependency Injection).
- And the Spring framework is based on dependency injection, as well as other frameworks like Google Guice and Play.
- *Dependency injection helps in TDD development.*
- *Dependency Injection helps in loosely coupling. It's a singleton class and helps in maintaining factory pattern.*

# Types of DI
- *Constructor injection*: the dependencies are provided through a class constructor.
- *Setter injection*: the client exposes a setter method that the injector uses to inject the dependency.
- *Interface injection*: the dependency provides an injector method that will inject the dependency into any client passed to it. Clients must implement an interface that exposes a setter method that accepts the dependency.

# Spring - @Autowired
- @AutoWired is used in Spring for the dependency injection.
- Singleton class would be initiated in the AutoWiring.

# Java8 - Oracle Commercial License
- After Java 8, all java versions are under [Oracle Commercial License](https://www.infogain.com/blog/java-8-to-11-a-migration-story/).
- Rough cost - Rs 15L for 5 years for 10 servers. ( $25 per server per month )

# Java7 vs Java8
- Java SE 8 (Spider) is a groundbreaking software framework launches that bring many major upgrades and enhancements in java programming, including the Java Script enhanced engine, new APIs for manipulation of date and time,
- JVM enhanced and quicker, and more.
- Java SE 8 is a huge leap forward for the language of programming, which also brings the most awaited update of the technology giant – the lambda word.
- This is a new language feature specifically included in the update Java 8 and one of the most significant programming upgrades.
- This add-on eventually led to practical programming as a pioneer in the development platform.
- The Java Development Kit 8 was officially released by Oracle on Mar 18 2014, marking a turning point for the global programme.
- The company changed the programming model for functional programming to accommodate the new expressions of Lambda.

# Session implementation in java
Servlets in java provide an interface known as `HttpSessionInterface`.
- public HttpSession `getSession(boolean create)`: This method gets the session associated with the request. In case it is not available or not present, a new session is created which is based upon the Boolean argument specified.
- public String `getId()`: The unique session id is returned by this method.
- public long `getCreationTime()`: The time when the session was created is returned by this method. It is measured in milliseconds.
- public long `getLastAccessedTime()`: The time when the session was last accessed is returned by this method. It is measured in milliseconds.
- public void `invalidate()`: A session can be invalidated by using this method.

# [Java Stream](https://www.geeksforgeeks.org/stream-in-java/)

Java Stream is by default supported for Collection interfaces. 
- To use streams for other data types, we can use [Streams.of(variale)](https://stackify.com/streams-guide-java-8/).

![image](https://user-images.githubusercontent.com/1247944/175827637-cf1f634e-6850-49d0-9039-0d9b3093902e.png)

Example Source Codes
- [Streams](Streams)
- [TW-Code](https://github.com/Anshul619/joy-of-energy/blob/master/src/main/java/uk/tw/energy/service/PricePlanService.java)

## Map
- The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.

```java
List<Integer> number = Arrays.asList(2, 3, 4, 5);

// Apply x->x*x on number list. List as an output.
List<Integer> outputList = number.stream().map(x -> x*x).collect(Collectors.toList());

// Apply x->x*x on number list. Set as an output.
Set<Integer> outputSet = number.stream().map(x -> x*x).collect(Collectors.toSet());
```

## Sorted
- The sorted method is used to sort the stream.

```java
// create a list of strings
List<String> strings = Arrays.asList("Anshul", "Agrawal", "Developer");

// Sort the list
List<String> sorted = strings.stream().sorted().collect(Collectors.toList());
```

## Collectors
-  The collect method is used to return the result of the intermediate operations performed on the stream.

```java
List<String> sorted = strings.stream().sorted().collect(Collectors.toList());
Set<Integer> outputSet = number.stream().map(x -> x*x).collect(Collectors.toSet());
```

## Filter
- The filter method is used to select elements as per the Predicate passed as argument.

```java
// create a list of strings
List<String> strings = Arrays.asList("Anshul", "Agrawal", "Developer");

// Filter list for string starting with "A". Here s->s.startsWith is the predicate.
List<String> filtered = strings.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
```

## Reduce
- The reduce method is used to reduce the elements of a stream to a single value.

```java
// create a list of integers
List<Integer> number = Arrays.asList(2, 3, 4, 5);

// Apply x->x*x on number list. List as an output.
List<Integer> outputList = number.stream().map(x -> x*x).collect(Collectors.toList());

// Apply x->x*x on number list. Set as an output.
Set<Integer> outputSet = number.stream().map(x -> x*x).collect(Collectors.toSet());

System.out.println(outputList);
```

## ForEach
- The forEach method is used to iterate through every element of the stream.

```java
// create a list of integers
List<Integer> number = Arrays.asList(2, 3, 4, 5);

// Apply x->x*x on number list & then print it
number.stream().map(x -> x*x).forEach(y->System.out.println(y));
```  

# [Generics](https://www.geeksforgeeks.org/generics-in-java/)

## Type Parameters in Java Generics

The type parameters naming conventions are important to learn generics thoroughly. 

The common type parameters are as follows:
- T – Type
- E – Element
- K – Key
- N – Number
- V – Value

## Advantages of Generics
- Code Reuse
- Type Safety
- Individual Type Casting is not needed
- Generics promotes Code Re-usability
- Implement Generic Algorithms

# Java Exception Hierarchy

Exception Handling in Java is one of the effective means to handle the runtime errors so that the regular flow of the application can be preserved.

Types of Exceptions
- User Defined Exception
- Built-in Exception

# How Does JVM handle an Exception?

Whenever inside a method, if an exception has occurred, the method creates an Object known as an Exception Object and hands it off to the run-time system(JVM).
- The exception object contains the name and description of the exception and the current state of the program where the exception has occurred.
- The run-time system searches the call stack to find the method that contains a block of code that can handle the occurred exception. The block of the code is called an Exception handler.
- The run-time system starts searching from the method in which the exception occurred, and proceeds through the call stack in the reverse order in which methods were called.

![image](https://user-images.githubusercontent.com/1247944/175828367-7389509d-e5e9-45fb-8a62-94601db0d915.png)

# [Advanced MultiThreading](https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-concurrency-advanced/src/main/java/com/baeldung)

# References
- https://www.geeksforgeeks.org/spring-componentscan-annotation-with-example/
- https://www.codejava.net/coding/what-is-dependency-injection-with-java-code-example
- https://www.interviewbit.com/java-interview-questions/
- https://www.geeksforgeeks.org/java/?ref=shm
- https://www.educba.com/jre-vs-jvm/
- https://www.educba.com/java-7-vs-java-8/
- https://www.edureka.co/blog/session-in-java/
- https://blog.knoldus.com/java-8-stream-need-with-examples-and-limitations/
- https://stackoverflow.com/questions/44180101/in-java-what-are-the-advantages-of-streams-over-loops
- [15 Practical Exercises Help You Master Java Stream API](https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82)