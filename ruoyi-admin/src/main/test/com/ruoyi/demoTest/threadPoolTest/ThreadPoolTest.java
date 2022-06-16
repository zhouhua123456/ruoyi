package com.ruoyi.demoTest.threadPoolTest;

import com.ruoyi.demoTest.javaGroup.GroupTest;
import com.ruoyi.demoTest.javaGroup.OrderBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ThreadPoolTest {

    @Autowired
    private ThreadPoolTaskExecutor executor;

    @Test
    public void mothod(){
        GroupTest.init();


        List<OrderBean> lists = GroupTest.lists;//前台传的list文件
        for(OrderBean bean : lists){
            MyThread myThread = new MyThread();
            myThread.setObject(bean);
            executor.submit(
                    new Thread(myThread)
            );
        }

        //得加下面的主线程睡眠，不加的话如果主线程都执行完了，而子线程还在睡眠的话就会强行打断
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
