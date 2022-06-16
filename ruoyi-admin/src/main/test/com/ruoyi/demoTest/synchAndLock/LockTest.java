package com.ruoyi.demoTest.synchAndLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    //支持公平锁和非公平锁
    private Lock lock = new ReentrantLock();
    //锁的等待和唤醒
    Condition condition = lock.newCondition();



    public void TestMothod(int numb) throws InterruptedException {
        lock.lock();//得到锁对象
        for(int i=0;i<10;i++){
            if(numb==0){
                condition.await();//将其他数字加入到队列当中，处于等待唤醒状态
            }else if(numb == 1){
                condition.signal();
            }
            numb = i;
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
        lock.unlock();//释放锁
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        for(int i=0;i<2;i++){
            int numb = i;
            new Thread(() ->{
                try {
                    lockTest.TestMothod(numb);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
