/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncDeltaInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncDeltaInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSyncDeltaSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public void setSyncDeltaStatus(char value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaStatus_set(swigCPtr, this, value);
  }

  public char getSyncDeltaStatus() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaStatus_get(swigCPtr, this);
  }

  public void setSyncDescription(String value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_SyncDescription_set(swigCPtr, this, value);
  }

  public String getSyncDescription() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_SyncDescription_get(swigCPtr, this);
  }

  public void setIsOnlyTrdDelta(int value) {
    ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_IsOnlyTrdDelta_set(swigCPtr, this, value);
  }

  public int getIsOnlyTrdDelta() {
    return ThostTradeApiJNI.CThostFtdcSyncDeltaInfoField_IsOnlyTrdDelta_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInfoField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncDeltaInfoField(), true);
  }

}
