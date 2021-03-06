/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcQryMaxOrderVolumeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMaxOrderVolumeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMaxOrderVolumeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcQryMaxOrderVolumeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_reserve1_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_MaxVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcQryMaxOrderVolumeField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryMaxOrderVolumeField() {
    this(ThostTradeApiJNI.new_CThostFtdcQryMaxOrderVolumeField(), true);
  }

}
