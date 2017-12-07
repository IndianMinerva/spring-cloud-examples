###Instructions for running

- mvn clean install; docker build -t eureka-server .
- docker tag $IMAGE_ID $DOCKER_ID_USER/eureka-server
- docker push $DOCKER_ID_USER/eureka-rest-service
- docker-compose -f docker/docker-compose.yml up