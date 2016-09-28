FROM centos

RUN yum -y install java-1.7.0-openjdk-devel.x86_64

ADD ../target/SpringBootWithMongo-1.0.1.war /

ENV spring_data_mongodb_host=192.168.47.130

CMD ["java", "-jar", "SpringBootWithMongo-1.0.1.war"]

EXPOSE 8063
