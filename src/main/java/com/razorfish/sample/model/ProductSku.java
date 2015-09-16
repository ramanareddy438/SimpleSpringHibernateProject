
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ProductSku {

    private String productRefId;
    private String productFamily;
    private String productName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The productRefId
     */
    public String getProductRefId() {
        return productRefId;
    }

    /**
     * 
     * @param productRefId
     *     The product_ref_id
     */
    public void setProductRefId(String productRefId) {
        this.productRefId = productRefId;
    }

    /**
     * 
     * @return
     *     The productFamily
     */
    public String getProductFamily() {
        return productFamily;
    }

    /**
     * 
     * @param productFamily
     *     The product_family
     */
    public void setProductFamily(String productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * 
     * @return
     *     The productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * @param productName
     *     The product_name
     */
    public void setProductName(String productName) {
        this.productName = productName;
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
