FROM alpine-jdk:base
MAINTAINER javaonfly
COPY target/springbootdemo-0.0.2-SNAPSHOT.jar /opt/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/springbootdemo-0.0.2-SNAPSHOT.jar"]
EXPOSE 9091