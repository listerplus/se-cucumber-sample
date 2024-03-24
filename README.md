# Selenium in Java using Cucumber
Selenium in Java with Cucumber for the page - http://horse.industryconnect.io/
I will be using IntelliJ

## Pre Requisites
Install the following needed applications
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows) - IDE
- [JDK (Java Development Kit)](https://www.oracle.com/au/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi) - Build system used for Java

  ### Setup Environment Variables for Java
  Set JAVA_HOME environment variable to point to the JDK installation directory.
  Set M2_HOME environment variable to the directory where Maven is installed.
  Add JDK's bin and Maven's bin directory to the system's PATH variable
  

## Getting Started
- Create a new project in IntelliJ: with Language set to Java, Build system to Maven
- Add Maven dependencies into pom.xml

  ### Dependencies
  From https://mvnrepository.com/

  | Title                                                                                     | groupId                                            | Notes |
  |-------------------------------------------------------------------------------------------|----------------------------------------------------|-------|
  | [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) | org.seleniumhq.selenium| 
  | [Cucumber JVM: Java](hhttps://mvnrepository.com/artifact/io.cucumber/cucumber-java)       | io.cucumber |
  | [TestNG](https://mvnrepository.com/artifact/org.testng/testng)                            | org.testng | for Assertions
  | [Cucumber JVM: JUnit 4](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)    | io.cucumber | for TestRunner

  ### Plugins
  Go to Settings > Plugins, and install the following:
  - Gherkin
  - Cucumber for Java


## References
- [Selenium Java Doc](https://www.selenium.dev/selenium/docs/api/java/index.html)
- [Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)
- [Cucumber Guide](https://cucumber.io/docs/guides/browser-automation/?lang=java)


## Contact
If you have any questions or need some help, please do contact me. 
See also [my blog](https://listerlabs.wordpress.com/)

