/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcTradeParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradeParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradeParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcTradeParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcTradeParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcTradeParamField_BrokerID_get(swigCPtr, this);
  }

  public void setTradeParamID(char value) {
    ThostTradeApiJNI.CThostFtdcTradeParamField_TradeParamID_set(swigCPtr, this, value);
  }

  public char getTradeParamID() {
    return ThostTradeApiJNI.CThostFtdcTradeParamField_TradeParamID_get(swigCPtr, this);
  }

  public void setTradeParamValue(String value) {
    ThostTradeApiJNI.CThostFtdcTradeParamField_TradeParamValue_set(swigCPtr, this, value);
  }

  public String getTradeParamValue() {
    return ThostTradeApiJNI.CThostFtdcTradeParamField_TradeParamValue_get(swigCPtr, this);
  }

  public void setMemo(String value) {
    ThostTradeApiJNI.CThostFtdcTradeParamField_Memo_set(swigCPtr, this, value);
  }

  public String getMemo() {
    return ThostTradeApiJNI.CThostFtdcTradeParamField_Memo_get(swigCPtr, this);
  }

  public CThostFtdcTradeParamField() {
    this(ThostTradeApiJNI.new_CThostFtdcTradeParamField(), true);
  }

}
