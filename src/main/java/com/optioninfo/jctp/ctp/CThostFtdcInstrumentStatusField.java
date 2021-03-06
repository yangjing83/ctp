/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcInstrumentStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_reserve1_get(swigCPtr, this);
  }

  public void setSettlementGroupID(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_set(swigCPtr, this, value);
  }

  public String getSettlementGroupID() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_reserve2_get(swigCPtr, this);
  }

  public void setInstrumentStatus(char value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_set(swigCPtr, this, value);
  }

  public char getInstrumentStatus() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_get(swigCPtr, this);
  }

  public void setTradingSegmentSN(int value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_set(swigCPtr, this, value);
  }

  public int getTradingSegmentSN() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_get(swigCPtr, this);
  }

  public void setEnterTime(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_EnterTime_set(swigCPtr, this, value);
  }

  public String getEnterTime() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_EnterTime_get(swigCPtr, this);
  }

  public void setEnterReason(char value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_EnterReason_set(swigCPtr, this, value);
  }

  public char getEnterReason() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_EnterReason_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcInstrumentStatusField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcInstrumentStatusField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentStatusField() {
    this(ThostTradeApiJNI.new_CThostFtdcInstrumentStatusField(), true);
  }

}
