# springboot-kafka

Download kafka here 
https://www.apache.org/dyn/closer.cgi?path=/kafka/2.1.0/kafka_2.11-2.1.0.tgz

Run zookeeper
```
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Run kafka
```
bin/kafka-server-start.sh config/server.properties
```

Run the project
```
mvn spring-boot:run
```