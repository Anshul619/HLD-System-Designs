# Introduction
- [JavaScript](https://www.w3schools.com/js/) is a single-threaded synchronous programming language.

# JavaScript is asynchronous
- Asynchronous execution reduces waiting times.
- Parallel execution reduces wall-clock time.
- Interleaved execution is done by concurrent threads. Concurrent and interleaved are used (roughly) synonymously.
- [Introducing asynchronous JavaScript](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Asynchronous/Introducing)

## Asynchronous JavaScript - Callbacks

````
function myDisplayer(some) {
  document.getElementById("demo").innerHTML = some;
}

function myCalculator(num1, num2, myCallback) {
  let sum = num1 + num2;
  myCallback(sum);
}

myCalculator(5, 5, myDisplayer);
````

[Read more](https://www.w3schools.com/js//js_callback.asp)

## Asynchronous JavaScript - Timeouts

````
setTimeout(myFunction, 3000);

function myFunction() {
  document.getElementById("demo").innerHTML = "I love You !!";
}
````

[Read more](https://www.w3schools.com/js//js_asynchronous.asp)

## Asynchronous JavaScript - Promises

````
let myPromise = new Promise(function(myResolve, myReject) {
// "Producing Code" (May take some time)

  myResolve(); // when successful
  myReject();  // when error
});

// "Consuming Code" (Must wait for a fulfilled Promise)
myPromise.then(
  function(value) { /* code if successful */ },
  function(error) { /* code if some error */ }
);
````

[Read more](https://www.w3schools.com/js//js_promise.asp)

## Asynchronous JavaScript - Async
- The keyword [async](https://www.w3schools.com/js//js_async.asp) before a function makes the function return a promise.

````
async function myFunction() {
  return "Hello";
}

is same as 

function myFunction() {
  return Promise.resolve("Hello");
}
````

## Asynchronous JavaScript - Await
- let value = await promise;
- The await keyword can only be used inside an async function.

# Web worker - Parallel Processing, Multi-Threading
- A [web worker](https://www.w3schools.com/js//js_api_web_workers.asp) is a JavaScript that runs in the background, independently of other scripts, without affecting the performance of the page. 
- You can continue to do whatever you want: clicking, selecting things, etc., while the web worker runs in the background.

````
let w;

function startWorker() {
  if (typeof(w) == "undefined") {
    w = new Worker("demo_workers.js");
  }
  w.onmessage = function(event) {
    document.getElementById("result").innerHTML = event.data;
  };
}

function stopWorker() {
  w.terminate();
  w = undefined;
}
````

# What is Event Loop?
- An event loop is something that pulls stuff out of the queue and places it onto the function execution stack whenever the function stack becomes empty.
- The event loop is the secret by which JavaScript gives us an illusion of being multithreaded even though it is single-threaded
- [What is an event loop in JavaScript ?](https://www.geeksforgeeks.org/what-is-an-event-loop-in-javascript/)

# Memory allocation in JavaScript
- Heap memory: Data stored randomly and memory allocated.
- Stack memory: Memory allocated in the form of stacks. Mainly used for functions.

The function stack is a function which keeps track of all other functions executed in run time.
- Ever seen a stack trace being printed when you ran into an error in JavaScript.
- That is nothing but a snapshot of the function stack at that point when the error occurred.


# How to create object in javascript?

````javascript
 function getUsers(var username) {        
        //this.name = username;        
}
var k = new getUsers("Anshul");
````

# How to access static area of a function in javascript?

````
getUsers.prototype.name = "Anshul";
````

# When would happen if object change value of a class?
- [Classes](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes) are a template for creating objects. 
- They encapsulate data with code to work on that data. 
- Classes in JS are built on prototypes but also have some syntax and semantics that are not shared with ES5 class-like semantics.

````
    var k = new getUsers("Anshul");
    
    getUsers.prototype.name = "Anshul";
    //getUsers.prototype.name
    
    // k.name =  "Anshul"
    
    k.name = "Chitresh";
    
    // print k.name = "Chitresh"
    
    //delete k.name
    // print k.name = "Anshul"
    k.name = "Chitresh";
    
    
    var g = new getUsers("Anshul");
    
    //g.name = 
    // print g.name = "Anshul"
````


# How to create nested promise?

````
new Promise(function(){
        //Code to be executed;
    }).then {
        // new Promise
    }
    .error //
````

# Hoisting
- In JavaScript, Hoisting is the default behavior of moving all the declarations at the top of the scope before code execution. 
- Basically, it gives us an advantage that no matter where functions and variables are declared, they are moved to the top of their scope regardless of whether their scope is global or local.
- To avoid hoisting, you can run javascript in strict mode by using `use strict` on top of the code.

```javascript
hoistedVariable = 3;
console.log(hoistedVariable); // outputs 3 even when the variable is declared after it is initialized	
var hoistedVariable;
```

# Difference between “ == “ and “ === “ operators.

Both are comparison operators. 
- The difference between both the operators is that `==` is used to compare values whereas, `===` is used to compare both values and types.

```javascript
var x = 2;
var y = "2";
(x == y)  // Returns true since the value of both x and y is the same
(x === y) // Returns false since the typeof x is "number" and typeof y is "string"
```

# Difference between var and let keyword in javascript.
- From the very beginning, the 'var' keyword was used in JavaScript programming whereas the keyword 'let' was just added in 2015.
- The keyword `Var` has function scope. Anywhere in the function, the variable specified using var is accessible 
- But in `let`, the scope of a variable declared with the 'let' keyword is limited to the block in which it is declared. ( `Block Scope` )
- `var` declares a variable that will be hoisted but `let` declares a variable that will not be hoisted.

```javascript
var funcs = [];
    
    // let's create 3 functions
    for (let i = 0; i < 3; i++) {
        
        // and store them in funcs
        funcs[i] = function() {
            // each should log its value.
            console.log("My value: " + i);
        };
    
    }
    
    for (var j = 0; j < 3; j++) {
        // and now let's run each one to see
        funcs[j]();
    }
```

# Explain Implicit Type Coercion in javascript.
- Implicit type coercion in javascript is the automatic conversion of value from one data type to another. 
- It takes place when the operands of an expression are of different data types.

```javascript
var x = 3;
var y = "3";
x + y // Returns "33" 
```

# Is javascript a statically typed or a dynamically typed language?
- Javascript is a loosely(dynamically) typed language, variables in JS are not associated with any type. 
- A variable can hold the value of any data type.
- In a `dynamically typed language`, the type of variable is checked during run-time in contrast to a `statically typed language`, where the type of variable is checked during compile-time.

```javascript
var a = 23;
var a = "Hello World!";
```

# What is NaN property in JavaScript?
- NaN property represents the `Not-a-Number` value. It indicates a value that is not a legal number.

# Explain passed by value and passed by reference.
- In JavaScript, primitive data types ( int, string etc. ) are passed by value and non-primitive data types ( object ) are passed by reference.

# What is an Immediately Invoked Function in JavaScript?

An Immediately Invoked Function ( known as IIFE and pronounced as IIFY) is a function that runs as soon as it is defined.

```javascript
(function(){ 
  // Do something;
})();
```

# What do you mean by strict mode in javascript and characteristics of javascript strict-mode?

Characteristics of strict mode in javascript ( introduced in `ECMAScript 5` )
- Duplicate arguments are not allowed by developers.
- In strict mode, you won't be able to use the JavaScript keyword as a parameter or function name.
- The 'use strict' keyword is used to define strict mode at the start of the script. Strict mode is supported by all browsers.
- Engineers will not be allowed to create global variables in 'Strict Mode.

# Explain Higher Order Functions in javascript.

Functions that operate on other functions, either by taking them as arguments or by returning them, are called higher-order functions.

Example1
```javascript
function higherOrder(fn) {
  fn();
}
   
higherOrder(function() { console.log("Hello world") });
```

Example2
```javascript
function higherOrder2() {
return function() {
return "Do something";
}
}      
var x = higherOrder2();
x()   // Returns "Do something"
```

# Explain “this” keyword.
- The `this` keyword refers to the object that the function is a property of.
- The value of the `this` keyword will always depend on the object that is invoking the function.

# What do you mean by Self Invoking Functions?
- Without being requested, a self-invoking expression is automatically invoked (initiated). 
- If a function expression is followed by (), it will execute automatically. 
- A function declaration cannot be invoked by itself.
- For-Example - `Immediately Invoked Function`

# Explain Closures in JavaScript.
- Closures are an ability of a function to remember the variables and functions that are declared in its outer scope.
- A closure is the combination of a function bundled together (enclosed) with references to its surrounding state (the lexical environment).
- In other words, a closure gives you access to an outer function's scope from an inner function.
- In JavaScript, closures are created every time a function is created, at function creation time.

```javascript
var Person = function(pName){
  var name = pName;

  this.getName = function(){
    return name;
  }
}

var person = new Person("Neelesh");
console.log(person.getName());
```


# References
- [Closures](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Closures)
- [JavaScript](https://www.interviewbit.com/javascript-interview-questions/)
- [Understanding Browser Caching](https://www.section.io/engineering-education/understanding-browser-caching/)



