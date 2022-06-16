package com.ruoyi.lims.aspectj;

import com.ruoyi.common.annotation.Test;
import com.ruoyi.lims.domain.LimsiSrollMain;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 测试AOP
 * 方法里面可以获取参数，然后将入职插入到数据库中
 */

@Aspect
@Component
public class TestAspect {



    @Before("@annotation(test1)")
    public Object testMethod(JoinPoint point, Test test1){
        System.out.println("测试aop");
        String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();
        Object[] args = point.getArgs();
        Object params = point.getArgs()[0];
        LimsiSrollMain lims = null;
        if(params != null && params instanceof LimsiSrollMain){
/*            lims = (LimsiSrollMain) params;
            System.out.println(lims.getSampleNumber());
            lims.setSampleName(test1.name());*/
        }
        return lims;
    }

    @After("@annotation(test1)")
    public void backMethod(JoinPoint point, Test test1){
        System.out.println("业务方法已执行完！");
    }
}
