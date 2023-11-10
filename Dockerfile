
# Use the official OpenJDK image as the base image for the runtime
FROM openjdk:17

EXPOSE 8080


# Copy the JAR file from the build stage to the runtime image
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]