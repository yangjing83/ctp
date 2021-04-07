/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcInvestorPositionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcInvestorPositionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_reserve1_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_InvestorID_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PosiDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPositionDate(char value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionDate_set(swigCPtr, this, value);
  }

  public char getPositionDate() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionDate_get(swigCPtr, this);
  }

  public void setYdPosition(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_YdPosition_set(swigCPtr, this, value);
  }

  public int getYdPosition() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_YdPosition_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_Position_get(swigCPtr, this);
  }

  public void setLongFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_LongFrozen_set(swigCPtr, this, value);
  }

  public int getLongFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_LongFrozen_get(swigCPtr, this);
  }

  public void setShortFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_ShortFrozen_set(swigCPtr, this, value);
  }

  public int getShortFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_ShortFrozen_get(swigCPtr, this);
  }

  public void setLongFrozenAmount(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_LongFrozenAmount_set(swigCPtr, this, value);
  }

  public double getLongFrozenAmount() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_LongFrozenAmount_get(swigCPtr, this);
  }

  public void setShortFrozenAmount(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_ShortFrozenAmount_set(swigCPtr, this, value);
  }

  public double getShortFrozenAmount() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_ShortFrozenAmount_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_OpenVolume_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseVolume_get(swigCPtr, this);
  }

  public void setOpenAmount(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_OpenAmount_set(swigCPtr, this, value);
  }

  public double getOpenAmount() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_OpenAmount_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseAmount_get(swigCPtr, this);
  }

  public void setPositionCost(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionCost_set(swigCPtr, this, value);
  }

  public double getPositionCost() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionCost_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PreMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_UseMargin_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionProfit_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_SettlementPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_SettlementID_get(swigCPtr, this);
  }

  public void setOpenCost(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_OpenCost_set(swigCPtr, this, value);
  }

  public double getOpenCost() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_OpenCost_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setCombPosition(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CombPosition_set(swigCPtr, this, value);
  }

  public int getCombPosition() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CombPosition_get(swigCPtr, this);
  }

  public void setCombLongFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CombLongFrozen_set(swigCPtr, this, value);
  }

  public int getCombLongFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CombLongFrozen_get(swigCPtr, this);
  }

  public void setCombShortFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CombShortFrozen_set(swigCPtr, this, value);
  }

  public int getCombShortFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CombShortFrozen_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setTodayPosition(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_TodayPosition_set(swigCPtr, this, value);
  }

  public int getTodayPosition() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_TodayPosition_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setStrikeFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_StrikeFrozen_set(swigCPtr, this, value);
  }

  public int getStrikeFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_StrikeFrozen_get(swigCPtr, this);
  }

  public void setStrikeFrozenAmount(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_StrikeFrozenAmount_set(swigCPtr, this, value);
  }

  public double getStrikeFrozenAmount() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_StrikeFrozenAmount_get(swigCPtr, this);
  }

  public void setAbandonFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_AbandonFrozen_set(swigCPtr, this, value);
  }

  public int getAbandonFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_AbandonFrozen_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_ExchangeID_get(swigCPtr, this);
  }

  public void setYdStrikeFrozen(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_YdStrikeFrozen_set(swigCPtr, this, value);
  }

  public int getYdStrikeFrozen() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_YdStrikeFrozen_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setPositionCostOffset(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionCostOffset_set(swigCPtr, this, value);
  }

  public double getPositionCostOffset() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_PositionCostOffset_get(swigCPtr, this);
  }

  public void setTasPosition(int value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_TasPosition_set(swigCPtr, this, value);
  }

  public int getTasPosition() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_TasPosition_get(swigCPtr, this);
  }

  public void setTasPositionCost(double value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_TasPositionCost_set(swigCPtr, this, value);
  }

  public double getTasPositionCost() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_TasPositionCost_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcInvestorPositionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcInvestorPositionField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionField() {
    this(ThostTradeApiJNI.new_CThostFtdcInvestorPositionField(), true);
  }

}
