package com.ruoyi.demoTest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeFormat {
    public static void main(String[] args) {
        long stmp = 1655355028270L;
        Date date = new Date(stmp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.forEach((key,value) ->{
            System.out.println(key);
        });

        ArrayList<String> strings = new ArrayList<>();
        //strings.add("1");
        //strings.add("2");
        //strings.add("3");
        //strings.add("4");
        System.out.println(strings.size());
        ArrayList<String> stringsNew = new ArrayList<>();
        for (String string : strings) {
            if(!string.equals("2")){
                stringsNew.add(string);
            }
        }

        BigDecimal bigDecimal = new BigDecimal("1");
        System.out.println(bigDecimal);
    }
}
