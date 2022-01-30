# SpringWebCrudRest

#Description

The springWebCrudRest project is do the All the CRUD operations and also implement resttemplate
1) Adding logger
2) Adding profile activate configuration file
3) Adding health checkup of application(Acuator)
4) Adding spring-security Basic
--------------------------------------------------------------------------------------------------------------------------------------
Profile: Every enterprise application has many environments.

        like: Dev | Test | Stage | Prod | UAT / Pre-Prod
		
Each environment requires a setting that is specific to them. For example, in DEV, we do not need to constantly check database consistency. 
Whereas in TEST and STAGE, we need to. These environments host specific configurations called Profiles

This is simple — properties files
We make properties files for each environment and set the profile in the application accordingly, so it will pick the respective properties file		

---------------------------------------------------------------------------------------------------------------------------------------------------
Enabling Actuator:

To enable Spring Boot actuator endpoints to your Spring Boot application, 
we need to add the Spring Boot Starter actuator dependency in our build configuration file.
Maven users can add the below dependency in your pom.xml file.

<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>


Key Features Offered by an Actuator:

Health check: You can use a health endpoint to check the status of your running application.

Monitoring and Management over HTTP/JMX: Actuator support HTTP endpoint as well as Java Management Extensions (JMX) to provide a standard mechanism to monitor and manage applications.

Logger: It provides a feature to view and update the logs level.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Spring Boot JPA is a Java specification for managing relational data in Java applications. 
It allows us to access and persist data between Java object/ class and relational database. 
JPA follows Object-Relation Mapping (ORM). It is a set of interfaces. 
It also provides a runtime EntityManager API for processing queries and transactions on the objects against the database. It uses a platform-independent object-oriented query language JPQL (Java Persistent Query Language).

In the context of persistence, it covers three areas:

The Java Persistence API
Object-Relational metadata
The API itself, defined in the persistence package
JPA is not a framework. 
It defines a concept that can be implemented by any framework.


JPA Implementations
JPA is an open-source API. 
There is various enterprises vendor such as Eclipse, RedHat, Oracle, etc. 
that provides new products by adding the JPA in them. 
There are some popular JPA implementations frameworks such as Hibernate, EclipseLink, DataNucleus, etc. 
It is also known as Object-Relation Mapping (ORM) tool.



JPA Features
There are following features of JPA:

1) It is a powerful repository and custom object-mapping abstraction.
2) It dynamically generates queries from queries methods name.
3) Possibility to integrate custom repository code.
4) It is easy to integrate with Spring Framework with the custom namespace.



Difference between JPA and Hibernate

JPA: JPA is a Java specification that is used to access, manage, and persist data between Java object and relational database. 
It is a standard approach for ORM.

Hibernate: It is a lightweight, open-source ORM tool that is used to store Java objects in the relational database system. 
It is a provider of JPA. It follows a common approach provided by JPA.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
What is JDBC?
JDBC stands for Java Database Connectivity. It provides a set of Java API for accessing the relational databases from Java program. These Java APIs enables Java programs to execute SQL statements and interact with any SQL compliant database.

JDBC provides a flexible architecture to write a database independent application that can run on different platforms and interact with different DBMS without any modification.


Pros of JDBC:

1) Clean and simple SQL processing

2) Good performance with large data

3) Very good for small applications

4) Simple syntax so easy to learn

Cons of JDBC:

1) Complex if it is used in large projects

2) Large programming overhead

3) No encapsulation

4) Hard to implement MVC concept

5) Query is DBMS specific

=====================================================================================================================================================================================================================================
What is ORM?
ORM stands for Object-Relational Mapping (ORM) is a programming technique for converting data between relational databases and object oriented programming languages such as Java, C#, etc.

Advantages:

1	Let’s business code access objects rather than DB tables.
2	Hides details of SQL queries from OO logic.
3	Based on JDBC 'under the hood.'
4	No need to deal with the database implementation.
5	Entities based on business concepts rather than database structure.
6	Transaction management and automatic key generation.
7	Fast development of application.


Java ORM Frameworks
There are several persistent frameworks and ORM options in Java. A persistent framework is an ORM service that stores and retrieves objects into a relational database.

Enterprise JavaBeans Entity Beans
Java Data Objects
Castor
TopLink
Spring DAO
Hibernate
And many more
======================================================================================================================================================================================================
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

===================================================================================================================================================

Spring Vs Spring Boot


Spring Framework is a widely used Java EE framework for building applications.	
It aims to simplify Java EE development that makes developers more productive.	
The primary feature of the Spring Framework is dependency injection.	
It helps to make things simpler by allowing us to develop loosely coupled applications.	
The developer writes a lot of code (boilerplate code) to do the minimal task.	
To test the Spring project, we need to set up the sever explicitly.	
It does not provide support for an in-memory database.	
Developers manually define dependencies for the Spring project in pom.xml.	


Spring Boot Framework is widely used to develop REST APIs.
It aims to shorten the code length and provide the easiest way to develop Web Applications.
The primary feature of Spring Boot is Autoconfiguration. It automatically configures the classes based on the requirement.
It helps to create a stand-alone application with less configuration.
It reduces boilerplate code.
Spring Boot offers embedded server such as Jetty and Tomcat, etc.
It offers several plugins for working with an embedded and in-memory database such as H2.
Spring Boot comes with the concept of starter in pom.xml file that internally takes care of downloading the dependencies JARs based on Spring Boot Requirement.

=========================================================================================================================================================================