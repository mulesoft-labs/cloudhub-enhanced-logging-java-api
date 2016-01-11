
package com.mulesoft.cloudhub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SupportedVersion {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("vpnSupported")
    @Expose
    private Boolean vpnSupported;
    @SerializedName("monitoringSupported")
    @Expose
    private Boolean monitoringSupported;
    @SerializedName("persistentQueuesSupported")
    @Expose
    private Boolean persistentQueuesSupported;
    @SerializedName("loggingNgSupported")
    @Expose
    private Boolean loggingNgSupported;
    @SerializedName("log4j1Used")
    @Expose
    private Boolean log4j1Used;

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The vpnSupported
     */
    public Boolean getVpnSupported() {
        return vpnSupported;
    }

    /**
     * 
     * @param vpnSupported
     *     The vpnSupported
     */
    public void setVpnSupported(Boolean vpnSupported) {
        this.vpnSupported = vpnSupported;
    }

    /**
     * 
     * @return
     *     The monitoringSupported
     */
    public Boolean getMonitoringSupported() {
        return monitoringSupported;
    }

    /**
     * 
     * @param monitoringSupported
     *     The monitoringSupported
     */
    public void setMonitoringSupported(Boolean monitoringSupported) {
        this.monitoringSupported = monitoringSupported;
    }

    /**
     * 
     * @return
     *     The persistentQueuesSupported
     */
    public Boolean getPersistentQueuesSupported() {
        return persistentQueuesSupported;
    }

    /**
     * 
     * @param persistentQueuesSupported
     *     The persistentQueuesSupported
     */
    public void setPersistentQueuesSupported(Boolean persistentQueuesSupported) {
        this.persistentQueuesSupported = persistentQueuesSupported;
    }

    /**
     * 
     * @return
     *     The loggingNgSupported
     */
    public Boolean getLoggingNgSupported() {
        return loggingNgSupported;
    }

    /**
     * 
     * @param loggingNgSupported
     *     The loggingNgSupported
     */
    public void setLoggingNgSupported(Boolean loggingNgSupported) {
        this.loggingNgSupported = loggingNgSupported;
    }

    /**
     * 
     * @return
     *     The log4j1Used
     */
    public Boolean getLog4j1Used() {
        return log4j1Used;
    }

    /**
     * 
     * @param log4j1Used
     *     The log4j1Used
     */
    public void setLog4j1Used(Boolean log4j1Used) {
        this.log4j1Used = log4j1Used;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
