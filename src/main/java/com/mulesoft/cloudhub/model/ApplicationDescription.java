
package com.mulesoft.cloudhub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ApplicationDescription {

    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("fullDomain")
    @Expose
    private String fullDomain;
    @SerializedName("properties")
    @Expose
    private Properties properties;
    @SerializedName("propertiesOptions")
    @Expose
    private PropertiesOptions propertiesOptions;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("workers")
    @Expose
    private Workers workers;
    @SerializedName("lastUpdateTime")
    @Expose
    private Long lastUpdateTime;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("muleVersion")
    @Expose
    private MuleVersion muleVersion;
    @SerializedName("supportedVersions")
    @Expose
    private List<SupportedVersion> supportedVersions = new ArrayList<SupportedVersion>();
    @SerializedName("tenants")
    @Expose
    private Long tenants;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("vpnConfig")
    @Expose
    private VpnConfig vpnConfig;
    @SerializedName("persistentQueues")
    @Expose
    private Boolean persistentQueues;
    @SerializedName("persistentQueuesEncryptionEnabled")
    @Expose
    private Boolean persistentQueuesEncryptionEnabled;
    @SerializedName("persistentQueuesEncrypted")
    @Expose
    private Boolean persistentQueuesEncrypted;
    @SerializedName("monitoringEnabled")
    @Expose
    private Boolean monitoringEnabled;
    @SerializedName("monitoringAutoRestart")
    @Expose
    private Boolean monitoringAutoRestart;
    @SerializedName("staticIPsEnabled")
    @Expose
    private Boolean staticIPsEnabled;
    @SerializedName("multitenanted")
    @Expose
    private Boolean multitenanted;
    @SerializedName("hasFile")
    @Expose
    private Boolean hasFile;
    @SerializedName("secureDataGatewayEnabled")
    @Expose
    private Boolean secureDataGatewayEnabled;
    @SerializedName("vpnEnabled")
    @Expose
    private Boolean vpnEnabled;
    @SerializedName("loggingNgEnabled")
    @Expose
    private Boolean loggingNgEnabled;
    @SerializedName("loggingCustomLog4JEnabled")
    @Expose
    private Boolean loggingCustomLog4JEnabled;
    @SerializedName("trackingSettings")
    @Expose
    private TrackingSettings trackingSettings;
    @SerializedName("logLevels")
    @Expose
    private List<Object> logLevels = new ArrayList<Object>();
    @SerializedName("ipAddresses")
    @Expose
    private List<Object> ipAddresses = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 
     * @param domain
     *     The domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * 
     * @return
     *     The fullDomain
     */
    public String getFullDomain() {
        return fullDomain;
    }

    /**
     * 
     * @param fullDomain
     *     The fullDomain
     */
    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    /**
     * 
     * @return
     *     The properties
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     * @param properties
     *     The properties
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 
     * @return
     *     The propertiesOptions
     */
    public PropertiesOptions getPropertiesOptions() {
        return propertiesOptions;
    }

    /**
     * 
     * @param propertiesOptions
     *     The propertiesOptions
     */
    public void setPropertiesOptions(PropertiesOptions propertiesOptions) {
        this.propertiesOptions = propertiesOptions;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The workers
     */
    public Workers getWorkers() {
        return workers;
    }

    /**
     * 
     * @param workers
     *     The workers
     */
    public void setWorkers(Workers workers) {
        this.workers = workers;
    }

    /**
     * 
     * @return
     *     The lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 
     * @param lastUpdateTime
     *     The lastUpdateTime
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 
     * @return
     *     The fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * @param fileName
     *     The fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 
     * @return
     *     The muleVersion
     */
    public MuleVersion getMuleVersion() {
        return muleVersion;
    }

    /**
     * 
     * @param muleVersion
     *     The muleVersion
     */
    public void setMuleVersion(MuleVersion muleVersion) {
        this.muleVersion = muleVersion;
    }

    /**
     * 
     * @return
     *     The supportedVersions
     */
    public List<SupportedVersion> getSupportedVersions() {
        return supportedVersions;
    }

    /**
     * 
     * @param supportedVersions
     *     The supportedVersions
     */
    public void setSupportedVersions(List<SupportedVersion> supportedVersions) {
        this.supportedVersions = supportedVersions;
    }

    /**
     * 
     * @return
     *     The tenants
     */
    public Long getTenants() {
        return tenants;
    }

    /**
     * 
     * @param tenants
     *     The tenants
     */
    public void setTenants(Long tenants) {
        this.tenants = tenants;
    }

    /**
     * 
     * @return
     *     The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * @return
     *     The vpnConfig
     */
    public VpnConfig getVpnConfig() {
        return vpnConfig;
    }

    /**
     * 
     * @param vpnConfig
     *     The vpnConfig
     */
    public void setVpnConfig(VpnConfig vpnConfig) {
        this.vpnConfig = vpnConfig;
    }

    /**
     * 
     * @return
     *     The persistentQueues
     */
    public Boolean getPersistentQueues() {
        return persistentQueues;
    }

    /**
     * 
     * @param persistentQueues
     *     The persistentQueues
     */
    public void setPersistentQueues(Boolean persistentQueues) {
        this.persistentQueues = persistentQueues;
    }

    /**
     * 
     * @return
     *     The persistentQueuesEncryptionEnabled
     */
    public Boolean getPersistentQueuesEncryptionEnabled() {
        return persistentQueuesEncryptionEnabled;
    }

    /**
     * 
     * @param persistentQueuesEncryptionEnabled
     *     The persistentQueuesEncryptionEnabled
     */
    public void setPersistentQueuesEncryptionEnabled(Boolean persistentQueuesEncryptionEnabled) {
        this.persistentQueuesEncryptionEnabled = persistentQueuesEncryptionEnabled;
    }

    /**
     * 
     * @return
     *     The persistentQueuesEncrypted
     */
    public Boolean getPersistentQueuesEncrypted() {
        return persistentQueuesEncrypted;
    }

    /**
     * 
     * @param persistentQueuesEncrypted
     *     The persistentQueuesEncrypted
     */
    public void setPersistentQueuesEncrypted(Boolean persistentQueuesEncrypted) {
        this.persistentQueuesEncrypted = persistentQueuesEncrypted;
    }

    /**
     * 
     * @return
     *     The monitoringEnabled
     */
    public Boolean getMonitoringEnabled() {
        return monitoringEnabled;
    }

    /**
     * 
     * @param monitoringEnabled
     *     The monitoringEnabled
     */
    public void setMonitoringEnabled(Boolean monitoringEnabled) {
        this.monitoringEnabled = monitoringEnabled;
    }

    /**
     * 
     * @return
     *     The monitoringAutoRestart
     */
    public Boolean getMonitoringAutoRestart() {
        return monitoringAutoRestart;
    }

    /**
     * 
     * @param monitoringAutoRestart
     *     The monitoringAutoRestart
     */
    public void setMonitoringAutoRestart(Boolean monitoringAutoRestart) {
        this.monitoringAutoRestart = monitoringAutoRestart;
    }

    /**
     * 
     * @return
     *     The staticIPsEnabled
     */
    public Boolean getStaticIPsEnabled() {
        return staticIPsEnabled;
    }

    /**
     * 
     * @param staticIPsEnabled
     *     The staticIPsEnabled
     */
    public void setStaticIPsEnabled(Boolean staticIPsEnabled) {
        this.staticIPsEnabled = staticIPsEnabled;
    }

    /**
     * 
     * @return
     *     The multitenanted
     */
    public Boolean getMultitenanted() {
        return multitenanted;
    }

    /**
     * 
     * @param multitenanted
     *     The multitenanted
     */
    public void setMultitenanted(Boolean multitenanted) {
        this.multitenanted = multitenanted;
    }

    /**
     * 
     * @return
     *     The hasFile
     */
    public Boolean getHasFile() {
        return hasFile;
    }

    /**
     * 
     * @param hasFile
     *     The hasFile
     */
    public void setHasFile(Boolean hasFile) {
        this.hasFile = hasFile;
    }

    /**
     * 
     * @return
     *     The secureDataGatewayEnabled
     */
    public Boolean getSecureDataGatewayEnabled() {
        return secureDataGatewayEnabled;
    }

    /**
     * 
     * @param secureDataGatewayEnabled
     *     The secureDataGatewayEnabled
     */
    public void setSecureDataGatewayEnabled(Boolean secureDataGatewayEnabled) {
        this.secureDataGatewayEnabled = secureDataGatewayEnabled;
    }

    /**
     * 
     * @return
     *     The vpnEnabled
     */
    public Boolean getVpnEnabled() {
        return vpnEnabled;
    }

    /**
     * 
     * @param vpnEnabled
     *     The vpnEnabled
     */
    public void setVpnEnabled(Boolean vpnEnabled) {
        this.vpnEnabled = vpnEnabled;
    }

    /**
     * 
     * @return
     *     The loggingNgEnabled
     */
    public Boolean getLoggingNgEnabled() {
        return loggingNgEnabled;
    }

    /**
     * 
     * @param loggingNgEnabled
     *     The loggingNgEnabled
     */
    public void setLoggingNgEnabled(Boolean loggingNgEnabled) {
        this.loggingNgEnabled = loggingNgEnabled;
    }

    /**
     * 
     * @return
     *     The loggingCustomLog4JEnabled
     */
    public Boolean getLoggingCustomLog4JEnabled() {
        return loggingCustomLog4JEnabled;
    }

    /**
     * 
     * @param loggingCustomLog4JEnabled
     *     The loggingCustomLog4JEnabled
     */
    public void setLoggingCustomLog4JEnabled(Boolean loggingCustomLog4JEnabled) {
        this.loggingCustomLog4JEnabled = loggingCustomLog4JEnabled;
    }

    /**
     * 
     * @return
     *     The trackingSettings
     */
    public TrackingSettings getTrackingSettings() {
        return trackingSettings;
    }

    /**
     * 
     * @param trackingSettings
     *     The trackingSettings
     */
    public void setTrackingSettings(TrackingSettings trackingSettings) {
        this.trackingSettings = trackingSettings;
    }

    /**
     * 
     * @return
     *     The logLevels
     */
    public List<Object> getLogLevels() {
        return logLevels;
    }

    /**
     * 
     * @param logLevels
     *     The logLevels
     */
    public void setLogLevels(List<Object> logLevels) {
        this.logLevels = logLevels;
    }

    /**
     * 
     * @return
     *     The ipAddresses
     */
    public List<Object> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * 
     * @param ipAddresses
     *     The ipAddresses
     */
    public void setIpAddresses(List<Object> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
