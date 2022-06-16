package com.ruoyi.demoTest.designPattern.strategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Strategy strategy1 = new OperationAdd();
        Context context = new Context(strategy1);
        strategy1.doOperation(1,2);
    }
}
