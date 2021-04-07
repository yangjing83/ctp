/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcUserSessionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserSessionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserSessionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcUserSessionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_LoginTime_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_reserve1_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_MacAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_LoginRemark_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcUserSessionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcUserSessionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcUserSessionField() {
    this(ThostTradeApiJNI.new_CThostFtdcUserSessionField(), true);
  }

}
