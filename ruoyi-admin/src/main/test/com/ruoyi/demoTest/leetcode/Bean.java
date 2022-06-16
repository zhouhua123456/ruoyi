package com.ruoyi.demoTest.leetcode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bean {
    private String name;

    private int age;

    public static int lengthOfLongestSubstring(Bean bean) throws InterruptedException {
        synchronized (bean){
            if(bean.getAge() == 1){
                Thread.sleep(2002);
            }
            System.out.println(Thread.currentThread().getName() +"---"+ bean.getAge());
        }
        return 0;
    }

}
