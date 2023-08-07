# Spring Core Repository

This repository is created for educational purposes and aims to provide introductory materials about the Spring Core framework. It will contain information and examples on how to work with Spring Core, exploring concepts such as Dependency Injection (DI), Inversion of Control (IoC), beans, IoC containers, ApplicationContext, annotations, and managing bean lifecycle.

# Contents

1. Introduction to Spring Core
* What is Spring Core?
* Understanding Inversion of Control (IoC) and Dependency Injection (DI)
* The role of beans and how to manage them
* Overview of IoC containers and ApplicationContext
2. Dependency Injection (DI)
* Exploring different types of dependency injection in Spring
* Constructor injection
* Setter injection
* Field injection
* Using annotations for dependency injection
3. Inversion of Control (IoC) Container
* Understanding the concept of IoC container
* Working with BeanFactory and ApplicationContext
* Configuring Spring beans using XML and annotations
* Initializing and destroying beans using lifecycle callbacks
4. Annotations in Spring Core
* Using annotations for component scanning
* @Component, @Service, @Repository, and @Controller annotations
* @Autowired and @Qualifier annotations for dependency injection
* @Configuration and @Bean annotations for Java-based configuration
5. Managing Bean Lifecycle
* Understanding the lifecycle of Spring beans
* Implementing InitializingBean and DisposableBean interfaces
* Using @PostConstruct and @PreDestroy annotations
 
 # How to Use this Repository

This repository contains code examples, explanations, and practical exercises to help you understand Spring Core concepts better. Feel free to explore the different directories and read through the documentation.

To get started, it's recommended to follow these steps:*

Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/your-username/spring-core-repo.git
```

1. Ensure you have JDK 11 installed and properly configured on your development environment.
2. Verify the MySQL Connector version (8.0.33) compatibility with your MySQL database server.
3. Check the version of the Spring Context dependency and update it to the latest version if needed.
4. Run the Checkstyle :
```bash
mvn clean package
```

# Dependencies

The project has the following key dependencies:

* JUnit (version 3.8.1) for testing purposes.
* MySQL Connector (version 8.0.33) for database connectivity.
* Spring Context (version 6.0.9) for Spring Core functionality.


Navigate to the respective directories for each topic to access the source code and documentation.
Read through the README.md files in each directory for explanations and instructions on running the examples.
# Contribution

This repository is open to contributions from the community. If you find any issues or have suggestions for improvement, feel free to create a pull request.

Happy learning with Spring Core! 🌱💻



