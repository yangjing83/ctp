/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQueryFreqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQueryFreqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQueryFreqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQueryFreqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setQueryFreq(int value) {
    ThostTradeApiJNI.CThostFtdcQueryFreqField_QueryFreq_set(swigCPtr, this, value);
  }

  public int getQueryFreq() {
    return ThostTradeApiJNI.CThostFtdcQueryFreqField_QueryFreq_get(swigCPtr, this);
  }

  public CThostFtdcQueryFreqField() {
    this(ThostTradeApiJNI.new_CThostFtdcQueryFreqField(), true);
  }

}