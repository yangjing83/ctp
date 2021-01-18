/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcNotifyFutureSignInField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcNotifyFutureSignInField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNotifyFutureSignInField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcNotifyFutureSignInField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_ErrorMsg_get(swigCPtr, this);
  }

  public void setPinKey(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_PinKey_set(swigCPtr, this, value);
  }

  public String getPinKey() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_PinKey_get(swigCPtr, this);
  }

  public void setMacKey(String value) {
    ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_MacKey_set(swigCPtr, this, value);
  }

  public String getMacKey() {
    return ThostTradeApiJNI.CThostFtdcNotifyFutureSignInField_MacKey_get(swigCPtr, this);
  }

  public CThostFtdcNotifyFutureSignInField() {
    this(ThostTradeApiJNI.new_CThostFtdcNotifyFutureSignInField(), true);
  }

}