package com.ruoyi.demoTest.designPattern.singletonDemo;

public class Demo3 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Demo3(){};

    private static Demo3 INSTANCE;

    /**
     * getInstance()方法中添加了synchronized关键字，使其变成一个同步方法，目的是为了在多线程环境下保证单例对象唯一。
     * @return
     *
     * 优点： 只有在使用时才会实例化单例，一定程度上节约了资源。
     * 缺点： 第一次加载时要立即实例化，反应稍慢。每次调用getInstance()方法都会进行同步，这样会消耗不必要的资源。这种模式一般不建议使用。
     */
    public static synchronized Demo3 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Demo3();
        }
        return INSTANCE;
    }
}
