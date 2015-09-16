
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Owner {

    private LeadOwner leadOwner;
    private Organization organization;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The leadOwner
     */
    public LeadOwner getLeadOwner() {
        return leadOwner;
    }

    /**
     * 
     * @param leadOwner
     *     The lead_owner
     */
    public void setLeadOwner(LeadOwner leadOwner) {
        this.leadOwner = leadOwner;
    }

    /**
     * 
     * @return
     *     The organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * 
     * @param organization
     *     The organization
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
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
