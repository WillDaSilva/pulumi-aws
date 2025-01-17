// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPlanArgs Empty = new GetPlanArgs();

    /**
     * The Amazon Resource Name (ARN) of the contact or escalation plan.
     * 
     */
    @Import(name="contactId", required=true)
    private Output<String> contactId;

    /**
     * @return The Amazon Resource Name (ARN) of the contact or escalation plan.
     * 
     */
    public Output<String> contactId() {
        return this.contactId;
    }

    private GetPlanArgs() {}

    private GetPlanArgs(GetPlanArgs $) {
        this.contactId = $.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlanArgs $;

        public Builder() {
            $ = new GetPlanArgs();
        }

        public Builder(GetPlanArgs defaults) {
            $ = new GetPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactId The Amazon Resource Name (ARN) of the contact or escalation plan.
         * 
         * @return builder
         * 
         */
        public Builder contactId(Output<String> contactId) {
            $.contactId = contactId;
            return this;
        }

        /**
         * @param contactId The Amazon Resource Name (ARN) of the contact or escalation plan.
         * 
         * @return builder
         * 
         */
        public Builder contactId(String contactId) {
            return contactId(Output.of(contactId));
        }

        public GetPlanArgs build() {
            $.contactId = Objects.requireNonNull($.contactId, "expected parameter 'contactId' to be non-null");
            return $;
        }
    }

}
