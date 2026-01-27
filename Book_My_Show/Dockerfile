# Use lightweight Java 17 runtime
FROM eclipse-temurin:17-jre-alpine

# Set working directory inside container
WORKDIR /app

# Copy the built JAR into container
COPY target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
