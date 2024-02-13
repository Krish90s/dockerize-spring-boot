# Dockerfile

# Use a base image with OpenJDK 17
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/webapplication-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port the app runs on
EXPOSE 8080

# Define the command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]
