From openjdk:8
EXPOSE 8084
ADD target/restaurant-0.0.1-SNAPSHOT.war restaurant-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/restaurant-0.0.1-SNAPSHOT.war" ]