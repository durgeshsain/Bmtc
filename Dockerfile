# to download jdk image.
FROM openjdk:8
# Copy the jar file from local to docker image
ADD target/bmtc-booking-0.0.1-SNAPSHOT.jar booking-0.0.1-SNAPSHOT.jar
# Expose port
EXPOSE 8081
# Tell how to run the copied jar file
ENTRYPOINT ["java", "-jar", "booking-0.0.1-SNAPSHOT.jar"]

# To build the docker image
# docker build -f Dockerfile -t booking-docker .

# To run the docker image:
# See the docker images: docker images
# See the docker processes: docker ps
# kill the docker processes: docker kill <container-id>
# delete process: docker rm <container-id>
# delete docker image: docker rmi <name>
# then run: docker run -p 8080:8088 booking-docker
# [here 8080 is docker port which is exposed and 8088 is the application port. This is how port mapping is done]
#Create a network (bridge) to interact between two docker containers
#docker network create bmtc_net

#Download mysql image and create container with dbname, user and passwd
#docker container run --name mysqldb --network bmtc_net -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=bmtc-db -d mysql:8

#To see a container logs
#docker container logs <container_name>

#To execute the container in bash
#docker exec -it mysqldb bash
#mysql -uroot -proot

#To check all the running networks
#docker network ls

#docker build  -f Dockerfile -t bmtc-app .

#docker container run --network bmtc_net -p 8081:8088 -d bmtc-app

#docker ontainer logs bmtc-app
