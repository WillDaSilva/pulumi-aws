// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie.outputs;

import com.pulumi.aws.macie.outputs.FindingsFilterFindingCriteriaCriterion;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FindingsFilterFindingCriteria {
    /**
     * @return A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * 
     */
    private final @Nullable List<FindingsFilterFindingCriteriaCriterion> criterions;

    @CustomType.Constructor
    private FindingsFilterFindingCriteria(@CustomType.Parameter("criterions") @Nullable List<FindingsFilterFindingCriteriaCriterion> criterions) {
        this.criterions = criterions;
    }

    /**
     * @return A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * 
     */
    public List<FindingsFilterFindingCriteriaCriterion> criterions() {
        return this.criterions == null ? List.of() : this.criterions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FindingsFilterFindingCriteriaCriterion> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder criterions(@Nullable List<FindingsFilterFindingCriteriaCriterion> criterions) {
            this.criterions = criterions;
            return this;
        }
        public Builder criterions(FindingsFilterFindingCriteriaCriterion... criterions) {
            return criterions(List.of(criterions));
        }        public FindingsFilterFindingCriteria build() {
            return new FindingsFilterFindingCriteria(criterions);
        }
    }
}