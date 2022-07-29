// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagePipelineImageTestsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImagePipelineImageTestsConfigurationArgs Empty = new ImagePipelineImageTestsConfigurationArgs();

    /**
     * Whether image tests are enabled. Defaults to `true`.
     * 
     */
    @Import(name="imageTestsEnabled")
    private @Nullable Output<Boolean> imageTestsEnabled;

    /**
     * @return Whether image tests are enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> imageTestsEnabled() {
        return Optional.ofNullable(this.imageTestsEnabled);
    }

    /**
     * Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
     * 
     */
    @Import(name="timeoutMinutes")
    private @Nullable Output<Integer> timeoutMinutes;

    /**
     * @return Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
     * 
     */
    public Optional<Output<Integer>> timeoutMinutes() {
        return Optional.ofNullable(this.timeoutMinutes);
    }

    private ImagePipelineImageTestsConfigurationArgs() {}

    private ImagePipelineImageTestsConfigurationArgs(ImagePipelineImageTestsConfigurationArgs $) {
        this.imageTestsEnabled = $.imageTestsEnabled;
        this.timeoutMinutes = $.timeoutMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagePipelineImageTestsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagePipelineImageTestsConfigurationArgs $;

        public Builder() {
            $ = new ImagePipelineImageTestsConfigurationArgs();
        }

        public Builder(ImagePipelineImageTestsConfigurationArgs defaults) {
            $ = new ImagePipelineImageTestsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageTestsEnabled Whether image tests are enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder imageTestsEnabled(@Nullable Output<Boolean> imageTestsEnabled) {
            $.imageTestsEnabled = imageTestsEnabled;
            return this;
        }

        /**
         * @param imageTestsEnabled Whether image tests are enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder imageTestsEnabled(Boolean imageTestsEnabled) {
            return imageTestsEnabled(Output.of(imageTestsEnabled));
        }

        /**
         * @param timeoutMinutes Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
         * 
         * @return builder
         * 
         */
        public Builder timeoutMinutes(@Nullable Output<Integer> timeoutMinutes) {
            $.timeoutMinutes = timeoutMinutes;
            return this;
        }

        /**
         * @param timeoutMinutes Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
         * 
         * @return builder
         * 
         */
        public Builder timeoutMinutes(Integer timeoutMinutes) {
            return timeoutMinutes(Output.of(timeoutMinutes));
        }

        public ImagePipelineImageTestsConfigurationArgs build() {
            return $;
        }
    }

}