// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> body;

    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> method;

    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> queryString;

    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> singleHeader;

    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> uriPath;

    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers.
         * 
         * @return builder
         * 
         */
        public Builder body(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param singleHeader Inspect a single header. See Single Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        /**
         * @param singleHeader Inspect a single header. See Single Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs build() {
            return $;
        }
    }

}