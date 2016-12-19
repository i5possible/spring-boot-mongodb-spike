FROM openjdk:8u111-jre
MAINTAINER Hong Liang mongodb-spike <lianghongbuaa@gmail.com>
RUN adduser mongodb-spike
RUN mkdir /app
WORKDIR /app

ADD ./build/libs/my-mongodb-spike.jar /app/lib/

RUN chown -R mongodb-spike /app
USER mongodb-spike
EXPOSE 8080

CMD ["java","-jar","/app/lib/my-mongodb-spike.jar"]

