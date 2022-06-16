package com.ruoyi.demoTest.designPattern.decoratorPatternDemo;

/**
 * 装饰类，额外再增加一些属性
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
