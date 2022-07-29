// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs Empty = new FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs();

    /**
     * Maximum.
     * 
     */
    @Import(name="max")
    private @Nullable Output<Integer> max;

    /**
     * @return Maximum.
     * 
     */
    public Optional<Output<Integer>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * Minimum.
     * 
     */
    @Import(name="min", required=true)
    private Output<Integer> min;

    /**
     * @return Minimum.
     * 
     */
    public Output<Integer> min() {
        return this.min;
    }

    private FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs() {}

    private FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs(FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs $;

        public Builder() {
            $ = new FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs();
        }

        public Builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs defaults) {
            $ = new FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max Maximum.
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<Integer> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max Maximum.
         * 
         * @return builder
         * 
         */
        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        /**
         * @param min Minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(Output<Integer> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min Minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public FleetLaunchTemplateConfigOverrideInstanceRequirementsVcpuCountArgs build() {
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            return $;
        }
    }

}