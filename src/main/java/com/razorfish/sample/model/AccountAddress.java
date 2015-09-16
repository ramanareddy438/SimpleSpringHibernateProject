
package com.razorfish.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AccountAddress {

    private String accountSite;
    private String website;
    private String contactPhone;
    private List<BillingAddress> billingAddress = new ArrayList<BillingAddress>();
    private List<ShippingAddress> shippingAddress = new ArrayList<ShippingAddress>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The accountSite
     */
    public String getAccountSite() {
        return accountSite;
    }

    /**
     * 
     * @param accountSite
     *     The account_site
     */
    public void setAccountSite(String accountSite) {
        this.accountSite = accountSite;
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
     *     The contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 
     * @param contactPhone
     *     The contact_phone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 
     * @return
     *     The billingAddress
     */
    public List<BillingAddress> getBillingAddress() {
        return billingAddress;
    }

    /**
     * 
     * @param billingAddress
     *     The billing_address
     */
    public void setBillingAddress(List<BillingAddress> billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * 
     * @return
     *     The shippingAddress
     */
    public List<ShippingAddress> getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 
     * @param shippingAddress
     *     The shipping_address
     */
    public void setShippingAddress(List<ShippingAddress> shippingAddress) {
        this.shippingAddress = shippingAddress;
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
