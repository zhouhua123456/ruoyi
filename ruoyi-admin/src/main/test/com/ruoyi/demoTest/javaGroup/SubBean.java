package com.ruoyi.demoTest.javaGroup;

public class SubBean extends OrderBean {

    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "orderBean{" +
                "Id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", money=" + super.getMoney() +
                ", state='" + super.getState() + '\'' +
                ", love='" + super.getLove() + '\'' +
                ",word='"+work+'\''+
                '}';
    }
}
