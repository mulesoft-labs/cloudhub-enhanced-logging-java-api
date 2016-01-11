
package com.mulesoft.cloudhub.model.logging;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Deployment {

    @SerializedName("deploymentId")
    @Expose
    private String deploymentId;
    @SerializedName("createTime")
    @Expose
    private Date createTime;
    @SerializedName("startTime")
    @Expose
    private Date startTime;
    @SerializedName("endTime")
    @Expose
    private Date endTime;
    @SerializedName("instances")
    @Expose
    private List<Instance> instances = new ArrayList<Instance>();

    /**
     * 
     * @return
     *     The deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * 
     * @param deploymentId
     *     The deploymentId
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * 
     * @return
     *     The createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime
     *     The createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return
     *     The startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return
     *     The endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime
     *     The endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 
     * @return
     *     The instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    /**
     * 
     * @param instances
     *     The instances
     */
    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

}
