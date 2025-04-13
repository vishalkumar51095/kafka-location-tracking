package com.deliveryboy.deliveryboy.service;

import com.deliveryboy.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger=  LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
//            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
//            this.logger.info("message produced");
        for(int i=1;i<=100000;i++){
            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
            this.logger.info("message produced " + i);
            System.out.println("____________________________");
        }
            return true;
    }
}
