FROM amazoncorretto:25.0.3-al2023-headless
MAINTAINER chernyshoff.ru
COPY build/libs/coroutines-concept-io-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]