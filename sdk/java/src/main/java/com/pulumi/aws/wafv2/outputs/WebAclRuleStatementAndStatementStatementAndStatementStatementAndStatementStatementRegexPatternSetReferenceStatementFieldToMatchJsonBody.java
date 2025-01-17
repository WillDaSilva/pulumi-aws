// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBody {
    /**
     * @return What to do when JSON parsing fails. Defaults to evaluating up to the first parsing failure. Valid values are `EVALUATE_AS_STRING`, `MATCH` and `NO_MATCH`.
     * 
     */
    private @Nullable String invalidFallbackBehavior;
    /**
     * @return The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `included_paths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * 
     */
    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern matchPattern;
    /**
     * @return The parts of the JSON to match against using the `match_pattern`. Valid values are `ALL`, `KEY` and `VALUE`.
     * 
     */
    private String matchScope;
    /**
     * @return What to do if the body is larger than can be inspected. Valid values are `CONTINUE` (default), `MATCH` and `NO_MATCH`.
     * 
     */
    private @Nullable String oversizeHandling;

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBody() {}
    /**
     * @return What to do when JSON parsing fails. Defaults to evaluating up to the first parsing failure. Valid values are `EVALUATE_AS_STRING`, `MATCH` and `NO_MATCH`.
     * 
     */
    public Optional<String> invalidFallbackBehavior() {
        return Optional.ofNullable(this.invalidFallbackBehavior);
    }
    /**
     * @return The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `included_paths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * 
     */
    public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern matchPattern() {
        return this.matchPattern;
    }
    /**
     * @return The parts of the JSON to match against using the `match_pattern`. Valid values are `ALL`, `KEY` and `VALUE`.
     * 
     */
    public String matchScope() {
        return this.matchScope;
    }
    /**
     * @return What to do if the body is larger than can be inspected. Valid values are `CONTINUE` (default), `MATCH` and `NO_MATCH`.
     * 
     */
    public Optional<String> oversizeHandling() {
        return Optional.ofNullable(this.oversizeHandling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBody defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String invalidFallbackBehavior;
        private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern matchPattern;
        private String matchScope;
        private @Nullable String oversizeHandling;
        public Builder() {}
        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
    	      this.oversizeHandling = defaults.oversizeHandling;
        }

        @CustomType.Setter
        public Builder invalidFallbackBehavior(@Nullable String invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder matchPattern(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPattern matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }
        @CustomType.Setter
        public Builder matchScope(String matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }
        @CustomType.Setter
        public Builder oversizeHandling(@Nullable String oversizeHandling) {
            this.oversizeHandling = oversizeHandling;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBody build() {
            final var o = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBody();
            o.invalidFallbackBehavior = invalidFallbackBehavior;
            o.matchPattern = matchPattern;
            o.matchScope = matchScope;
            o.oversizeHandling = oversizeHandling;
            return o;
        }
    }
}
