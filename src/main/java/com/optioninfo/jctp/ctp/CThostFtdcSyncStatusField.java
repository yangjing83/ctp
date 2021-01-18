/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSyncStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSyncStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcSyncStatusField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcSyncStatusField_TradingDay_get(swigCPtr, this);
  }

  public void setDataSyncStatus(char value) {
    ThostTradeApiJNI.CThostFtdcSyncStatusField_DataSyncStatus_set(swigCPtr, this, value);
  }

  public char getDataSyncStatus() {
    return ThostTradeApiJNI.CThostFtdcSyncStatusField_DataSyncStatus_get(swigCPtr, this);
  }

  public CThostFtdcSyncStatusField() {
    this(ThostTradeApiJNI.new_CThostFtdcSyncStatusField(), true);
  }

}
