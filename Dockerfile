# ---- Build Stage ----
    FROM maven:3.9.6-eclipse-temurin-21 AS builder
    WORKDIR /app
    
    # Copy pom.xml and download dependencies first (caching)
    COPY pom.xml .
    RUN mvn dependency:go-offline
    
    # Copy all source code
    COPY src ./src
    
    # Build the application (skipping tests for speed)
    RUN mvn clean package -DskipTests
    
    # ---- Runtime Stage ----
    FROM eclipse-temurin:21-jdk-jammy
    WORKDIR /app
    
    # Add a non-root user
    RUN useradd -m appuser
    USER appuser
    
    # Copy the built jar from the builder stage
    COPY --from=builder /app/target/*.jar app.jar
    
    EXPOSE 8080
    ENTRYPOINT ["java", "-jar", "app.jar"]