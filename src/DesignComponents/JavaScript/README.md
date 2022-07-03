
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
- https://developer.mozilla.org/en-US/docs/Web/JavaScript/Closures
- https://www.interviewbit.com/javascript-interview-questions/



