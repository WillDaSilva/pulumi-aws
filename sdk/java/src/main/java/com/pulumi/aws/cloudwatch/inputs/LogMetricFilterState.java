// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogMetricFilterState extends com.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterState Empty = new LogMetricFilterState();

    /**
     * The name of the log group to associate the metric filter with.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return The name of the log group to associate the metric filter with.
     * 
     */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    @Import(name="metricTransformation")
    private @Nullable Output<LogMetricFilterMetricTransformationArgs> metricTransformation;

    /**
     * @return A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    public Optional<Output<LogMetricFilterMetricTransformationArgs>> metricTransformation() {
        return Optional.ofNullable(this.metricTransformation);
    }

    /**
     * A name for the metric filter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the metric filter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private LogMetricFilterState() {}

    private LogMetricFilterState(LogMetricFilterState $) {
        this.logGroupName = $.logGroupName;
        this.metricTransformation = $.metricTransformation;
        this.name = $.name;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogMetricFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogMetricFilterState $;

        public Builder() {
            $ = new LogMetricFilterState();
        }

        public Builder(LogMetricFilterState defaults) {
            $ = new LogMetricFilterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupName The name of the log group to associate the metric filter with.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName The name of the log group to associate the metric filter with.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param metricTransformation A block defining collection of information needed to define how metric data gets emitted. See below.
         * 
         * @return builder
         * 
         */
        public Builder metricTransformation(@Nullable Output<LogMetricFilterMetricTransformationArgs> metricTransformation) {
            $.metricTransformation = metricTransformation;
            return this;
        }

        /**
         * @param metricTransformation A block defining collection of information needed to define how metric data gets emitted. See below.
         * 
         * @return builder
         * 
         */
        public Builder metricTransformation(LogMetricFilterMetricTransformationArgs metricTransformation) {
            return metricTransformation(Output.of(metricTransformation));
        }

        /**
         * @param name A name for the metric filter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the metric filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pattern A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
         * for extracting metric data out of ingested log events.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
         * for extracting metric data out of ingested log events.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public LogMetricFilterState build() {
            return $;
        }
    }

}