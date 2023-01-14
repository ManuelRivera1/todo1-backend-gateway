FROM 376410516192.dkr.ecr.us-east-1.amazonaws.com/adoptopenjdk/openjdk11:latest
ADD target/gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java","-Djava.gateway.egd=file:/dev/./urandom","-jar","/gateway.jar"]
EXPOSE 8181