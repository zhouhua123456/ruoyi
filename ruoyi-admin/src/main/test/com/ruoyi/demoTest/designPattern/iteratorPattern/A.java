package com.ruoyi.demoTest.designPattern.iteratorPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class A {
    public static void main(String[] args) {

        //ArrayList
/*        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        //LinkedList
/*        List<String> strings = new LinkedList<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        //HashSet
/*        Set<String> strings = new HashSet<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        Map<String, Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }

        Iterator<String> iterator1 = map.keySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
