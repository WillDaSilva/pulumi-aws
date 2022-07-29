// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayConnectPeerAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitGatewayConnectPeerAssociationArgs Empty = new TransitGatewayConnectPeerAssociationArgs();

    /**
     * The ID of the device.
     * 
     */
    @Import(name="deviceId", required=true)
    private Output<String> deviceId;

    /**
     * @return The ID of the device.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link.
     * 
     */
    @Import(name="linkId")
    private @Nullable Output<String> linkId;

    /**
     * @return The ID of the link.
     * 
     */
    public Optional<Output<String>> linkId() {
        return Optional.ofNullable(this.linkId);
    }

    /**
     * The Amazon Resource Name (ARN) of the Connect peer.
     * 
     */
    @Import(name="transitGatewayConnectPeerArn", required=true)
    private Output<String> transitGatewayConnectPeerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Connect peer.
     * 
     */
    public Output<String> transitGatewayConnectPeerArn() {
        return this.transitGatewayConnectPeerArn;
    }

    private TransitGatewayConnectPeerAssociationArgs() {}

    private TransitGatewayConnectPeerAssociationArgs(TransitGatewayConnectPeerAssociationArgs $) {
        this.deviceId = $.deviceId;
        this.globalNetworkId = $.globalNetworkId;
        this.linkId = $.linkId;
        this.transitGatewayConnectPeerArn = $.transitGatewayConnectPeerArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayConnectPeerAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayConnectPeerAssociationArgs $;

        public Builder() {
            $ = new TransitGatewayConnectPeerAssociationArgs();
        }

        public Builder(TransitGatewayConnectPeerAssociationArgs defaults) {
            $ = new TransitGatewayConnectPeerAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId The ID of the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId The ID of the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param linkId The ID of the link.
         * 
         * @return builder
         * 
         */
        public Builder linkId(@Nullable Output<String> linkId) {
            $.linkId = linkId;
            return this;
        }

        /**
         * @param linkId The ID of the link.
         * 
         * @return builder
         * 
         */
        public Builder linkId(String linkId) {
            return linkId(Output.of(linkId));
        }

        /**
         * @param transitGatewayConnectPeerArn The Amazon Resource Name (ARN) of the Connect peer.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayConnectPeerArn(Output<String> transitGatewayConnectPeerArn) {
            $.transitGatewayConnectPeerArn = transitGatewayConnectPeerArn;
            return this;
        }

        /**
         * @param transitGatewayConnectPeerArn The Amazon Resource Name (ARN) of the Connect peer.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayConnectPeerArn(String transitGatewayConnectPeerArn) {
            return transitGatewayConnectPeerArn(Output.of(transitGatewayConnectPeerArn));
        }

        public TransitGatewayConnectPeerAssociationArgs build() {
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            $.transitGatewayConnectPeerArn = Objects.requireNonNull($.transitGatewayConnectPeerArn, "expected parameter 'transitGatewayConnectPeerArn' to be non-null");
            return $;
        }
    }

}