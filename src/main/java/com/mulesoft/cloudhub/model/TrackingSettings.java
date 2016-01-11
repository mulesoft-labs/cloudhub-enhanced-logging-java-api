
package com.mulesoft.cloudhub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TrackingSettings {

    @SerializedName("trackingLevel")
    @Expose
    private String trackingLevel;

    /**
     * 
     * @return
     *     The trackingLevel
     */
    public String getTrackingLevel() {
        return trackingLevel;
    }

    /**
     * 
     * @param trackingLevel
     *     The trackingLevel
     */
    public void setTrackingLevel(String trackingLevel) {
        this.trackingLevel = trackingLevel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
