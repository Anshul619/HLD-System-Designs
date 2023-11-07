
# What are the most prominent features of Angular 8?
- Angular 8 support `Cross-Platform Features`.
  - The Angular 8 platform can be used to develop Progressive Web Apps. By using Angular 8, you can develop an extremely fast website that can provide app-like experiences with zero-step installation and high-quality performance.
- `Better Speed & Performance`
  - Angular 8 supports code generation facility that covert the templates into highly optimized code for JavaScript virtual machines. That's why Angular 8 is super fast.
- `High Productivity`
  - Angular 8 provides easy and powerful template syntax to create UI views.
- Provide Full Development Support

# What are the differences between promises and observables in Angular 8?
- Promises can deal with a single asynchronous event at a time.
- The observables can handle a sequence of asynchronous events over a period of time.
- Promises are always asynchronous. Observables are both synchronous and asynchronous.
- Promises are not lazy. They can execute immediately after creation.
- Observables are very lazy. They can't be executed until you subscribe to them using the `subscribe()` method.

# What is the usage of Codelyzer?
- `Codelyzer` is an open-source tool in Angular 8 that sits on top of TSLint. 
- It is used to check whether Angular TypeScript projects follow a set of rules or not. 
- It also checks the errors in codes, not following pre-defined rules. 
- It contains more than 50 rules for checking if an Angular application follows best practices. 
- It runs on the `tslint.json` file and checks only the static code in Angular 8.

# How Angular 8 has enhanced the performance over its previous versions?
Angular 8 consists of advanced level features such as
- Differential loading,
- CLI workflow improvements,
- Dynamic imports for lazy routes,
- Ivy rendering engine,
- Bazel, etc.

This ensures systematic workflow and performance improvements.

# What is the usage of Wildcard Route in Angular 8?
- In Angular 8, the `Wildcard Route` is used to set a route when the requested URL doesn't match any router paths. 
- After using the Wildcard Router, the set route matches to every URL as an instruction to get a clear client-generated view. 
- This Wildcard route always comes last as it needs to perform its task at the end only. 
- So, the Wildcard Router is mainly used to define the route of the pages in Angular 8.

# What are the most important parts of the Angular 8 Architecture?
The basic building blocks are NgModules that are used to provide compilation context for components and collect related code into functional sets.

Following is the list of most important parts of the Angular 8 architecture:
- Modules
- Components
- Templates
- MetaData
- Data-Binding
- Directives
- Services
- Dependency Injection

# What is the requirement and usage of Angular 8 components?
- The Angular 8 components are the list of classes with decorators that mainly mark their own types and provide metadata that guide Angular to do things.

- Every Angular application always has at least one component known as a `root component` that connects a page hierarchy with page DOM.
  - Each component defines a class that contains application data and logic and is associated with an HTML template that defines a view to be displayed in a target environment.

# What is the usage of @NgModule in Angular 8?
The `NgModules` in Angular 8 is used for the following things:
- The NgModule is a class marked by the @NgModule decorator where the @NgModule decorator is used to take a metadata object that describes how to compile a component's template and how to create an injector at runtime.
- The NgModules is used to configure the injector and the compiler and also help to organize the related things together.
- The NgModule is used to identify the module's own components, directives, and pipes. 
- It can also make some of them public, through the `exports` property, to facilitate external components to use them.

# What is the usage of Angular 8 ngFor Directive?

The Angular 8 ngFor directive is used to repeat a portion of the HTML template once per each item from an iterable list (Collection). 
- The ngFor is an Angular structural directive and is similar to ngRepeat in AngularJS. 
- Some local variables like Index, First, Last, odd, and even are exported by ngFor directive.

```javascript
<li *ngFor="let item of items;"> .... </li>   
```

# What is the usage of Angular 8 ngIf Directive?
The Angular 8 ngIf directive is a structural directive that is used to add or remove HTML elements according to the expression. 
- The expression must return a Boolean value true or false. 
- You can see the functioning of nglf directive clearly. 
- If the expression is false, then the element is removed. 
- Otherwise, the element is inserted. 
- It is similar to the ng-if directive of AngularJS.

```javascript
<p *ngIf="condition">    
    condition is true and ngIf is true.    
</p>    
<p *ngIf="!condition">    
    condition is false and ngIf is false.    
</p>
```

# What is data binding in Angular 8?

Data Binding is one of the key concepts of Angular 8.
- It is the most eminent technique which is used to link your data to the view layer.
- It is used to make a communication between the DOM and the TypeScript code of your component.
- In simple words, you can say that data binding is a communication between the typescript code of your component and your template, which the user sees. 
- It makes it easy to define interactive applications without worrying about pushing and pulling data.

There are two types of data binding i.e. one-way data binding, two-way data binding.

# What is String Interpolation in Angular 8, and why is it used?

String Interpolation is a one-way data-binding technique in Angular 8. 
- It is used to extract the output data from a TypeScript code to the HTML template view layer. 
- It shows the data from the component to view layer in the form of curly braces. 
- This interpolation technique adds the value of property to the component.

```javascript
{{data}}
```

# What is the Purpose of Event Binding in Angular 8?

Event binding is a technique in Angular 8 used to handle the events raised from the DOM like button click, mouse move etc. 
- When the DOM event happens (eg. click, change, keyup, keydown), it calls the specified method in the component.

```javascript
<button (click)="playMusic()"></button>
```

# What is the main purpose of Angular 8 forms?

The main purpose of Angular 8 forms is to handle the user's input. 
- You can also use these Angular forms in your application to enable users to log in, update profiles, enter information, or perform many other data-entry tasks.

There are two approaches to handle the user's input through forms in Angular 8:
- Reactive forms
- Template-driven forms

Both approaches are used to collect user input events from the view, validate the user input, create a form model and data model to update, and provide a way to track changes.

# How to create a component?

```javascript
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello-world',
  templateUrl: './hello-world.component.html'
})
export class HelloWorldComponent implements OnInit {

  constructor() { }
  ngOnInit(){
  }
}
```

# [How to add component in Angular app?](https://www.netjstech.com/2020/03/creating-new-component-in-angular.html)
- In the `app.module.ts`, add the import statement for the new component as well as add it in declarations array too with in `@NgModule` decorator.

# [Caching with HttpInterceptor in Angular](https://blog.logrocket.com/caching-with-httpinterceptor-in-angular/)

```javascript
@Injectable()
class CacheInterceptor implements HttpInterceptor {
  private cache: Map<HttpRequest, HttpResponse> = new Map()
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
    if(req.method !== "GET") {
        return next.handle(req)
    }
    const cachedResponse: HttpResponse = this.cache.get(req)
    if(cachedResponse) {
        return of(cachedResponse.clone())
    } else {
        return next.handle(req).pipe(
            do(stateEvent => {
                if(stateEvent instanceof HttpResponse) {
                    this.cache.set(req, stateEvent.clone())
                }
            })
        ).share()
    }
  }    
}
```

# [IndexedDB vs LocalStorage API](https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API)
- IndexedDB is a low-level API for client-side storage of significant amounts of structured data, including files/blobs. 
- This API uses indexes to enable high-performance searches of this data. 
- While Web Storage is useful for storing smaller amounts of data, it is less useful for storing larger amounts of structured data.

# [How to create a service? How to create a Shared service in angular8?](https://w3path.com/angular-8-services/)

Injectable module from the @angular/core and annotates the class with the @Injectable() decorator. 
- This marks the class as one that participates in the dependency injection system. 
- The `MyService` class is going to provide an injectable service, and it can also have its own injected dependencies.

```javascript

// Service creation
import { Injectable } from '@angular/core';
 
@Injectable({
  providedIn: 'root'
})
export class MyService {
 
  constructor() { }
}

// Service Injection in the Controller/Component
import { Component } from '@angular/core';
import { MyserviceService } from './myservice.service';
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  todaydate;
 
  constructor(private myservice: MyserviceService) {}
 
  ngOnInit() { // ngOnInit function gets called by default in any component created.
    this.todaydate = this.myservice.todayDate();
  }
}
```

# [RxJS - Reactive Extension of JS](https://www.educative.io/blog/rx-js-angular)

Reactive Extensions for JavaScript, or RxJS, is a JavaScript library that `uses observables for reactive programming`. 
- It can be used with other JavaScript libraries and frameworks, and it integrates well into Angular.

Core Features
- `Observable` - RxJS observables allow you to `publish events`. Observables have two methods: `subscribe` and `unsubscribe`. You execute an observable by subscribing to it. Observables model a stream of events.
- `Observer` - An observer is an object with `next()`, `error()`, and `complete()` methods that is called when there’s an interaction with the observable. They are the objects that subscribe to observables.
- `Subscription` - A subscription to the observable will trigger the observable to execute.
- `Operator` - An operator is a function that allows us to perform certain actions on events executed by observables.
- `Subject` - A subject is the same as an EventEmitter. It is an observable that multicasts information to observers.
- `Scheduler` - A scheduler handles the execution of subscriptions.

# What type of object is returned by httpClient?

Both `httpClient.get()` & `httpClient.post()` returns response as `Observable obj`.

```javascript
httpClient.get(url, options)
.subscribe( (data) => console.log(data) );
```

# References
- https://www.javatpoint.com/angular-8-interview-questions
- 

