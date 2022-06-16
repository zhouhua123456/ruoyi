package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.LimsiSrollMain;

/**
 * 委托查询Service接口
 *
 * @author ruoyi
 * @date 2022-03-25
 */
public interface ILimsiSrollMainService
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
     * 批量删除委托查询
     *
     * @param sids 需要删除的委托查询主键集合
     * @return 结果
     */
    public int deleteLimsiSrollMainBySids(Long[] sids);

    /**
     * 删除委托查询信息
     *
     * @param sid 委托查询主键
     * @return 结果
     */
    public int deleteLimsiSrollMainBySid(Long sid);

    public LimsiSrollMain testRedis(Long sid);
}
