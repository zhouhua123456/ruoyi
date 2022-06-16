package com.ruoyi.demoTest.designPattern.facadePatternDemo;

public class FacadePatternTest {
    public static void main(String[] args) {
        //这个外观类，拥有我们接口中各种接口和实现
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
    }
}
