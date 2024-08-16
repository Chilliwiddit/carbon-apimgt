package org.wso2.carbon.apimgt.api.model;


import org.wso2.carbon.apimgt.api.AnalyticsException;

public interface AnalyticsforMonetization {
    /**
     * Create billing plan for a policy
     *
     * @param monetizationUsagePublishInfo monetization publish info
     * @return usage data from analytics provider
     * @throws AnalyticsException if the action failed
     */
    Object getUsageData(MonetizationUsagePublishInfo monetizationUsagePublishInfo) throws AnalyticsException;
}
