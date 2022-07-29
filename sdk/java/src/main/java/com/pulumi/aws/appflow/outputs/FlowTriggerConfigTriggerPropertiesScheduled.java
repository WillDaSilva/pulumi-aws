// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowTriggerConfigTriggerPropertiesScheduled {
    /**
     * @return Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. Valid values are `Incremental` and `Complete`.
     * 
     */
    private final @Nullable String dataPullMode;
    /**
     * @return Specifies the date range for the records to import from the connector in the first flow run. Must be a valid RFC3339 timestamp.
     * 
     */
    private final @Nullable String firstExecutionFrom;
    /**
     * @return Specifies the scheduled end time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    private final @Nullable String scheduleEndTime;
    /**
     * @return The scheduling expression that determines the rate at which the schedule will run, for example `rate(5minutes)`.
     * 
     */
    private final String scheduleExpression;
    /**
     * @return Specifies the optional offset that is added to the time interval for a schedule-triggered flow. Maximum value of 36000.
     * 
     */
    private final @Nullable Integer scheduleOffset;
    /**
     * @return Specifies the scheduled start time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    private final @Nullable String scheduleStartTime;
    /**
     * @return Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as `America/New_York`.
     * 
     */
    private final @Nullable String timezone;

    @CustomType.Constructor
    private FlowTriggerConfigTriggerPropertiesScheduled(
        @CustomType.Parameter("dataPullMode") @Nullable String dataPullMode,
        @CustomType.Parameter("firstExecutionFrom") @Nullable String firstExecutionFrom,
        @CustomType.Parameter("scheduleEndTime") @Nullable String scheduleEndTime,
        @CustomType.Parameter("scheduleExpression") String scheduleExpression,
        @CustomType.Parameter("scheduleOffset") @Nullable Integer scheduleOffset,
        @CustomType.Parameter("scheduleStartTime") @Nullable String scheduleStartTime,
        @CustomType.Parameter("timezone") @Nullable String timezone) {
        this.dataPullMode = dataPullMode;
        this.firstExecutionFrom = firstExecutionFrom;
        this.scheduleEndTime = scheduleEndTime;
        this.scheduleExpression = scheduleExpression;
        this.scheduleOffset = scheduleOffset;
        this.scheduleStartTime = scheduleStartTime;
        this.timezone = timezone;
    }

    /**
     * @return Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run. Valid values are `Incremental` and `Complete`.
     * 
     */
    public Optional<String> dataPullMode() {
        return Optional.ofNullable(this.dataPullMode);
    }
    /**
     * @return Specifies the date range for the records to import from the connector in the first flow run. Must be a valid RFC3339 timestamp.
     * 
     */
    public Optional<String> firstExecutionFrom() {
        return Optional.ofNullable(this.firstExecutionFrom);
    }
    /**
     * @return Specifies the scheduled end time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    public Optional<String> scheduleEndTime() {
        return Optional.ofNullable(this.scheduleEndTime);
    }
    /**
     * @return The scheduling expression that determines the rate at which the schedule will run, for example `rate(5minutes)`.
     * 
     */
    public String scheduleExpression() {
        return this.scheduleExpression;
    }
    /**
     * @return Specifies the optional offset that is added to the time interval for a schedule-triggered flow. Maximum value of 36000.
     * 
     */
    public Optional<Integer> scheduleOffset() {
        return Optional.ofNullable(this.scheduleOffset);
    }
    /**
     * @return Specifies the scheduled start time for a schedule-triggered flow. Must be a valid RFC3339 timestamp.
     * 
     */
    public Optional<String> scheduleStartTime() {
        return Optional.ofNullable(this.scheduleStartTime);
    }
    /**
     * @return Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as `America/New_York`.
     * 
     */
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfigTriggerPropertiesScheduled defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataPullMode;
        private @Nullable String firstExecutionFrom;
        private @Nullable String scheduleEndTime;
        private String scheduleExpression;
        private @Nullable Integer scheduleOffset;
        private @Nullable String scheduleStartTime;
        private @Nullable String timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTriggerConfigTriggerPropertiesScheduled defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPullMode = defaults.dataPullMode;
    	      this.firstExecutionFrom = defaults.firstExecutionFrom;
    	      this.scheduleEndTime = defaults.scheduleEndTime;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.scheduleOffset = defaults.scheduleOffset;
    	      this.scheduleStartTime = defaults.scheduleStartTime;
    	      this.timezone = defaults.timezone;
        }

        public Builder dataPullMode(@Nullable String dataPullMode) {
            this.dataPullMode = dataPullMode;
            return this;
        }
        public Builder firstExecutionFrom(@Nullable String firstExecutionFrom) {
            this.firstExecutionFrom = firstExecutionFrom;
            return this;
        }
        public Builder scheduleEndTime(@Nullable String scheduleEndTime) {
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public Builder scheduleOffset(@Nullable Integer scheduleOffset) {
            this.scheduleOffset = scheduleOffset;
            return this;
        }
        public Builder scheduleStartTime(@Nullable String scheduleStartTime) {
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }
        public Builder timezone(@Nullable String timezone) {
            this.timezone = timezone;
            return this;
        }        public FlowTriggerConfigTriggerPropertiesScheduled build() {
            return new FlowTriggerConfigTriggerPropertiesScheduled(dataPullMode, firstExecutionFrom, scheduleEndTime, scheduleExpression, scheduleOffset, scheduleStartTime, timezone);
        }
    }
}