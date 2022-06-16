package com.ruoyi.demoTest.floatAndDoubleTest;

import com.ruoyi.common.utils.spring.SpringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 其实java出float和double，并不是为了精确计算的。它主要是为了服务科学计算或工程计算。一般商业开发是用不到这两个
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FloatAndDoubleTest {

    @Test
    public  void mothod() {
/*        float a = 0.33f;
        float a1 = 0.2f;
        double b = 0.233;
        long c = 10l;*/
        //FloatAndDoubleTest.reverseM();
        //FloatAndDoubleTest.replaceM();
        //FloatAndDoubleTest.arrayM();
 /*       BigDecimal bigDecimal = new BigDecimal(10.22);

        BigDecimal bigDecimal1 = new BigDecimal("10.22");
        BigDecimal divide = bigDecimal1.divide(new BigDecimal(100));
        System.out.println(divide);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);*/

/*        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();

        System.out.println(hal.getProcessor());
        System.out.println(hal.getMemory());*/
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        String message = messageSource.getMessage("user.jcaptcha.expire", null, LocaleContextHolder.getLocale());

        System.out.println(message);

    }

    /**
     * 字符串反转
     */
    public static void reverseM(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }

    /**
     * 字符串替换
     */
    public static void replaceM(){
        String a = "hella";
        String a1 = a.replace('a', 'o');
        System.out.println(a1);
    }

    /**
     * 数组和集合互换
     */
    public static void  arrayM(){
        ArrayList<Integer> munb = new ArrayList<Integer>();
        munb.add(1);
        munb.add(2);
        munb.add(3);
        Object[] objects = munb.toArray();


        List<String> strings = Arrays.asList("1", "2", "3");
        System.out.println(strings);
    }
}
