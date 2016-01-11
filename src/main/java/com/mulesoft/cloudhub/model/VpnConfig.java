
package com.mulesoft.cloudhub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class VpnConfig {

    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("mask")
    @Expose
    private Long mask;

    /**
     * 
     * @return
     *     The network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * 
     * @param network
     *     The network
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * 
     * @return
     *     The mask
     */
    public Long getMask() {
        return mask;
    }

    /**
     * 
     * @param mask
     *     The mask
     */
    public void setMask(Long mask) {
        this.mask = mask;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
