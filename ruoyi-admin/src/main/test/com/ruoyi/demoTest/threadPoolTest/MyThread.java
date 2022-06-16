package com.ruoyi.demoTest.threadPoolTest;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.demoTest.javaGroup.OrderBean;

/**
 * 这里面应该有对象的解析和处理逻辑
 */
public class MyThread implements Runnable {

    private OrderBean bean;

    public void setObject(OrderBean bean){
        this.bean = bean;
    }


    @Override
    public void run() {
        if(bean != null){
            //处理都在这里面进行
            System.out.println("睡一会");
            try {
                Thread.sleep(1000);
                System.out.println("当前线程是："+Thread.currentThread().getName()+"获取到的是 "+bean.getName()+ DateUtils.getNowDate());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
