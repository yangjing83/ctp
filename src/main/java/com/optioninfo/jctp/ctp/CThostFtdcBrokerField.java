/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcBrokerField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerAbbr(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerField_BrokerAbbr_set(swigCPtr, this, value);
  }

  public String getBrokerAbbr() {
    return ThostTradeApiJNI.CThostFtdcBrokerField_BrokerAbbr_get(swigCPtr, this);
  }

  public void setBrokerName(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerField_BrokerName_set(swigCPtr, this, value);
  }

  public String getBrokerName() {
    return ThostTradeApiJNI.CThostFtdcBrokerField_BrokerName_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ThostTradeApiJNI.CThostFtdcBrokerField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ThostTradeApiJNI.CThostFtdcBrokerField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcBrokerField() {
    this(ThostTradeApiJNI.new_CThostFtdcBrokerField(), true);
  }

}
