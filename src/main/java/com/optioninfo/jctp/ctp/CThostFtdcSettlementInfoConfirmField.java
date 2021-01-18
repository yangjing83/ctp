/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSettlementInfoConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSettlementInfoConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSettlementInfoConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
  }

  public void setConfirmDate(String value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_set(swigCPtr, this, value);
  }

  public String getConfirmDate() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_get(swigCPtr, this);
  }

  public void setConfirmTime(String value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_set(swigCPtr, this, value);
  }

  public String getConfirmTime() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_SettlementID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcSettlementInfoConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcSettlementInfoConfirmField() {
    this(ThostTradeApiJNI.new_CThostFtdcSettlementInfoConfirmField(), true);
  }

}