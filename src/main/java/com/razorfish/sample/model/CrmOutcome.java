
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CrmOutcome {

    private String crmOoutcomeId;
    private String crmCampaignOutcomeId;
    private String salesId;
    private CurrentStatus currentStatus;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The crmOoutcomeId
     */
    public String getCrmOoutcomeId() {
        return crmOoutcomeId;
    }

    /**
     * 
     * @param crmOoutcomeId
     *     The crm_ooutcome_id
     */
    public void setCrmOoutcomeId(String crmOoutcomeId) {
        this.crmOoutcomeId = crmOoutcomeId;
    }

    /**
     * 
     * @return
     *     The crmCampaignOutcomeId
     */
    public String getCrmCampaignOutcomeId() {
        return crmCampaignOutcomeId;
    }

    /**
     * 
     * @param crmCampaignOutcomeId
     *     The crm_campaign_outcome_id
     */
    public void setCrmCampaignOutcomeId(String crmCampaignOutcomeId) {
        this.crmCampaignOutcomeId = crmCampaignOutcomeId;
    }

    /**
     * 
     * @return
     *     The salesId
     */
    public String getSalesId() {
        return salesId;
    }

    /**
     * 
     * @param salesId
     *     The sales_id
     */
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    /**
     * 
     * @return
     *     The currentStatus
     */
    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    /**
     * 
     * @param currentStatus
     *     The current_status
     */
    public void setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
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
