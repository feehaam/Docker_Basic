FROM openjdk:21
ARG BUILD_PATH=/build/libs/*
COPY ${BUILD_PATH} ./app.jar
CMD ["java","-jar","app.jar"]

# command 1: ./gradlew build
# command 2: docker build -t app-name .
# docker run -p 8080:8080 app-name