// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.aws.opsworks.outputs.HaproxyLayerCloudwatchConfigurationLogStream;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HaproxyLayerCloudwatchConfiguration {
    private @Nullable Boolean enabled;
    private @Nullable List<HaproxyLayerCloudwatchConfigurationLogStream> logStreams;

    private HaproxyLayerCloudwatchConfiguration() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<HaproxyLayerCloudwatchConfigurationLogStream> logStreams() {
        return this.logStreams == null ? List.of() : this.logStreams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaproxyLayerCloudwatchConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<HaproxyLayerCloudwatchConfigurationLogStream> logStreams;
        public Builder() {}
        public Builder(HaproxyLayerCloudwatchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder logStreams(@Nullable List<HaproxyLayerCloudwatchConfigurationLogStream> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public Builder logStreams(HaproxyLayerCloudwatchConfigurationLogStream... logStreams) {
            return logStreams(List.of(logStreams));
        }
        public HaproxyLayerCloudwatchConfiguration build() {
            final var o = new HaproxyLayerCloudwatchConfiguration();
            o.enabled = enabled;
            o.logStreams = logStreams;
            return o;
        }
    }
}
