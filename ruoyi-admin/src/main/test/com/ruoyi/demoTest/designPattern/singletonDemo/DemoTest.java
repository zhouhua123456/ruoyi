package com.ruoyi.demoTest.designPattern.singletonDemo;

public class DemoTest {
    public static void main(String[] args) {
  /*      Demo demo = Demo.getInstance();
        demo.setName("小猫");
        Demo demog = Demo.getInstance();
        System.out.println(demog.getName());
*/

/*        Demo1 demo1 = Demo1.getInstance();
        demo1.setName("小猫");
        Demo1 demog1 = Demo1.getInstance();
        System.out.println(demog1.getName());*/

/*        Demo2 demo2 = Demo2.getInstance();
        demo2.setName("小猫");
        Demo2 demog2 = Demo2.getInstance();
        System.out.println(demog2.getName());*/

/*        Demo3 instance = Demo3.getInstance();
        instance.setName("11");
        Demo3 instanceg = Demo3.getInstance();
        System.out.println(instanceg.getName());*/

 /*       Demo4 instance = Demo4.getInstance();
        instance.setName("11");
        Demo4 instanceg = Demo4.getInstance();
        System.out.println(instanceg.getName());*/

/*        Demo5 instance = Demo5.getInstance();
        instance.setName("112");
        Demo5 instanceg = Demo5.getInstance();
        System.out.println(instanceg.getName());*/

        //遍历枚举类中的所有属性
/*        Demo6[] values = Demo6.values();
        for (Demo6 value :values){
            System.out.println(value);
        }

        Demo6 blue = Demo6.BLUE;
        System.out.println(blue.name());*/
        //System.out.println(Demo6.GREEN);

        Demo6 name = Demo6.ERROR_A;
        System.out.println(name.getCode());
        name.play();
        name.rr = "777";

        Demo6 name_b = Demo6.ERROR_B;
        System.out.println(name.rr);
    }
}
