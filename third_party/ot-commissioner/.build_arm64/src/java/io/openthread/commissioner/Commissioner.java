/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.openthread.commissioner;

public class Commissioner {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Commissioner(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Commissioner obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        commissionerModuleJNI.delete_Commissioner(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Commissioner create(CommissionerHandler aHandler) {
    long cPtr = commissionerModuleJNI.Commissioner_create(CommissionerHandler.getCPtr(aHandler), aHandler);
    return (cPtr == 0) ? null : new Commissioner(cPtr, true);
  }

  public Error init(Config aConfig) {
    return new Error(commissionerModuleJNI.Commissioner_init(swigCPtr, this, Config.getCPtr(aConfig), aConfig), true);
  }

  public Config getConfig() {
    return new Config(commissionerModuleJNI.Commissioner_getConfig(swigCPtr, this), false);
  }

  public Error connect(String aAddr, int aPort) {
    return new Error(commissionerModuleJNI.Commissioner_connect(swigCPtr, this, aAddr, aPort), true);
  }

  public void disconnect() {
    commissionerModuleJNI.Commissioner_disconnect(swigCPtr, this);
  }

  public int getSessionId() {
    return commissionerModuleJNI.Commissioner_getSessionId(swigCPtr, this);
  }

  public State getState() {
    return State.swigToEnum(commissionerModuleJNI.Commissioner_getState(swigCPtr, this));
  }

  public boolean isActive() {
    return commissionerModuleJNI.Commissioner_isActive(swigCPtr, this);
  }

  public boolean isCcmMode() {
    return commissionerModuleJNI.Commissioner_isCcmMode(swigCPtr, this);
  }

  public String getDomainName() {
    return commissionerModuleJNI.Commissioner_getDomainName(swigCPtr, this);
  }

  public void cancelRequests() {
    commissionerModuleJNI.Commissioner_cancelRequests(swigCPtr, this);
  }

  public Error petition(String[] aExistingCommissionerId, String aAddr, int aPort) {
    return new Error(commissionerModuleJNI.Commissioner_petition(swigCPtr, this, aExistingCommissionerId, aAddr, aPort), true);
  }

  public Error resign() {
    return new Error(commissionerModuleJNI.Commissioner_resign(swigCPtr, this), true);
  }

  public Error getCommissionerDataset(CommissionerDataset aDataset, int aDatasetFlags) {
    return new Error(commissionerModuleJNI.Commissioner_getCommissionerDataset(swigCPtr, this, CommissionerDataset.getCPtr(aDataset), aDataset, aDatasetFlags), true);
  }

  public Error setCommissionerDataset(CommissionerDataset aDataset) {
    return new Error(commissionerModuleJNI.Commissioner_setCommissionerDataset(swigCPtr, this, CommissionerDataset.getCPtr(aDataset), aDataset), true);
  }

  public Error setBbrDataset(BbrDataset aDataset) {
    return new Error(commissionerModuleJNI.Commissioner_setBbrDataset(swigCPtr, this, BbrDataset.getCPtr(aDataset), aDataset), true);
  }

  public Error getBbrDataset(BbrDataset aDataset, int aDatasetFlags) {
    return new Error(commissionerModuleJNI.Commissioner_getBbrDataset(swigCPtr, this, BbrDataset.getCPtr(aDataset), aDataset, aDatasetFlags), true);
  }

  public Error getActiveDataset(ActiveOperationalDataset aDataset, int aDatasetFlags) {
    return new Error(commissionerModuleJNI.Commissioner_getActiveDataset(swigCPtr, this, ActiveOperationalDataset.getCPtr(aDataset), aDataset, aDatasetFlags), true);
  }

  public Error getRawActiveDataset(ByteArray aRawDataset, int aDatasetFlags) {
    return new Error(commissionerModuleJNI.Commissioner_getRawActiveDataset(swigCPtr, this, ByteArray.getCPtr(aRawDataset), aRawDataset, aDatasetFlags), true);
  }

  public Error setActiveDataset(ActiveOperationalDataset aActiveDataset) {
    return new Error(commissionerModuleJNI.Commissioner_setActiveDataset(swigCPtr, this, ActiveOperationalDataset.getCPtr(aActiveDataset), aActiveDataset), true);
  }

  public Error getPendingDataset(PendingOperationalDataset aDataset, int aDatasetFlags) {
    return new Error(commissionerModuleJNI.Commissioner_getPendingDataset(swigCPtr, this, PendingOperationalDataset.getCPtr(aDataset), aDataset, aDatasetFlags), true);
  }

  public Error setPendingDataset(PendingOperationalDataset aPendingDataset) {
    return new Error(commissionerModuleJNI.Commissioner_setPendingDataset(swigCPtr, this, PendingOperationalDataset.getCPtr(aPendingDataset), aPendingDataset), true);
  }

  public Error setSecurePendingDataset(String aPbbrAddr, long aMaxRetrievalTimer, PendingOperationalDataset aDataset) {
    return new Error(commissionerModuleJNI.Commissioner_setSecurePendingDataset(swigCPtr, this, aPbbrAddr, aMaxRetrievalTimer, PendingOperationalDataset.getCPtr(aDataset), aDataset), true);
  }

  public Error commandReenroll(String aDstAddr) {
    return new Error(commissionerModuleJNI.Commissioner_commandReenroll(swigCPtr, this, aDstAddr), true);
  }

  public Error commandDomainReset(String aDstAddr) {
    return new Error(commissionerModuleJNI.Commissioner_commandDomainReset(swigCPtr, this, aDstAddr), true);
  }

  public Error commandMigrate(String aDstAddr, String aDesignatedNetwork) {
    return new Error(commissionerModuleJNI.Commissioner_commandMigrate(swigCPtr, this, aDstAddr, aDesignatedNetwork), true);
  }

  public Error announceBegin(long aChannelMask, short aCount, int aPeriod, String aDstAddr) {
    return new Error(commissionerModuleJNI.Commissioner_announceBegin(swigCPtr, this, aChannelMask, aCount, aPeriod, aDstAddr), true);
  }

  public Error panIdQuery(long aChannelMask, int aPanId, String aDstAddr) {
    return new Error(commissionerModuleJNI.Commissioner_panIdQuery(swigCPtr, this, aChannelMask, aPanId, aDstAddr), true);
  }

  public Error energyScan(long aChannelMask, short aCount, int aPeriod, int aScanDuration, String aDstAddr) {
    return new Error(commissionerModuleJNI.Commissioner_energyScan(swigCPtr, this, aChannelMask, aCount, aPeriod, aScanDuration, aDstAddr), true);
  }

  public Error registerMulticastListener(short[] aStatus, String aPbbrAddr, StringVector aMulticastAddrList, long aTimeout) {
    return new Error(commissionerModuleJNI.Commissioner_registerMulticastListener(swigCPtr, this, aStatus, aPbbrAddr, StringVector.getCPtr(aMulticastAddrList), aMulticastAddrList, aTimeout), true);
  }

  public Error requestToken(ByteArray aSignedToken, String aAddr, int aPort) {
    return new Error(commissionerModuleJNI.Commissioner_requestToken(swigCPtr, this, ByteArray.getCPtr(aSignedToken), aSignedToken, aAddr, aPort), true);
  }

  public Error setToken(ByteArray aSignedToken) {
    return new Error(commissionerModuleJNI.Commissioner_setToken(swigCPtr, this, ByteArray.getCPtr(aSignedToken), aSignedToken), true);
  }

  public static Error generatePSKc(ByteArray aPSKc, String aPassphrase, String aNetworkName, ByteArray aExtendedPanId) {
    return new Error(commissionerModuleJNI.Commissioner_generatePSKc(ByteArray.getCPtr(aPSKc), aPSKc, aPassphrase, aNetworkName, ByteArray.getCPtr(aExtendedPanId), aExtendedPanId), true);
  }

  public static ByteArray computeJoinerId(java.math.BigInteger aEui64) {
    return new ByteArray(commissionerModuleJNI.Commissioner_computeJoinerId(aEui64), true);
  }

  public static void addJoiner(ByteArray aSteeringData, ByteArray aJoinerId) {
    commissionerModuleJNI.Commissioner_addJoiner(ByteArray.getCPtr(aSteeringData), aSteeringData, ByteArray.getCPtr(aJoinerId), aJoinerId);
  }

  public static Error getMeshLocalAddr(String[] aMeshLocalAddr, String aMeshLocalPrefix, int aLocator16) {
    return new Error(commissionerModuleJNI.Commissioner_getMeshLocalAddr(aMeshLocalAddr, aMeshLocalPrefix, aLocator16), true);
  }

}
