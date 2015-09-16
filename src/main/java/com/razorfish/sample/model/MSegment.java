
package com.razorfish.sample.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MSegment {

    private String mSegmentId;
    private String segmentType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mSegmentId
     */
    public String getMSegmentId() {
        return mSegmentId;
    }

    /**
     * 
     * @param mSegmentId
     *     The m_segment_id
     */
    public void setMSegmentId(String mSegmentId) {
        this.mSegmentId = mSegmentId;
    }

    /**
     * 
     * @return
     *     The segmentType
     */
    public String getSegmentType() {
        return segmentType;
    }

    /**
     * 
     * @param segmentType
     *     The segment_type
     */
    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
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
