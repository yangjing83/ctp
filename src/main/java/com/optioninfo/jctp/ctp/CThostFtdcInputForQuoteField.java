/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcInputForQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputForQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcInputForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteRef(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_ForQuoteRef_set(swigCPtr, this, value);
  }

  public String getForQuoteRef() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_ForQuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcInputForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcInputForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputForQuoteField() {
    this(ThostTradeApiJNI.new_CThostFtdcInputForQuoteField(), true);
  }

}