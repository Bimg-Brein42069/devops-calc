FROM openjdk:11
COPY ./target/CalcUlator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","CalcUlator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]