// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InvocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InvocationArgs Empty = new InvocationArgs();

    /**
     * Name of the lambda function.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return Name of the lambda function.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    /**
     * JSON payload to the lambda function.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="input", required=true)
    private Output<String> input;

    /**
     * @return JSON payload to the lambda function.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> input() {
        return this.input;
    }

    /**
     * Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
     * 
     */
    @Import(name="qualifier")
    private @Nullable Output<String> qualifier;

    /**
     * @return Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
     * 
     */
    public Optional<Output<String>> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    /**
     * Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<Map<String,String>> triggers;

    /**
     * @return Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
     * 
     */
    public Optional<Output<Map<String,String>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private InvocationArgs() {}

    private InvocationArgs(InvocationArgs $) {
        this.functionName = $.functionName;
        this.input = $.input;
        this.qualifier = $.qualifier;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InvocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InvocationArgs $;

        public Builder() {
            $ = new InvocationArgs();
        }

        public Builder(InvocationArgs defaults) {
            $ = new InvocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionName Name of the lambda function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName Name of the lambda function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param input JSON payload to the lambda function.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder input(Output<String> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input JSON payload to the lambda function.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder input(String input) {
            return input(Output.of(input));
        }

        /**
         * @param qualifier Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable Output<String> qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        /**
         * @param qualifier Qualifier (i.e., version) of the lambda function. Defaults to `$LATEST`.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(String qualifier) {
            return qualifier(Output.of(qualifier));
        }

        /**
         * @param triggers Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<Map<String,String>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers Map of arbitrary keys and values that, when changed, will trigger a re-invocation.
         * 
         * @return builder
         * 
         */
        public Builder triggers(Map<String,String> triggers) {
            return triggers(Output.of(triggers));
        }

        public InvocationArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.input = Objects.requireNonNull($.input, "expected parameter 'input' to be non-null");
            return $;
        }
    }

}
