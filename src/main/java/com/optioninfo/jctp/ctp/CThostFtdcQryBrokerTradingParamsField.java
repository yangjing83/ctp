/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryBrokerTradingParamsField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBrokerTradingParamsField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerTradingParamsField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryBrokerTradingParamsField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_InvestorID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_CurrencyID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerTradingParamsField_AccountID_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerTradingParamsField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryBrokerTradingParamsField(), true);
  }

}
