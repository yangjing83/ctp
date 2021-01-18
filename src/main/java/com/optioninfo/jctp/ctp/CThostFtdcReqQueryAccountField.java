/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcReqQueryAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqQueryAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqQueryAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcReqQueryAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_Password_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_FutureSerial_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_TID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    ThostTradeApiJNI.CThostFtdcReqQueryAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return ThostTradeApiJNI.CThostFtdcReqQueryAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqQueryAccountField() {
    this(ThostTradeApiJNI.new_CThostFtdcReqQueryAccountField(), true);
  }

}
