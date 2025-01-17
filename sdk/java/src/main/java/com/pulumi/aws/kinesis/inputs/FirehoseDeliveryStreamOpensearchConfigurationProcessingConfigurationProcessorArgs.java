// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs Empty = new FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;

    /**
     * @return Array of processor parameters. More details are given below
     * 
     */
    public Optional<Output<List<FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs() {}

    private FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs(FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs $) {
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs $;

        public Builder() {
            $ = new FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs();
        }

        public Builder(FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs defaults) {
            $ = new FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameters Array of processor parameters. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Array of processor parameters. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Array of processor parameters. More details are given below
         * 
         * @return builder
         * 
         */
        public Builder parameters(FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param type The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FirehoseDeliveryStreamOpensearchConfigurationProcessingConfigurationProcessorArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
