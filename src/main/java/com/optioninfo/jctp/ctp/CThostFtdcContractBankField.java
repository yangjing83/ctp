/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcContractBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcContractBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcContractBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcContractBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcContractBankField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcContractBankField_BrokerID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcContractBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcContractBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ThostTradeApiJNI.CThostFtdcContractBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ThostTradeApiJNI.CThostFtdcContractBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    ThostTradeApiJNI.CThostFtdcContractBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return ThostTradeApiJNI.CThostFtdcContractBankField_BankName_get(swigCPtr, this);
  }

  public CThostFtdcContractBankField() {
    this(ThostTradeApiJNI.new_CThostFtdcContractBankField(), true);
  }

}
