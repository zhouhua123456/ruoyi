package com.ruoyi.demoTest.designPattern.decoratorPatternDemo;

/**
 * 虽然返回的都是Shape
 * 但是没有装饰之前，它只是一个圆
 * 装饰之后它有颜色了。。。
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
