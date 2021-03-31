FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine

# copy the packaged jar file into our docker image
COPY target/backend-0.0.1-SNAPSHOT.jar /dg-app.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/dg-app.jar"]