/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.optioninfo.jctp.ctp;

public class CThostFtdcRspTransferField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspTransferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspTransferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostTradeApiJNI.delete_CThostFtdcRspTransferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_InstallID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_FutureSerial_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TradeAmount_get(swigCPtr, this);
  }

  public void setFutureFetchAmount(double value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_FutureFetchAmount_set(swigCPtr, this, value);
  }

  public double getFutureFetchAmount() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_FutureFetchAmount_get(swigCPtr, this);
  }

  public void setFeePayFlag(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_FeePayFlag_set(swigCPtr, this, value);
  }

  public char getFeePayFlag() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_FeePayFlag_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerFee_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_Message_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TID_get(swigCPtr, this);
  }

  public void setTransferStatus(char value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_TransferStatus_set(swigCPtr, this, value);
  }

  public char getTransferStatus() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_TransferStatus_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    ThostTradeApiJNI.CThostFtdcRspTransferField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return ThostTradeApiJNI.CThostFtdcRspTransferField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcRspTransferField() {
    this(ThostTradeApiJNI.new_CThostFtdcRspTransferField(), true);
  }

}
