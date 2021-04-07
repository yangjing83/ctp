/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcParkedOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcParkedOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcParkedOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcParkedOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_reserve1_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_RequestID_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParkedOrderID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ParkedOrderID_set(swigCPtr, this, value);
  }

  public String getParkedOrderID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ParkedOrderID_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_UserType_get(swigCPtr, this);
  }

  public void setStatus(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_Status_set(swigCPtr, this, value);
  }

  public char getStatus() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_Status_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_ClientID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcParkedOrderField() {
    this(ThostTradeApiJNI.new_CThostFtdcParkedOrderField(), true);
  }

}
