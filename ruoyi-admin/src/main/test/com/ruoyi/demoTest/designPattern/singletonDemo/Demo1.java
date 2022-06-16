package com.ruoyi.demoTest.designPattern.singletonDemo;

/**
 *
 * 这种单例会更好一点，不会在项目启动的时候就帮我们创建
 * 懒汉式:达到初始化目的，带来了线程安全问题
 * 但是有个问题，就是我们在创建这个对象的时候如果有并发，还是会有创建出多个对象的可能性
 * 因为我们创建的方法不具备原子性
 */

public class Demo1 {
    private Demo1(){};

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private static Demo1 INSTANCE;
    static {
        INSTANCE = new Demo1();
    }
    public static  Demo1 getInstance(){
        return INSTANCE;
    }
}
