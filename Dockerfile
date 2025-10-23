FROM maven:latest
LABEL authors="No Name"

WORKDIR /app

COPY pom.xml /app
COPY . /app

# Build the project and create the JAR file
RUN mvn package

# Use exec form for CMD
CMD ["java", "-jar", "target/grocerycalc.jar"]
