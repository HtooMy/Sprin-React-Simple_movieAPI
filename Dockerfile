FROM node:alpine
COPY . .
RUN mvn clean package -Pprod -DskipTests

FROM openjdk:17
COPY --from=build /target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]