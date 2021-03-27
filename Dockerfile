FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENV RABBIT_MQ_HOST=hellohost
ENV RABBIT_MQ_PORT=8000

EXPOSE 8888

ENTRYPOINT ["java","-jar","app.jar"]

