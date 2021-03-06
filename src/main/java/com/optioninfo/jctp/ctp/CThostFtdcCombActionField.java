/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcCombActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_reserve1_get(swigCPtr, this);
  }

  public void setCombActionRef(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_CombActionRef_set(swigCPtr, this, value);
  }

  public String getCombActionRef() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_CombActionRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_UserID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_reserve2_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setReserve3(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_reserve3_set(swigCPtr, this, value);
  }

  public String getReserve3() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_reserve3_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_MacAddress_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ComTradeID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcCombActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcCombActionField() {
    this(ThostTradeApiJNI.new_CThostFtdcCombActionField(), true);
  }

}
