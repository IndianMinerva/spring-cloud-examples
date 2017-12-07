###Instructions for running

- mvn clean install dockerfile:build
- docker push $DOCKER_ID_USER/eureka-rest-service
- docker-compose -f docker/docker-compose.yml up