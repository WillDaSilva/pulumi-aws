// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs();

    /**
     * Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
     * 
     */
    @Import(name="retryDuration")
    private @Nullable Output<Integer> retryDuration;

    /**
     * @return Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
     * 
     */
    public Optional<Output<Integer>> retryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs() {}

    private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs $) {
        this.enabled = $.enabled;
        this.retryDuration = $.retryDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs();
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs defaults) {
            $ = new FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param retryDuration Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
         * 
         * @return builder
         * 
         */
        public Builder retryDuration(@Nullable Output<Integer> retryDuration) {
            $.retryDuration = retryDuration;
            return this;
        }

        /**
         * @param retryDuration Total amount of seconds Firehose spends on retries. Valid values between 0 and 7200. Default is 300.
         * 
         * @return builder
         * 
         */
        public Builder retryDuration(Integer retryDuration) {
            return retryDuration(Output.of(retryDuration));
        }

        public FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfigurationArgs build() {
            return $;
        }
    }

}