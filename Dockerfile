FROM openjdk:19-alpine
WORKDIR /usr/src/app
COPY . /usr/src/app/
EXPOSE 5001
RUN /usr/src/app/gradlew build
CMD ["java", "-jar", "/usr/src/app/build/libs/note-service-1.0.0.jar"]