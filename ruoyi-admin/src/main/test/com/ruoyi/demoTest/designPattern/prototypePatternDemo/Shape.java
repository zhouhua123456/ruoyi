package com.ruoyi.demoTest.designPattern.prototypePatternDemo;

//定义一个抽象方法，实现Cloneable接口

/**
 * 其实clone方法是我们自己去实现的，接口中什么都没有定义，只是作为一个标记而已
 * 但是你又不能不实现这个接口，因为子类中有重写clone方法，
 * 最后:重写clone方法要写上implements Cloneable，就不会报错，没写就会报错，至于至于这个Cloneable接口，
 * 其实里面什么有也没有，这也就是为啥好多地方说这是个标志接口，没作用。但是你没写implements Cloneable，重写clone就会报错
 * Cloneable是标记接口
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
