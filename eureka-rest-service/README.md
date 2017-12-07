###Instructions for running

- mvn clean install; docker build -t eureka-rest-service .
- docker tag $IMAGE_ID $DOCKER_ID_USER/eureka-rest-service
- docker push $DOCKER_ID_USER/eureka-rest-service
- docker-compose -f docker/docker-compose.yml up