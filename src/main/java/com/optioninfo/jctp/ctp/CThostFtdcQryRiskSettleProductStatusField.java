/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryRiskSettleProductStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryRiskSettleProductStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryRiskSettleProductStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryRiskSettleProductStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    ThostTradeApiJNI.CThostFtdcQryRiskSettleProductStatusField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ThostTradeApiJNI.CThostFtdcQryRiskSettleProductStatusField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryRiskSettleProductStatusField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryRiskSettleProductStatusField(), true);
  }

}