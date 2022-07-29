// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetSubnetIdsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetIdsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetIdsPlainArgs Empty = new GetSubnetIdsPlainArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSubnetIdsFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetSubnetIdsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The VPC ID that you want to filter from.
     * 
     */
    @Import(name="vpcId", required=true)
    private String vpcId;

    /**
     * @return The VPC ID that you want to filter from.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    private GetSubnetIdsPlainArgs() {}

    private GetSubnetIdsPlainArgs(GetSubnetIdsPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetIdsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetIdsPlainArgs $;

        public Builder() {
            $ = new GetSubnetIdsPlainArgs();
        }

        public Builder(GetSubnetIdsPlainArgs defaults) {
            $ = new GetSubnetIdsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSubnetIdsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSubnetIdsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired subnets.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId The VPC ID that you want to filter from.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetSubnetIdsPlainArgs build() {
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}