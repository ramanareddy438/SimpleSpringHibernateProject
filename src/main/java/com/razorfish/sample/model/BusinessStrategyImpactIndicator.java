
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BusinessStrategyImpactIndicator {

    private String bssId;
    private ImpactIndicators impactIndicators;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The bssId
     */
    public String getBssId() {
        return bssId;
    }

    /**
     * 
     * @param bssId
     *     The bss_id
     */
    public void setBssId(String bssId) {
        this.bssId = bssId;
    }

    /**
     * 
     * @return
     *     The impactIndicators
     */
    public ImpactIndicators getImpactIndicators() {
        return impactIndicators;
    }

    /**
     * 
     * @param impactIndicators
     *     The impact_indicators
     */
    public void setImpactIndicators(ImpactIndicators impactIndicators) {
        this.impactIndicators = impactIndicators;
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
