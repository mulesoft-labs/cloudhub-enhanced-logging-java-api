
package com.mulesoft.cloudhub.model.logging;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class DeploymentList {

    @SerializedName("data")
    @Expose
    private List<Deployment> data = new ArrayList<Deployment>();
    @SerializedName("total")
    @Expose
    private Long total;

    /**
     * 
     * @return
     *     The data
     */
    public List<Deployment> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<Deployment> data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

}
