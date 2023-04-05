FROM openjdk:17-oracle

COPY ./build/libs/<project>-<version>-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]