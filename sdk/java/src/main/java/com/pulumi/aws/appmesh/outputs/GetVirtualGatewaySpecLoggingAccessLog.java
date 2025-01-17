// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecLoggingAccessLogFile;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualGatewaySpecLoggingAccessLog {
    private List<GetVirtualGatewaySpecLoggingAccessLogFile> files;

    private GetVirtualGatewaySpecLoggingAccessLog() {}
    public List<GetVirtualGatewaySpecLoggingAccessLogFile> files() {
        return this.files;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualGatewaySpecLoggingAccessLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualGatewaySpecLoggingAccessLogFile> files;
        public Builder() {}
        public Builder(GetVirtualGatewaySpecLoggingAccessLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
        }

        @CustomType.Setter
        public Builder files(List<GetVirtualGatewaySpecLoggingAccessLogFile> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }
        public Builder files(GetVirtualGatewaySpecLoggingAccessLogFile... files) {
            return files(List.of(files));
        }
        public GetVirtualGatewaySpecLoggingAccessLog build() {
            final var o = new GetVirtualGatewaySpecLoggingAccessLog();
            o.files = files;
            return o;
        }
    }
}
