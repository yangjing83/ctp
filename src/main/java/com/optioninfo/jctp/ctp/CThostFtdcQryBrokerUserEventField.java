/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryBrokerUserEventField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerUserEventField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    ThostTradeApiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return ThostTradeApiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerUserEventField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryBrokerUserEventField(), true);
  }

}
