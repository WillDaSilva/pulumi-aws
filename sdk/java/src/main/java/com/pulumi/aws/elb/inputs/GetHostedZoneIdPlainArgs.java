// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostedZoneIdPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostedZoneIdPlainArgs Empty = new GetHostedZoneIdPlainArgs();

    /**
     * Name of the region whose AWS ELB HostedZoneId is desired.
     * Defaults to the region from the AWS provider configuration.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return Name of the region whose AWS ELB HostedZoneId is desired.
     * Defaults to the region from the AWS provider configuration.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetHostedZoneIdPlainArgs() {}

    private GetHostedZoneIdPlainArgs(GetHostedZoneIdPlainArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostedZoneIdPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostedZoneIdPlainArgs $;

        public Builder() {
            $ = new GetHostedZoneIdPlainArgs();
        }

        public Builder(GetHostedZoneIdPlainArgs defaults) {
            $ = new GetHostedZoneIdPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Name of the region whose AWS ELB HostedZoneId is desired.
         * Defaults to the region from the AWS provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetHostedZoneIdPlainArgs build() {
            return $;
        }
    }

}