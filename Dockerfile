FROM openjdk:11

USER root
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-kafka.jar
ENTRYPOINT ["java","-jar","/springboot-kafka.jar"]
