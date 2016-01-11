
package com.mulesoft.cloudhub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Workers {

    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("amount")
    @Expose
    private Long amount;
    @SerializedName("remainingOrgWorkers")
    @Expose
    private Double remainingOrgWorkers;
    @SerializedName("totalOrgWorkers")
    @Expose
    private Long totalOrgWorkers;

    /**
     * 
     * @return
     *     The type
     */
    public Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The remainingOrgWorkers
     */
    public Double getRemainingOrgWorkers() {
        return remainingOrgWorkers;
    }

    /**
     * 
     * @param remainingOrgWorkers
     *     The remainingOrgWorkers
     */
    public void setRemainingOrgWorkers(Double remainingOrgWorkers) {
        this.remainingOrgWorkers = remainingOrgWorkers;
    }

    /**
     * 
     * @return
     *     The totalOrgWorkers
     */
    public Long getTotalOrgWorkers() {
        return totalOrgWorkers;
    }

    /**
     * 
     * @param totalOrgWorkers
     *     The totalOrgWorkers
     */
    public void setTotalOrgWorkers(Long totalOrgWorkers) {
        this.totalOrgWorkers = totalOrgWorkers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
