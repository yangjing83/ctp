/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcMarketDataAsk45Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataAsk45Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataAsk45Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcMarketDataAsk45Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAskPrice4(double value) {
    ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskVolume4_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return ThostTradeApiJNI.CThostFtdcMarketDataAsk45Field_AskVolume5_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataAsk45Field() {
    this(ThostTradeApiJNI.new_CThostFtdcMarketDataAsk45Field(), true);
  }

}
