// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestination;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettings {
    /**
     * @return Setting to allow self signed or verified RTMP certificates.
     * 
     */
    private @Nullable String certificateMode;
    /**
     * @return Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
     * 
     */
    private @Nullable Integer connectionRetryInterval;
    /**
     * @return The RTMP endpoint excluding the stream name. See Destination for more details.
     * 
     */
    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestination destination;
    /**
     * @return Number of retry attempts.
     * 
     */
    private @Nullable Integer numRetries;

    private ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettings() {}
    /**
     * @return Setting to allow self signed or verified RTMP certificates.
     * 
     */
    public Optional<String> certificateMode() {
        return Optional.ofNullable(this.certificateMode);
    }
    /**
     * @return Number of seconds to wait before retrying connection to the flash media server if the connection is lost.
     * 
     */
    public Optional<Integer> connectionRetryInterval() {
        return Optional.ofNullable(this.connectionRetryInterval);
    }
    /**
     * @return The RTMP endpoint excluding the stream name. See Destination for more details.
     * 
     */
    public ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestination destination() {
        return this.destination;
    }
    /**
     * @return Number of retry attempts.
     * 
     */
    public Optional<Integer> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateMode;
        private @Nullable Integer connectionRetryInterval;
        private ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestination destination;
        private @Nullable Integer numRetries;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.connectionRetryInterval = defaults.connectionRetryInterval;
    	      this.destination = defaults.destination;
    	      this.numRetries = defaults.numRetries;
        }

        @CustomType.Setter
        public Builder certificateMode(@Nullable String certificateMode) {
            this.certificateMode = certificateMode;
            return this;
        }
        @CustomType.Setter
        public Builder connectionRetryInterval(@Nullable Integer connectionRetryInterval) {
            this.connectionRetryInterval = connectionRetryInterval;
            return this;
        }
        @CustomType.Setter
        public Builder destination(ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettingsDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder numRetries(@Nullable Integer numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettings build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputOutputSettingsRtmpOutputSettings();
            o.certificateMode = certificateMode;
            o.connectionRetryInterval = connectionRetryInterval;
            o.destination = destination;
            o.numRetries = numRetries;
            return o;
        }
    }
}
