// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateAuthorityRevocationConfigurationOcspConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityRevocationConfigurationOcspConfiguration Empty = new GetCertificateAuthorityRevocationConfigurationOcspConfiguration();

    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="ocspCustomCname", required=true)
    private String ocspCustomCname;

    public String ocspCustomCname() {
        return this.ocspCustomCname;
    }

    private GetCertificateAuthorityRevocationConfigurationOcspConfiguration() {}

    private GetCertificateAuthorityRevocationConfigurationOcspConfiguration(GetCertificateAuthorityRevocationConfigurationOcspConfiguration $) {
        this.enabled = $.enabled;
        this.ocspCustomCname = $.ocspCustomCname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityRevocationConfigurationOcspConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityRevocationConfigurationOcspConfiguration $;

        public Builder() {
            $ = new GetCertificateAuthorityRevocationConfigurationOcspConfiguration();
        }

        public Builder(GetCertificateAuthorityRevocationConfigurationOcspConfiguration defaults) {
            $ = new GetCertificateAuthorityRevocationConfigurationOcspConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder ocspCustomCname(String ocspCustomCname) {
            $.ocspCustomCname = ocspCustomCname;
            return this;
        }

        public GetCertificateAuthorityRevocationConfigurationOcspConfiguration build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.ocspCustomCname = Objects.requireNonNull($.ocspCustomCname, "expected parameter 'ocspCustomCname' to be non-null");
            return $;
        }
    }

}