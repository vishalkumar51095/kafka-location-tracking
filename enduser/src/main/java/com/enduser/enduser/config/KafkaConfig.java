package com.enduser.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.Location_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value){

        System.out.println(value);
    }
}
