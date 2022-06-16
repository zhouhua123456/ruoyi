package com.ruoyi.demoTest.designPattern.commandPattern;

//使用 Broker 类来接受并执行命令。

/**
 * 需要同时执行一组动作的时候，比如打开冰箱，把大象放进去，关上冰箱，这一列动作，我们可以找一个对象帮我们一下子完成
 * 有数据库事务那个味道了，，，，
 */
public class CommandPatternTest {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Play play = new Play(abcStock);
        Sing sing = new Sing();

        //broker根据传入的命令类型，来确定用哪个对象来处理
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(play);
        broker.takeOrder(sing);

        broker.placeOrders();


    }
}
