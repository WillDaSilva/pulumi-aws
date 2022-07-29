// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequest;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 {
    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * @return The identifier for the desired client.
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    private final @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequest oauthRequest;
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    private final @Nullable String refreshToken;

    @CustomType.Constructor
    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2(
        @CustomType.Parameter("accessToken") @Nullable String accessToken,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("oauthRequest") @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequest oauthRequest,
        @CustomType.Parameter("refreshToken") @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.oauthRequest = oauthRequest;
        this.refreshToken = refreshToken;
    }

    /**
     * @return The credentials used to access protected Zendesk resources.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The identifier for the desired client.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The client secret used by the OAuth client to authenticate to the authorization server.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The OAuth requirement needed to request security tokens from the connector endpoint. See OAuth Request for more details.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequest> oauthRequest() {
        return Optional.ofNullable(this.oauthRequest);
    }
    /**
     * @return The refresh token used to refresh expired access token.
     * 
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequest oauthRequest;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.oauthRequest = defaults.oauthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder oauthRequest(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OauthRequest oauthRequest) {
            this.oauthRequest = oauthRequest;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 build() {
            return new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2(accessToken, clientId, clientSecret, oauthRequest, refreshToken);
        }
    }
}