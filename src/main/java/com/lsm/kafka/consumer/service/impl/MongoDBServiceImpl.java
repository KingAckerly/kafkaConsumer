package com.lsm.kafka.consumer.service.impl;


import com.lsm.kafka.consumer.bean.RequestLog;
import com.lsm.kafka.consumer.service.IMongoDBService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongoDBServiceImpl implements IMongoDBService {

    private static Logger logger = LoggerFactory.getLogger(MongoDBServiceImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveRequestLog(RequestLog requestLog) {
        logger.info("requestLog:" + requestLog);
        mongoTemplate.insert(requestLog, "requestLog");
    }
}
