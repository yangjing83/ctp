/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcSecAgentTradeInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSecAgentTradeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSecAgentTradeInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcSecAgentTradeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return ThostTradeApiJNI.CThostFtdcSecAgentTradeInfoField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcSecAgentTradeInfoField() {
    this(ThostTradeApiJNI.new_CThostFtdcSecAgentTradeInfoField(), true);
  }

}
