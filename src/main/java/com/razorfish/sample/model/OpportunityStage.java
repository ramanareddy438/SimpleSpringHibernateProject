
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class OpportunityStage {

    private String stageId;
    private String stageType;
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
     *     The stageType
     */
    public String getStageType() {
        return stageType;
    }

    /**
     * 
     * @param stageType
     *     The stage_type
     */
    public void setStageType(String stageType) {
        this.stageType = stageType;
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
