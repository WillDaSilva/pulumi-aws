// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionTrustedKeyGroupItem {
    /**
     * @return The ID of the key group that contains the public keys
     * 
     */
    private final @Nullable String keyGroupId;
    /**
     * @return Set of active CloudFront key pairs associated with the signer account
     * 
     */
    private final @Nullable List<String> keyPairIds;

    @CustomType.Constructor
    private DistributionTrustedKeyGroupItem(
        @CustomType.Parameter("keyGroupId") @Nullable String keyGroupId,
        @CustomType.Parameter("keyPairIds") @Nullable List<String> keyPairIds) {
        this.keyGroupId = keyGroupId;
        this.keyPairIds = keyPairIds;
    }

    /**
     * @return The ID of the key group that contains the public keys
     * 
     */
    public Optional<String> keyGroupId() {
        return Optional.ofNullable(this.keyGroupId);
    }
    /**
     * @return Set of active CloudFront key pairs associated with the signer account
     * 
     */
    public List<String> keyPairIds() {
        return this.keyPairIds == null ? List.of() : this.keyPairIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedKeyGroupItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyGroupId;
        private @Nullable List<String> keyPairIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedKeyGroupItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyGroupId = defaults.keyGroupId;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        public Builder keyGroupId(@Nullable String keyGroupId) {
            this.keyGroupId = keyGroupId;
            return this;
        }
        public Builder keyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }
        public Builder keyPairIds(String... keyPairIds) {
            return keyPairIds(List.of(keyPairIds));
        }        public DistributionTrustedKeyGroupItem build() {
            return new DistributionTrustedKeyGroupItem(keyGroupId, keyPairIds);
        }
    }
}