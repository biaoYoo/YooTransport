FROM frolvlad/alpine-oraclejdk8:slim

RUN mvn clean package

ADD ./target/config-1.0.jar config.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-1.0.jar"]

EXPOSE 8761
