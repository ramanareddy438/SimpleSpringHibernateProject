
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ErpAccount {

    private String accountId;
    private String accountOwner;
    private String accountCustomerName;
    private String accountCustomerPo;
    private String parentId;
    private String annualRevenue;
    private String industry;
    private ErpSales erpSales;
    private AccountGeo accountGeo;
    private AccountAddress accountAddress;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 
     * @param accountId
     *     The account_id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     The accountOwner
     */
    public String getAccountOwner() {
        return accountOwner;
    }

    /**
     * 
     * @param accountOwner
     *     The account_owner
     */
    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    /**
     * 
     * @return
     *     The accountCustomerName
     */
    public String getAccountCustomerName() {
        return accountCustomerName;
    }

    /**
     * 
     * @param accountCustomerName
     *     The account_customer_name
     */
    public void setAccountCustomerName(String accountCustomerName) {
        this.accountCustomerName = accountCustomerName;
    }

    /**
     * 
     * @return
     *     The accountCustomerPo
     */
    public String getAccountCustomerPo() {
        return accountCustomerPo;
    }

    /**
     * 
     * @param accountCustomerPo
     *     The account_customer_po
     */
    public void setAccountCustomerPo(String accountCustomerPo) {
        this.accountCustomerPo = accountCustomerPo;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parent_id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
     *     The erpSales
     */
    public ErpSales getErpSales() {
        return erpSales;
    }

    /**
     * 
     * @param erpSales
     *     The erp_sales
     */
    public void setErpSales(ErpSales erpSales) {
        this.erpSales = erpSales;
    }

    /**
     * 
     * @return
     *     The accountGeo
     */
    public AccountGeo getAccountGeo() {
        return accountGeo;
    }

    /**
     * 
     * @param accountGeo
     *     The account_geo
     */
    public void setAccountGeo(AccountGeo accountGeo) {
        this.accountGeo = accountGeo;
    }

    /**
     * 
     * @return
     *     The accountAddress
     */
    public AccountAddress getAccountAddress() {
        return accountAddress;
    }

    /**
     * 
     * @param accountAddress
     *     The account_address
     */
    public void setAccountAddress(AccountAddress accountAddress) {
        this.accountAddress = accountAddress;
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
