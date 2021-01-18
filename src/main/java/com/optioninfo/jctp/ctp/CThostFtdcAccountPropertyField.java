/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcAccountPropertyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAccountPropertyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAccountPropertyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcAccountPropertyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_BankID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_BankAccount_get(swigCPtr, this);
  }

  public void setOpenName(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_OpenName_set(swigCPtr, this, value);
  }

  public String getOpenName() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_OpenName_get(swigCPtr, this);
  }

  public void setOpenBank(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_OpenBank_set(swigCPtr, this, value);
  }

  public String getOpenBank() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_OpenBank_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_IsActive_get(swigCPtr, this);
  }

  public void setAccountSourceType(char value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_AccountSourceType_set(swigCPtr, this, value);
  }

  public char getAccountSourceType() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_AccountSourceType_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_OpenDate_get(swigCPtr, this);
  }

  public void setCancelDate(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_CancelDate_set(swigCPtr, this, value);
  }

  public String getCancelDate() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_CancelDate_get(swigCPtr, this);
  }

  public void setOperatorID(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_OperatorID_set(swigCPtr, this, value);
  }

  public String getOperatorID() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_OperatorID_get(swigCPtr, this);
  }

  public void setOperateDate(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_OperateDate_set(swigCPtr, this, value);
  }

  public String getOperateDate() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_OperateDate_get(swigCPtr, this);
  }

  public void setOperateTime(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_OperateTime_set(swigCPtr, this, value);
  }

  public String getOperateTime() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_OperateTime_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcAccountPropertyField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcAccountPropertyField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcAccountPropertyField() {
    this(ThostTradeApiJNI.new_CThostFtdcAccountPropertyField(), true);
  }

}
