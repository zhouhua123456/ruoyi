package com.ruoyi.demoTest.InnerClassTest;

//外部类,,{内部类}注意需要大括号包住
public class InnerClassTest {
    private String a;

    public void mothod(){
        System.out.println("11");
    }

    public InnerClassTest() {
        a = "99";
    }

    public static void main(String[] args) {
        T t = new InnerClassTest().new T();
        t.ceshi();
    }

    /**
     * 内部类比较牛，我们通过说的父类子类，如果父类将变量设置为private（私有），子类是获取不到的
     * 内部类可以访问外部类的所有变量和方法
     */


    //内部类
    class T{

        public void ceshi(){
            System.out.println(a);
            mothod();
        }
    }
}



