package com.ruoyi.demoTest.designPattern.singletonDemo;

/**
 * 第一次加载Demo5类时不会初始化instance，只有在第一次调用getInstance()方法时，虚拟机会加载SingletonHolder类，初始化instance。
 *
 * 这方式既保证线程安全，单例对象的唯一，也延迟了单例的初始化，推荐使用这种方式来实现单例模式。
 */
public class Demo5 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //将默认构造方法私有，防止new
    private Demo5(){};

    public static Demo5 getInstance(){
        return SingletonHolder.getInstance;
    }

    //创建一个静态内部类
    private static class SingletonHolder{
        private static Demo5 getInstance = new Demo5();
    }
}
