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
public final class DistributionTrustedSignerItem {
    /**
     * @return AWS account ID or `self`
     * 
     */
    private final @Nullable String awsAccountNumber;
    /**
     * @return Set of active CloudFront key pairs associated with the signer account
     * 
     */
    private final @Nullable List<String> keyPairIds;

    @CustomType.Constructor
    private DistributionTrustedSignerItem(
        @CustomType.Parameter("awsAccountNumber") @Nullable String awsAccountNumber,
        @CustomType.Parameter("keyPairIds") @Nullable List<String> keyPairIds) {
        this.awsAccountNumber = awsAccountNumber;
        this.keyPairIds = keyPairIds;
    }

    /**
     * @return AWS account ID or `self`
     * 
     */
    public Optional<String> awsAccountNumber() {
        return Optional.ofNullable(this.awsAccountNumber);
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

    public static Builder builder(DistributionTrustedSignerItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccountNumber;
        private @Nullable List<String> keyPairIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedSignerItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountNumber = defaults.awsAccountNumber;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        public Builder awsAccountNumber(@Nullable String awsAccountNumber) {
            this.awsAccountNumber = awsAccountNumber;
            return this;
        }
        public Builder keyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }
        public Builder keyPairIds(String... keyPairIds) {
            return keyPairIds(List.of(keyPairIds));
        }        public DistributionTrustedSignerItem build() {
            return new DistributionTrustedSignerItem(awsAccountNumber, keyPairIds);
        }
    }
}