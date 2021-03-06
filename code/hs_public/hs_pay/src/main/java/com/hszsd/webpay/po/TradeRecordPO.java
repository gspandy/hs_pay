package com.hszsd.webpay.po;

import java.math.BigDecimal;
import java.util.Date;

public class TradeRecordPO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.TRANS_ID
     *
     * @mbggenerated
     */
    private String transId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.MONEY
     *
     * @mbggenerated
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.CREDIT
     *
     * @mbggenerated
     */
    private BigDecimal credit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.MOBILE
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.ORDER_ID
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.SOURCE_CODE
     *
     * @mbggenerated
     */
    private String sourceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.OPERATE_TYPE
     *
     * @mbggenerated
     */
    private int operateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.TRADE_STATUS
     *
     * @mbggenerated
     */
    private int tradeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.RETURN_URL
     *
     * @mbggenerated
     */
    private String returnUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.NOTICE_URL
     *
     * @mbggenerated
     */
    private String noticeUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.CREATE_BY
     *
     * @mbggenerated
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.UPDATE_DATE
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.UPDATE_BY
     *
     * @mbggenerated
     */
    private String updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HSPRD.TB_TRADE_RECORD.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.TRANS_ID
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.TRANS_ID
     *
     * @mbggenerated
     */
    public String getTransId() {
        return transId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.TRANS_ID
     *
     * @param transId the value for HSPRD.TB_TRADE_RECORD.TRANS_ID
     *
     * @mbggenerated
     */
    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.USER_ID
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.USER_ID
     *
     * @param userId the value for HSPRD.TB_TRADE_RECORD.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.MONEY
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.MONEY
     *
     * @mbggenerated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.MONEY
     *
     * @param money the value for HSPRD.TB_TRADE_RECORD.MONEY
     *
     * @mbggenerated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.CREDIT
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.CREDIT
     *
     * @mbggenerated
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.CREDIT
     *
     * @param credit the value for HSPRD.TB_TRADE_RECORD.CREDIT
     *
     * @mbggenerated
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.MOBILE
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.MOBILE
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.MOBILE
     *
     * @param mobile the value for HSPRD.TB_TRADE_RECORD.MOBILE
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.ORDER_ID
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.ORDER_ID
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.ORDER_ID
     *
     * @param orderId the value for HSPRD.TB_TRADE_RECORD.ORDER_ID
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.SOURCE_CODE
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.SOURCE_CODE
     *
     * @mbggenerated
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.SOURCE_CODE
     *
     * @param sourceCode the value for HSPRD.TB_TRADE_RECORD.SOURCE_CODE
     *
     * @mbggenerated
     */
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode == null ? null : sourceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.OPERATE_TYPE
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.OPERATE_TYPE
     *
     * @mbggenerated
     */
    public int getOperateType() {
        return operateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.OPERATE_TYPE
     *
     * @param operateType the value for HSPRD.TB_TRADE_RECORD.OPERATE_TYPE
     *
     * @mbggenerated
     */
    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.TRADE_STATUS
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.TRADE_STATUS
     *
     * @mbggenerated
     */
    public int getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.TRADE_STATUS
     *
     * @param tradeStatus the value for HSPRD.TB_TRADE_RECORD.TRADE_STATUS
     *
     * @mbggenerated
     */
    public void setTradeStatus(int tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.RETURN_URL
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.RETURN_URL
     *
     * @mbggenerated
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.RETURN_URL
     *
     * @param returnUrl the value for HSPRD.TB_TRADE_RECORD.RETURN_URL
     *
     * @mbggenerated
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.NOTICE_URL
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.NOTICE_URL
     *
     * @mbggenerated
     */
    public String getNoticeUrl() {
        return noticeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.NOTICE_URL
     *
     * @param noticeUrl the value for HSPRD.TB_TRADE_RECORD.NOTICE_URL
     *
     * @mbggenerated
     */
    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl == null ? null : noticeUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.CREATE_DATE
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.CREATE_DATE
     *
     * @param createDate the value for HSPRD.TB_TRADE_RECORD.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.CREATE_BY
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.CREATE_BY
     *
     * @mbggenerated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.CREATE_BY
     *
     * @param createBy the value for HSPRD.TB_TRADE_RECORD.CREATE_BY
     *
     * @mbggenerated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.UPDATE_DATE
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.UPDATE_DATE
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.UPDATE_DATE
     *
     * @param updateDate the value for HSPRD.TB_TRADE_RECORD.UPDATE_DATE
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.UPDATE_BY
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.UPDATE_BY
     *
     * @mbggenerated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.UPDATE_BY
     *
     * @param updateBy the value for HSPRD.TB_TRADE_RECORD.UPDATE_BY
     *
     * @mbggenerated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HSPRD.TB_TRADE_RECORD.REMARK
     *
     * @return the value of HSPRD.TB_TRADE_RECORD.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HSPRD.TB_TRADE_RECORD.REMARK
     *
     * @param remark the value for HSPRD.TB_TRADE_RECORD.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}