FROM maven:3.8.5-jdk-11-slim

WORKDIR /app

COPY ./src /app/src

COPY pom.xml /app

RUN ["mvn", "install", "-DskipTests"]

ENTRYPOINT ["mvn"]

CMD ["test"]
