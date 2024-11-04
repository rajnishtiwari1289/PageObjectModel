Page Object Model
==================================
Go to https://thinking-tester-contact-list.herokuapp.com/ and signup
create username as email and password and put to Global.properties file

**Folder Structure**

src-main-java 
- com.testinglab 
  - config 
     - GlobalHelper.java 
  - driver
     - Driver.java
     - DriverRule.java
     - DriverType.java
  - pageObjects
  - utils
 
src-main-resources
- Global.properties

src-test-java
  - com.testinglab
    - endtoend
      - ContactListTest.java
    - unit
      - LoginTest.java
 
   - resources
     - excelfile
