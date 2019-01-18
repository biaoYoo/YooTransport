FROM goodrainapps/maven:jdk8-alpine
MAINTAINER Yoob <yoothinkcan@gmail.com>

COPY *.jar /app/target/

ENV PORT=80
CMD ["java", "-Xmx200m","-Dserver.port=${PORT}","-jar", "/app/target/geteway-1.0.jar"]

EXPOSE 80