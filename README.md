# Application Cases of Design Patterns in SpringBoot

Design patterns are summaries of experience in solving specific problems in software development.

In the SpringBoot framework, design patterns are cleverly integrated into various aspects, not only improving the framework’s flexibility and extensibility but also providing elegant solutions for developers.


## 1. Singleton Pattern

### Pattern Overview
The Singleton Pattern ensures that a class has only one instance and provides a global access point to it.

### SpringBoot Application
Beans in SpringBoot are singletons by default. They are created and managed by the Spring container, ensuring global uniqueness.

#### Implementation Example
- [UserService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/singleton/UserService.java)
- [UserController.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/singleton/UserController.java)

#### Application Advantages
1. Reduces memory footprint, avoids repetitive object creation
2. Facilitates management of shared resources
3. Simplifies object tracking and referencing

## 2. Factory Method Pattern

### Pattern Overview
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.

### SpringBoot Application
SpringBoot’s BeanFactory is a typical application of the Factory Method Pattern, responsible for creating and managing Bean instances.

#### Implementation Example

- Payment processor interface [PaymentProcessor.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factory/PaymentProcessor.java)
- Concrete implementation - Credit Card Payment [CreditCardProcessor.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factory/CreditCardProcessor.java)
- Concrete implementation - PayPal Payment [PayPalProcessor.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factory/PayPalProcessor.java)
- Payment processor factory [PaymentProcessorFactory.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factory/PaymentProcessorFactory.java)
- Using the factory [OrderService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/factory/OrderService.java)

#### Application Advantages
1. Loose coupling, separates the client from concrete implementations
2. Adheres to the Open-Closed Principle, easy to add new payment methods
3. Encapsulates object creation logic for unified management