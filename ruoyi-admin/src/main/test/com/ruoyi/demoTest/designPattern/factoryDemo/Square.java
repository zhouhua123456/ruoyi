package com.ruoyi.demoTest.designPattern.factoryDemo;

//正方形
public class Square implements Shape {


    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
