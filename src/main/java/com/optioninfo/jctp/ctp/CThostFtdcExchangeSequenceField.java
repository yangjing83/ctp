/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcExchangeSequenceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeSequenceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeSequenceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcExchangeSequenceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcExchangeSequenceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcExchangeSequenceField_ExchangeID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcExchangeSequenceField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcExchangeSequenceField_SequenceNo_get(swigCPtr, this);
  }

  public void setMarketStatus(char value) {
    ThostTradeApiJNI.CThostFtdcExchangeSequenceField_MarketStatus_set(swigCPtr, this, value);
  }

  public char getMarketStatus() {
    return ThostTradeApiJNI.CThostFtdcExchangeSequenceField_MarketStatus_get(swigCPtr, this);
  }

  public CThostFtdcExchangeSequenceField() {
    this(ThostTradeApiJNI.new_CThostFtdcExchangeSequenceField(), true);
  }

}
