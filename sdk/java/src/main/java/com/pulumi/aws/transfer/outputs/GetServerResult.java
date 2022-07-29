// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerResult {
    /**
     * @return Amazon Resource Name (ARN) of Transfer Server.
     * 
     */
    private final String arn;
    /**
     * @return The ARN of any certificate.
     * 
     */
    private final String certificate;
    /**
     * @return The domain of the storage system that is used for file transfers.
     * 
     */
    private final String domain;
    /**
     * @return The endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`).
     * 
     */
    private final String endpoint;
    /**
     * @return The type of endpoint that the server is connected to.
     * 
     */
    private final String endpointType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
     * 
     */
    private final String identityProviderType;
    /**
     * @return Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    private final String invocationRole;
    /**
     * @return Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     * 
     */
    private final String loggingRole;
    /**
     * @return The file transfer protocol or protocols over which your file transfer protocol client can connect to your server&#39;s endpoint.
     * 
     */
    private final List<String> protocols;
    /**
     * @return The name of the security policy that is attached to the server.
     * 
     */
    private final String securityPolicyName;
    private final String serverId;
    /**
     * @return URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetServerResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identityProviderType") String identityProviderType,
        @CustomType.Parameter("invocationRole") String invocationRole,
        @CustomType.Parameter("loggingRole") String loggingRole,
        @CustomType.Parameter("protocols") List<String> protocols,
        @CustomType.Parameter("securityPolicyName") String securityPolicyName,
        @CustomType.Parameter("serverId") String serverId,
        @CustomType.Parameter("url") String url) {
        this.arn = arn;
        this.certificate = certificate;
        this.domain = domain;
        this.endpoint = endpoint;
        this.endpointType = endpointType;
        this.id = id;
        this.identityProviderType = identityProviderType;
        this.invocationRole = invocationRole;
        this.loggingRole = loggingRole;
        this.protocols = protocols;
        this.securityPolicyName = securityPolicyName;
        this.serverId = serverId;
        this.url = url;
    }

    /**
     * @return Amazon Resource Name (ARN) of Transfer Server.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The ARN of any certificate.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return The domain of the storage system that is used for file transfers.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`).
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The type of endpoint that the server is connected to.
     * 
     */
    public String endpointType() {
        return this.endpointType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
     * 
     */
    public String identityProviderType() {
        return this.identityProviderType;
    }
    /**
     * @return Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    public String invocationRole() {
        return this.invocationRole;
    }
    /**
     * @return Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     * 
     */
    public String loggingRole() {
        return this.loggingRole;
    }
    /**
     * @return The file transfer protocol or protocols over which your file transfer protocol client can connect to your server&#39;s endpoint.
     * 
     */
    public List<String> protocols() {
        return this.protocols;
    }
    /**
     * @return The name of the security policy that is attached to the server.
     * 
     */
    public String securityPolicyName() {
        return this.securityPolicyName;
    }
    public String serverId() {
        return this.serverId;
    }
    /**
     * @return URL of the service endpoint used to authenticate users with an `identity_provider_type` of `API_GATEWAY`.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificate;
        private String domain;
        private String endpoint;
        private String endpointType;
        private String id;
        private String identityProviderType;
        private String invocationRole;
        private String loggingRole;
        private List<String> protocols;
        private String securityPolicyName;
        private String serverId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.domain = defaults.domain;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointType = defaults.endpointType;
    	      this.id = defaults.id;
    	      this.identityProviderType = defaults.identityProviderType;
    	      this.invocationRole = defaults.invocationRole;
    	      this.loggingRole = defaults.loggingRole;
    	      this.protocols = defaults.protocols;
    	      this.securityPolicyName = defaults.securityPolicyName;
    	      this.serverId = defaults.serverId;
    	      this.url = defaults.url;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identityProviderType(String identityProviderType) {
            this.identityProviderType = Objects.requireNonNull(identityProviderType);
            return this;
        }
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = Objects.requireNonNull(invocationRole);
            return this;
        }
        public Builder loggingRole(String loggingRole) {
            this.loggingRole = Objects.requireNonNull(loggingRole);
            return this;
        }
        public Builder protocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder securityPolicyName(String securityPolicyName) {
            this.securityPolicyName = Objects.requireNonNull(securityPolicyName);
            return this;
        }
        public Builder serverId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetServerResult build() {
            return new GetServerResult(arn, certificate, domain, endpoint, endpointType, id, identityProviderType, invocationRole, loggingRole, protocols, securityPolicyName, serverId, url);
        }
    }
}