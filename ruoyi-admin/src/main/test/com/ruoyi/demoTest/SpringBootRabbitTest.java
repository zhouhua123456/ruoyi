package com.ruoyi.demoTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootRabbitTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 点播模式（点对点）
     */
    @Test
    public void directMethod(){

        //Message需要自己构造一个，定义消息体内容好和消息头
        //rabbitTemplate.send("atguigu","atguigu","hahhaa");

        //object默认消息体，中需要传入要发送的对象，自动序列化发送给rabbitmq,发送
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","周华");
        map.put("age","31");
        map.put("message", Arrays.asList("1","2","3"));
        try{
            rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",map);
            String a = "11";
        }catch(Exception r){
            r.printStackTrace();
        }


        //接收mq的信息
/*        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o);*/
    }
}
