// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.qldb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLedgerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLedgerPlainArgs Empty = new GetLedgerPlainArgs();

    /**
     * The friendly name of the ledger to match.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The friendly name of the ledger to match.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLedgerPlainArgs() {}

    private GetLedgerPlainArgs(GetLedgerPlainArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLedgerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLedgerPlainArgs $;

        public Builder() {
            $ = new GetLedgerPlainArgs();
        }

        public Builder(GetLedgerPlainArgs defaults) {
            $ = new GetLedgerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The friendly name of the ledger to match.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLedgerPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}