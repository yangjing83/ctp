/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcInvestorPositionCombineDetailField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionCombineDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionCombineDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcInvestorPositionCombineDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_Direction_get(swigCPtr, this);
  }

  public void setTotalAmt(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_set(swigCPtr, this, value);
  }

  public int getTotalAmt() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_LegID_get(swigCPtr, this);
  }

  public void setLegMultiple(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_set(swigCPtr, this, value);
  }

  public int getLegMultiple() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setTradeGroupID(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_set(swigCPtr, this, value);
  }

  public int getTradeGroupID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionCombineDetailField() {
    this(ThostTradeApiJNI.new_CThostFtdcInvestorPositionCombineDetailField(), true);
  }

}