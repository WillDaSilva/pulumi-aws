// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs();

    /**
     * Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementArgs>> statements;

    /**
     * @return Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs() {}

    private WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements Statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}