package com.ruoyi.demoTest.designPattern.commandPattern;

public class Play implements Order {

    private Stock abcStock;

    public Play(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.play();
    }
}
