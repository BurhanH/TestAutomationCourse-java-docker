# Test Automation Course | java-docker
Sample repository based on Java and Docker

## How to run tests
- mvn clean test
- mvn clean test -Dtest=SomeTasksTests

## How to build image
- docker build -t java-docker .

## How to run tests in Docker container
- docker run java-docker
- docker run java-docker test -Dtest=SomeTasksTests

## How to run tests in Docker container (use public image)
- docker run burazalinov/java-docker
- docker run burazalinov/java-docker test -Dtest=SomeTasksTests
