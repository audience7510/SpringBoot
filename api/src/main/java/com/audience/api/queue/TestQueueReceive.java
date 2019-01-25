package com.audience.api.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 创建消费者,监听队列,匹配的routingKey为test.queue
 */
@Component
@RabbitListener(queues = "test.queue")
public class TestQueueReceive {
    private static final Logger logger = LoggerFactory.getLogger(TestQueueReceive.class);

    @RabbitHandler
    public void receive(String msg){
        logger.info(msg);
    }
}
