/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcForQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteRef(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ForQuoteRef_set(swigCPtr, this, value);
  }

  public String getForQuoteRef() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ForQuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_UserID_get(swigCPtr, this);
  }

  public void setForQuoteLocalID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ForQuoteLocalID_set(swigCPtr, this, value);
  }

  public String getForQuoteLocalID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ForQuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setForQuoteStatus(char value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ForQuoteStatus_set(swigCPtr, this, value);
  }

  public char getForQuoteStatus() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ForQuoteStatus_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_SessionID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerForQutoSeq(int value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_BrokerForQutoSeq_set(swigCPtr, this, value);
  }

  public int getBrokerForQutoSeq() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_BrokerForQutoSeq_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteField() {
    this(ThostTradeApiJNI.new_CThostFtdcForQuoteField(), true);
  }

}