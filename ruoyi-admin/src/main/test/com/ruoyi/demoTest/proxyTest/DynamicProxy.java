package com.ruoyi.demoTest.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy  implements InvocationHandler {

    //　这个就是我们要代理的真实对象
    private Object subject;

    //    构造方法，给我们要代理的真实对象赋初值
    public DynamicProxy(Object subject)
    {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //　　在代理真实对象前我们可以添加一些自己的操作
        System.out.println("代理增强-代码之前");

        //调用原来的 方法
        method.invoke(subject, args);

        System.out.println("代理增强-代码之后");

        return null;
    }
}
