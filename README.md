# SpringWebCrudRest

#Description

The springWebCrudRest project is do the All the CRUD operations and also implement resttemplate
1) Adding logger
2) Adding profile activate configuration file
3) Adding health checkup of application(Acuator)
4) Adding spring-security Basic
--------------------------------------------------------------------------------------------------------------------------------------
#Profile: Every enterprise application has many environments.

        like: Dev | Test | Stage | Prod | UAT / Pre-Prod
		
1) Each environment requires a setting that is specific to them. For example, in DEV, we do not need to constantly check database consistency. 
Whereas in TEST and STAGE, we need to. These environments host specific configurations called Profiles

2) This is simple — properties files
We make properties files for each environment and set the profile in the application accordingly, so it will pick the respective properties file		

---------------------------------------------------------------------------------------------------------------------------------------------------
#Enabling Actuator:

1) To enable Spring Boot actuator endpoints to your Spring Boot application, 
2) we need to add the Spring Boot Starter actuator dependency in our build configuration file.
3) Maven users can add the below dependency in your pom.xml file.

<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>


#Key Features Offered by an Actuator:

Health check: 
1) You can use a health endpoint to check the status of your running application.

2) Monitoring and Management over HTTP/JMX: Actuator support HTTP endpoint as well as Java Management Extensions (JMX) to provide a standard mechanism to monitor and manage applications.

#Logger: 
It provides a feature to view and update the logs level.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1) Spring Boot JPA is a Java specification for managing relational data in Java applications. 
2) It allows us to access and persist data between Java object/ class and relational database. 
3) JPA follows Object-Relation Mapping (ORM). It is a set of interfaces. 
4) It also provides a runtime EntityManager API for processing queries and transactions on the objects against the database. It uses a platform-independent object-oriented query language JPQL (Java Persistent Query Language).

#In the context of persistence, it covers three areas:

1) The Java Persistence API
2) Object-Relational metadata
3) The API itself, defined in the persistence package
4) JPA is not a framework. 
5) It defines a concept that can be implemented by any framework.


#JPA Implementations
1) JPA is an open-source API. 
2) There is various enterprises vendor such as Eclipse, RedHat, Oracle, etc. 
3) that provides new products by adding the JPA in them. 
4) There are some popular JPA implementations frameworks such as Hibernate, EclipseLink, DataNucleus, etc. 
5) It is also known as Object-Relation Mapping (ORM) tool.



#JPA Features
There are following features of JPA:

1) It is a powerful repository and custom object-mapping abstraction.
2) It dynamically generates queries from queries methods name.
3) Possibility to integrate custom repository code.
4) It is easy to integrate with Spring Framework with the custom namespace.



#Difference between JPA and Hibernate

#JPA: 
1) JPA is a Java specification that is used to access, manage, and persist data between Java object and relational database. 
2) It is a standard approach for ORM.

#Hibernate: 
1) It is a lightweight, open-source ORM tool that is used to store Java objects in the relational database system. 
2) It is a provider of JPA. It follows a common approach provided by JPA.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#What is JDBC?
1) JDBC stands for Java Database Connectivity. 
2) It provides a set of Java API for accessing the relational databases from Java program. 
3) These Java APIs enables Java programs to execute SQL statements and interact with any SQL compliant database.

JDBC provides a flexible architecture to write a database independent application that can run on different platforms and interact with different DBMS without any modification.


#Pros of JDBC:

1) Clean and simple SQL processing

2) Good performance with large data

3) Very good for small applications

4) Simple syntax so easy to learn

#Cons of JDBC:

1) Complex if it is used in large projects

2) Large programming overhead

3) No encapsulation

4) Hard to implement MVC concept

5) Query is DBMS specific

=====================================================================================================================================================================================================================================
What is ORM?
ORM stands for Object-Relational Mapping (ORM) is a programming technique for converting data between relational databases and object oriented programming languages such as Java, C#, etc.

#Advantages:

1) Let’s business code access objects rather than DB tables.
2) Hides details of SQL queries from OO logic.
3) Based on JDBC 'under the hood.'
4) No need to deal with the database implementation.
5) Entities based on business concepts rather than database structure.
6) Transaction management and automatic key generation.
7) Fast development of application.


#Java ORM Frameworks
There are several persistent frameworks and ORM options in Java. A persistent framework is an ORM service that stores and retrieves objects into a relational database.

1) Enterprise JavaBeans Entity Beans
2) Java Data Objects
3) Castor
4) TopLink
5) Spring DAO
6) Hibernate
7) And many more
======================================================================================================================================================================================================


===================================================================================================================================================

# Spring Vs Spring Boot


1) Spring Framework is a widely used Java EE framework for building applications.	
2) It aims to simplify Java EE development that makes developers more productive.	
3) The primary feature of the Spring Framework is dependency injection.	
4) It helps to make things simpler by allowing us to develop loosely coupled applications.	
5) The developer writes a lot of code (boilerplate code) to do the minimal task.	
6) To test the Spring project, we need to set up the sever explicitly.	
7) It does not provide support for an in-memory database.	
8) Developers manually define dependencies for the Spring project in pom.xml.	


1) Spring Boot Framework is widely used to develop REST APIs.
2) It aims to shorten the code length and provide the easiest way to develop Web Applications.
3) The primary feature of Spring Boot is Autoconfiguration. It automatically configures the classes based on the requirement.
4) It helps to create a stand-alone application with less configuration.
5) It reduces boilerplate code.
6) Spring Boot offers embedded server such as Jetty and Tomcat, etc.
7) It offers several plugins for working with an embedded and in-memory database such as H2.
8) Spring Boot comes with the concept of starter in pom.xml file that internally takes care of downloading the dependencies JARs based on Spring Boot Requirement.

=========================================================================================================================================================================

#Spring Boot
	
1) Spring Boot is a module of Spring for packaging the Spring-based application with sensible defaults.	
2) It provides default configurations to build Spring-powered framework.	
3) There is no need to build configuration manually.	
4) There is no requirement for a deployment descriptor.	
5) It avoids boilerplate code and wraps dependencies together in a single unit.	
6) It reduces development time and increases productivity.	

#Spring MVC

1) Spring MVC is a model view controller-based web framework under the Spring framework.
2) It provides ready to use features for building a web application.
3) It requires build configuration manually.
4) A Deployment descriptor is required.
5) It specifies each dependency separately.
6) It takes more time to achieve the same.

============================================================================================================================================================================
#Tech
java,spring-data-jpa,RestTemplate,junitTest

#database
Mysql

#Tools
sts,PostMan


#ProjectManageemnttool
Maven

#Version Control
Git

==============================================================================================================================================================