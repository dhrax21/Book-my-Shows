FROM openjdk:11
EXPOSE 8081
ADD target/bookmyshow-0.0.1-SNAPSHOT.jar bookmyshow-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/bookmyshow-0.0.1-SNAPSHOT.jar"]
CMD java -jar bookmyshow-0.0.1-SNAPSHOT.jar
