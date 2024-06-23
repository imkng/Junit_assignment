# Project Name

## Overview

This project is a Java-based application developed using IntelliJ IDEA as the integrated development environment (IDE). The project uses JUnit 5 for testing purposes.

## Prerequisites

To work on this project, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- IntelliJ IDEA
- Maven or Gradle (if your project uses one of these build tools)

## Getting Started

### Cloning the Repository

1. Clone the repository to your local machine using the following command:

   ```bash
   git clone git@github.com:imkng/Junit_assignment.git

### Open the project in IntelliJ IDEA:

Open IntelliJ IDEA.
Click on File > Open....
Navigate to the cloned repository and select it.
Setting Up the Project
Ensure JDK is configured:

Go to File > Project Structure.
Under Project Settings, select Project.
Ensure the Project SDK is set to JDK 11 or higher. If not, click New... and set up the JDK.
Add JUnit 5 dependency:

Depending on your build tool, add the following dependency to your project.

For Maven:

Open the pom.xml file.

Add the following dependency within the <dependencies> section:

xml
Copy code
<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.10.2</version>
			<scope>test</scope>
		</dependency>

Reload the project:

If you are using Maven, right-click on the pom.xml file and select Reload.
If you are using Gradle, right-click on the build.gradle file and select Refresh Gradle Project.
Running the Application
To run the application:

Locate the main class of your project. This is typically the class containing the public static void main(String[] args) method.
Right-click on the main class file.
Select Run 'YourMainClass'.
Running Tests
To run the tests using JUnit 5:

Ensure you have written test classes in the src/test/java directory.
Right-click on the test class or method you want to run.
Select Run 'YourTestClass' or Run 'YourTestMethod'.
Alternatively, you can run all tests in the project:

Open the Run menu.
Select Edit Configurations....
Click the + icon to add a new configuration and select JUnit.
Name your configuration, set the Test kind to All in package, and specify the package.
Click OK and run the configuration.
