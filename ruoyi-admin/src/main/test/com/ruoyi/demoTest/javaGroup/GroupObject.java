package com.ruoyi.demoTest.javaGroup;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupObject {

    public static List<HashMap<String,Object>> method(List<OrderBean> lists, String groupBy){

        List<List<OrderBean>> groupList = new ArrayList<>();

        lists.stream().collect(Collectors.groupingBy(OrderBean::getAge,Collectors.toList())).
                forEach((groupByThing,groupByObject)->{
                    groupList.add(groupByObject);
                });



        List<HashMap<String, Object>> results = new ArrayList<HashMap<String, Object>>();

        for(List<OrderBean> list : groupList){
            int lanNumb = 0;
            BigDecimal lanMoneySum = new BigDecimal(0);
            String age = "";

            int pingNumb = 0;
            BigDecimal pingMoneySum = new BigDecimal(0);

            int changNumb = 0;
            BigDecimal changMoneySum = new BigDecimal(0);

            int youNumb = 0;
            BigDecimal youMoneySum = new BigDecimal(0);
            HashMap<String, Object> map = new HashMap<String,Object>();

            for(OrderBean o: list){
                System.out.println(o);
                age = o.getAge();
                switch(o.getLove()){
                    case "打篮球":
                        lanNumb ++;
                        lanMoneySum = lanMoneySum.add(o.getMoney());
                        break;
                    case "打乒乓球":
                        pingNumb ++;
                        pingMoneySum = pingMoneySum.add(o.getMoney());
                        break;
                    case "唱歌":
                        changNumb ++;
                        changMoneySum = changMoneySum.add(o.getMoney());
                        break;
                    case "玩游戏":
                        youNumb ++;
                        youMoneySum = youMoneySum.add(o.getMoney());
                        break;
                }
            }

            map.put("lanNumb", lanNumb);
            map.put("lanMoneySum", lanMoneySum);
            map.put("pingNumb", pingNumb);
            map.put("pingMoneySum", pingMoneySum);
            map.put("changNumb", changNumb);
            map.put("changMoneySum", changMoneySum);
            map.put("youNumb", youNumb);
            map.put("youMoneySum", youMoneySum);

            map.put("age",age);
            results.add(map);


        }

        return results;
    }
}
