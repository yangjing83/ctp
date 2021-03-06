/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcBrokerTradingParamsField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerTradingParamsField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerTradingParamsField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcBrokerTradingParamsField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_InvestorID_get(swigCPtr, this);
  }

  public void setMarginPriceType(char value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_set(swigCPtr, this, value);
  }

  public char getMarginPriceType() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_get(swigCPtr, this);
  }

  public void setAlgorithm(char value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_Algorithm_set(swigCPtr, this, value);
  }

  public char getAlgorithm() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_Algorithm_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_get(swigCPtr, this);
  }

  public void setOptionRoyaltyPriceType(char value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_set(swigCPtr, this, value);
  }

  public char getOptionRoyaltyPriceType() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcBrokerTradingParamsField_AccountID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerTradingParamsField() {
    this(ThostTradeApiJNI.new_CThostFtdcBrokerTradingParamsField(), true);
  }

}
