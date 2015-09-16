
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AccountGeo {

    private String geoId;
    private String geoName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The geoId
     */
    public String getGeoId() {
        return geoId;
    }

    /**
     * 
     * @param geoId
     *     The geo_id
     */
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    /**
     * 
     * @return
     *     The geoName
     */
    public String getGeoName() {
        return geoName;
    }

    /**
     * 
     * @param geoName
     *     The geo_name
     */
    public void setGeoName(String geoName) {
        this.geoName = geoName;
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
