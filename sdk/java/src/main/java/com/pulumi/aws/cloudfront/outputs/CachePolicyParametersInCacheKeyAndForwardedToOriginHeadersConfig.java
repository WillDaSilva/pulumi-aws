// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig {
    /**
     * @return Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    private final @Nullable String headerBehavior;
    /**
     * @return Object that contains a list of header names. See Items for more information.
     * 
     */
    private final @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders headers;

    @CustomType.Constructor
    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig(
        @CustomType.Parameter("headerBehavior") @Nullable String headerBehavior,
        @CustomType.Parameter("headers") @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders headers) {
        this.headerBehavior = headerBehavior;
        this.headers = headers;
    }

    /**
     * @return Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    public Optional<String> headerBehavior() {
        return Optional.ofNullable(this.headerBehavior);
    }
    /**
     * @return Object that contains a list of header names. See Items for more information.
     * 
     */
    public Optional<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders> headers() {
        return Optional.ofNullable(this.headers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String headerBehavior;
        private @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders headers;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder headerBehavior(@Nullable String headerBehavior) {
            this.headerBehavior = headerBehavior;
            return this;
        }
        public Builder headers(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders headers) {
            this.headers = headers;
            return this;
        }        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig(headerBehavior, headers);
        }
    }
}