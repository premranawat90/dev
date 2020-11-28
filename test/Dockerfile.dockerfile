# For Java 8, try this
# FROM openjdk:8-jdk-alpine
 

# Refer to Maven build -> finalName Name
ARG JAR_FILE=target/SpringbootH2Database.jar 

# cd /opt/app
WORKDIR /opt/app

# cp target/SpringbootH2Database.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]