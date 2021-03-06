/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcUserRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcUserRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcUserRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcUserRightField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcUserRightField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcUserRightField_UserID_get(swigCPtr, this);
  }

  public void setUserRightType(char value) {
    ThostTradeApiJNI.CThostFtdcUserRightField_UserRightType_set(swigCPtr, this, value);
  }

  public char getUserRightType() {
    return ThostTradeApiJNI.CThostFtdcUserRightField_UserRightType_get(swigCPtr, this);
  }

  public void setIsForbidden(int value) {
    ThostTradeApiJNI.CThostFtdcUserRightField_IsForbidden_set(swigCPtr, this, value);
  }

  public int getIsForbidden() {
    return ThostTradeApiJNI.CThostFtdcUserRightField_IsForbidden_get(swigCPtr, this);
  }

  public CThostFtdcUserRightField() {
    this(ThostTradeApiJNI.new_CThostFtdcUserRightField(), true);
  }

}
