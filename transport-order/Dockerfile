FROM goodrainapps/maven:jdk8-alpine
MAINTAINER Yoob <yoothinkcan@gmail.com>

COPY *.jar /app/target/

ENV PORT=2100
CMD ["java", "-Xmx200m","-Dserver.port=${PORT}","-jar", "/app/target/transport-order-1.0.jar"]

EXPOSE 2100