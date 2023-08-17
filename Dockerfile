From openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/poc-0.0.1-SNAPSHOT.jar mapped-name.jar
ENTRYPOINT ["java","-jar","/mapped-name.jar"]