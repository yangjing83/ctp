/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncingInvestorGroupField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorGroupField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorGroupField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncingInvestorGroupField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncingInvestorGroupField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSyncingInvestorGroupField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    ThostTradeApiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return ThostTradeApiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorGroupName(String value) {
    ThostTradeApiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupName_set(swigCPtr, this, value);
  }

  public String getInvestorGroupName() {
    return ThostTradeApiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupName_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorGroupField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncingInvestorGroupField(), true);
  }

}