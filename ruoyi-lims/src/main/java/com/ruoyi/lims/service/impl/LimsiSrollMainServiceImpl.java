package com.ruoyi.lims.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.ruoyi.common.annotation.Test;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.LimsiSrollMainMapper;
import com.ruoyi.lims.domain.LimsiSrollMain;
import com.ruoyi.lims.service.ILimsiSrollMainService;

/**
 * 委托查询Service业务层处理
 *
 * @author ruoyi
 * @date 2022-03-25
 */
@Service
public class LimsiSrollMainServiceImpl implements ILimsiSrollMainService
{
    @Autowired
    private LimsiSrollMainMapper limsiSrollMainMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;//操作k-v都是字符串的

    @Autowired
    private RedisTemplate redisTemplate;//k-v都是对象的

    /**
     * 查询委托查询
     *
     * @param sid 委托查询主键
     * @return 委托查询
     */

    @Override
    public LimsiSrollMain selectLimsiSrollMainBySid(Long sid)
    {
        return limsiSrollMainMapper.selectLimsiSrollMainBySid(sid);
    }

    /**
     * 查询委托查询列表
     *
     * @param limsiSrollMain 委托查询
     * @return 委托查询
     */
    @Test(name = "酸洗液")
    @Override
    public List<LimsiSrollMain> selectLimsiSrollMainList(LimsiSrollMain limsiSrollMain)
    {
        //调用公用方法的时候
        String time = DateUtils.getTime();
        System.out.println(time);

        return limsiSrollMainMapper.selectLimsiSrollMainList(limsiSrollMain);
    }

    /**
     * 新增委托查询
     *
     * @param limsiSrollMain 委托查询
     * @return 结果
     */
    @Override

    public int insertLimsiSrollMain(LimsiSrollMain limsiSrollMain)
    {
        limsiSrollMain.setCreateTime(DateUtils.getNowDate());
        return limsiSrollMainMapper.insertLimsiSrollMain(limsiSrollMain);
    }

    /**
     * 修改委托查询
     *
     * @param limsiSrollMain 委托查询
     * @return 结果
     */
    @Override
    public int updateLimsiSrollMain(LimsiSrollMain limsiSrollMain)
    {
        limsiSrollMain.setUpdateTime(DateUtils.getNowDate());
        return limsiSrollMainMapper.updateLimsiSrollMain(limsiSrollMain);
    }

    /**
     * 批量删除委托查询
     *
     * @param sids 需要删除的委托查询主键
     * @return 结果
     */
    @Override
    public int deleteLimsiSrollMainBySids(Long[] sids)
    {
        return limsiSrollMainMapper.deleteLimsiSrollMainBySids(sids);
    }

    /**
     * 开启异步调用，不用让前台响应界面再等待状态
     *
     */
    @Override

    public int deleteLimsiSrollMainBySid(Long sid)
    {
        return limsiSrollMainMapper.deleteLimsiSrollMainBySid(sid);
    }

    //@Cacheable(cacheNames = {"isrollMain"})
    //这里可以直接使用@Async，加小括号是为了学习
    @Async
    public LimsiSrollMain testRedis(Long sid){
        System.out.println("已经到service层了");
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        //操作字符串的String
        stringRedisTemplate.opsForValue().append("key1","value1");
        stringRedisTemplate.opsForValue().get("key1");

        //操作LIst
        stringRedisTemplate.opsForList().leftPush("key2","1");
        stringRedisTemplate.opsForList().leftPush("key2","2");
        stringRedisTemplate.opsForList().leftPush("key2","3");
        stringRedisTemplate.opsForList().leftPop("key2");

        //操作Hash
        stringRedisTemplate.opsForHash().put("key3","name","周华");
        stringRedisTemplate.opsForHash().put("key3","age","20");


        //操作Set
        stringRedisTemplate.opsForSet().add("key4","2","3","4");


        //操作Zset
        stringRedisTemplate.opsForZSet().add("key5","80",3);
        stringRedisTemplate.opsForZSet().add("key5","90",2);
        stringRedisTemplate.opsForZSet().add("key5","100",1);

        LimsiSrollMain limsiSrollMain = limsiSrollMainMapper.selectLimsiSrollMainBySid(new Long(1));

        redisTemplate.opsForValue().set("limsiSrollMain1",limsiSrollMain);
        System.out.println(limsiSrollMain);
        return limsiSrollMain;
    }

    @RabbitListener(queues = "atguigu.news")
    public void listenRabbitMqMessage(HashMap map){
        System.out.println("********************************"+map);

    }
}
