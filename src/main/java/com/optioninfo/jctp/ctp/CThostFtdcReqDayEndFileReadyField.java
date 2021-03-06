/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcReqDayEndFileReadyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqDayEndFileReadyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqDayEndFileReadyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcReqDayEndFileReadyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_SessionID_get(swigCPtr, this);
  }

  public void setFileBusinessCode(char value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_FileBusinessCode_set(swigCPtr, this, value);
  }

  public char getFileBusinessCode() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_FileBusinessCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostTradeApiJNI.CThostFtdcReqDayEndFileReadyField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcReqDayEndFileReadyField() {
    this(ThostTradeApiJNI.new_CThostFtdcReqDayEndFileReadyField(), true);
  }

}
