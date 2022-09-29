# Test Automation Course | java-docker
Sample repository based on Java and Docker

[![Run Java Tests](https://github.com/BurhanH/TestAutomationCourse-java-docker/actions/workflows/run-tests.yml/badge.svg)](https://github.com/BurhanH/TestAutomationCourse-java-docker/actions/workflows/run-tests.yml)

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

## Copyrights
[snysmymric](https://github.com/snysmymric) and [ViktorPodgornov](https://github.com/ViktorPodgornov) shared the [codebase](/src) for this repository.
