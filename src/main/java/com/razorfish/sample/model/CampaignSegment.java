
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CampaignSegment {

    private String campaignSegmentId;
    private MSegment mSegment;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The campaignSegmentId
     */
    public String getCampaignSegmentId() {
        return campaignSegmentId;
    }

    /**
     * 
     * @param campaignSegmentId
     *     The campaign_segment_id
     */
    public void setCampaignSegmentId(String campaignSegmentId) {
        this.campaignSegmentId = campaignSegmentId;
    }

    /**
     * 
     * @return
     *     The mSegment
     */
    public MSegment getMSegment() {
        return mSegment;
    }

    /**
     * 
     * @param mSegment
     *     The m_segment
     */
    public void setMSegment(MSegment mSegment) {
        this.mSegment = mSegment;
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
