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