/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcFutureLimitPosiParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcFutureLimitPosiParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFutureLimitPosiParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcFutureLimitPosiParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorRange(char value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_reserve1_get(swigCPtr, this);
  }

  public void setSpecOpenVolume(int value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_SpecOpenVolume_set(swigCPtr, this, value);
  }

  public int getSpecOpenVolume() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_SpecOpenVolume_get(swigCPtr, this);
  }

  public void setArbiOpenVolume(int value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_ArbiOpenVolume_set(swigCPtr, this, value);
  }

  public int getArbiOpenVolume() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_ArbiOpenVolume_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_OpenVolume_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ThostTradeApiJNI.CThostFtdcFutureLimitPosiParamField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcFutureLimitPosiParamField() {
    this(ThostTradeApiJNI.new_CThostFtdcFutureLimitPosiParamField(), true);
  }

}
