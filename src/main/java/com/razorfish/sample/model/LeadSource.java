
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class LeadSource {

    private String leadSourceId;
    private String leadSourceType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The leadSourceId
     */
    public String getLeadSourceId() {
        return leadSourceId;
    }

    /**
     * 
     * @param leadSourceId
     *     The lead_source_id
     */
    public void setLeadSourceId(String leadSourceId) {
        this.leadSourceId = leadSourceId;
    }

    /**
     * 
     * @return
     *     The leadSourceType
     */
    public String getLeadSourceType() {
        return leadSourceType;
    }

    /**
     * 
     * @param leadSourceType
     *     The lead_source_type
     */
    public void setLeadSourceType(String leadSourceType) {
        this.leadSourceType = leadSourceType;
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
