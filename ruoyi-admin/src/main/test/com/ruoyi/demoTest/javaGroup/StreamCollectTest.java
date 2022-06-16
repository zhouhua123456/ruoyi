package com.ruoyi.demoTest.javaGroup;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectTest {
    public static void main(String[] args) {
        GroupTest.init();


        List<OrderBean> lists = GroupTest.lists;
        /**
         * 过滤List集合中对象年龄等于20的
         */
        /* List<OrderBean> collect = lists.stream().filter(bean -> bean.getAge().equals("20"))
                .collect(toList());*/

        /**
         * 集合去重
         */
        /*List<OrderBean> collect = lists.stream().distinct().collect(toList());*/


        /**
         * 集合排序，根据某一个字段排序
         */
/*
        List<OrderBean> collect = lists.stream().sorted(Comparator.comparing(OrderBean::getAge)).collect(toList());
*/

        /**
         * 返回集合中的前几个元素
         */
        /*List<OrderBean> collect = lists.stream().limit(2).collect(toList());*/

        /**
         * 跳过集合的前几个元素
         */

        /*List<OrderBean> collect = lists.stream().skip(2).collect(toList());*/

        /**
         * 获取集合中所有人员的名称，返回一个新的集合
         */

        /*List<String> collect = lists.stream().map(OrderBean::getName).collect(toList());*/

        /**
         * 查找集合中有没有一个对象的名字是a的
         * anyMatch(T -> boolean):流中是否有一个元素匹配给定的 T -> boolean 条件
         * allMatch(T -> boolean):流中是否所有元素都匹配给定的 T -> boolean 条件
         * noneMatch(T -> boolean):流中是否没有元素匹配给定的 T -> boolean 条件
         */
        /*boolean a = lists.stream().anyMatch(bean -> bean.getName().equals("a"));*/

        /**
         * findAny() 和 findFirst()
         */
        /*Optional<OrderBean> any = lists.stream().findAny();*/

        /**
         * 计算集合中的对象年龄的和
         */

/*        int sum = list.stream().map(Person::getAge).reduce(0, (a, b) -> a + b);
        与之相同:
        int sum = list.stream().map(Person::getAge).reduce(0, Integer::sum);*/

        /**
         * 分组，根据爱好分组,返回map
         */
        Map<String, List<OrderBean>> collect = lists.stream().collect(Collectors.groupingBy(OrderBean::getLove));

        /**
         * 分组，根据爱好分组,返回list
         */
/*        List<List<OrderBean>> objects = new ArrayList<>();
        lists.stream().collect(Collectors.groupingBy(OrderBean::getLove, Collectors.toList()))
                .forEach((a,b) ->{
                    objects.add(b);
                });*/

        HashMap<String, Object> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.forEach((key,value) ->{
            //System.out.println(key);
        });

        HashSet<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.forEach(a -> System.out.println(a));

        BigDecimal zero = BigDecimal.ZERO;
        System.out.println("zero= "+zero);
    }
}
