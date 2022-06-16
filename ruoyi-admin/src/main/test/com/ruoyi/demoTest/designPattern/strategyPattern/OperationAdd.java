package com.ruoyi.demoTest.designPattern.strategyPattern;

public class OperationAdd implements  Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
