// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketWebsiteConfigurationV2RoutingRuleRedirect {
    /**
     * @return The host name to use in the redirect request.
     * 
     */
    private final @Nullable String hostName;
    /**
     * @return The HTTP redirect code to use on the response.
     * 
     */
    private final @Nullable String httpRedirectCode;
    /**
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original request. Valid values: `http`, `https`.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/` folder) to `documents/`, you can set a `condition` block with `key_prefix_equals` set to `docs/` and in the `redirect` set `replace_key_prefix_with` to `/documents`.
     * 
     */
    private final @Nullable String replaceKeyPrefixWith;
    /**
     * @return The specific object key to use in the redirect request. For example, redirect request to `error.html`.
     * 
     */
    private final @Nullable String replaceKeyWith;

    @CustomType.Constructor
    private BucketWebsiteConfigurationV2RoutingRuleRedirect(
        @CustomType.Parameter("hostName") @Nullable String hostName,
        @CustomType.Parameter("httpRedirectCode") @Nullable String httpRedirectCode,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("replaceKeyPrefixWith") @Nullable String replaceKeyPrefixWith,
        @CustomType.Parameter("replaceKeyWith") @Nullable String replaceKeyWith) {
        this.hostName = hostName;
        this.httpRedirectCode = httpRedirectCode;
        this.protocol = protocol;
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        this.replaceKeyWith = replaceKeyWith;
    }

    /**
     * @return The host name to use in the redirect request.
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * @return The HTTP redirect code to use on the response.
     * 
     */
    public Optional<String> httpRedirectCode() {
        return Optional.ofNullable(this.httpRedirectCode);
    }
    /**
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original request. Valid values: `http`, `https`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/` folder) to `documents/`, you can set a `condition` block with `key_prefix_equals` set to `docs/` and in the `redirect` set `replace_key_prefix_with` to `/documents`.
     * 
     */
    public Optional<String> replaceKeyPrefixWith() {
        return Optional.ofNullable(this.replaceKeyPrefixWith);
    }
    /**
     * @return The specific object key to use in the redirect request. For example, redirect request to `error.html`.
     * 
     */
    public Optional<String> replaceKeyWith() {
        return Optional.ofNullable(this.replaceKeyWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteConfigurationV2RoutingRuleRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostName;
        private @Nullable String httpRedirectCode;
        private @Nullable String protocol;
        private @Nullable String replaceKeyPrefixWith;
        private @Nullable String replaceKeyWith;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteConfigurationV2RoutingRuleRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.httpRedirectCode = defaults.httpRedirectCode;
    	      this.protocol = defaults.protocol;
    	      this.replaceKeyPrefixWith = defaults.replaceKeyPrefixWith;
    	      this.replaceKeyWith = defaults.replaceKeyWith;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder httpRedirectCode(@Nullable String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder replaceKeyPrefixWith(@Nullable String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }
        public Builder replaceKeyWith(@Nullable String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }        public BucketWebsiteConfigurationV2RoutingRuleRedirect build() {
            return new BucketWebsiteConfigurationV2RoutingRuleRedirect(hostName, httpRedirectCode, protocol, replaceKeyPrefixWith, replaceKeyWith);
        }
    }
}