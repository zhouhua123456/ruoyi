package com.ruoyi.demoTest.synchAndLock;

import java.math.BigDecimal;

public class Synch1Test {
    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.setMoney(new BigDecimal(100));
        for(int i = 0;i<100;i++){

            new Thread(() ->{
                bean.buy();;
            }).start();

        }
    }
}
