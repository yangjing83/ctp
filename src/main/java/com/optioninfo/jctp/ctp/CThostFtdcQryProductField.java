/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryProductField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcQryProductField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcQryProductField_reserve1_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    ThostTradeApiJNI.CThostFtdcQryProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return ThostTradeApiJNI.CThostFtdcQryProductField_ProductClass_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcQryProductField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    ThostTradeApiJNI.CThostFtdcQryProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ThostTradeApiJNI.CThostFtdcQryProductField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryProductField(), true);
  }

}
