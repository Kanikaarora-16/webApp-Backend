# Web application


## Technology Stack
- SpringBoot 2.5.7
- Java 11
- Maven 3.5.2
- React JS 
- YARN / NPM for package Dependencies
- Junit 4
- Eclipse IDE


## Setup
# Backend
- git clone
- cd webApp-Backend-master
- mvn spring-boot:run
- open url http://localhost:8080/convert/number=123&name=abc
- It will display the name and number in Json format
- To run test: mvn clean test
- To import backend code in eclipse, import as an Existing maven project

# Frontend
- cd webApp-Frontend-master
- npm install
- npm start
- url http://localhost:3000/ will get opened
- Enter Name and Number. Click Submit

## Backend Architecture

├── webApplication
    ├── src/main/java
    │   ├── com.project.form
    │   │   ├── Application.java
    │   ├── com.project.form.controller
    │   │   ├── IndexController.java
    │   ├── com.project.form.service
    │   │   ├── WebApplication.java
    │   │   └── WebApplicationBean.java
    │   │   └── WebApplicationImpl.java
    │   └── com.project.form.util
    │   │   └── WebApplicationUtil.java
    │   │   └── WebApplicationUtilImpl.java
    └── src/test/java
       	├── com.project.form
        │   ├── ApplicationTest.java
        │   ├── HttpRequestTest.java
        │   └── SmokeTest.java
	   	└── com.project.form.service
      	  	└── WebApplicationImplTest.java
        	



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.7/maven-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-developing-web-applications)



