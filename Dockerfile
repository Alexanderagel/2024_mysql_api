#starta f¨rn en base image som innehåller jdk 8

FROM openjdk:21-jdk


#sätt arbetsmappen (där vi jobbar) till /app
WORKDIR /app


# Kopiera maven wrapper till där vvi är (.)

COPY mvnw .
COPY .mvn .mvn

# Kopiera pom filen och källkoden
COPY pom.xml .
COPY src src

# Bygg applikationen
RUN ./mvnw package -DskipTests

# Kör applikationen
CMD ["java", "-jar", "target/2024_mysql_api-0.0.1-SNAPSHOT.jar"]