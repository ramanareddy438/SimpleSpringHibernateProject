
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CampaignLead {

    private String campaignLeadId;
    private String leadCaptureDate;
    private LeadSource leadSource;
    private Lead lead;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The campaignLeadId
     */
    public String getCampaignLeadId() {
        return campaignLeadId;
    }

    /**
     * 
     * @param campaignLeadId
     *     The campaign_lead_id
     */
    public void setCampaignLeadId(String campaignLeadId) {
        this.campaignLeadId = campaignLeadId;
    }

    /**
     * 
     * @return
     *     The leadCaptureDate
     */
    public String getLeadCaptureDate() {
        return leadCaptureDate;
    }

    /**
     * 
     * @param leadCaptureDate
     *     The lead_capture_date
     */
    public void setLeadCaptureDate(String leadCaptureDate) {
        this.leadCaptureDate = leadCaptureDate;
    }

    /**
     * 
     * @return
     *     The leadSource
     */
    public LeadSource getLeadSource() {
        return leadSource;
    }

    /**
     * 
     * @param leadSource
     *     The lead_source
     */
    public void setLeadSource(LeadSource leadSource) {
        this.leadSource = leadSource;
    }

    /**
     * 
     * @return
     *     The lead
     */
    public Lead getLead() {
        return lead;
    }

    /**
     * 
     * @param lead
     *     The lead
     */
    public void setLead(Lead lead) {
        this.lead = lead;
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
