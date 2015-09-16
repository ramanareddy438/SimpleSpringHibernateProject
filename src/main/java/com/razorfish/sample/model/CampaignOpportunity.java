
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CampaignOpportunity {

    private String opportunityId;
    private String createdBy;
    private String createdOn;
    private String purchasingAuthority;
    private String timeline;
    private String leveragedAssets;
    private String opportunityOwner;
    private String opportunityType;
    private String probability;
    private String nextSteps;
    private String opportunityAmount;
    private String expectedRevenue;
    private String opportunityName;
    private String opportunityAccountId;
    private String mainCompetitors;
    private OpportunityStage opportunityStage;
    private OpportunityLeadSource opportunityLeadSource;
    private ProductInterest productInterest;
    private CrmOutcome crmOutcome;
    private CrmAccount crmAccount;
    private ErpAccount erpAccount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The opportunityId
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * 
     * @param opportunityId
     *     The opportunity_id
     */
    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 
     * @return
     *     The createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * 
     * @param createdOn
     *     The created_on
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * 
     * @return
     *     The purchasingAuthority
     */
    public String getPurchasingAuthority() {
        return purchasingAuthority;
    }

    /**
     * 
     * @param purchasingAuthority
     *     The purchasing_authority
     */
    public void setPurchasingAuthority(String purchasingAuthority) {
        this.purchasingAuthority = purchasingAuthority;
    }

    /**
     * 
     * @return
     *     The timeline
     */
    public String getTimeline() {
        return timeline;
    }

    /**
     * 
     * @param timeline
     *     The timeline
     */
    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    /**
     * 
     * @return
     *     The leveragedAssets
     */
    public String getLeveragedAssets() {
        return leveragedAssets;
    }

    /**
     * 
     * @param leveragedAssets
     *     The leveraged_assets
     */
    public void setLeveragedAssets(String leveragedAssets) {
        this.leveragedAssets = leveragedAssets;
    }

    /**
     * 
     * @return
     *     The opportunityOwner
     */
    public String getOpportunityOwner() {
        return opportunityOwner;
    }

    /**
     * 
     * @param opportunityOwner
     *     The opportunity_owner
     */
    public void setOpportunityOwner(String opportunityOwner) {
        this.opportunityOwner = opportunityOwner;
    }

    /**
     * 
     * @return
     *     The opportunityType
     */
    public String getOpportunityType() {
        return opportunityType;
    }

    /**
     * 
     * @param opportunityType
     *     The opportunity_type
     */
    public void setOpportunityType(String opportunityType) {
        this.opportunityType = opportunityType;
    }

    /**
     * 
     * @return
     *     The probability
     */
    public String getProbability() {
        return probability;
    }

    /**
     * 
     * @param probability
     *     The probability
     */
    public void setProbability(String probability) {
        this.probability = probability;
    }

    /**
     * 
     * @return
     *     The nextSteps
     */
    public String getNextSteps() {
        return nextSteps;
    }

    /**
     * 
     * @param nextSteps
     *     The next_steps
     */
    public void setNextSteps(String nextSteps) {
        this.nextSteps = nextSteps;
    }

    /**
     * 
     * @return
     *     The opportunityAmount
     */
    public String getOpportunityAmount() {
        return opportunityAmount;
    }

    /**
     * 
     * @param opportunityAmount
     *     The opportunity_amount
     */
    public void setOpportunityAmount(String opportunityAmount) {
        this.opportunityAmount = opportunityAmount;
    }

    /**
     * 
     * @return
     *     The expectedRevenue
     */
    public String getExpectedRevenue() {
        return expectedRevenue;
    }

    /**
     * 
     * @param expectedRevenue
     *     The expected_revenue
     */
    public void setExpectedRevenue(String expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    /**
     * 
     * @return
     *     The opportunityName
     */
    public String getOpportunityName() {
        return opportunityName;
    }

    /**
     * 
     * @param opportunityName
     *     The opportunity_name
     */
    public void setOpportunityName(String opportunityName) {
        this.opportunityName = opportunityName;
    }

    /**
     * 
     * @return
     *     The opportunityAccountId
     */
    public String getOpportunityAccountId() {
        return opportunityAccountId;
    }

    /**
     * 
     * @param opportunityAccountId
     *     The opportunity_account_id
     */
    public void setOpportunityAccountId(String opportunityAccountId) {
        this.opportunityAccountId = opportunityAccountId;
    }

    /**
     * 
     * @return
     *     The mainCompetitors
     */
    public String getMainCompetitors() {
        return mainCompetitors;
    }

    /**
     * 
     * @param mainCompetitors
     *     The main_competitors
     */
    public void setMainCompetitors(String mainCompetitors) {
        this.mainCompetitors = mainCompetitors;
    }

    /**
     * 
     * @return
     *     The opportunityStage
     */
    public OpportunityStage getOpportunityStage() {
        return opportunityStage;
    }

    /**
     * 
     * @param opportunityStage
     *     The opportunity_stage
     */
    public void setOpportunityStage(OpportunityStage opportunityStage) {
        this.opportunityStage = opportunityStage;
    }

    /**
     * 
     * @return
     *     The opportunityLeadSource
     */
    public OpportunityLeadSource getOpportunityLeadSource() {
        return opportunityLeadSource;
    }

    /**
     * 
     * @param opportunityLeadSource
     *     The opportunity_lead_source
     */
    public void setOpportunityLeadSource(OpportunityLeadSource opportunityLeadSource) {
        this.opportunityLeadSource = opportunityLeadSource;
    }

    /**
     * 
     * @return
     *     The productInterest
     */
    public ProductInterest getProductInterest() {
        return productInterest;
    }

    /**
     * 
     * @param productInterest
     *     The product_interest
     */
    public void setProductInterest(ProductInterest productInterest) {
        this.productInterest = productInterest;
    }

    /**
     * 
     * @return
     *     The crmOutcome
     */
    public CrmOutcome getCrmOutcome() {
        return crmOutcome;
    }

    /**
     * 
     * @param crmOutcome
     *     The crm_outcome
     */
    public void setCrmOutcome(CrmOutcome crmOutcome) {
        this.crmOutcome = crmOutcome;
    }

    /**
     * 
     * @return
     *     The crmAccount
     */
    public CrmAccount getCrmAccount() {
        return crmAccount;
    }

    /**
     * 
     * @param crmAccount
     *     The crm_account
     */
    public void setCrmAccount(CrmAccount crmAccount) {
        this.crmAccount = crmAccount;
    }

    /**
     * 
     * @return
     *     The erpAccount
     */
    public ErpAccount getErpAccount() {
        return erpAccount;
    }

    /**
     * 
     * @param erpAccount
     *     The erp_account
     */
    public void setErpAccount(ErpAccount erpAccount) {
        this.erpAccount = erpAccount;
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
