/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcVerifyInvestorPasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyInvestorPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyInvestorPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcVerifyInvestorPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcVerifyInvestorPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcVerifyInvestorPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcVerifyInvestorPasswordField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcVerifyInvestorPasswordField_InvestorID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostTradeApiJNI.CThostFtdcVerifyInvestorPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostTradeApiJNI.CThostFtdcVerifyInvestorPasswordField_Password_get(swigCPtr, this);
  }

  public CThostFtdcVerifyInvestorPasswordField() {
    this(ThostTradeApiJNI.new_CThostFtdcVerifyInvestorPasswordField(), true);
  }

}
