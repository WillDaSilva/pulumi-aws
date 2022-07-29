// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StudioSessionMappingState extends com.pulumi.resources.ResourceArgs {

    public static final StudioSessionMappingState Empty = new StudioSessionMappingState();

    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Import(name="identityId")
    private @Nullable Output<String> identityId;

    /**
     * @return The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    public Optional<Output<String>> identityId() {
        return Optional.ofNullable(this.identityId);
    }

    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Import(name="identityName")
    private @Nullable Output<String> identityName;

    /**
     * @return The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    public Optional<Output<String>> identityName() {
        return Optional.ofNullable(this.identityName);
    }

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @Import(name="identityType")
    private @Nullable Output<String> identityType;

    /**
     * @return Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    public Optional<Output<String>> identityType() {
        return Optional.ofNullable(this.identityType);
    }

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @Import(name="sessionPolicyArn")
    private @Nullable Output<String> sessionPolicyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    public Optional<Output<String>> sessionPolicyArn() {
        return Optional.ofNullable(this.sessionPolicyArn);
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Import(name="studioId")
    private @Nullable Output<String> studioId;

    /**
     * @return The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    public Optional<Output<String>> studioId() {
        return Optional.ofNullable(this.studioId);
    }

    private StudioSessionMappingState() {}

    private StudioSessionMappingState(StudioSessionMappingState $) {
        this.identityId = $.identityId;
        this.identityName = $.identityName;
        this.identityType = $.identityType;
        this.sessionPolicyArn = $.sessionPolicyArn;
        this.studioId = $.studioId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioSessionMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioSessionMappingState $;

        public Builder() {
            $ = new StudioSessionMappingState();
        }

        public Builder(StudioSessionMappingState defaults) {
            $ = new StudioSessionMappingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityId The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
         * 
         * @return builder
         * 
         */
        public Builder identityId(@Nullable Output<String> identityId) {
            $.identityId = identityId;
            return this;
        }

        /**
         * @param identityId The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
         * 
         * @return builder
         * 
         */
        public Builder identityId(String identityId) {
            return identityId(Output.of(identityId));
        }

        /**
         * @param identityName The name of the user or group from the Amazon Web Services SSO Identity Store.
         * 
         * @return builder
         * 
         */
        public Builder identityName(@Nullable Output<String> identityName) {
            $.identityName = identityName;
            return this;
        }

        /**
         * @param identityName The name of the user or group from the Amazon Web Services SSO Identity Store.
         * 
         * @return builder
         * 
         */
        public Builder identityName(String identityName) {
            return identityName(Output.of(identityName));
        }

        /**
         * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
         * 
         * @return builder
         * 
         */
        public Builder identityType(@Nullable Output<String> identityType) {
            $.identityType = identityType;
            return this;
        }

        /**
         * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
         * 
         * @return builder
         * 
         */
        public Builder identityType(String identityType) {
            return identityType(Output.of(identityType));
        }

        /**
         * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
         * 
         * @return builder
         * 
         */
        public Builder sessionPolicyArn(@Nullable Output<String> sessionPolicyArn) {
            $.sessionPolicyArn = sessionPolicyArn;
            return this;
        }

        /**
         * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
         * 
         * @return builder
         * 
         */
        public Builder sessionPolicyArn(String sessionPolicyArn) {
            return sessionPolicyArn(Output.of(sessionPolicyArn));
        }

        /**
         * @param studioId The ID of the Amazon EMR Studio to which the user or group will be mapped.
         * 
         * @return builder
         * 
         */
        public Builder studioId(@Nullable Output<String> studioId) {
            $.studioId = studioId;
            return this;
        }

        /**
         * @param studioId The ID of the Amazon EMR Studio to which the user or group will be mapped.
         * 
         * @return builder
         * 
         */
        public Builder studioId(String studioId) {
            return studioId(Output.of(studioId));
        }

        public StudioSessionMappingState build() {
            return $;
        }
    }

}