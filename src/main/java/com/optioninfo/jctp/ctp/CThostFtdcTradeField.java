/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcTradeField_reserve1_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ThostTradeApiJNI.CThostFtdcTradeField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostTradeApiJNI.CThostFtdcTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return ThostTradeApiJNI.CThostFtdcTradeField_reserve2_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ThostTradeApiJNI.CThostFtdcTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    ThostTradeApiJNI.CThostFtdcTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return ThostTradeApiJNI.CThostFtdcTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ThostTradeApiJNI.CThostFtdcTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ThostTradeApiJNI.CThostFtdcTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return ThostTradeApiJNI.CThostFtdcTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostTradeApiJNI.CThostFtdcTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcTradeField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    ThostTradeApiJNI.CThostFtdcTradeField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return ThostTradeApiJNI.CThostFtdcTradeField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    ThostTradeApiJNI.CThostFtdcTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return ThostTradeApiJNI.CThostFtdcTradeField_TradeSource_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostTradeApiJNI.CThostFtdcTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcTradeField() {
    this(ThostTradeApiJNI.new_CThostFtdcTradeField(), true);
  }

}
