# NHS selenium Testing Exercise / Instructions

#### Codes and Tests Prepared by:
**Mardan Abla**

*QA Test Automation Engineer *

mardan.mrn@gmail.com

**- Build Tool:** Maven

**- Test Framework:** Cucumber BBD (with Junit 4 Assertions)



#### System Requirements: 
- Java 8+ SDK

------------
## Test RUN 

Notes: To run all Scenarios, use `@test` tag in the CukesRunner class/Cucumber Options
#### 1. Way:
 - Clone the projects
 - Import maven dependencies from POM
 - Go **src -> test > java > com >  nhs > runners > CukesRunner** and RUN
 - To generate "HTML Maven Cucumber Report" ; 
    > Open Maven right side panel
    > Double Click Project's Lifecycle
    > Click "verify"
                                                  
#### 2. Way:
 - Run from command line invoke `mvn clean verify` 
 - You can change any of browser from configuration properties 

------------

## Test Reports Locations
1- Cucumber HTML Plugin Reports
**target -> cucumber-html-reports > overview-steps.html** 
(Right Click and Open in any Browser )

2- When you run my project, Cucumber will create automatically online report link. You can click the link
with in the 24 hours and check the all test steps and status. 



-----------------------------

2020 October;
https://github.com/Mardan528

### End

------------




