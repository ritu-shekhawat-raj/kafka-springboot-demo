# kafka-springboot-demo

commands used to run this application:

start Zookeeper to Manage Your Kafka Cluster:
 bin/zookeeper-server-start.sh config/zookeeper.properties

run a Kafka Broker:
 bin/kafka-server-start.sh config/server.properties

create a Kafka Topic:
 bin/kafka-topics.sh --create --topic myTopic -zookeeper \localhost:2181 --replication-factor 1 --partitions 1

kafka console:
 /kafka/bin$ ./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic myTopic
