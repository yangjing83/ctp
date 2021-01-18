/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcReqUserLoginWithOTPField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqUserLoginWithOTPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqUserLoginWithOTPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcReqUserLoginWithOTPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_Password_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_MacAddress_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_LoginRemark_get(swigCPtr, this);
  }

  public void setOTPPassword(String value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_OTPPassword_set(swigCPtr, this, value);
  }

  public String getOTPPassword() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_OTPPassword_get(swigCPtr, this);
  }

  public void setClientIPPort(int value) {
    ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPPort_set(swigCPtr, this, value);
  }

  public int getClientIPPort() {
    return ThostTradeApiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPPort_get(swigCPtr, this);
  }

  public CThostFtdcReqUserLoginWithOTPField() {
    this(ThostTradeApiJNI.new_CThostFtdcReqUserLoginWithOTPField(), true);
  }

}
