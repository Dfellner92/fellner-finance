# Use an official JDK image to build and run the app
FROM openjdk:21-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/fellner-finance-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 to the host
EXPOSE 8080


# Security improvement
RUN useradd -m appuser
USER appuser

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
