package com.lsm.kafka.consumer.consumer;

import com.alibaba.fastjson.JSON;
import com.lsm.kafka.consumer.bean.RequestLog;
import com.lsm.kafka.consumer.service.IMongoDBService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class AOPConsumer {

    private static Logger logger = LoggerFactory.getLogger(AOPConsumer.class);

    @Autowired
    IMongoDBService mongoDBService;

    //如果本地没有配置kafka连接,这里的监听就需要注释起来
    @KafkaListener(topics = {"requestLog"})
    public void requestLog(String message) {
        logger.info("requestLog topic message : {}", message);
        RequestLog requestLog = JSON.parseObject(message, RequestLog.class);
        mongoDBService.saveRequestLog(requestLog);
    }

}
