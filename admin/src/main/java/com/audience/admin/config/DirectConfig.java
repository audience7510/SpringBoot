package com.audience.admin.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfig {

    //创建队列
    @Bean
    public Queue testQueue(){
        //指定routingKey
        return new Queue("test.queue");
    }
}
