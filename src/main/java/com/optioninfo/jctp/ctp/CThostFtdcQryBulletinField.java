/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryBulletinField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBulletinField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBulletinField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryBulletinField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryBulletinField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcQryBulletinField_ExchangeID_get(swigCPtr, this);
  }

  public void setBulletinID(int value) {
    ThostTradeApiJNI.CThostFtdcQryBulletinField_BulletinID_set(swigCPtr, this, value);
  }

  public int getBulletinID() {
    return ThostTradeApiJNI.CThostFtdcQryBulletinField_BulletinID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcQryBulletinField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcQryBulletinField_SequenceNo_get(swigCPtr, this);
  }

  public void setNewsType(String value) {
    ThostTradeApiJNI.CThostFtdcQryBulletinField_NewsType_set(swigCPtr, this, value);
  }

  public String getNewsType() {
    return ThostTradeApiJNI.CThostFtdcQryBulletinField_NewsType_get(swigCPtr, this);
  }

  public void setNewsUrgency(char value) {
    ThostTradeApiJNI.CThostFtdcQryBulletinField_NewsUrgency_set(swigCPtr, this, value);
  }

  public char getNewsUrgency() {
    return ThostTradeApiJNI.CThostFtdcQryBulletinField_NewsUrgency_get(swigCPtr, this);
  }

  public CThostFtdcQryBulletinField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryBulletinField(), true);
  }

}
