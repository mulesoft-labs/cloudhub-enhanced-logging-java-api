
package com.mulesoft.cloudhub.model.logging;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Log {

    @SerializedName("loggerName")
    @Expose
    private String loggerName;
    @SerializedName("threadName")
    @Expose
    private String threadName;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("tenantId")
    @Expose
    private String tenantId;
    @SerializedName("instanceId")
    @Expose
    private String instanceId;

    /**
     * 
     * @return
     *     The loggerName
     */
    public String getLoggerName() {
        return loggerName;
    }

    /**
     * 
     * @param loggerName
     *     The loggerName
     */
    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    /**
     * 
     * @return
     *     The threadName
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * 
     * @param threadName
     *     The threadName
     */
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * 
     * @param tenantId
     *     The tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

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

}
