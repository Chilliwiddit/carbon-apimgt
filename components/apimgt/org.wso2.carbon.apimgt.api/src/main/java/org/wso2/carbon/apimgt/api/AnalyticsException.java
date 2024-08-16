package org.wso2.carbon.apimgt.api;

/**
 * This is the custom exception class for API analytics.
 */
public class AnalyticsException extends RuntimeException {

    public AnalyticsException(String msg) {
        super(msg);
    }

    public AnalyticsException(String msg, Throwable e) {
        super(msg, e);
    }

    public AnalyticsException(Throwable throwable) {
        super(throwable);
    }

}
