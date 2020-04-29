package com.lsm.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//如果本地MongoDB连接没有配置,会报MongoDB连接异常,此处暂时不用,选择禁用MongoDB
//@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@SpringBootApplication
@EnableEurekaClient
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

}
