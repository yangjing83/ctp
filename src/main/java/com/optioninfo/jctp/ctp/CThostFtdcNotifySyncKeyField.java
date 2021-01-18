/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcNotifySyncKeyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcNotifySyncKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNotifySyncKeyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcNotifySyncKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_UserID_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_Message_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostTradeApiJNI.CThostFtdcNotifySyncKeyField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcNotifySyncKeyField() {
    this(ThostTradeApiJNI.new_CThostFtdcNotifySyncKeyField(), true);
  }

}
