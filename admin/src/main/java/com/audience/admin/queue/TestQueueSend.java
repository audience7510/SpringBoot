package com.audience.admin.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建生产者,使用AmqpTemplate发送消息,调用TestQueueSend中的send方法即可发送消息
 */
@Component
public class TestQueueSend {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String msg){
        amqpTemplate.convertAndSend("test.queue",msg);
    }
}
