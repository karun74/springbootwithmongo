FROM centos

RUN yum -y install java-1.7.0-openjdk-devel.x86_64

ADD SpringBootWithMongo-1.0.1.war /

ENV spring_data_mongodb_host=127.0.0.1

CMD ["java", "-jar", "SpringBootWithMongo-1.0.1.war"]

EXPOSE 8063
