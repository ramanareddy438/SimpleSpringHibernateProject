
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CampaignAudience {

    private String campaignAudienceId;
    private MAudience mAudience;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The campaignAudienceId
     */
    public String getCampaignAudienceId() {
        return campaignAudienceId;
    }

    /**
     * 
     * @param campaignAudienceId
     *     The campaign_audience_id
     */
    public void setCampaignAudienceId(String campaignAudienceId) {
        this.campaignAudienceId = campaignAudienceId;
    }

    /**
     * 
     * @return
     *     The mAudience
     */
    public MAudience getMAudience() {
        return mAudience;
    }

    /**
     * 
     * @param mAudience
     *     The m_audience
     */
    public void setMAudience(MAudience mAudience) {
        this.mAudience = mAudience;
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
