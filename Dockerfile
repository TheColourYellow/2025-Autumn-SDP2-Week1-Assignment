FROM maven:latest
LABEL authors="No Name"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD "java", "-jar", "target/GroceryCalc.jar"