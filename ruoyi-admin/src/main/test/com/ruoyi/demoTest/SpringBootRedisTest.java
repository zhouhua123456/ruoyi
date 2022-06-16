package com.ruoyi.demoTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootRedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    //Redis练习
    @Test
    public void RedisMethod(){

/*        //--------------练习String类型方法
        //@Set方法，给缓存赋值，如果该缓存已经有值的话就覆盖
        stringRedisTemplate.opsForValue().set("key1","100");

        String key1 = stringRedisTemplate.opsForValue().get("key1");

        //这个是让其减一
        stringRedisTemplate.opsForValue().decrement("key1");
        //自定义减去几
        stringRedisTemplate.opsForValue().decrement("key1",2);

        //让其加一
        stringRedisTemplate.opsForValue().increment("key1");

        stringRedisTemplate.opsForValue().increment("key1",2);

        //字符串拼接
        stringRedisTemplate.opsForValue().append("key1","111");

        //获取字符串长度
        stringRedisTemplate.opsForValue().size("key1");

        String key2 = stringRedisTemplate.opsForValue().get("key1");

        System.out.println("******************"+key2);*/

        //--------------------------List

 /*       //在左边存值
        stringRedisTemplate.opsForList().leftPush("key2","11");

        //取出最左的值
        String key2 = stringRedisTemplate.opsForList().leftPop("key2");
        System.out.println(key2);

        //第一种方式已数组的方式添加
        String[] strings = new String[2];
        strings[0] = "你好";
        strings[1] = "中国";
        stringRedisTemplate.opsForList().leftPushAll("key2",strings);

        //第二种方式已集合的方式添加
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("早安");
        strings1.add("郑州");
        strings1.add("郑州");
        stringRedisTemplate.opsForList().leftPushAll("key2",strings1);

        //count是要删除的个数，2代表冲集合种删除2个
        stringRedisTemplate.opsForList().remove("key2",2,"郑州");*/

/*        HashMap<String, Object> map = new HashMap<>();
        map.put("name","周华");
        map.put("age","31");
        redisTemplate.opsForValue().set("people",map);*/
/*        redisTemplate.multi();//事务开启
        redisTemplate.exec();//执行事务
        redisTemplate.discard();//放弃执行事务块的所有命令
        redisTemplate.watch("key2");//监视一个或多个key,如果在事务执行之前这个key被其他命令修改，那么事务将会被打断执行
        redisTemplate.unwatch();//取消监视所有key*/




    }

    @Before
    public void play(){
        System.out.println("试试会不会自己执行");
    }
}
