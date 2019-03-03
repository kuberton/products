FROM openjdk:8-jdk-alpine as builder
RUN apk add --no-cache maven
WORKDIR /app
COPY . .
RUN mvn clean package 


FROM openjdk:8-jdk-alpine as release
WORKDIR /app
COPY --from=builder /app/target/products-1.0-SNAPSHOT.jar /app/
EXPOSE 8080
CMD java -jar /app/products-1.0-SNAPSHOT.jar