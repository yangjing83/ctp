/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncDeltaInitInvstMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInitInvstMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInitInvstMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncDeltaInitInvstMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setLastRiskTotalInvstMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskTotalInvstMargin_set(swigCPtr, this, value);
  }

  public double getLastRiskTotalInvstMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskTotalInvstMargin_get(swigCPtr, this);
  }

  public void setLastRiskTotalExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskTotalExchMargin_set(swigCPtr, this, value);
  }

  public double getLastRiskTotalExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskTotalExchMargin_get(swigCPtr, this);
  }

  public void setThisSyncInvstMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncInvstMargin_set(swigCPtr, this, value);
  }

  public double getThisSyncInvstMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncInvstMargin_get(swigCPtr, this);
  }

  public void setThisSyncExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncExchMargin_set(swigCPtr, this, value);
  }

  public double getThisSyncExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncExchMargin_get(swigCPtr, this);
  }

  public void setRemainRiskInvstMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskInvstMargin_set(swigCPtr, this, value);
  }

  public double getRemainRiskInvstMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskInvstMargin_get(swigCPtr, this);
  }

  public void setRemainRiskExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskExchMargin_set(swigCPtr, this, value);
  }

  public double getRemainRiskExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskExchMargin_get(swigCPtr, this);
  }

  public void setLastRiskSpecTotalInvstMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskSpecTotalInvstMargin_set(swigCPtr, this, value);
  }

  public double getLastRiskSpecTotalInvstMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskSpecTotalInvstMargin_get(swigCPtr, this);
  }

  public void setLastRiskSpecTotalExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskSpecTotalExchMargin_set(swigCPtr, this, value);
  }

  public double getLastRiskSpecTotalExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_LastRiskSpecTotalExchMargin_get(swigCPtr, this);
  }

  public void setThisSyncSpecInvstMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncSpecInvstMargin_set(swigCPtr, this, value);
  }

  public double getThisSyncSpecInvstMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncSpecInvstMargin_get(swigCPtr, this);
  }

  public void setThisSyncSpecExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncSpecExchMargin_set(swigCPtr, this, value);
  }

  public double getThisSyncSpecExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_ThisSyncSpecExchMargin_get(swigCPtr, this);
  }

  public void setRemainRiskSpecInvstMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskSpecInvstMargin_set(swigCPtr, this, value);
  }

  public double getRemainRiskSpecInvstMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskSpecInvstMargin_get(swigCPtr, this);
  }

  public void setRemainRiskSpecExchMargin(double value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskSpecExchMargin_set(swigCPtr, this, value);
  }

  public double getRemainRiskSpecExchMargin() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_RemainRiskSpecExchMargin_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInitInvstMarginField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInitInvstMarginField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncDeltaInitInvstMarginField(), true);
  }

}