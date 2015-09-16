
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MAudience {

    private String mAudienceId;
    private String audienceType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mAudienceId
     */
    public String getMAudienceId() {
        return mAudienceId;
    }

    /**
     * 
     * @param mAudienceId
     *     The m_audience_id
     */
    public void setMAudienceId(String mAudienceId) {
        this.mAudienceId = mAudienceId;
    }

    /**
     * 
     * @return
     *     The audienceType
     */
    public String getAudienceType() {
        return audienceType;
    }

    /**
     * 
     * @param audienceType
     *     The audience_type
     */
    public void setAudienceType(String audienceType) {
        this.audienceType = audienceType;
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
