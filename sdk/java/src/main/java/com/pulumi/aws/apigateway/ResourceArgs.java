// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    /**
     * The ID of the parent API resource
     * 
     */
    @Import(name="parentId", required=true)
    private Output<String> parentId;

    /**
     * @return The ID of the parent API resource
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
    }

    /**
     * The last path segment of this API resource.
     * 
     */
    @Import(name="pathPart", required=true)
    private Output<String> pathPart;

    /**
     * @return The last path segment of this API resource.
     * 
     */
    public Output<String> pathPart() {
        return this.pathPart;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi", required=true)
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }

    private ResourceArgs() {}

    private ResourceArgs(ResourceArgs $) {
        this.parentId = $.parentId;
        this.pathPart = $.pathPart;
        this.restApi = $.restApi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceArgs $;

        public Builder() {
            $ = new ResourceArgs();
        }

        public Builder(ResourceArgs defaults) {
            $ = new ResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parentId The ID of the parent API resource
         * 
         * @return builder
         * 
         */
        public Builder parentId(Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The ID of the parent API resource
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        /**
         * @param pathPart The last path segment of this API resource.
         * 
         * @return builder
         * 
         */
        public Builder pathPart(Output<String> pathPart) {
            $.pathPart = pathPart;
            return this;
        }

        /**
         * @param pathPart The last path segment of this API resource.
         * 
         * @return builder
         * 
         */
        public Builder pathPart(String pathPart) {
            return pathPart(Output.of(pathPart));
        }

        /**
         * @param restApi The ID of the associated REST API
         * 
         * @return builder
         * 
         */
        public Builder restApi(Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        /**
         * @param restApi The ID of the associated REST API
         * 
         * @return builder
         * 
         */
        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        public ResourceArgs build() {
            $.parentId = Objects.requireNonNull($.parentId, "expected parameter 'parentId' to be non-null");
            $.pathPart = Objects.requireNonNull($.pathPart, "expected parameter 'pathPart' to be non-null");
            $.restApi = Objects.requireNonNull($.restApi, "expected parameter 'restApi' to be non-null");
            return $;
        }
    }

}