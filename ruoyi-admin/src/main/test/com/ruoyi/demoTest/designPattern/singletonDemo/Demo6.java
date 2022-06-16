package com.ruoyi.demoTest.designPattern.singletonDemo;

/**
 * 什么是枚举类
 * 类的对象只有有限个，确定的。举例如下:也就是说new 出来的对象是确定的那几个
 *
 * 星期: Monday(星期一) .... Sunday(星 期天)
 * 性别: Man(男 )、Woman(女)
 * 季节: Spring(春 ....winer(冬天)
 * 支付方式: Cash (现金)、WeChatPay (微信)、Alipay(支 付宝)、BankCard(银行卡)、CreditCard(信用卡)
 * 就职状态: Busy、 Free、 Vocation、 Dimission
 * 订单状态: Nonpayment (未付款)、Paid (已付款)、Fulilld (已配货)
 * Delivered (已发货)、Return (退货)、Checked ( 已确认)
 * 线程状态:创建、就绪、运行、阻塞、死亡
 * 当需要定义一组常量时，强烈建议使用枚举类
 *
 * 我们在创建枚举的时候，基本上把所有要生产的对象也都生成好了。
 */
public enum Demo6 {

    //这里是对应的四个对象，如果我们这里只有ERROR_A，没有BDD对象,那么这可不就是单例的吗。。。
    ERROR_A("A类异常"),
    ERROR_B("B类异常"),
    ERROR_C("C类异常"),
    ERROR_D("D类异常");


    Demo6(String name1){
        this.code = name1;
    }

    //可以定义普通属性
    public String rr;

    private String code;

    public String getCode() {
        return code;
    }

    //可以定义普通方法
    public void play(){
        System.out.println(this.getCode()+"123");
    }

}


