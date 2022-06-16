package com.ruoyi.demoTest.javaGroup;

import java.math.BigDecimal;

public class OrderBean {
    private long Id;

    private String name;

    private String age;//年龄段


    private BigDecimal money;

    private String state;//0代表不行，1代表可以

    private String love;//爱好

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }


    public OrderBean() {
    }

    public OrderBean(Long id, String name, String age, BigDecimal money, String state, String love) {
        Id = id;
        this.name = name;
        this.age = age;
        this.money = money;
        this.state = state;
        this.love = love;
    }

    @Override
    public String toString() {
        return "orderBean{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", money=" + money +
                ", state='" + state + '\'' +
                ", love='" + love + '\'' +
                '}';
    }
}
