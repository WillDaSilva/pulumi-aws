// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPhoneConfig {
    /**
     * @return The After Call Work (ACW) timeout setting, in seconds. Minimum value of 0.
     * 
     */
    private final @Nullable Integer afterContactWorkTimeLimit;
    /**
     * @return When Auto-Accept Call is enabled for an available agent, the agent connects to contacts automatically.
     * 
     */
    private final @Nullable Boolean autoAccept;
    /**
     * @return The phone number for the user&#39;s desk phone. Required if `phone_type` is set as `DESK_PHONE`.
     * 
     */
    private final @Nullable String deskPhoneNumber;
    /**
     * @return The phone type. Valid values are `DESK_PHONE` and `SOFT_PHONE`.
     * 
     */
    private final String phoneType;

    @CustomType.Constructor
    private UserPhoneConfig(
        @CustomType.Parameter("afterContactWorkTimeLimit") @Nullable Integer afterContactWorkTimeLimit,
        @CustomType.Parameter("autoAccept") @Nullable Boolean autoAccept,
        @CustomType.Parameter("deskPhoneNumber") @Nullable String deskPhoneNumber,
        @CustomType.Parameter("phoneType") String phoneType) {
        this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
        this.autoAccept = autoAccept;
        this.deskPhoneNumber = deskPhoneNumber;
        this.phoneType = phoneType;
    }

    /**
     * @return The After Call Work (ACW) timeout setting, in seconds. Minimum value of 0.
     * 
     */
    public Optional<Integer> afterContactWorkTimeLimit() {
        return Optional.ofNullable(this.afterContactWorkTimeLimit);
    }
    /**
     * @return When Auto-Accept Call is enabled for an available agent, the agent connects to contacts automatically.
     * 
     */
    public Optional<Boolean> autoAccept() {
        return Optional.ofNullable(this.autoAccept);
    }
    /**
     * @return The phone number for the user&#39;s desk phone. Required if `phone_type` is set as `DESK_PHONE`.
     * 
     */
    public Optional<String> deskPhoneNumber() {
        return Optional.ofNullable(this.deskPhoneNumber);
    }
    /**
     * @return The phone type. Valid values are `DESK_PHONE` and `SOFT_PHONE`.
     * 
     */
    public String phoneType() {
        return this.phoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPhoneConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer afterContactWorkTimeLimit;
        private @Nullable Boolean autoAccept;
        private @Nullable String deskPhoneNumber;
        private String phoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPhoneConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.afterContactWorkTimeLimit = defaults.afterContactWorkTimeLimit;
    	      this.autoAccept = defaults.autoAccept;
    	      this.deskPhoneNumber = defaults.deskPhoneNumber;
    	      this.phoneType = defaults.phoneType;
        }

        public Builder afterContactWorkTimeLimit(@Nullable Integer afterContactWorkTimeLimit) {
            this.afterContactWorkTimeLimit = afterContactWorkTimeLimit;
            return this;
        }
        public Builder autoAccept(@Nullable Boolean autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }
        public Builder deskPhoneNumber(@Nullable String deskPhoneNumber) {
            this.deskPhoneNumber = deskPhoneNumber;
            return this;
        }
        public Builder phoneType(String phoneType) {
            this.phoneType = Objects.requireNonNull(phoneType);
            return this;
        }        public UserPhoneConfig build() {
            return new UserPhoneConfig(afterContactWorkTimeLimit, autoAccept, deskPhoneNumber, phoneType);
        }
    }
}