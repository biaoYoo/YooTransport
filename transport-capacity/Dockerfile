FROM goodrainapps/maven:jdk8-alpine
MAINTAINER Yoob <yoothinkcan@gmail.com>

# package
COPY *.jar /app/target/

ENV PORT=2200
CMD ["java", "-Xmx200m","-Dserver.port=${PORT}","-jar", "/app/target/transport-capacity-1.0.jar"]

EXPOSE 2200