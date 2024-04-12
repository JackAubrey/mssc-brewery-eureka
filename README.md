# SFG Brewery Eureka Service

Source code in this repository is to support my online courses.

Learn more about my courses below!
* [Spring Boot Microservices with Spring Cloud](https://www.udemy.com/spring-boot-microservices-with-spring-cloud-beginner-to-guru/?couponCode=GIT_HUB2)


## Commands used to push to DockerHub and manage the version:
* mvn clean package -DskipTests docker:build docker:push
* mvn release:prepare
* mvn release:perform
* git checkout tags/mssc-beer-inventory-failover-service-0.0.3
* mvn clean package -DskipTests docker:build docker:push
