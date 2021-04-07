/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_reserve1_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_reserve2_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerExecOrderSeq(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerExecOrderSeq() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setReserve3(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_reserve3_set(swigCPtr, this, value);
  }

  public String getReserve3() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_reserve3_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderField() {
    this(ThostTradeApiJNI.new_CThostFtdcExecOrderField(), true);
  }

}
