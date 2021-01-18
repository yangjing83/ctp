/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcParkedOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcParkedOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcParkedOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcParkedOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setParkedOrderActionID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ParkedOrderActionID_set(swigCPtr, this, value);
  }

  public String getParkedOrderActionID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ParkedOrderActionID_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_UserType_get(swigCPtr, this);
  }

  public void setStatus(char value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_Status_set(swigCPtr, this, value);
  }

  public char getStatus() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_Status_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcParkedOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcParkedOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcParkedOrderActionField() {
    this(ThostTradeApiJNI.new_CThostFtdcParkedOrderActionField(), true);
  }

}