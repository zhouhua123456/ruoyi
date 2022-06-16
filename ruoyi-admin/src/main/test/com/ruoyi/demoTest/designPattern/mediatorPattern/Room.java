package com.ruoyi.demoTest.designPattern.mediatorPattern;

public class Room {
    private String houseType;

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Room(String houseType) {
        this.houseType = houseType;
    }
}
