// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainPolicyArgs Empty = new DomainPolicyArgs();

    /**
     * IAM policy document specifying the access policies for the domain
     * 
     */
    @Import(name="accessPolicies", required=true)
    private Output<String> accessPolicies;

    /**
     * @return IAM policy document specifying the access policies for the domain
     * 
     */
    public Output<String> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    private DomainPolicyArgs() {}

    private DomainPolicyArgs(DomainPolicyArgs $) {
        this.accessPolicies = $.accessPolicies;
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainPolicyArgs $;

        public Builder() {
            $ = new DomainPolicyArgs();
        }

        public Builder(DomainPolicyArgs defaults) {
            $ = new DomainPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicies IAM policy document specifying the access policies for the domain
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(Output<String> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        /**
         * @param accessPolicies IAM policy document specifying the access policies for the domain
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(String accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        /**
         * @param domainName Name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public DomainPolicyArgs build() {
            $.accessPolicies = Objects.requireNonNull($.accessPolicies, "expected parameter 'accessPolicies' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}