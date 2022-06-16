package com.ruoyi.demoTest.designPattern.chainofResponsibilityPattern;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){

        //这里作为传递处理的条件，如果符合条件true，就进行处理
        if(this.level <= level){
            write(message);
        }

        //这里作为传递处理的传递，如果不到最后一个，就一直这样传递下去，直到最后一个对象处理完成后返回
        //有点老大处理完找老二，老二处理完找老三，老三处理完退出
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
