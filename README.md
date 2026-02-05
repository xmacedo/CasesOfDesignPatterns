# Application Cases of Design Patterns in SpringBoot

Design patterns are summaries of experience in solving specific problems in software development.

In the SpringBoot framework, design patterns are cleverly integrated into various aspects, not only improving the framework’s flexibility and extensibility but also providing elegant solutions for developers.


## 1. Singleton Pattern

### Pattern Overview
The Singleton Pattern ensures that a class has only one instance and provides a global access point to it.

### SpringBoot Application
Beans in SpringBoot are singletons by default. They are created and managed by the Spring container, ensuring global uniqueness.

### Implementation Example
- [UserService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/singleton/UserService.java)
- [UserController.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/singleton/UserController.java)

### Application Advantages
1. Reduces memory footprint, avoids repetitive object creation
2. Facilitates management of shared resources
3. Simplifies object tracking and referencing

## 2. Factory Method Pattern

### Pattern Overview
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.

### SpringBoot Application
SpringBoot’s BeanFactory is a typical application of the Factory Method Pattern, responsible for creating and managing Bean instances.

### Implementation Example

- Payment processor interface [PaymentProcessor.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factoryMethod/PaymentProcessor.java)
- Concrete implementation - Credit Card Payment [CreditCardProcessor.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factoryMethod/CreditCardProcessor.java)
- Concrete implementation - PayPal Payment [PayPalProcessor.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factoryMethod/PayPalProcessor.java)
- Payment processor factory [PaymentProcessorFactory.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factoryMethod/PaymentProcessorFactory.java)
- Using the factory [OrderService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factoryMethod/OrderService.java)

### Application Advantages
1. Loose coupling, separates the client from concrete implementations
2. Adheres to the Open-Closed Principle, easy to add new payment methods
3. Encapsulates object creation logic for unified management


## 3. Abstract Factory Pattern

### Pattern Overview
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### SpringBoot Application
SpringBoot's multi-environment configuration and data source creation are applications of the Abstract Factory Pattern.

### Implementation Example
- Abstract product - [Connection.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/Connection.java)
- Abstract product - [Transaction.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/Transaction.java)
- Abstract factory [DatabaseFactory.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/DatabaseFactory.java)
- Concrete factory - MySQL [MySQLDatabaseFactory.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/MySQLDatabaseFactory.java)
- Concrete product implementation - [MySQLConnection.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/MySQLConnection.java)
- Concrete product implementation - [MySQLTransaction.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/MySQLTransaction.java)
- Concrete factory - PostgreSQL [PostgreSQLDatabaseFactory.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/PostgresSQLDatabaseFactory.java)
- Concrete product implementation - [PostgreSQLConnection.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/PostgresSQLConnection.java)
- Concrete product implementation - [PostgreSQLTransaction.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/PostgresSQLTransaction.java)
- Using the abstract factory [QueryService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/abstractFactory/QueryService.java)

### Application Advantages
1. Provides a family of related objects, not just a single one
2. Ensures that the created products are compatible with each other
3. Facilitates switching environments (e.g., dev, test, prod)

## 4. Builder Pattern

### Pattern Overview
The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### SpringBoot Application
The Builder Pattern is used extensively in SpringBoot’s configuration classes and fluent (chainable) API designs.

### Implementation Example
- Product Class - [EmailMessage.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/builder/EmailMessage.java)
- Service using the builder pattern [EmailService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/builder/EmailService.java)


### Application Advantages
1. Strong control over parameters, allowing for step-by-step object construction
2. Good readability, similar to a natural language description
3. Supports multiple configuration combinations without needing a large number of overloaded constructors

## 5. Prototype Pattern

### Pattern Overview
The Prototype Pattern creates new objects by copying an existing object (a prototype) rather than creating a new instance, often used for objects that are expensive to create.

### SpringBoot Application
The prototype bean scope in SpringBoot is an application of the Prototype Pattern, where a new instance is created every time it is requested.

