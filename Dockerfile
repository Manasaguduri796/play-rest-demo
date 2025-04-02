FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/universal/restdemo-1.0-SNAPSHOT.zip /app/restdemo-1.0-SNAPSHOT.zip

RUN apt-get update && apt-get install unzip -y

RUN unzip restdemo-1.0-SNAPSHOT.zip && rm restdemo-1.0-SNAPSHOT.zip

RUN chmod +x /app/restdemo-1.0-SNAPSHOT/bin/restdemo

EXPOSE 9000

WORKDIR /app/restdemo-1.0-SNAPSHOT

ENTRYPOINT ["bin/restdemo","-Dplay.http.secret.key=nDSADzuR0zQ5ltIVODapSXokCcRf/df1Ue3ySscH7YM"]
