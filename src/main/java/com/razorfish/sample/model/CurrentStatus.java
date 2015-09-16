
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CurrentStatus {

    private String stageId;
    private String saleStage;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The stageId
     */
    public String getStageId() {
        return stageId;
    }

    /**
     * 
     * @param stageId
     *     The stage_id
     */
    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    /**
     * 
     * @return
     *     The saleStage
     */
    public String getSaleStage() {
        return saleStage;
    }

    /**
     * 
     * @param saleStage
     *     The sale_stage
     */
    public void setSaleStage(String saleStage) {
        this.saleStage = saleStage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
