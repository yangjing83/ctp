/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryTransferSerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryTransferSerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTransferSerialField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryTransferSerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTransferSerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryTransferSerialField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTransferSerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcQryTransferSerialField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTransferSerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcQryTransferSerialField_BankID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcQryTransferSerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcQryTransferSerialField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryTransferSerialField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryTransferSerialField(), true);
  }

}
