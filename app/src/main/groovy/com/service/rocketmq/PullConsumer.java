package com.service.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPullConsumer;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PullConsumer {

    private static final Map<MessageQueue, Long> OFFSE_TABLE = new HashMap<MessageQueue, Long>();

    public static void main(String[] args) throws MQClientException {
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer("please_rename_unique_group_name_5");
        consumer.start();
        Set<MessageQueue> mqs = consumer.fetchSubscribeMessageQueues("TopicTest1");

        for (MessageQueue mq : mqs) {
            long Offset = consumer.fetchConsumeOffset(mq, true);
            System.out.println("consumer from the queue:" + mq + "%n");
        }

    }

}
