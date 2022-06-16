package com.ruoyi.demoTest.designPattern.factoryDemo;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = simpleFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = simpleFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = simpleFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

    }
}
