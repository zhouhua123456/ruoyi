package com.ruoyi.demoTest.designPattern.facadePatternDemo;

/**
 * 这个就是我们的接待类，也叫外观类
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    //封装一下原来的方法，还可以增强
    public void drawCircle(){
        System.out.println("我还可以增强啊");
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
