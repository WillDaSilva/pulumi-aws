// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetSecurityGroupFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityGroupArgs Empty = new GetSecurityGroupArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetSecurityGroupFilterArgs>> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<Output<List<GetSecurityGroupFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The id of the specific security group to retrieve.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the specific security group to retrieve.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired security group.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags, each pair of which must exactly match
     * a pair on the desired security group.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The id of the VPC that the desired security group belongs to.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The id of the VPC that the desired security group belongs to.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetSecurityGroupArgs() {}

    private GetSecurityGroupArgs(GetSecurityGroupArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.name = $.name;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityGroupArgs $;

        public Builder() {
            $ = new GetSecurityGroupArgs();
        }

        public Builder(GetSecurityGroupArgs defaults) {
            $ = new GetSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetSecurityGroupFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetSecurityGroupFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSecurityGroupFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The id of the specific security group to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the specific security group to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the field to filter by, as defined by
         * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field to filter by, as defined by
         * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired security group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired security group.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The id of the VPC that the desired security group belongs to.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The id of the VPC that the desired security group belongs to.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetSecurityGroupArgs build() {
            return $;
        }
    }

}