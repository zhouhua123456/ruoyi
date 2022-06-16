package com.ruoyi.demoTest.designPattern.mediatorPattern;

/**
 * 张三要租房子，还是需要中间帮忙
 */
public class DemoTest {
    public static void main(String[] args) {
        People people = new People("张三");
        Mediator mediator = new Mediator();
        mediator.rent(people);
    }
}
