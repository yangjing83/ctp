/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryInvestorPositionCombineDetailField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInvestorPositionCombineDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInvestorPositionCombineDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryInvestorPositionCombineDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcQryInvestorPositionCombineDetailField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryInvestorPositionCombineDetailField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryInvestorPositionCombineDetailField(), true);
  }

}
