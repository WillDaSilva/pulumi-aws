// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainLogPublishingOption {
    /**
     * @return CloudWatch Log Group where the logs are published.
     * 
     */
    private final String cloudwatchLogGroupArn;
    /**
     * @return Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Type of OpenSearch log being published.
     * 
     */
    private final String logType;

    @CustomType.Constructor
    private GetDomainLogPublishingOption(
        @CustomType.Parameter("cloudwatchLogGroupArn") String cloudwatchLogGroupArn,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("logType") String logType) {
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.enabled = enabled;
        this.logType = logType;
    }

    /**
     * @return CloudWatch Log Group where the logs are published.
     * 
     */
    public String cloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }
    /**
     * @return Whether node to node encryption is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Type of OpenSearch log being published.
     * 
     */
    public String logType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainLogPublishingOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudwatchLogGroupArn;
        private Boolean enabled;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainLogPublishingOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logType = defaults.logType;
        }

        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }        public GetDomainLogPublishingOption build() {
            return new GetDomainLogPublishingOption(cloudwatchLogGroupArn, enabled, logType);
        }
    }
}