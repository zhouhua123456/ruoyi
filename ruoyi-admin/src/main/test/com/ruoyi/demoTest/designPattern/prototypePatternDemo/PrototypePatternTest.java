package com.ruoyi.demoTest.designPattern.prototypePatternDemo;

public class PrototypePatternTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");//克隆一号对象
        System.out.println("Shape : " + clonedShape3.getType());

        Shape clonedShape4 = (Shape) ShapeCache.getShape("3");//克隆二号对象

        /**
         * 以后我们只需要getShape，就可以获取一个克隆对象了，不用再去new创建对象了。
         */


        System.out.println(clonedShape3.getType().equals(clonedShape4.getType()));
    }
}
