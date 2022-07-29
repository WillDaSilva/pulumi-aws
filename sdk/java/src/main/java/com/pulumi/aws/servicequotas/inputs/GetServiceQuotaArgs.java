// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicequotas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceQuotaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceQuotaArgs Empty = new GetServiceQuotaArgs();

    /**
     * Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_code` or `quota_name` must be specified.
     * 
     */
    @Import(name="quotaCode")
    private @Nullable Output<String> quotaCode;

    /**
     * @return Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_code` or `quota_name` must be specified.
     * 
     */
    public Optional<Output<String>> quotaCode() {
        return Optional.ofNullable(this.quotaCode);
    }

    /**
     * Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_name` or `quota_code` must be specified.
     * 
     */
    @Import(name="quotaName")
    private @Nullable Output<String> quotaName;

    /**
     * @return Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_name` or `quota_code` must be specified.
     * 
     */
    public Optional<Output<String>> quotaName() {
        return Optional.ofNullable(this.quotaName);
    }

    /**
     * Service code for the quota. Available values can be found with the `aws.servicequotas.getService` or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    @Import(name="serviceCode", required=true)
    private Output<String> serviceCode;

    /**
     * @return Service code for the quota. Available values can be found with the `aws.servicequotas.getService` or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    public Output<String> serviceCode() {
        return this.serviceCode;
    }

    private GetServiceQuotaArgs() {}

    private GetServiceQuotaArgs(GetServiceQuotaArgs $) {
        this.quotaCode = $.quotaCode;
        this.quotaName = $.quotaName;
        this.serviceCode = $.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceQuotaArgs $;

        public Builder() {
            $ = new GetServiceQuotaArgs();
        }

        public Builder(GetServiceQuotaArgs defaults) {
            $ = new GetServiceQuotaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param quotaCode Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_code` or `quota_name` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder quotaCode(@Nullable Output<String> quotaCode) {
            $.quotaCode = quotaCode;
            return this;
        }

        /**
         * @param quotaCode Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_code` or `quota_name` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder quotaCode(String quotaCode) {
            return quotaCode(Output.of(quotaCode));
        }

        /**
         * @param quotaName Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_name` or `quota_code` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder quotaName(@Nullable Output<String> quotaName) {
            $.quotaName = quotaName;
            return this;
        }

        /**
         * @param quotaName Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html). One of `quota_name` or `quota_code` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder quotaName(String quotaName) {
            return quotaName(Output.of(quotaName));
        }

        /**
         * @param serviceCode Service code for the quota. Available values can be found with the `aws.servicequotas.getService` or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
         * 
         * @return builder
         * 
         */
        public Builder serviceCode(Output<String> serviceCode) {
            $.serviceCode = serviceCode;
            return this;
        }

        /**
         * @param serviceCode Service code for the quota. Available values can be found with the `aws.servicequotas.getService` or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
         * 
         * @return builder
         * 
         */
        public Builder serviceCode(String serviceCode) {
            return serviceCode(Output.of(serviceCode));
        }

        public GetServiceQuotaArgs build() {
            $.serviceCode = Objects.requireNonNull($.serviceCode, "expected parameter 'serviceCode' to be non-null");
            return $;
        }
    }

}