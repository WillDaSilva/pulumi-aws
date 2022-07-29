// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGeofenceCollectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGeofenceCollectionArgs Empty = new GetGeofenceCollectionArgs();

    /**
     * The name of the geofence collection.
     * 
     */
    @Import(name="collectionName", required=true)
    private Output<String> collectionName;

    /**
     * @return The name of the geofence collection.
     * 
     */
    public Output<String> collectionName() {
        return this.collectionName;
    }

    /**
     * A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Key-value map of resource tags for the geofence collection.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the geofence collection.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetGeofenceCollectionArgs() {}

    private GetGeofenceCollectionArgs(GetGeofenceCollectionArgs $) {
        this.collectionName = $.collectionName;
        this.kmsKeyId = $.kmsKeyId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGeofenceCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGeofenceCollectionArgs $;

        public Builder() {
            $ = new GetGeofenceCollectionArgs();
        }

        public Builder(GetGeofenceCollectionArgs defaults) {
            $ = new GetGeofenceCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collectionName The name of the geofence collection.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(Output<String> collectionName) {
            $.collectionName = collectionName;
            return this;
        }

        /**
         * @param collectionName The name of the geofence collection.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(String collectionName) {
            return collectionName(Output.of(collectionName));
        }

        /**
         * @param kmsKeyId A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param tags Key-value map of resource tags for the geofence collection.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags for the geofence collection.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetGeofenceCollectionArgs build() {
            $.collectionName = Objects.requireNonNull($.collectionName, "expected parameter 'collectionName' to be non-null");
            return $;
        }
    }

}