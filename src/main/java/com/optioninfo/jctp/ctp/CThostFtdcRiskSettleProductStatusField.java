/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcRiskSettleProductStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRiskSettleProductStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRiskSettleProductStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcRiskSettleProductStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcRiskSettleProductStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcRiskSettleProductStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    ThostTradeApiJNI.CThostFtdcRiskSettleProductStatusField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ThostTradeApiJNI.CThostFtdcRiskSettleProductStatusField_ProductID_get(swigCPtr, this);
  }

  public void setProductStatus(char value) {
    ThostTradeApiJNI.CThostFtdcRiskSettleProductStatusField_ProductStatus_set(swigCPtr, this, value);
  }

  public char getProductStatus() {
    return ThostTradeApiJNI.CThostFtdcRiskSettleProductStatusField_ProductStatus_get(swigCPtr, this);
  }

  public CThostFtdcRiskSettleProductStatusField() {
    this(ThostTradeApiJNI.new_CThostFtdcRiskSettleProductStatusField(), true);
  }

}
