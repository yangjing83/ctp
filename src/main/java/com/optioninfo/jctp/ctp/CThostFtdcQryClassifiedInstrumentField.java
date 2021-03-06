/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryClassifiedInstrumentField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryClassifiedInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryClassifiedInstrumentField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryClassifiedInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ProductID_get(swigCPtr, this);
  }

  public void setTradingType(char value) {
    ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_TradingType_set(swigCPtr, this, value);
  }

  public char getTradingType() {
    return ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_TradingType_get(swigCPtr, this);
  }

  public void setClassType(char value) {
    ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ClassType_set(swigCPtr, this, value);
  }

  public char getClassType() {
    return ThostTradeApiJNI.CThostFtdcQryClassifiedInstrumentField_ClassType_get(swigCPtr, this);
  }

  public CThostFtdcQryClassifiedInstrumentField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryClassifiedInstrumentField(), true);
  }

}
