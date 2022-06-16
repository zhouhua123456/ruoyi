package com.ruoyi.demoTest.designPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    public Room room;
    public People people;

    public void rent(People people){

        System.out.println(people.getName()+"租房子");
        this.show();

    }

    public void show(){
        List<Room> rooms = new ArrayList<Room>();
        Room dan = new Room("单人");
        rooms.add(dan);
        Room shuang = new Room("双人");
        rooms.add(shuang);
        rooms.forEach(room1 -> System.out.println(room1.getHouseType()));
    }
}
