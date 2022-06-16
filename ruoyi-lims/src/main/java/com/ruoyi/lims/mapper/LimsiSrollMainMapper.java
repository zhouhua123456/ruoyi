package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.LimsiSrollMain;

/**
 * 委托查询Mapper接口
 * 
 * @author ruoyi
 * @date 2022-03-25
 */
public interface LimsiSrollMainMapper 
{
    /**
     * 查询委托查询
     * 
     * @param sid 委托查询主键
     * @return 委托查询
     */
    public LimsiSrollMain selectLimsiSrollMainBySid(Long sid);

    /**
     * 查询委托查询列表
     * 
     * @param limsiSrollMain 委托查询
     * @return 委托查询集合
     */
    public List<LimsiSrollMain> selectLimsiSrollMainList(LimsiSrollMain limsiSrollMain);

    /**
     * 新增委托查询
     * 
     * @param limsiSrollMain 委托查询
     * @return 结果
     */
    public int insertLimsiSrollMain(LimsiSrollMain limsiSrollMain);

    /**
     * 修改委托查询
     * 
     * @param limsiSrollMain 委托查询
     * @return 结果
     */
    public int updateLimsiSrollMain(LimsiSrollMain limsiSrollMain);

    /**
     * 删除委托查询
     * 
     * @param sid 委托查询主键
     * @return 结果
     */
    public int deleteLimsiSrollMainBySid(Long sid);

    /**
     * 批量删除委托查询
     * 
     * @param sids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLimsiSrollMainBySids(Long[] sids);
}
