package org.wso2.carbon.apimgt.impl.analytics;

import org.wso2.carbon.apimgt.api.AnalyticsException;
import org.wso2.carbon.apimgt.api.model.AnalyticsforMonetization;
import org.wso2.carbon.apimgt.api.model.MonetizationUsagePublishInfo;

public class DefaultAnalyticsImpl implements AnalyticsforMonetization {
    @Override
    public Object getUsageData(MonetizationUsagePublishInfo monetizationUsagePublishInfo) throws AnalyticsException {
        return new Object();
    }
}
