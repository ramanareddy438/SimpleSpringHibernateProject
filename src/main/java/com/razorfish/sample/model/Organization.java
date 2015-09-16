
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Organization {

    private String organizationId;
    private String name;
    private String location;
    private String industry;
    private String website;
    private String revenue;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * 
     * @param organizationId
     *     The organization_id
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 
     * @param industry
     *     The industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 
     * @return
     *     The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return
     *     The revenue
     */
    public String getRevenue() {
        return revenue;
    }

    /**
     * 
     * @param revenue
     *     The revenue
     */
    public void setRevenue(String revenue) {
        this.revenue = revenue;
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
