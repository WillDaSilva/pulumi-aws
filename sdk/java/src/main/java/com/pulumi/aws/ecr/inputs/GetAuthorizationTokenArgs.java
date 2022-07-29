// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationTokenArgs Empty = new GetAuthorizationTokenArgs();

    /**
     * AWS account ID of the ECR Repository. If not specified the default account is assumed.
     * 
     */
    @Import(name="registryId")
    private @Nullable Output<String> registryId;

    /**
     * @return AWS account ID of the ECR Repository. If not specified the default account is assumed.
     * 
     */
    public Optional<Output<String>> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    private GetAuthorizationTokenArgs() {}

    private GetAuthorizationTokenArgs(GetAuthorizationTokenArgs $) {
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationTokenArgs $;

        public Builder() {
            $ = new GetAuthorizationTokenArgs();
        }

        public Builder(GetAuthorizationTokenArgs defaults) {
            $ = new GetAuthorizationTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryId AWS account ID of the ECR Repository. If not specified the default account is assumed.
         * 
         * @return builder
         * 
         */
        public Builder registryId(@Nullable Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param registryId AWS account ID of the ECR Repository. If not specified the default account is assumed.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        public GetAuthorizationTokenArgs build() {
            return $;
        }
    }

}