// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.outputs;

import com.pulumi.aws.servicediscovery.outputs.ServiceDnsConfigDnsRecord;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceDnsConfig {
    /**
     * @return An array that contains one DnsRecord object for each resource record set.
     * 
     */
    private final List<ServiceDnsConfigDnsRecord> dnsRecords;
    /**
     * @return The ID of the namespace to use for DNS configuration.
     * 
     */
    private final String namespaceId;
    /**
     * @return The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
     * 
     */
    private final @Nullable String routingPolicy;

    @CustomType.Constructor
    private ServiceDnsConfig(
        @CustomType.Parameter("dnsRecords") List<ServiceDnsConfigDnsRecord> dnsRecords,
        @CustomType.Parameter("namespaceId") String namespaceId,
        @CustomType.Parameter("routingPolicy") @Nullable String routingPolicy) {
        this.dnsRecords = dnsRecords;
        this.namespaceId = namespaceId;
        this.routingPolicy = routingPolicy;
    }

    /**
     * @return An array that contains one DnsRecord object for each resource record set.
     * 
     */
    public List<ServiceDnsConfigDnsRecord> dnsRecords() {
        return this.dnsRecords;
    }
    /**
     * @return The ID of the namespace to use for DNS configuration.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }
    /**
     * @return The routing policy that you want to apply to all records that Route 53 creates when you register an instance and specify the service. Valid Values: MULTIVALUE, WEIGHTED
     * 
     */
    public Optional<String> routingPolicy() {
        return Optional.ofNullable(this.routingPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDnsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServiceDnsConfigDnsRecord> dnsRecords;
        private String namespaceId;
        private @Nullable String routingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRecords = defaults.dnsRecords;
    	      this.namespaceId = defaults.namespaceId;
    	      this.routingPolicy = defaults.routingPolicy;
        }

        public Builder dnsRecords(List<ServiceDnsConfigDnsRecord> dnsRecords) {
            this.dnsRecords = Objects.requireNonNull(dnsRecords);
            return this;
        }
        public Builder dnsRecords(ServiceDnsConfigDnsRecord... dnsRecords) {
            return dnsRecords(List.of(dnsRecords));
        }
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        public Builder routingPolicy(@Nullable String routingPolicy) {
            this.routingPolicy = routingPolicy;
            return this;
        }        public ServiceDnsConfig build() {
            return new ServiceDnsConfig(dnsRecords, namespaceId, routingPolicy);
        }
    }
}