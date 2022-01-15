# Base Alpine Linux based image with OpenJDK JRE only
FROM openjdk:8-jre-alpine
# copy application WAR (with libraries inside)
COPY target/PatikaDockerizeTutorial-*.jar /app.jar
# specify default command
CMD ["/usr/bin/java", "-jar", "/app.jar"]


#FROM maven:3.8.4-jdk-11
##FROM maven:3.8.4
#COPY . /usr/src/myapp
#WORKDIR /usr/src/myapp
#CMD ["echo", "!TEST KOŞUMLARI BAŞLAMASI ICIN LÜTFEN mvn verify test KOMUTLARINI YAZINIZ!"]
#RUN mvn clean test -DskipTests=true | awk '/Tests/{print}'
