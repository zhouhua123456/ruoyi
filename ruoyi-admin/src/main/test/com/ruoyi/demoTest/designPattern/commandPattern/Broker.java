package com.ruoyi.demoTest.designPattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

//经纪人，创建命令调用类。这里是需要将保存在集合中的所有动作一次性都执行

/**
 * 其实这个才是核心，我们把需要执行的一系列命令添加到集合中，然后再循环执行
 * 这个类相当于遥控器
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
