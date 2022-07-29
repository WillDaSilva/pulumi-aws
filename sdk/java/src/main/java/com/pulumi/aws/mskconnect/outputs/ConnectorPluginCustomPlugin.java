// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorPluginCustomPlugin {
    /**
     * @return The Amazon Resource Name (ARN) of the worker configuration.
     * 
     */
    private final String arn;
    /**
     * @return The revision of the worker configuration.
     * 
     */
    private final Integer revision;

    @CustomType.Constructor
    private ConnectorPluginCustomPlugin(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("revision") Integer revision) {
        this.arn = arn;
        this.revision = revision;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the worker configuration.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The revision of the worker configuration.
     * 
     */
    public Integer revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorPluginCustomPlugin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorPluginCustomPlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.revision = defaults.revision;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }        public ConnectorPluginCustomPlugin build() {
            return new ConnectorPluginCustomPlugin(arn, revision);
        }
    }
}