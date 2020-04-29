package com.lsm.kafka.consumer.service;


import com.lsm.kafka.consumer.bean.RequestLog;

public interface IMongoDBService {

    void saveRequestLog(RequestLog requestLog);

}
