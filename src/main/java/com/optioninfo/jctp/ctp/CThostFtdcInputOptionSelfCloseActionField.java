/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcInputOptionSelfCloseActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputOptionSelfCloseActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputOptionSelfCloseActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcInputOptionSelfCloseActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseActionRef(int value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseActionRef_set(swigCPtr, this, value);
  }

  public int getOptionSelfCloseActionRef() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseActionRef_get(swigCPtr, this);
  }

  public void setOptionSelfCloseRef(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseRef_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseRef() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_UserID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_reserve1_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcInputOptionSelfCloseActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputOptionSelfCloseActionField() {
    this(ThostTradeApiJNI.new_CThostFtdcInputOptionSelfCloseActionField(), true);
  }

}
