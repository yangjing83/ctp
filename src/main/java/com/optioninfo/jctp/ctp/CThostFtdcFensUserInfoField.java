/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcFensUserInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcFensUserInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFensUserInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcFensUserInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcFensUserInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcFensUserInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcFensUserInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcFensUserInfoField_UserID_get(swigCPtr, this);
  }

  public void setLoginMode(char value) {
    ThostTradeApiJNI.CThostFtdcFensUserInfoField_LoginMode_set(swigCPtr, this, value);
  }

  public char getLoginMode() {
    return ThostTradeApiJNI.CThostFtdcFensUserInfoField_LoginMode_get(swigCPtr, this);
  }

  public CThostFtdcFensUserInfoField() {
    this(ThostTradeApiJNI.new_CThostFtdcFensUserInfoField(), true);
  }

}
