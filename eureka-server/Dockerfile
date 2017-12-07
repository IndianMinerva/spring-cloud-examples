FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/eureka-server
ADD target/eureka-server-0.0.1-SNAPSHOT.jar /usr/local/eureka-server
EXPOSE 8761
CMD java -jar /usr/local/eureka-server/eureka-server-0.0.1-SNAPSHOT.jar