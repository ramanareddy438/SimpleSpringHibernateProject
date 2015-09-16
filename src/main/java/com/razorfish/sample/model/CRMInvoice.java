
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CRMInvoice {

    private String invoiceId;
    private String invoiceNumber;
    private String currency;
    private String saleAmount;
    private String saleOrderDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The invoiceId
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * 
     * @param invoiceId
     *     The invoice_id
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * 
     * @return
     *     The invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * 
     * @param invoiceNumber
     *     The invoice_number
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The saleAmount
     */
    public String getSaleAmount() {
        return saleAmount;
    }

    /**
     * 
     * @param saleAmount
     *     The sale_amount
     */
    public void setSaleAmount(String saleAmount) {
        this.saleAmount = saleAmount;
    }

    /**
     * 
     * @return
     *     The saleOrderDate
     */
    public String getSaleOrderDate() {
        return saleOrderDate;
    }

    /**
     * 
     * @param saleOrderDate
     *     The sale_order_date
     */
    public void setSaleOrderDate(String saleOrderDate) {
        this.saleOrderDate = saleOrderDate;
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
