FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-k8s-demo*.jar /spring-boot-k8s-demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/spring-boot-k8s-demo-0.0.1.jar"]