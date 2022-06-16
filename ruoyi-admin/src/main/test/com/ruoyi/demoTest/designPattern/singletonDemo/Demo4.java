package com.ruoyi.demoTest.designPattern.singletonDemo;

/**
 * 优点： 资源利用率高，既能够在需要的时候才初始化实例，又能保证线程安全，同时调用getInstance()方法不进行同步锁，效率高。
 *
 * 缺点： 第一次加载时稍慢，由于Java内存模型的原因偶尔会失败。在高并发环境下也有一定的缺陷，虽然发生概率很小。
 * DCL模式是使用最多的单例模式实现方式，除非代码在并发场景比较复杂或者JDK 6以下版本使用，否则，这种方式基本都能满足需求。
 */
public class Demo4 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Demo4(){};

    private static Demo4 INSTANCE;

    public static Demo4 getInstance(){
        if(INSTANCE == null){
            // 两层判空，第一层是为了避免不必要的同步
            // 第二层是为了在null的情况下创建实例
            synchronized(Demo4.class){
                if(INSTANCE == null){
                    INSTANCE = new Demo4();
                }
            }
        }
        return INSTANCE;
    }
}
