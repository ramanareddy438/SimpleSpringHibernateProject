
package com.razorfish.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CrmAccount {

    private String accountName;
    private String accountEmail;
    private String accountIndustry;
    private String accountParentId;
    private String annualRevenue;
    private String accountRefId;
    private List<BusinessAddress> businessAddress = new ArrayList<BusinessAddress>();
    private List<ShippingAddress> shippingAddress = new ArrayList<ShippingAddress>();
    private AccountOwner accountOwner;
    private CrmSales crmSales;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 
     * @param accountName
     *     The account_name
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 
     * @return
     *     The accountEmail
     */
    public String getAccountEmail() {
        return accountEmail;
    }

    /**
     * 
     * @param accountEmail
     *     The account_email
     */
    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    /**
     * 
     * @return
     *     The accountIndustry
     */
    public String getAccountIndustry() {
        return accountIndustry;
    }

    /**
     * 
     * @param accountIndustry
     *     The account_industry
     */
    public void setAccountIndustry(String accountIndustry) {
        this.accountIndustry = accountIndustry;
    }

    /**
     * 
     * @return
     *     The accountParentId
     */
    public String getAccountParentId() {
        return accountParentId;
    }

    /**
     * 
     * @param accountParentId
     *     The account_parent_id
     */
    public void setAccountParentId(String accountParentId) {
        this.accountParentId = accountParentId;
    }

    /**
     * 
     * @return
     *     The annualRevenue
     */
    public String getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * 
     * @param annualRevenue
     *     The annual_revenue
     */
    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    /**
     * 
     * @return
     *     The accountRefId
     */
    public String getAccountRefId() {
        return accountRefId;
    }

    /**
     * 
     * @param accountRefId
     *     The account_ref_id
     */
    public void setAccountRefId(String accountRefId) {
        this.accountRefId = accountRefId;
    }

    /**
     * 
     * @return
     *     The businessAddress
     */
    public List<BusinessAddress> getBusinessAddress() {
        return businessAddress;
    }

    /**
     * 
     * @param businessAddress
     *     The business_address
     */
    public void setBusinessAddress(List<BusinessAddress> businessAddress) {
        this.businessAddress = businessAddress;
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

    /**
     * 
     * @return
     *     The accountOwner
     */
    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    /**
     * 
     * @param accountOwner
     *     The account_owner
     */
    public void setAccountOwner(AccountOwner accountOwner) {
        this.accountOwner = accountOwner;
    }

    /**
     * 
     * @return
     *     The crmSales
     */
    public CrmSales getCrmSales() {
        return crmSales;
    }

    /**
     * 
     * @param crmSales
     *     The crm_sales
     */
    public void setCrmSales(CrmSales crmSales) {
        this.crmSales = crmSales;
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
