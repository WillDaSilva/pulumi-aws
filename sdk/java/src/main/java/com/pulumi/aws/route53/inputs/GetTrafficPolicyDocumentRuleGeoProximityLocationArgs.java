// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficPolicyDocumentRuleGeoProximityLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTrafficPolicyDocumentRuleGeoProximityLocationArgs Empty = new GetTrafficPolicyDocumentRuleGeoProximityLocationArgs();

    /**
     * Specify a value for `bias` if you want to route more traffic to an endpoint from nearby endpoints (positive values) or route less traffic to an endpoint (negative values).
     * 
     */
    @Import(name="bias")
    private @Nullable Output<String> bias;

    /**
     * @return Specify a value for `bias` if you want to route more traffic to an endpoint from nearby endpoints (positive values) or route less traffic to an endpoint (negative values).
     * 
     */
    public Optional<Output<String>> bias() {
        return Optional.ofNullable(this.bias);
    }

    /**
     * References to an endpoint.
     * 
     */
    @Import(name="endpointReference")
    private @Nullable Output<String> endpointReference;

    /**
     * @return References to an endpoint.
     * 
     */
    public Optional<Output<String>> endpointReference() {
        return Optional.ofNullable(this.endpointReference);
    }

    /**
     * Indicates whether you want Amazon Route 53 to evaluate the health of the endpoint and route traffic only to healthy endpoints.
     * 
     */
    @Import(name="evaluateTargetHealth")
    private @Nullable Output<Boolean> evaluateTargetHealth;

    /**
     * @return Indicates whether you want Amazon Route 53 to evaluate the health of the endpoint and route traffic only to healthy endpoints.
     * 
     */
    public Optional<Output<Boolean>> evaluateTargetHealth() {
        return Optional.ofNullable(this.evaluateTargetHealth);
    }

    /**
     * If you want to associate a health check with the endpoint or rule.
     * 
     */
    @Import(name="healthCheck")
    private @Nullable Output<String> healthCheck;

    /**
     * @return If you want to associate a health check with the endpoint or rule.
     * 
     */
    public Optional<Output<String>> healthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }

    /**
     * Represents the location south (negative) or north (positive) of the equator. Valid values are -90 degrees to 90 degrees.
     * 
     */
    @Import(name="latitude")
    private @Nullable Output<String> latitude;

    /**
     * @return Represents the location south (negative) or north (positive) of the equator. Valid values are -90 degrees to 90 degrees.
     * 
     */
    public Optional<Output<String>> latitude() {
        return Optional.ofNullable(this.latitude);
    }

    /**
     * Represents the location west (negative) or east (positive) of the prime meridian. Valid values are -180 degrees to 180 degrees.
     * 
     */
    @Import(name="longitude")
    private @Nullable Output<String> longitude;

    /**
     * @return Represents the location west (negative) or east (positive) of the prime meridian. Valid values are -180 degrees to 180 degrees.
     * 
     */
    public Optional<Output<String>> longitude() {
        return Optional.ofNullable(this.longitude);
    }

    /**
     * Region code for the AWS Region that you created the resource in.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region code for the AWS Region that you created the resource in.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * References to a rule.
     * 
     */
    @Import(name="ruleReference")
    private @Nullable Output<String> ruleReference;

    /**
     * @return References to a rule.
     * 
     */
    public Optional<Output<String>> ruleReference() {
        return Optional.ofNullable(this.ruleReference);
    }

    private GetTrafficPolicyDocumentRuleGeoProximityLocationArgs() {}

    private GetTrafficPolicyDocumentRuleGeoProximityLocationArgs(GetTrafficPolicyDocumentRuleGeoProximityLocationArgs $) {
        this.bias = $.bias;
        this.endpointReference = $.endpointReference;
        this.evaluateTargetHealth = $.evaluateTargetHealth;
        this.healthCheck = $.healthCheck;
        this.latitude = $.latitude;
        this.longitude = $.longitude;
        this.region = $.region;
        this.ruleReference = $.ruleReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficPolicyDocumentRuleGeoProximityLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficPolicyDocumentRuleGeoProximityLocationArgs $;

        public Builder() {
            $ = new GetTrafficPolicyDocumentRuleGeoProximityLocationArgs();
        }

        public Builder(GetTrafficPolicyDocumentRuleGeoProximityLocationArgs defaults) {
            $ = new GetTrafficPolicyDocumentRuleGeoProximityLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bias Specify a value for `bias` if you want to route more traffic to an endpoint from nearby endpoints (positive values) or route less traffic to an endpoint (negative values).
         * 
         * @return builder
         * 
         */
        public Builder bias(@Nullable Output<String> bias) {
            $.bias = bias;
            return this;
        }

        /**
         * @param bias Specify a value for `bias` if you want to route more traffic to an endpoint from nearby endpoints (positive values) or route less traffic to an endpoint (negative values).
         * 
         * @return builder
         * 
         */
        public Builder bias(String bias) {
            return bias(Output.of(bias));
        }

        /**
         * @param endpointReference References to an endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointReference(@Nullable Output<String> endpointReference) {
            $.endpointReference = endpointReference;
            return this;
        }

        /**
         * @param endpointReference References to an endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointReference(String endpointReference) {
            return endpointReference(Output.of(endpointReference));
        }

        /**
         * @param evaluateTargetHealth Indicates whether you want Amazon Route 53 to evaluate the health of the endpoint and route traffic only to healthy endpoints.
         * 
         * @return builder
         * 
         */
        public Builder evaluateTargetHealth(@Nullable Output<Boolean> evaluateTargetHealth) {
            $.evaluateTargetHealth = evaluateTargetHealth;
            return this;
        }

        /**
         * @param evaluateTargetHealth Indicates whether you want Amazon Route 53 to evaluate the health of the endpoint and route traffic only to healthy endpoints.
         * 
         * @return builder
         * 
         */
        public Builder evaluateTargetHealth(Boolean evaluateTargetHealth) {
            return evaluateTargetHealth(Output.of(evaluateTargetHealth));
        }

        /**
         * @param healthCheck If you want to associate a health check with the endpoint or rule.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(@Nullable Output<String> healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        /**
         * @param healthCheck If you want to associate a health check with the endpoint or rule.
         * 
         * @return builder
         * 
         */
        public Builder healthCheck(String healthCheck) {
            return healthCheck(Output.of(healthCheck));
        }

        /**
         * @param latitude Represents the location south (negative) or north (positive) of the equator. Valid values are -90 degrees to 90 degrees.
         * 
         * @return builder
         * 
         */
        public Builder latitude(@Nullable Output<String> latitude) {
            $.latitude = latitude;
            return this;
        }

        /**
         * @param latitude Represents the location south (negative) or north (positive) of the equator. Valid values are -90 degrees to 90 degrees.
         * 
         * @return builder
         * 
         */
        public Builder latitude(String latitude) {
            return latitude(Output.of(latitude));
        }

        /**
         * @param longitude Represents the location west (negative) or east (positive) of the prime meridian. Valid values are -180 degrees to 180 degrees.
         * 
         * @return builder
         * 
         */
        public Builder longitude(@Nullable Output<String> longitude) {
            $.longitude = longitude;
            return this;
        }

        /**
         * @param longitude Represents the location west (negative) or east (positive) of the prime meridian. Valid values are -180 degrees to 180 degrees.
         * 
         * @return builder
         * 
         */
        public Builder longitude(String longitude) {
            return longitude(Output.of(longitude));
        }

        /**
         * @param region Region code for the AWS Region that you created the resource in.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region code for the AWS Region that you created the resource in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param ruleReference References to a rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleReference(@Nullable Output<String> ruleReference) {
            $.ruleReference = ruleReference;
            return this;
        }

        /**
         * @param ruleReference References to a rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleReference(String ruleReference) {
            return ruleReference(Output.of(ruleReference));
        }

        public GetTrafficPolicyDocumentRuleGeoProximityLocationArgs build() {
            return $;
        }
    }

}