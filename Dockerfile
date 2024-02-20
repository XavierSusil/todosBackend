FROM openjdk:20
WORKDIR /app
COPY ./target/todosBackend-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "todosBackend-0.0.1-SNAPSHOT.jar"]