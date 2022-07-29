// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountThrottleSetting {
    /**
     * @return The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    private final @Nullable Integer burstLimit;
    /**
     * @return The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    private final @Nullable Double rateLimit;

    @CustomType.Constructor
    private AccountThrottleSetting(
        @CustomType.Parameter("burstLimit") @Nullable Integer burstLimit,
        @CustomType.Parameter("rateLimit") @Nullable Double rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    /**
     * @return The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    public Optional<Integer> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }
    /**
     * @return The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    public Optional<Double> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountThrottleSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer burstLimit;
        private @Nullable Double rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountThrottleSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder burstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }
        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }        public AccountThrottleSetting build() {
            return new AccountThrottleSetting(burstLimit, rateLimit);
        }
    }
}