package com.ruoyi.demoTest.designPattern.commandPattern;

public class Sing implements Order {
    @Override
    public void execute() {
        System.out.println("其实这样写就可以了，没有必要搞那么复杂--唱歌");
    }
}
