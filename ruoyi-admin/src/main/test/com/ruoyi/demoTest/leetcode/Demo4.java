package com.ruoyi.demoTest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        Bean a = new Bean("a",1);
        Bean b = new Bean("b",2);
        Bean c = new Bean("c",3);
        List<Bean> objects = new ArrayList<>();
        objects.add(a);
        objects.add(b);
        objects.add(c);
        for (Bean object : objects) {

            new Thread(()->{
                try {
                    Bean bean = new Bean();
                    bean.lengthOfLongestSubstring(object);
                    System.out.println(object.getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }



}
