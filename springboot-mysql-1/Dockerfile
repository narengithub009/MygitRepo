FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-mysql-docker.jar spring-boot-mysql-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-mysql-docker.jar"]