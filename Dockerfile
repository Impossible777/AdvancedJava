FROM openjdk:11
COPY target/docker-java-jar-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]