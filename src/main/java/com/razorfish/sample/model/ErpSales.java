
package com.razorfish.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ErpSales {

    private String saleOrderId;
    private String orderNumber;
    private String amount;
    private String orderDate;
    private String createdBy;
    private String lastModified;
    private List<ErpInvoice> invoice = new ArrayList<ErpInvoice>();
    private List<ProductSku> productSku = new ArrayList<ProductSku>();
    private SalesPerson salesPerson;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The saleOrderId
     */
    public String getSaleOrderId() {
        return saleOrderId;
    }

    /**
     * 
     * @param saleOrderId
     *     The sale_order_id
     */
    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    /**
     * 
     * @return
     *     The orderNumber
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 
     * @param orderNumber
     *     The order_number
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 
     * @return
     *     The amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 
     * @param orderDate
     *     The order_date
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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
     *     The lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * 
     * @param lastModified
     *     The last_modified
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * 
     * @return
     *     The invoice
     */
    public List<ErpInvoice> getInvoice() {
        return invoice;
    }

    /**
     * 
     * @param invoice
     *     The invoice
     */
    public void setInvoice(List<ErpInvoice> invoice) {
        this.invoice = invoice;
    }

    /**
     * 
     * @return
     *     The productSku
     */
    public List<ProductSku> getProductSku() {
        return productSku;
    }

    /**
     * 
     * @param productSku
     *     The product_sku
     */
    public void setProductSku(List<ProductSku> productSku) {
        this.productSku = productSku;
    }

    /**
     * 
     * @return
     *     The salesPerson
     */
    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    /**
     * 
     * @param salesPerson
     *     The sales_person
     */
    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
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
