package com.ruoyi.demoTest.designPattern.interpreterPattern;

//这个类就是解释类的实现类，创建的时候需要我们传入一个规则，然后按照规则去解释后面的
public class TerminalExpression implements  Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
