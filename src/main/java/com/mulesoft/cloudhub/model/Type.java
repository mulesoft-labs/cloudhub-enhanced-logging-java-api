
package com.mulesoft.cloudhub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Type {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("weight")
    @Expose
    private Float weight;
    @SerializedName("cpu")
    @Expose
    private String cpu;
    @SerializedName("memory")
    @Expose
    private String memory;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * 
     * @param cpu
     *     The cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * 
     * @return
     *     The memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * 
     * @param memory
     *     The memory
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
