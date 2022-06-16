package com.ruoyi.demoTest.designPattern.singletonDemo;

/**
 * 创建内部委托单号规则
 * 前两位必须是业务类别：ZG,YL,YL
 * 后面6位是年后两位+月+日
 * 再后面四位是流水号
 */
public interface CreateOrderInCode {
    public String create();
}
