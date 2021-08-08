/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncDeltaInvstPosDtlField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInvstPosDtlField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInvstPosDtlField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncDeltaInvstPosDtlField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Direction_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenDate_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Volume_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementID_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeType_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchangeID_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setPositionProfitByDate(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByDate_set(swigCPtr, this, value);
  }

  public double getPositionProfitByDate() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByDate_get(swigCPtr, this);
  }

  public void setPositionProfitByTrade(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByTrade_set(swigCPtr, this, value);
  }

  public double getPositionProfitByTrade() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByTrade_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLastSettlementPrice(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_LastSettlementPrice_set(swigCPtr, this, value);
  }

  public double getLastSettlementPrice() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_LastSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseVolume_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseAmount_get(swigCPtr, this);
  }

  public void setTimeFirstVolume(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TimeFirstVolume_set(swigCPtr, this, value);
  }

  public int getTimeFirstVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TimeFirstVolume_get(swigCPtr, this);
  }

  public void setSpecPosiType(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SpecPosiType_set(swigCPtr, this, value);
  }

  public char getSpecPosiType() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SpecPosiType_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInvstPosDtlField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncDeltaInvstPosDtlField(), true);
  }

}