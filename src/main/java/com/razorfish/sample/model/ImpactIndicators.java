
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ImpactIndicators {

    private String impactIndicatorId;
    private String indicatorColumnName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The impactIndicatorId
     */
    public String getImpactIndicatorId() {
        return impactIndicatorId;
    }

    /**
     * 
     * @param impactIndicatorId
     *     The impact_indicator_id
     */
    public void setImpactIndicatorId(String impactIndicatorId) {
        this.impactIndicatorId = impactIndicatorId;
    }

    /**
     * 
     * @return
     *     The indicatorColumnName
     */
    public String getIndicatorColumnName() {
        return indicatorColumnName;
    }

    /**
     * 
     * @param indicatorColumnName
     *     The indicator_column_name
     */
    public void setIndicatorColumnName(String indicatorColumnName) {
        this.indicatorColumnName = indicatorColumnName;
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
