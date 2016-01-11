
package com.mulesoft.cloudhub.model.logging;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Instance {

    @SerializedName("instanceId")
    @Expose
    private String instanceId;
    @SerializedName("publicIPAddress")
    @Expose
    private String publicIPAddress;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("region")
    @Expose
    private String region;

    /**
     * 
     * @return
     *     The instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 
     * @param instanceId
     *     The instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * 
     * @return
     *     The publicIPAddress
     */
    public String getPublicIPAddress() {
        return publicIPAddress;
    }

    /**
     * 
     * @param publicIPAddress
     *     The publicIPAddress
     */
    public void setPublicIPAddress(String publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
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
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

}
