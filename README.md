# Apache Kafka code challenge

## Note
This code challenge uses the following stack:
* Spring boot
* H2 Database
* Apache Kafka 2.7.0

### Instructions for project execution

* After downloading Apache Kafka from 
` https://www.apache.org/dyn/closer.cgi?path=/kafka/2.7.0/kafka_2.13-2.7.0.tgz ` do the following steps:

` 1. Go to the Download path (kafka zip location) with a terminal `

* Execute the following commands:

` 2. tar -xzf kafka_2.13-2.7.0.tgz ` 

` 3. cd kafka_2.13-2.7.0 `

` # Start the ZooKeeper service ` 
    
` 4. bin/zookeeper-server-start.sh config/zookeeper.properties `

* Open another terminal and execute the following:

` # Start the Kafka broker service `

` 5. bin/kafka-server-start.sh config/server.properties `

* Now, create the topic ` novice-players ` as follows:

` 6. bin/kafka-topics.sh --create --topic novice-players --bootstrap-server localhost:9092 `

#

* In terms of the spring boot project, execute the following:

`1. mvn clean package `

* To execute the project:

`2. mvn spring-boot:run `  

* After that, with postman or curl execute POST requests to the following API:

novice-players http://localhost:8383/api/v1/players `

The request body is as follows:
```json
{
  "players": [
    {
      "name": "Sub zero",
      "type": "expert"
    },
    {
      "name": "Scorpion",
      "type": "novice"
    },
    {
      "name": "Reptile",
      "type": "meh"
    }
  ]
}
```

* The expected response is gonna be as follows:

```json
{
  "result": [
    "player Sub zero stored in DB",
    "player Scorpion sent to Kafka topic",
    "player Reptile did not fit"
  ]
}
```


* Finally, depending on that request (if exists novice players), to see the messages
that were pushed to the ` novice-players topic`, execute the following command in 
another terminal:

` bin/kafka-console-consumer.sh --topic novice-players --from-beginning --bootstrap-server localhost:9092 `

The expected output is:

![image](Captura%20de%20Pantalla%202021-01-14%20a%20la(s)%2021.30.45.png)
    
