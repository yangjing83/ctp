/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcReturnResultField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReturnResultField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReturnResultField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcReturnResultField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReturnCode(String value) {
    ThostTradeApiJNI.CThostFtdcReturnResultField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return ThostTradeApiJNI.CThostFtdcReturnResultField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    ThostTradeApiJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return ThostTradeApiJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcReturnResultField() {
    this(ThostTradeApiJNI.new_CThostFtdcReturnResultField(), true);
  }

}
