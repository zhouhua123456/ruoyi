package com.ruoyi.demoTest.designPattern.factoryDemo;

/**
 * 在面向对象编程中，创建对象实例最常用的方式就是通过 new 操作符构造一个对象实例，但在某些情况下，new 操作符直接生成对象会存在一些问题。举例来说，对象的创建需要一系列的步骤：可能需要计算或取得对象的初始位置、选择生成哪个子对象实例、或在生成之前必须先生成一些辅助对象。 在这些情况，新对象的建立就是一个 “过程”，而不仅仅是一个操作，就像一部大机器中的一个齿轮传动。
 *
 *         针对上面这种情况，我们如何轻松方便地构造对象实例，而不必关心构造对象示例的细节和复杂过程？解决方案就是使用一个工厂类来创建对象。
 *
 * 工厂模式将目的将创建对象的具体过程屏蔽隔离起来，从而达到更高的灵活性，工厂模式可以分为三类：
 * 简单工厂模式（Simple Factory）
 * 工厂方法模式（Factory Method）
 * 抽象工厂模式（Abstract Factory）
 */

//简单工厂模式

/**
 *   简单工厂模式的核心是定义一个创建对象的接口，将对象的创建和本身的业务逻辑分离，降低系统的耦合度，使得两个修改起来相对容易些，当以后实现改变时，只需要修改工厂类即可。
 *
 * 如果不使用工厂，用户将自己创建宝马车，具体UML图和代码如下：
 */
public class SimpleFactory {

    public Shape getShape(String shapeType){
        if(shapeType == "null"){
            return  null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
