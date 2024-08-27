package org.wso2.carbon.apimgt.api.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.Map;

public class MonetizationUsageInfo {

    Long requestCount;
    Long currentTimestamp;
    Map<String, Object> customAttributes = new HashMap<String, Object>();

    public MonetizationUsageInfo(Long requestCount, Map<String, Object> customAttributes, Long currentTimestamp) {
        this.requestCount = requestCount;
        this.customAttributes = customAttributes;
        this.currentTimestamp = currentTimestamp;
    }

    public Long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Long requestCount) {
        this.requestCount = requestCount;
    }

    public Long getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(Long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    public java.util.Map<String, Object> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(java.util.Map<String, Object> customAttributes) {
        this.customAttributes = customAttributes;
    }
}
