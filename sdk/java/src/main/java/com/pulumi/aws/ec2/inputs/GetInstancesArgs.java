// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetInstancesFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancesArgs Empty = new GetInstancesArgs();

    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [describe-instances in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetInstancesFilterArgs>> filters;

    /**
     * @return One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [describe-instances in the AWS CLI reference][1].
     * 
     */
    public Optional<Output<List<GetInstancesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
     * 
     */
    @Import(name="instanceStateNames")
    private @Nullable Output<List<String>> instanceStateNames;

    /**
     * @return A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
     * 
     */
    public Optional<Output<List<String>>> instanceStateNames() {
        return Optional.ofNullable(this.instanceStateNames);
    }

    /**
     * A map of tags, each pair of which must
     * exactly match a pair on desired instances.
     * 
     */
    @Import(name="instanceTags")
    private @Nullable Output<Map<String,String>> instanceTags;

    /**
     * @return A map of tags, each pair of which must
     * exactly match a pair on desired instances.
     * 
     */
    public Optional<Output<Map<String,String>>> instanceTags() {
        return Optional.ofNullable(this.instanceTags);
    }

    private GetInstancesArgs() {}

    private GetInstancesArgs(GetInstancesArgs $) {
        this.filters = $.filters;
        this.instanceStateNames = $.instanceStateNames;
        this.instanceTags = $.instanceTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancesArgs $;

        public Builder() {
            $ = new GetInstancesArgs();
        }

        public Builder(GetInstancesArgs defaults) {
            $ = new GetInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are
         * several valid keys, for a full reference, check out
         * [describe-instances in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetInstancesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are
         * several valid keys, for a full reference, check out
         * [describe-instances in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetInstancesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are
         * several valid keys, for a full reference, check out
         * [describe-instances in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetInstancesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param instanceStateNames A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
         * 
         * @return builder
         * 
         */
        public Builder instanceStateNames(@Nullable Output<List<String>> instanceStateNames) {
            $.instanceStateNames = instanceStateNames;
            return this;
        }

        /**
         * @param instanceStateNames A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
         * 
         * @return builder
         * 
         */
        public Builder instanceStateNames(List<String> instanceStateNames) {
            return instanceStateNames(Output.of(instanceStateNames));
        }

        /**
         * @param instanceStateNames A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
         * 
         * @return builder
         * 
         */
        public Builder instanceStateNames(String... instanceStateNames) {
            return instanceStateNames(List.of(instanceStateNames));
        }

        /**
         * @param instanceTags A map of tags, each pair of which must
         * exactly match a pair on desired instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceTags(@Nullable Output<Map<String,String>> instanceTags) {
            $.instanceTags = instanceTags;
            return this;
        }

        /**
         * @param instanceTags A map of tags, each pair of which must
         * exactly match a pair on desired instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceTags(Map<String,String> instanceTags) {
            return instanceTags(Output.of(instanceTags));
        }

        public GetInstancesArgs build() {
            return $;
        }
    }

}