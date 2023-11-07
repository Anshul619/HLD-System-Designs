
# What is TypeScript?

TypeScript is a typed superset of JavaScript that compiles to plain JavaScript.
- It is pure object-oriented with classes, interfaces and statically typed programming languages like C# or Java.
- You will need a compiler to compile and generate the code in the JavaScript file.
- Basically, TypeScript is the [ES6 version](https://www.w3schools.com/Js/js_es6.asp) of JavaScript with some additional features ( like `Static Typing` ).

# What are the Differences between TypeScript and JavaScript?
- TypeScript is an `Object-Oriented` language. JavaScript is a Scripting language.
- TypeScript has a feature known as `Static typing`. JS does not have static typing.
- TypeScript gives support for `modules`. JavaScript does not support modules.
- TypeScript supports optional parameter function. JS does not support optional parameter function.

# Why do we need TypeScript?

- `Using new features of ECMAScript`: 
  - TypeScript supports new ECMAScript standards and transpile them to ECMAScript targets of your choice. 
  - So, you can use features of [ES2015 ( i.e. EC6)](https://www.w3schools.com/Js/js_es6.asp) and beyond.
- `Static Typing`: 
  - JavaScript is dynamically typed and does not know what type a variable is until it is actually instantiated at run-time. 
  - TypeScript adds type support to JavaScript.
- `Type Inference`: 
  - TypeScript makes typing a bit easier and a lot less explicit by the usage of type inference. 
  - Even if you don’t explicitly type the types, they are still there to save you from doing something which otherwise would result in a run-time error.
- `Better IDE Support`
  - The development experience with TypeScript is a great improvement over JavaScript. 
  - There is a wide range of IDEs that have excellent support for TypeScript, like Visual Studio & VS code, Atom, Sublime, and IntelliJ/WebStorm.
- `Strict Null Checking`: 
  - Errors, like cannot read property ‘x’ of undefined, is common in JavaScript programming. 
  - You can avoid most of these kinds of errors since one cannot use a variable that is not known to the TypeScript compiler.
- `Interoperability`
  - TypeScript is closely related to JavaScript so it has great interoperability capabilities, but some extra work is required to work with JavaScript libraries in TypeScript.

# What are the disadvantages of TypeScript?
- TypeScript takes a long time to compile the code.
- It does not support abstract classes.
- If we run the TypeScript application in the browser, a compilation step is required to transform TypeScript into JavaScript.
- Web developers are using JavaScript for decades and TypeScript doesn’t bring anything new ( except static typing )
- To use any third party library, the definition file is a must.
- Quality of type definition files is a concern.

# How do you compile TypeScript files?

To compile any .ts file into .js use the following command:
- `tsc <TypeScript File Name>`

For example, to compile `edureka.ts` ( & the result would be `edureka.js`. )
- `tsc edureka.ts`

# What are the different types of TypeScript?

The Type System represents the different types of values supported by the language.
- It checks the validity of the supplied values before they are stored or manipulated by the program.

It can be classified into two types such as:
- `Built-in`: This includes number, string, boolean, void, null and undefined.
- `User-defined`: It includes Enumerations (enums), classes, interfaces, arrays, and tuple.

# List out the built-in data types in TypeScript.

In TypeScript, the built-in data types are also known as primitive data types and the list include:
- `Number`: This represents number type values. The numbers are stored as floating-point values in TypeScript.
- `String`: A string represents a sequence of characters stored as Unicode UTF-16 code.
- `Boolean`: This represents a logical value. When we use the Boolean type, we get the output only in true or false.
- `Null`: Null represents a variable whose value is undefined. It is not possible to directly reference the null type value itself.
- `Undefined`: The Undefined type denotes all uninitialized variables.
- `Void`: A void is the return type of the functions that do not return any type of value.

# What are Interfaces in TypeScript?
The interface is a structure that defines the contract in your application.
- It defines the syntax for classes to follow.
- It contains only the declaration of the members & it is the responsibility of the deriving class to define the members.
- The TypeScript compiler uses interface for type-checking and checks whether the object has a specific structure or not.

```javascript
interface interface_name {
// variables' declaration
// methods' declaration
}
```

# What are Classes in TypeScript? List out some of the features.

TypeScript introduced classes so that they can avail the benefits of object-oriented techniques like encapsulation and abstraction. 
- The class in TypeScript is compiled to plain JavaScript functions by the TypeScript compiler to work across platforms and browsers. 

```javascript
class Employee {
  empID: number;
  empName: string;
   
  constructor(ID: number, name: string) {
    this.empName = name;
    this.empID = ID;
  }
   
  getSalary() : number {
    return 40000;
  }
}
```

Features of class
- Inheritance 
- Encapsulation 
- Polymorphism 
- Abstraction

# What are modules in TypeScript?
A module is a powerful way of creating a group of related variables, functions, classes, and interfaces, etc.
- It can be executed within its own scope, but NOT in the global scope.
- Basically, you cannot access the variables, functions, classes, and interfaces declared in a module outside the module directly.

A module can be created by using the `export` keyword and can be used in other modules by using the `import` keyword.

# What is namespace in Typescript and how to declare it?

Namespace groups functionalities logically.
- These maintain the legacy code of typescript internally.
- It encapsulates the features and objects that share certain relationships.
- A namespace is also known as internal modules.
- A namespace can also include interfaces, classes, functions, and variables to support a group of related functionalities.

# Does TypeScript support function overloading?
Yes, TypeScript supports function overloading. But the implementation is odd.
- So, when you overload in TypeScript you only have one implementation with multiple signatures.

```javascript
class Customer {
  name: string;
  Id: number;
  add(Id: number);
  add(name:string);
  add(value: any) {
  
    if (value && typeof value == "number") {
      //Do something
    }
    
    if (value && typeof value == "string") {
      //Do Something
    }
  }
```

Notes
- The first signature has one parameter of type number whereas the second signature has a parameter of type string. 
- The third function contains the actual implementation and has a parameter of type any. 
- The implementation then checks for the type of the supplied parameter and executes a different piece of code based on the supplier parameter type.

# [How do I run TypeScript files directly without generating any JavaScript files?](https://docs.google.com/spreadsheets/d/1hp-y74b9ItnAazdxLqsvBW6MAm3SFZRpodwjvIEn9Tw/edit#gid=1089007431)

`ts-node example.ts`

# Explain Decorators in TypeScript.
- A Decorator is a special kind of declaration that can be applied to class, methods, accessor, property, or parameter etc.
- Decorators are functions that are prefixed `@expression` symbol, where expression must evaluate to a function that will be called at runtime with information about the decorated declaration.

# What is Lambda/Arrow function?

ES6 version of TypeScript provides shorthand syntax for defining the anonymous function, i.e., for function expressions. 
- These arrow functions are also called lambda functions. 
- A lambda function is a function without a name.

```javascript
let sum = (x: number, y: number): number => { 
  return x + y; 
} 
console.log(sum(10, 20)); //returns 30
```

# References
- https://www.edureka.co/blog/interview-questions/typescript-interview-questions/
