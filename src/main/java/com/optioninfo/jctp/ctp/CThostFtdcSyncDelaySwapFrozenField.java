/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncDelaySwapFrozenField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDelaySwapFrozenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDelaySwapFrozenField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncDelaySwapFrozenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDelaySwapSeqNo(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromRemainSwap(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_FromRemainSwap_set(swigCPtr, this, value);
  }

  public double getFromRemainSwap() {
    return ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_FromRemainSwap_get(swigCPtr, this);
  }

  public void setIsManualSwap(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_IsManualSwap_set(swigCPtr, this, value);
  }

  public int getIsManualSwap() {
    return ThostTradeApiJNI.CThostFtdcSyncDelaySwapFrozenField_IsManualSwap_get(swigCPtr, this);
  }

  public CThostFtdcSyncDelaySwapFrozenField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncDelaySwapFrozenField(), true);
  }

}