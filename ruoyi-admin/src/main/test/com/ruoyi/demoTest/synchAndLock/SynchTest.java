package com.ruoyi.demoTest.synchAndLock;

import java.math.BigDecimal;

public class SynchTest {
    private String ee = "-->";
    public static void main(String[] args) {
        Bean bean = new Bean("a",1,new BigDecimal(2000));

        //早知道直接用线程池多爽

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第一次减去"+mothod);
        }).start();

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第二次减去"+mothod);
        }).start();

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第三次减去"+mothod);
        }).start();

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第四次减去"+mothod);
        }).start();

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第五次减去"+mothod);
        }).start();

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第六次减去"+mothod);
        }).start();

        new Thread(() ->{
            Bean mothod = bean.mothod(bean);
            System.out.println("我第七次减去"+mothod);
        }).start();

    }
}
