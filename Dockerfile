FROM openjdk:11

ENV SERVICE_FILE ms-benchmark-demo-1.0.jar
ENV SERVICE_HOME /usr/ms-benchmark-demo

EXPOSE 8810

COPY target/$SERVICE_FILE $SERVICE_HOME/

WORKDIR $SERVICE_HOME

ENTRYPOINT ["sh", "-c", "java -jar $SERVICE_FILE"]
