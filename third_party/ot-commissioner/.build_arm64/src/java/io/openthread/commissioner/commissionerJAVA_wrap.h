/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_commissionerModule_WRAP_H_
#define SWIG_commissionerModule_WRAP_H_

class SwigDirector_Logger : public ot::commissioner::Logger, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_Logger(JNIEnv *jenv);
    virtual ~SwigDirector_Logger();
    virtual void Log(ot::commissioner::LogLevel aLevel, std::string const &aRegion, std::string const &aMsg);
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

class SwigDirector_CommissionerHandler : public ot::commissioner::CommissionerHandler, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_CommissionerHandler(JNIEnv *jenv);
    virtual std::string OnJoinerRequest(ot::commissioner::ByteArray const &aJoinerId);
    virtual void OnJoinerConnected(ot::commissioner::ByteArray const &aJoinerId, ot::commissioner::Error aError);
    virtual bool OnJoinerFinalize(ot::commissioner::ByteArray const &aJoinerId, std::string const &aVendorName, std::string const &aVendorModel, std::string const &aVendorSwVersion, ot::commissioner::ByteArray const &aVendorStackVersion, std::string const &aProvisioningUrl, ot::commissioner::ByteArray const &aVendorData);
    virtual void OnKeepAliveResponse(ot::commissioner::Error aError);
    virtual void OnPanIdConflict(std::string const &aPeerAddr, ot::commissioner::ChannelMask const &aChannelMask, uint16_t aPanId);
    virtual void OnEnergyReport(std::string const &aPeerAddr, ot::commissioner::ChannelMask const &aChannelMask, ot::commissioner::ByteArray const &aEnergyList);
    virtual void OnDatasetChanged();
    virtual ~SwigDirector_CommissionerHandler();
public:
    bool swig_overrides(int n) {
      return (n < 7 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<7> swig_override;
};


#endif
