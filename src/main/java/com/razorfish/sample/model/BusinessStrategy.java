
package com.razorfish.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BusinessStrategy {

    private String businessStrategyId;
    private String revenueTarget;
    private String totalMarketingInfluencedRevenueTarget;
    private String marketingBudgetSpend;
    private List<BusinessStrategyImpactIndicator> businessStrategyImpactIndicator = new ArrayList<BusinessStrategyImpactIndicator>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The businessStrategyId
     */
    public String getBusinessStrategyId() {
        return businessStrategyId;
    }

    /**
     * 
     * @param businessStrategyId
     *     The business_strategy_id
     */
    public void setBusinessStrategyId(String businessStrategyId) {
        this.businessStrategyId = businessStrategyId;
    }

    /**
     * 
     * @return
     *     The revenueTarget
     */
    public String getRevenueTarget() {
        return revenueTarget;
    }

    /**
     * 
     * @param revenueTarget
     *     The revenue_target
     */
    public void setRevenueTarget(String revenueTarget) {
        this.revenueTarget = revenueTarget;
    }

    /**
     * 
     * @return
     *     The totalMarketingInfluencedRevenueTarget
     */
    public String getTotalMarketingInfluencedRevenueTarget() {
        return totalMarketingInfluencedRevenueTarget;
    }

    /**
     * 
     * @param totalMarketingInfluencedRevenueTarget
     *     The total_marketing_influenced_revenue_target
     */
    public void setTotalMarketingInfluencedRevenueTarget(String totalMarketingInfluencedRevenueTarget) {
        this.totalMarketingInfluencedRevenueTarget = totalMarketingInfluencedRevenueTarget;
    }

    /**
     * 
     * @return
     *     The marketingBudgetSpend
     */
    public String getMarketingBudgetSpend() {
        return marketingBudgetSpend;
    }

    /**
     * 
     * @param marketingBudgetSpend
     *     The marketing_budget_spend
     */
    public void setMarketingBudgetSpend(String marketingBudgetSpend) {
        this.marketingBudgetSpend = marketingBudgetSpend;
    }

    /**
     * 
     * @return
     *     The businessStrategyImpactIndicator
     */
    public List<BusinessStrategyImpactIndicator> getBusinessStrategyImpactIndicator() {
        return businessStrategyImpactIndicator;
    }

    /**
     * 
     * @param businessStrategyImpactIndicator
     *     The business_strategy_impact_indicator
     */
    public void setBusinessStrategyImpactIndicator(List<BusinessStrategyImpactIndicator> businessStrategyImpactIndicator) {
        this.businessStrategyImpactIndicator = businessStrategyImpactIndicator;
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
