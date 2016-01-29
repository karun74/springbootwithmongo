FROM centos

RUN yum -y install java-1.7.0-openjdk-devel.x86_64

ADD SpringBootWithMongo-0.0.1-SNAPSHOT.war /

ENV spring_data_mongodb_host=127.0.0.1

CMD ["java", "-war", "SpringBootWithMongo-0.0.1-SNAPSHOT.war"]

EXPOSE 8063