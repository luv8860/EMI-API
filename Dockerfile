FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/Assignment-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT [ "java","-jar","application.jar" ]
CMD ["-start"]