// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReportPlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportPlanPlainArgs Empty = new GetReportPlanPlainArgs();

    /**
     * The backup report plan name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The backup report plan name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Metadata that you can assign to help organize the report plans you create.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Metadata that you can assign to help organize the report plans you create.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetReportPlanPlainArgs() {}

    private GetReportPlanPlainArgs(GetReportPlanPlainArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportPlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportPlanPlainArgs $;

        public Builder() {
            $ = new GetReportPlanPlainArgs();
        }

        public Builder(GetReportPlanPlainArgs defaults) {
            $ = new GetReportPlanPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The backup report plan name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Metadata that you can assign to help organize the report plans you create.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetReportPlanPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}