FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/eureka-rest-service
ADD target/eureka-rest-service-0.0.1-SNAPSHOT.jar /usr/local/eureka-rest-service
CMD java -jar /usr/local/eureka-rest-service/eureka-rest-service-0.0.1-SNAPSHOT.jar
