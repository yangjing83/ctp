/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_reserve1_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_TradeID_get(swigCPtr, this);
  }

  public void setTradeTimeStart(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_TradeTimeStart_set(swigCPtr, this, value);
  }

  public String getTradeTimeStart() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_TradeTimeStart_get(swigCPtr, this);
  }

  public void setTradeTimeEnd(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_TradeTimeEnd_set(swigCPtr, this, value);
  }

  public String getTradeTimeEnd() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_TradeTimeEnd_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcQryTradeField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryTradeField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryTradeField(), true);
  }

}
