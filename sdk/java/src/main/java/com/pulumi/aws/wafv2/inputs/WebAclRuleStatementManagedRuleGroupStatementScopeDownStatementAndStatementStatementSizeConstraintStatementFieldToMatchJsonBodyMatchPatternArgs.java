// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs();

    /**
     * An empty configuration block that is used for inspecting all headers.
     * 
     */
    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs> all;

    /**
     * @return An empty configuration block that is used for inspecting all headers.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    @Import(name="includedPaths")
    private @Nullable Output<List<String>> includedPaths;

    public Optional<Output<List<String>>> includedPaths() {
        return Optional.ofNullable(this.includedPaths);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs $) {
        this.all = $.all;
        this.includedPaths = $.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all An empty configuration block that is used for inspecting all headers.
         * 
         * @return builder
         * 
         */
        public Builder all(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        public Builder includedPaths(@Nullable Output<List<String>> includedPaths) {
            $.includedPaths = includedPaths;
            return this;
        }

        public Builder includedPaths(List<String> includedPaths) {
            return includedPaths(Output.of(includedPaths));
        }

        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs build() {
            return $;
        }
    }

}
