/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcRspAuthenticateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspAuthenticateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspAuthenticateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcRspAuthenticateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcRspAuthenticateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcRspAuthenticateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcRspAuthenticateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcRspAuthenticateField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcRspAuthenticateField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostTradeApiJNI.CThostFtdcRspAuthenticateField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    ThostTradeApiJNI.CThostFtdcRspAuthenticateField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return ThostTradeApiJNI.CThostFtdcRspAuthenticateField_AppID_get(swigCPtr, this);
  }

  public void setAppType(char value) {
    ThostTradeApiJNI.CThostFtdcRspAuthenticateField_AppType_set(swigCPtr, this, value);
  }

  public char getAppType() {
    return ThostTradeApiJNI.CThostFtdcRspAuthenticateField_AppType_get(swigCPtr, this);
  }

  public CThostFtdcRspAuthenticateField() {
    this(ThostTradeApiJNI.new_CThostFtdcRspAuthenticateField(), true);
  }

}
