/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcInputBatchOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputBatchOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputBatchOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcInputBatchOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_reserve1_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcInputBatchOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputBatchOrderActionField() {
    this(ThostTradeApiJNI.new_CThostFtdcInputBatchOrderActionField(), true);
  }

}
