/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryExchangeRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryExchangeRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryExchangeRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryExchangeRateField_BrokerID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeRateField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryExchangeRateField(), true);
  }

}
