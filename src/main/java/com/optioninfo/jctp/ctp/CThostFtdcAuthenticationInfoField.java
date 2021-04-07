/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcAuthenticationInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthenticationInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthenticationInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcAuthenticationInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthInfo(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_set(swigCPtr, this, value);
  }

  public String getAuthInfo() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_get(swigCPtr, this);
  }

  public void setIsResult(int value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_IsResult_set(swigCPtr, this, value);
  }

  public int getIsResult() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_IsResult_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_AppID_get(swigCPtr, this);
  }

  public void setAppType(char value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_AppType_set(swigCPtr, this, value);
  }

  public char getAppType() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_AppType_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_reserve1_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return ThostTradeApiJNI.CThostFtdcAuthenticationInfoField_ClientIPAddress_get(swigCPtr, this);
  }

  public CThostFtdcAuthenticationInfoField() {
    this(ThostTradeApiJNI.new_CThostFtdcAuthenticationInfoField(), true);
  }

}
