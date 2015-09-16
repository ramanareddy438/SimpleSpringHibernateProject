
package com.razorfish.sample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CrmSales {

    private String saleId;
    private String salesPerson;
    private CRMInvoice invoice;
    private List<ProductFamily> productFamily = new ArrayList<ProductFamily>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The saleId
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * 
     * @param saleId
     *     The sale_id
     */
    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    /**
     * 
     * @return
     *     The salesPerson
     */
    public String getSalesPerson() {
        return salesPerson;
    }

    /**
     * 
     * @param salesPerson
     *     The sales_person
     */
    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    /**
     * 
     * @return
     *     The invoice
     */
    public CRMInvoice getInvoice() {
        return invoice;
    }

    /**
     * 
     * @param invoice
     *     The invoice
     */
    public void setInvoice(CRMInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * 
     * @return
     *     The productFamily
     */
    public List<ProductFamily> getProductFamily() {
        return productFamily;
    }

    /**
     * 
     * @param productFamily
     *     The product_family
     */
    public void setProductFamily(List<ProductFamily> productFamily) {
        this.productFamily = productFamily;
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
