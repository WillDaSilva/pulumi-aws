// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.networkmanager.inputs.LinkBandwidthArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkArgs Empty = new LinkArgs();

    /**
     * The upload speed and download speed in Mbps. Documented below.
     * 
     */
    @Import(name="bandwidth", required=true)
    private Output<LinkBandwidthArgs> bandwidth;

    /**
     * @return The upload speed and download speed in Mbps. Documented below.
     * 
     */
    public Output<LinkBandwidthArgs> bandwidth() {
        return this.bandwidth;
    }

    /**
     * A description of the link.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the link.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * The provider of the link.
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return The provider of the link.
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    /**
     * The ID of the site.
     * 
     */
    @Import(name="siteId", required=true)
    private Output<String> siteId;

    /**
     * @return The ID of the site.
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the link.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the link.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private LinkArgs() {}

    private LinkArgs(LinkArgs $) {
        this.bandwidth = $.bandwidth;
        this.description = $.description;
        this.globalNetworkId = $.globalNetworkId;
        this.providerName = $.providerName;
        this.siteId = $.siteId;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkArgs $;

        public Builder() {
            $ = new LinkArgs();
        }

        public Builder(LinkArgs defaults) {
            $ = new LinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The upload speed and download speed in Mbps. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Output<LinkBandwidthArgs> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The upload speed and download speed in Mbps. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(LinkBandwidthArgs bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param description A description of the link.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the link.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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
         * @param providerName The provider of the link.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName The provider of the link.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param siteId The ID of the site.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId The ID of the site.
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type The type of the link.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the link.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LinkArgs build() {
            $.bandwidth = Objects.requireNonNull($.bandwidth, "expected parameter 'bandwidth' to be non-null");
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            $.siteId = Objects.requireNonNull($.siteId, "expected parameter 'siteId' to be non-null");
            return $;
        }
    }

}