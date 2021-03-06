/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcTransferBankToFutureReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankToFutureReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankToFutureReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcTransferBankToFutureReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ThostTradeApiJNI.CThostFtdcTransferBankToFutureReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankToFutureReqField() {
    this(ThostTradeApiJNI.new_CThostFtdcTransferBankToFutureReqField(), true);
  }

}
