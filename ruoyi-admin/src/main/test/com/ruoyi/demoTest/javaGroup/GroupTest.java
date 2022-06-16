package com.ruoyi.demoTest.javaGroup;

import com.ruoyi.common.utils.uuid.Seq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GroupTest {

    public static List<OrderBean> lists =  new ArrayList<OrderBean>();

    public static final String POSITIVE_INTEGER  = "([0-9][0-9]{0,1}|100)$";//0到100的正整数

    public static final String POSITIVE_INTEGER1  = "([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])";


    public static void main(String[] args) {
/*        String  date_str="2021-12-11 11:18:02.0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = sdf.parse(date_str);

            Timestamp timestamp = new Timestamp(parse.getTime());
            timestamp.setNanos(0);
            System.out.println(timestamp);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        System.out.println("测试");
        System.out.println("测试1");
        System.out.println("测试2");

        String s = Seq.getId(new AtomicInteger(20220613),1);
        System.out.println(s);


/*        BigDecimal bigDecimal = BigDecimal.valueOf(10.2);
        System.out.println(bigDecimal);
        //在使用之前先对对象进行初始化，放入10个人
        init();

        //先分组，再聚合
        List<HashMap<String, Object>> results = GroupObject.method(lists, "a");
        for(HashMap map : results ){
            System.out.println("--------------------------");
            System.out.println(map);
        }*/

/*        boolean matches = Pattern.matches(POSITIVE_INTEGER, "100");
        System.out.println(matches);*/

        BigDecimal bigDecimal = new BigDecimal(0.002162);
        BigDecimal bigDecimal1 = bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal1);
/*        long stmp = 1651213855613L;
        Date date = new Date(stmp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);*/
    }

    public static void init(){
        OrderBean a = new OrderBean(1L, "a", "10", BigDecimal.valueOf(10.2), "0", "打乒乓球");

        OrderBean b = new OrderBean(2L, "b", "20", BigDecimal.valueOf(11.2), "1", "玩游戏");

        OrderBean c = new OrderBean(3L, "c", "30", BigDecimal.valueOf(12.2), "1", "唱歌");

        OrderBean d = new OrderBean(4L, "d", "40", BigDecimal.valueOf(13.2), "1", "打篮球");

        OrderBean e = new OrderBean(5L, "e", "10", BigDecimal.valueOf(14.2), "1", "打篮球");

        OrderBean f = new OrderBean(6L, "f", "20", BigDecimal.valueOf(15.2), "1", "打篮球");

        OrderBean g = new OrderBean(7L, "g", "30", BigDecimal.valueOf(16.2), "1", "唱歌");

        OrderBean h = new OrderBean(8L, "h", "40", BigDecimal.valueOf(17.2), "1", "玩游戏");

        OrderBean i = new OrderBean(9L, "i", "10", BigDecimal.valueOf(18.2), "1", "玩游戏");

        OrderBean j = new OrderBean(10L, "j", "20", BigDecimal.valueOf(19.2), "1", "玩游戏");

        lists.add(a);
        lists.add(b);
        lists.add(c);
        lists.add(d);
        lists.add(e);
        lists.add(f);
        lists.add(g);
        lists.add(h);
        lists.add(i);
        lists.add(j);
    }


}
