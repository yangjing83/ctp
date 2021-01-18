/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcBulletinField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBulletinField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBulletinField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcBulletinField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_TradingDay_get(swigCPtr, this);
  }

  public void setBulletinID(int value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_BulletinID_set(swigCPtr, this, value);
  }

  public int getBulletinID() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_BulletinID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_SequenceNo_get(swigCPtr, this);
  }

  public void setNewsType(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_NewsType_set(swigCPtr, this, value);
  }

  public String getNewsType() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_NewsType_get(swigCPtr, this);
  }

  public void setNewsUrgency(char value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_NewsUrgency_set(swigCPtr, this, value);
  }

  public char getNewsUrgency() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_NewsUrgency_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_SendTime_get(swigCPtr, this);
  }

  public void setAbstract(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_Abstract_set(swigCPtr, this, value);
  }

  public String getAbstract() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_Abstract_get(swigCPtr, this);
  }

  public void setComeFrom(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_ComeFrom_set(swigCPtr, this, value);
  }

  public String getComeFrom() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_ComeFrom_get(swigCPtr, this);
  }

  public void setContent(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_Content_get(swigCPtr, this);
  }

  public void setURLLink(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_URLLink_set(swigCPtr, this, value);
  }

  public String getURLLink() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_URLLink_get(swigCPtr, this);
  }

  public void setMarketID(String value) {
    ThostTradeApiJNI.CThostFtdcBulletinField_MarketID_set(swigCPtr, this, value);
  }

  public String getMarketID() {
    return ThostTradeApiJNI.CThostFtdcBulletinField_MarketID_get(swigCPtr, this);
  }

  public CThostFtdcBulletinField() {
    this(ThostTradeApiJNI.new_CThostFtdcBulletinField(), true);
  }

}
