/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcAuthUserIDField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthUserIDField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthUserIDField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcAuthUserIDField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcAuthUserIDField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcAuthUserIDField_BrokerID_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    ThostTradeApiJNI.CThostFtdcAuthUserIDField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return ThostTradeApiJNI.CThostFtdcAuthUserIDField_AppID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcAuthUserIDField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcAuthUserIDField_UserID_get(swigCPtr, this);
  }

  public void setAuthType(char value) {
    ThostTradeApiJNI.CThostFtdcAuthUserIDField_AuthType_set(swigCPtr, this, value);
  }

  public char getAuthType() {
    return ThostTradeApiJNI.CThostFtdcAuthUserIDField_AuthType_get(swigCPtr, this);
  }

  public CThostFtdcAuthUserIDField() {
    this(ThostTradeApiJNI.new_CThostFtdcAuthUserIDField(), true);
  }

}
