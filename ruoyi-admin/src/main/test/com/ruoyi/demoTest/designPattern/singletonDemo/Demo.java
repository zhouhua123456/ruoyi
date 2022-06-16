package com.ruoyi.demoTest.designPattern.singletonDemo;

/**
 * 单例模式，指的是在一个JVM里只有一个实例存在
 * 一共有8种方法去实现单例
 */
public class Demo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //第一种：利用类加载器帮助我们实现单例模式。用jvm来保证我们的线程安全。
    /**
     * 唯一缺点，无论是否用到，都会有一个实例。
     */
    private static final Demo INSTANCE=new Demo();//这种静态的在项目启动的时候就会实例化

    //将构造方法进行私有，防止别人利用new的方式创建。
    private Demo(){};

    public static Demo getInstance(){
        return INSTANCE;
    }
}
