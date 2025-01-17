// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfgurationSetTrackingOptions {
    /**
     * @return Custom subdomain that is used to redirect email recipients to the Amazon SES event tracking domain.
     * 
     */
    private @Nullable String customRedirectDomain;

    private ConfgurationSetTrackingOptions() {}
    /**
     * @return Custom subdomain that is used to redirect email recipients to the Amazon SES event tracking domain.
     * 
     */
    public Optional<String> customRedirectDomain() {
        return Optional.ofNullable(this.customRedirectDomain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfgurationSetTrackingOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customRedirectDomain;
        public Builder() {}
        public Builder(ConfgurationSetTrackingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRedirectDomain = defaults.customRedirectDomain;
        }

        @CustomType.Setter
        public Builder customRedirectDomain(@Nullable String customRedirectDomain) {
            this.customRedirectDomain = customRedirectDomain;
            return this;
        }
        public ConfgurationSetTrackingOptions build() {
            final var o = new ConfgurationSetTrackingOptions();
            o.customRedirectDomain = customRedirectDomain;
            return o;
        }
    }
}
