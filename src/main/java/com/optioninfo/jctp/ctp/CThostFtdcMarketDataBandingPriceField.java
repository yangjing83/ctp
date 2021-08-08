/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcMarketDataBandingPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBandingPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBandingPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcMarketDataBandingPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBandingUpperPrice(double value) {
    ThostTradeApiJNI.CThostFtdcMarketDataBandingPriceField_BandingUpperPrice_set(swigCPtr, this, value);
  }

  public double getBandingUpperPrice() {
    return ThostTradeApiJNI.CThostFtdcMarketDataBandingPriceField_BandingUpperPrice_get(swigCPtr, this);
  }

  public void setBandingLowerPrice(double value) {
    ThostTradeApiJNI.CThostFtdcMarketDataBandingPriceField_BandingLowerPrice_set(swigCPtr, this, value);
  }

  public double getBandingLowerPrice() {
    return ThostTradeApiJNI.CThostFtdcMarketDataBandingPriceField_BandingLowerPrice_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBandingPriceField() {
    this(ThostTradeApiJNI.new_CThostFtdcMarketDataBandingPriceField(), true);
  }

}
