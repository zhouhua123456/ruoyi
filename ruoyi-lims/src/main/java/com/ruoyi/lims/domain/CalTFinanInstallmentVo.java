package com.ruoyi.lims.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalTFinanInstallmentVo {

    /**
     * 分期金额
     */
    private BigDecimal installmentAmount;

    /**
     * 分期期数
     */
    private String numOfPeriod;

    /**
     * 基本费率
     */
    private BigDecimal basicRate;

    /**
     * 基本费率-月手续费
     **/
    private BigDecimal bMonthServiceAmount;

    /**
     * 基本费率-月还款本金
     **/
    private BigDecimal bMonthRepaymentAmount;

    /**
     * 基本费率-月还款总额
     **/
    private BigDecimal bMonthRepaymentTotalAmount;

    /**
     * 基本费率-总手续费
     **/
    private BigDecimal bTotalServiceAmount;


    /**
     * 活动费率
     */
    private BigDecimal activityRate;

    /**
     * 活动费率-月手续费
     **/
    private BigDecimal aMonthServiceAmount;

    /**
     * 活动费率-月还款金额
     **/
    private BigDecimal aMonthRepaymentAmount;

    /**
     * 活动费率-月还款总额
     **/
    private BigDecimal aMonthRepaymentTotalAmount;

    /**
     * 活动费率-总手续费
     **/
    private BigDecimal aTotalServiceAmount;


}
