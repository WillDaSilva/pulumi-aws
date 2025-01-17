// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
    /**
     * @return Metric type.
     * 
     */
    private String predefinedMetricType;
    /**
     * @return Identifies the resource associated with the metric type.
     * 
     */
    private @Nullable String resourceLabel;

    private PolicyTargetTrackingConfigurationPredefinedMetricSpecification() {}
    /**
     * @return Metric type.
     * 
     */
    public String predefinedMetricType() {
        return this.predefinedMetricType;
    }
    /**
     * @return Identifies the resource associated with the metric type.
     * 
     */
    public Optional<String> resourceLabel() {
        return Optional.ofNullable(this.resourceLabel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingConfigurationPredefinedMetricSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String predefinedMetricType;
        private @Nullable String resourceLabel;
        public Builder() {}
        public Builder(PolicyTargetTrackingConfigurationPredefinedMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        @CustomType.Setter
        public Builder predefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }
        @CustomType.Setter
        public Builder resourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }
        public PolicyTargetTrackingConfigurationPredefinedMetricSpecification build() {
            final var o = new PolicyTargetTrackingConfigurationPredefinedMetricSpecification();
            o.predefinedMetricType = predefinedMetricType;
            o.resourceLabel = resourceLabel;
            return o;
        }
    }
}
