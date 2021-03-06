/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcCFMMCTradingAccountTokenField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCFMMCTradingAccountTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCTradingAccountTokenField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcCFMMCTradingAccountTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_get(swigCPtr, this);
  }

  public void setToken(String value) {
    ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_Token_set(swigCPtr, this, value);
  }

  public String getToken() {
    return ThostTradeApiJNI.CThostFtdcCFMMCTradingAccountTokenField_Token_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCTradingAccountTokenField() {
    this(ThostTradeApiJNI.new_CThostFtdcCFMMCTradingAccountTokenField(), true);
  }

}
