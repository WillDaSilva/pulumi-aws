// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SigningJobDestinationS3 {
    /**
     * @return Name of the S3 bucket.
     * 
     */
    private final String bucket;
    /**
     * @return An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    private final @Nullable String prefix;

    @CustomType.Constructor
    private SigningJobDestinationS3(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("prefix") @Nullable String prefix) {
        this.bucket = bucket;
        this.prefix = prefix;
    }

    /**
     * @return Name of the S3 bucket.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return An Amazon S3 object key prefix that you can use to limit signed objects keys to begin with the specified prefix.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobDestinationS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobDestinationS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }        public SigningJobDestinationS3 build() {
            return new SigningJobDestinationS3(bucket, prefix);
        }
    }
}