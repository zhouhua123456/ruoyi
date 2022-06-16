package com.ruoyi.demoTest.synchAndLock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bean {
    private String name;

    private int age;

    private BigDecimal money;

    private static int numb = 0;

    //让这个对象的钱少10

    /**
     * 这里如果不加锁结果，原因是不具备原子性，导致线程不安全，放多线程调用这个方法就容易出现问题
     * 我第一次减去Bean(name=a, age=1, money=1990)
     * 我第二次减去Bean(name=a, age=1, money=1980)
     * 我第三次减去Bean(name=a, age=1, money=1970)
     * 我第四次减去Bean(name=a, age=1, money=1960)
     * 我第五次减去Bean(name=a, age=1, money=1950)
     * 我第六次减去Bean(name=a, age=1, money=1930)
     * 我第七次减去Bean(name=a, age=1, money=1930)
     * @param bean
     * @return
     */
    public Bean mothod(Bean bean){
        //new ConcurrentHashMap<>();
        bean.setMoney(bean.getMoney().subtract(new BigDecimal(10)));

        return bean;
    }

    /**
     * 加锁后具备原子性，线程安全，肯定不会出现重复的情况
     * 我第一次减去Bean(name=a, age=1, money=1990)
     * 我第二次减去Bean(name=a, age=1, money=1980)
     * 我第三次减去Bean(name=a, age=1, money=1970)
     * 我第五次减去Bean(name=a, age=1, money=1960)
     * 我第七次减去Bean(name=a, age=1, money=1950)
     * 我第四次减去Bean(name=a, age=1, money=1940)
     * 我第六次减去Bean(name=a, age=1, money=1930)
     * @param bean
     * @return
     */
    public Bean mothodSyn(Bean bean){
        synchronized (bean){
            bean.setMoney(bean.getMoney().subtract(new BigDecimal(10)));
        }
        return bean;
    }

    /**
     *
     * 给调用这个方法的对象加锁
     *
     */

    public synchronized void buy(){
        try {
            Thread.sleep(2000);
            System.out.println("one");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sell(){
        try {
            Thread.sleep(2000);
            System.out.println("one");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
