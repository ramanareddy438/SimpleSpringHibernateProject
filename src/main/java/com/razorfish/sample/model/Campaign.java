
package com.razorfish.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Campaign {

    private String campaignId;
    private String campaignName;
    private String parentCampaignId;
    private String startDate;
    private String runTime;
    private String totalCost;
    private String targetClosedDeals;
    private String miRevenueTarget;
    private String touchPoint;
    private String assets;
    private BusinessStrategy businessStrategy;
    private List<CampaignAudience> campaignAudience = new ArrayList<CampaignAudience>();
    private CampaignSegment campaignSegment;
    private List<CampaignLead> campaignLead = new ArrayList<CampaignLead>();
    private List<CampaignOpportunity> campaignOpportunity = new ArrayList<CampaignOpportunity>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The campaignId
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * 
     * @param campaignId
     *     The campaign_id
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * 
     * @return
     *     The campaignName
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * 
     * @param campaignName
     *     The campaign_name
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * 
     * @return
     *     The parentCampaignId
     */
    public String getParentCampaignId() {
        return parentCampaignId;
    }

    /**
     * 
     * @param parentCampaignId
     *     The parent_campaign_id
     */
    public void setParentCampaignId(String parentCampaignId) {
        this.parentCampaignId = parentCampaignId;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The runTime
     */
    public String getRunTime() {
        return runTime;
    }

    /**
     * 
     * @param runTime
     *     The run_time
     */
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    /**
     * 
     * @return
     *     The totalCost
     */
    public String getTotalCost() {
        return totalCost;
    }

    /**
     * 
     * @param totalCost
     *     The total_cost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 
     * @return
     *     The targetClosedDeals
     */
    public String getTargetClosedDeals() {
        return targetClosedDeals;
    }

    /**
     * 
     * @param targetClosedDeals
     *     The target_closed_deals
     */
    public void setTargetClosedDeals(String targetClosedDeals) {
        this.targetClosedDeals = targetClosedDeals;
    }

    /**
     * 
     * @return
     *     The miRevenueTarget
     */
    public String getMiRevenueTarget() {
        return miRevenueTarget;
    }

    /**
     * 
     * @param miRevenueTarget
     *     The mi_revenue_target
     */
    public void setMiRevenueTarget(String miRevenueTarget) {
        this.miRevenueTarget = miRevenueTarget;
    }

    /**
     * 
     * @return
     *     The touchPoint
     */
    public String getTouchPoint() {
        return touchPoint;
    }

    /**
     * 
     * @param touchPoint
     *     The touch_point
     */
    public void setTouchPoint(String touchPoint) {
        this.touchPoint = touchPoint;
    }

    /**
     * 
     * @return
     *     The assets
     */
    public String getAssets() {
        return assets;
    }

    /**
     * 
     * @param assets
     *     The assets
     */
    public void setAssets(String assets) {
        this.assets = assets;
    }

    /**
     * 
     * @return
     *     The businessStrategy
     */
    public BusinessStrategy getBusinessStrategy() {
        return businessStrategy;
    }

    /**
     * 
     * @param businessStrategy
     *     The business_strategy
     */
    public void setBusinessStrategy(BusinessStrategy businessStrategy) {
        this.businessStrategy = businessStrategy;
    }

    /**
     * 
     * @return
     *     The campaignAudience
     */
    public List<CampaignAudience> getCampaignAudience() {
        return campaignAudience;
    }

    /**
     * 
     * @param campaignAudience
     *     The campaign_audience
     */
    public void setCampaignAudience(List<CampaignAudience> campaignAudience) {
        this.campaignAudience = campaignAudience;
    }

    /**
     * 
     * @return
     *     The campaignSegment
     */
    public CampaignSegment getCampaignSegment() {
        return campaignSegment;
    }

    /**
     * 
     * @param campaignSegment
     *     The campaign_segment
     */
    public void setCampaignSegment(CampaignSegment campaignSegment) {
        this.campaignSegment = campaignSegment;
    }

    /**
     * 
     * @return
     *     The campaignLead
     */
    public List<CampaignLead> getCampaignLead() {
        return campaignLead;
    }

    /**
     * 
     * @param campaignLead
     *     The campaign_lead
     */
    public void setCampaignLead(List<CampaignLead> campaignLead) {
        this.campaignLead = campaignLead;
    }

    /**
     * 
     * @return
     *     The campaignOpportunity
     */
    public List<CampaignOpportunity> getCampaignOpportunity() {
        return campaignOpportunity;
    }

    /**
     * 
     * @param campaignOpportunity
     *     The campaign_opportunity
     */
    public void setCampaignOpportunity(List<CampaignOpportunity> campaignOpportunity) {
        this.campaignOpportunity = campaignOpportunity;
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
