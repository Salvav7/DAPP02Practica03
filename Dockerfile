FROM tomcat:9.0.87-jre11-temurin-jammy
ADD target/DAAPP02Practica03-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]


