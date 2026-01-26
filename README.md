# Application Cases of Design Patterns in SpringBoot

Design patterns are summaries of experience in solving specific problems in software development.

In the SpringBoot framework, design patterns are cleverly integrated into various aspects, not only improving the framework’s flexibility and extensibility but also providing elegant solutions for developers.


## 1. Singleton Pattern

### Pattern Overview
The Singleton Pattern ensures that a class has only one instance and provides a global access point to it.

### SpringBoot Application
Beans in SpringBoot are singletons by default. They are created and managed by the Spring container, ensuring global uniqueness.

#### Implementation Example
[UserService.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/singleton/UserService.java)
[UserController.java](src/main/java/br/com/xmacedo/casesofdesignpatternsinspringboot/singleton/UserController.java)