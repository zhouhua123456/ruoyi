package com.ruoyi.lims.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 委托查询对象 limsi_sroll_main
 *
 * @author ruoyi
 * @date 2022-03-25
 */
public class LimsiSrollMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long sid;

    /** 委托单号 */
    @Excel(name = "委托单号")
    private String sampleId;

    /** 委托名称 */
    @Excel(name = "委托名称")
    private String sampleName;

    /** 委托类型 */
    @Excel(name = "委托类型")
    private String sampleType;

    /** 委托数量 */
    @Excel(name = "委托数量")
    private Integer sampleNumber;

    /** 委托人 */
    @Excel(name = "委托人")
    private String sampleUser;

    /** 委托时间 */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    @Excel(name = "委托时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sampleTime;

    /** 接收状态 */
    @Excel(name = "接收状态")
    private String state;

    public void setSid(Long sid)
    {
        this.sid = sid;
    }

    public Long getSid()
    {
        return sid;
    }
    public void setSampleId(String sampleId)
    {
        this.sampleId = sampleId;
    }

    public String getSampleId()
    {
        return sampleId;
    }
    public void setSampleName(String sampleName)
    {
        this.sampleName = sampleName;
    }

    public String getSampleName()
    {
        return sampleName;
    }
    public void setSampleType(String sampleType)
    {
        this.sampleType = sampleType;
    }

    public String getSampleType()
    {
        return sampleType;
    }
    public void setSampleNumber(Integer sampleNumber)
    {
        this.sampleNumber = sampleNumber;
    }

    public Integer getSampleNumber()
    {
        return sampleNumber;
    }
    public void setSampleUser(String sampleUser)
    {
        this.sampleUser = sampleUser;
    }

    public String getSampleUser()
    {
        return sampleUser;
    }
    public void setSampleTime(Date sampleTime)
    {
        this.sampleTime = sampleTime;
    }

    public Date getSampleTime()
    {
        return sampleTime;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sid", getSid())
            .append("sampleId", getSampleId())
            .append("sampleName", getSampleName())
            .append("sampleType", getSampleType())
            .append("sampleNumber", getSampleNumber())
            .append("sampleUser", getSampleUser())
            .append("sampleTime", getSampleTime())
            .append("state", getState())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
