/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryCommRateModelField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryCommRateModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCommRateModelField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryCommRateModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryCommRateModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryCommRateModelField_BrokerID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    ThostTradeApiJNI.CThostFtdcQryCommRateModelField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return ThostTradeApiJNI.CThostFtdcQryCommRateModelField_CommModelID_get(swigCPtr, this);
  }

  public CThostFtdcQryCommRateModelField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryCommRateModelField(), true);
  }

}
