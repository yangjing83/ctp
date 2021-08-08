/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncDeltaInvstCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInvstCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInvstCommRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncDeltaInvstCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInvstCommRateField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInvstCommRateField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncDeltaInvstCommRateField(), true);
  }

}
