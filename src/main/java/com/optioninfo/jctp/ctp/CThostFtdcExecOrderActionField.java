/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcExecOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExecOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcExecOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setExecOrderActionRef(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_set(swigCPtr, this, value);
  }

  public int getExecOrderActionRef() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_ActionType_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostTradeApiJNI.CThostFtdcExecOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostTradeApiJNI.CThostFtdcExecOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderActionField() {
    this(ThostTradeApiJNI.new_CThostFtdcExecOrderActionField(), true);
  }

}
