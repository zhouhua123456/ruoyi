package com.ruoyi.demoTest.proxyTest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo {


    public static void main(String[] args) {

        /**
         * 如果一些接口拥有很多相同的方法，那么可以通过一个动态代理，来代理增强多个对象
         *
         * 如果接口A有play(),接口Subject有play()
         * 那么我们可以定义一个动态代理类，来对这两个实现类进行功能增强
         *
         */

        Subject realSubject = new RealSubject();//我们原来的实现类

        InvocationHandler handler = new DynamicProxy(realSubject); //我们增强后的实现类

        //（获取动态代理类的类加载器，获取实现类实现的接口，实例化的动态代理类）

        Subject s = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);

        //System.out.println(s.getClass().getName());

        //realSubject.rent();//代码增强之前
        //realSubject.hello("没动态代理");


        s.rent();//代码增强之后
        //s.hello("动态代理");

        A b = new B();

        Method[] methods = b.getClass().getMethods();

        //获取所有方法
        for(Method method : methods){
            System.out.println(method.getName());
        }

        Method[] declaredMethods = b.getClass().getDeclaredMethods();

        //获取我们自己定义的方法
        for(Method declaredMethod : declaredMethods){
            System.out.println(declaredMethod.getName()+"--------");
        }

        //获取类定义的所有属性
        Field[] fields = b.getClass().getFields();

        for(Field field : fields){
            System.out.println(field+"*****");
        }

        //获取类定义的所有属性
        Field[] declaredFields = b.getClass().getDeclaredFields();

        for(Field declaredField : declaredFields){
            System.out.println(declaredField+"+++++");
        }

        InvocationHandler handler1 = new DynamicProxy(b);

        A o = (A)Proxy.newProxyInstance(handler1.getClass().getClassLoader(), b.getClass().getInterfaces(), handler1);

        o.play();
    }
}
