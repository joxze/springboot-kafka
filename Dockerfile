FROM docker.doku.com/doku-jdk11-centos7

USER root
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-kafka.jar
ENTRYPOINT ["java","-jar","/springboot-kafka.jar"]
