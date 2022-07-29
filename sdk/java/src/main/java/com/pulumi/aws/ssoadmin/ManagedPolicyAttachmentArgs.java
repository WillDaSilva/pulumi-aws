// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedPolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedPolicyAttachmentArgs Empty = new ManagedPolicyAttachmentArgs();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    @Import(name="managedPolicyArn", required=true)
    private Output<String> managedPolicyArn;

    /**
     * @return The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    public Output<String> managedPolicyArn() {
        return this.managedPolicyArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Import(name="permissionSetArn", required=true)
    private Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Output<String> permissionSetArn() {
        return this.permissionSetArn;
    }

    private ManagedPolicyAttachmentArgs() {}

    private ManagedPolicyAttachmentArgs(ManagedPolicyAttachmentArgs $) {
        this.instanceArn = $.instanceArn;
        this.managedPolicyArn = $.managedPolicyArn;
        this.permissionSetArn = $.permissionSetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedPolicyAttachmentArgs $;

        public Builder() {
            $ = new ManagedPolicyAttachmentArgs();
        }

        public Builder(ManagedPolicyAttachmentArgs defaults) {
            $ = new ManagedPolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param managedPolicyArn The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder managedPolicyArn(Output<String> managedPolicyArn) {
            $.managedPolicyArn = managedPolicyArn;
            return this;
        }

        /**
         * @param managedPolicyArn The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder managedPolicyArn(String managedPolicyArn) {
            return managedPolicyArn(Output.of(managedPolicyArn));
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(Output<String> permissionSetArn) {
            $.permissionSetArn = permissionSetArn;
            return this;
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(String permissionSetArn) {
            return permissionSetArn(Output.of(permissionSetArn));
        }

        public ManagedPolicyAttachmentArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            $.managedPolicyArn = Objects.requireNonNull($.managedPolicyArn, "expected parameter 'managedPolicyArn' to be non-null");
            $.permissionSetArn = Objects.requireNonNull($.permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
            return $;
        }
    }

}