# OOAD Java Design Patterns

This repository contains examples of Object-Oriented Analysis and Design (OOAD) principles applied using popular Design Patterns in Java. The project includes examples commonly used in test automation frameworks and enterprise applications.

## Table of Contents
1. [Creational Design Patterns](#creational-design-patterns)
   - [Factory Pattern](#1-factory-pattern)
   - [Singleton Pattern](#2-singleton-pattern)
   - [Builder Pattern](#3-builder-pattern)
2. [Structural Design Patterns](#structural-design-patterns)
   - [Facade Pattern](#4-facade-pattern)
   - [Decorator Pattern](#5-decorator-pattern)
3. [Behavioral Design Patterns](#behavioral-design-patterns)
   - [Strategy Pattern](#6-strategy-pattern)
   - [Observer Pattern](#7-observer-pattern)
4. [General Interview Tips & Comparisons](#general-interview-tips--comparisons)

---

## Creational Design Patterns

### 1. Factory Pattern
**Theory (What it is):**
The Factory Pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It encapsulates the object creation logic away from the client code.

**Why use it:**
- Loose coupling: the client code doesn't need to know the specific concrete classes.
- Easier to extend: you can introduce new types of products without breaking existing client code (Open/Closed Principle).

**Where to use it:**
- Managing WebDriver instances (e.g., ChromeDriver, FirefoxDriver).
- Creating different subscription plans based on string inputs.

**Interview Insights:**
- **SOLID Core:** Strongly supports the Open/Closed Principle (OCP). You can introduce new product types without breaking existing client code.
- **Common Question:** "What's the difference between Simple Factory, Factory Method, and Abstract Factory?" (Answer: Simple Factory is just a class with a static method. Factory Method uses inheritance and relies on subclasses to create objects. Abstract Factory is a factory of factories, used to create families of related objects without specifying their concrete classes).
- **Pitfall:** Can lead to creating too many small product/creator classes, bloating the codebase (Class Explosion).

**Code Example:**
```java
NetflixPlanFactory netflixPlanFactory = new NetflixPlanFactory();

// Get the object of Basic Plan and call the getPrice method
NetflixPlan basicPlan = netflixPlanFactory.getPlan("BASIC");
System.out.println("Basic Plan: " + basicPlan.getFinalAmount(3));

// Get the object of Premium Plan
NetflixPlan premiumPlan = netflixPlanFactory.getPlan("PREMIUM");
System.out.println("Premium Plan: " + premiumPlan.getFinalAmount(3));
```

### 2. Singleton Pattern
**Theory (What it is):**
The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance. 

**Why use it:**
- Controlled access to a single instance.
- Prevents resource conflicts by ensuring that only one instance of the object is created and shared across the application.

**Where to use it:**
- Database connections or logging utilities.
- Storing global configuration properties in an automation framework.

**Interview Insights:**
- **SOLID Warning:** Singleton is often considered an "Anti-pattern" in modern systems because it violates the Single Responsibility Principle: the class solves its core purpose but *also* controls its own creation and lifecycle.
- **Common Question:** "How do you make a Singleton thread-safe?" (Answer: Utilize 'Double-Checked Locking' utilizing the `volatile` keyword, or use `enum` in Java which is thread-safe by default).
- **Common Question:** "How can you break a Singleton?" (Answer: Using Reflection, Object Serialization, Cloning, and Multi-threading without synchronization can bypass private constructors and break Singletons. Mitigation: Throw exceptions inside constructors if an instance already exists, implement `readResolve()`, override `clone()` to throw `CloneNotSupportedException`).

**Code Example:**
```java
Singleton singleton1 = Singleton.getInstance();
singleton1.sayHello(); // Output: Hi, I am in Singleton class

Singleton singleton2 = Singleton.getInstance();
// singleton1 and singleton2 refer to the exact same instance in memory.
```

### 3. Builder Pattern
**Theory (What it is):**
The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It provides a fluent, step-by-step approach to creating an object.

**Why use it:**
- Eliminates the need for multiple constructors (the "Telescoping Constructor Anti-pattern").
- Makes object creation readable and less error-prone when there are many optional parameters.

**Where to use it:**
- Creating complex test data objects with many optional fields.
- Building request payloads for API testing.

**Interview Insights:**
- **Problem Solved:** Overcomes the Telescoping Constructor issue (constructors with 1 parameter, 2 parameters, 3 parameters, etc., causing massive confusion over what each parameter means).
- **Common Question:** "Builder Pattern vs Factory Pattern?" (Answer: Factory pattern builds objects in a single step and returns immediately. Builder builds a complex object step-by-step and returns the final product only on the `.build()` call).
- **Bonus Point:** Mention Lombok's `@Builder` annotation taking away boilerplate builder code in modern Java applications.

**Code Example:**
```java
// We want to build an Igloo House
HouseBuilder iglooBuilder = new IglooHouseBuilder();

// Tell that to our Director i.e. Civil Engineer
CivilEngineer engineer = new CivilEngineer(iglooBuilder);

// Engineer starts constructing house
engineer.constructHouse();

// Fetches the constructed house
House house = engineer.getHouse();
System.out.println("Builder constructed: " + house);
```

---

## Structural Design Patterns

### 4. Facade Pattern
**Theory (What it is):**
The Facade Pattern provides a simplified, higher-level interface to a complex subsystem. It hides the complexity of building or interacting with multiple related classes.

**Why use it:**
- Simplifies client interactions by abstracting away the heavy lifting.
- Decouples client code from the complex subsystem.

**Where to use it:**
- E-commerce checkout process involving authentication, inventory check, payment, and shipping.
- Wrapping a complex, multi-step API process into a single method call for test automation.

**Interview Insights:**
- **SOLID Core:** Supports the Principle of Least Knowledge (Law of Demeter). The client doesn't need to know about the sub-systems inner workings.
- **Common Question:** "Facade vs Adapter Pattern?" (Answer: Facade simplifies a complex interface. Adapter makes two incompatible interfaces work together. Facade generally wraps multiple classes; Adapter typically wraps one).
- **Pitfall:** The Facade can become a "God Object" tightly coupled to all subsystem classes if not carefully designed.

**Code Example:**
```java
// In automation test, without facade, we would need to interact with inventory, payment, and shipping subsystems.
// With facade, the test is much simpler:

CheckoutFacade checkout = new CheckoutFacade();
checkout.completeOrder("MAC-BOOK-PRO", "123 Tech Lane", "Credit Card", 1999.99);
```

### 5. Decorator Pattern
**Theory (What it is):**
The Decorator Pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

**Why use it:**
- Provides a flexible alternative to subclassing for extending functionality.
- You can mix and match behaviors by wrapping objects in multiple decorators.

**Where to use it:**
- Adding dynamic logging, screenshotting, or explicit waits to standard WebDriver Elements (`WebElement`).
- Modifying reporting output or network requests on the fly.

**Interview Insights:**
- **SOLID Core:** Heavily emphasizes the Single Responsibility Principle and Open/Closed Principle. Instead of having a class trying to do multiple variations of work, smaller decorator classes focus on wrapping and adding a single specific behavior without modifying base classes.
- **Common Question:** "Decorator vs Inheritance?" (Answer: Inheritance is static and applies to the entire class. Decorator allows adding behavior dynamically at runtime to single objects).
- **Java Internal use:** Java IO classes (`BufferedReader`, `FileReader`) are classic examples of the Decorator pattern.

**Code Example:**
```java
// A normal web element interaction
WebElement rawButton = new DefaultWebElement("//button[@id='submit']");
rawButton.click();

// Adding logging dynamically without changing the base element implementation
// The base element is 'wrapped' effectively by the Decorator
WebElement loggedButton = new LoggedElementDecorator(new DefaultWebElement("//button[@id='submit']"));
loggedButton.click(); // Now automatically logs info before clicking
```

---

## Behavioral Design Patterns

### 6. Strategy Pattern
**Theory (What it is):**
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime. It lets the algorithm vary independently of clients that use it.

**Why use it:**
- Eliminates large conditional statements (`if/else` or `switch`).
- Makes the code easily extensible—just create a new strategy class to add a new algorithm.

**Where to use it:**
- Using different login mechanisms in tests (e.g., API login for speed vs. UI login for E2E validation).
- Supporting various payment processing strategies (Credit Card, PayPal, Crypto).

**Interview Insights:**
- **SOLID Core:** Very representative of Open/Closed Principle (adding new strategies without modifying existing context) and Dependency Inversion Principle (depending on interfaces, not implementations).
- **Common Question:** "Difference between Strategy and State Pattern?" (Answer: Both are identical structurally. Strategy is a client-driven behavior selection (choosing how to do something). State implies a class transitions internally between predefined states automatically).
- **Trade-off:** Client must be aware of different strategies to pass the appropriate one to the context. 

**Code Example:**
```java
// Run test with UI Login (e.g. End-to-End smoke test)
LoginContext context = new LoginContext(new UILoginStrategy());
context.executeLogin("testuser", "securepass");

// Change strategy dynamically to API Login (e.g. fast setup)
context.setLoginStrategy(new APILoginStrategy());
context.executeLogin("testuser", "securepass");
```

### 7. Observer Pattern
**Theory (What it is):**
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Why use it:**
- Promotes loose coupling between the subject (the observable) and its observers.
- Easy to add new subscribers without changing the existing publisher code.

**Where to use it:**
- Test execution listeners (e.g., notifying logging and reporting systems like ExtentReports when a test passes or fails).
- Event-driven UI updates, message brokers (Kafka/RabbitMQ basics).

**Interview Insights:**
- **Common Pitfalls:** Memory leaks (the "Lapsed Listener Problem") if subjects are long-lived and observers forget to explicitly unregister, preventing Garbage Collection.
- **Common Question:** "Observer vs Pub-Sub Pattern?" (Answer: Observer pattern is mostly synchronous and observers are directly aware of the subject. Publish-Subscribe implies a message broker/event bus in between, decoupling publishers and subscribers completely, often asynchronous).
- **Push vs Pull:** Understand whether the subject "pushes" all data to the observer upon change, or "pulls" an update flag, requiring observers to reach back calling `getState()`.

**Code Example:**
```java
TestRunnerSubject runner = new TestRunnerSubject();

// Register listeners dynamically
runner.addListener(new ConsoleLoggerListener());
runner.addListener(new ExtentReportListener());

// When a test runs, all registered observers are automatically notified
runner.runTest("LoginWithValidCredentials", true);
runner.runTest("CheckoutWithInvalidCard", false);
```

---

## General Interview Tips & Comparisons

When preparing for OOAD & Design Pattern rounds, keep these larger concepts in mind:

1. **"Favor Object Composition over Class Inheritance"**
   - This is the cornerstone of patterns like **Strategy** and **Decorator**. Inheritance creates rigid code that is hard to maintain; composing behavior at runtime via interfaces creates flexibility.
   
2. **SOLID Principles mapping to Patterns**
   - **S**ingle Responsibility (Strategy, Decorator)
   - **O**pen/Closed (Strategy, Factory, Decorator)
   - **L**iskov Substitution (All patterns enforcing safe Subclassing without breaking)
   - **I**nterface Segregation (Facade often enforces narrower APIs)
   - **D**ependency Inversion (Factory, Strategy)

3. **Behavioral vs Structural vs Creational**
   - **Creational** deals with *Who* and *How* objects are made (Singleton, Builder, Factory).
   - **Structural** deals with *How* objects and classes are composed into larger structures (Facade, Decorator).
   - **Behavioral** deals with *What* logic objects execute and how they communicate with each other (Strategy, Observer).

4. **Always discuss Trade-offs**
   - No pattern is perfect. Using a pattern inherently adds complexity (more classes, more interfaces). A common interview red flag is forcing a design pattern onto a simple problem where a standard class/loop would suffice. 
