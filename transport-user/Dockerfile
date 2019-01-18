FROM goodrainapps/maven:jdk8-alpine
MAINTAINER Yoob <yoothinkcan@gmail.com>

COPY *.jar /app/target/

ENV PORT=2300
CMD ["java", "-Xmx200m","-Dserver.port=${PORT}","-jar", "/app/target/transport-user-1.0.jar"]

EXPOSE 2300