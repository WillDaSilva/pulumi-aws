// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleOrCostCategory;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleOrDimension;
import com.pulumi.aws.costexplorer.outputs.CostCategoryRuleRuleOrTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CostCategoryRuleRuleOr {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private final @Nullable CostCategoryRuleRuleOrCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private final @Nullable CostCategoryRuleRuleOrDimension dimension;
    /**
     * @return Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private final @Nullable CostCategoryRuleRuleOrTags tags;

    @CustomType.Constructor
    private CostCategoryRuleRuleOr(
        @CustomType.Parameter("costCategory") @Nullable CostCategoryRuleRuleOrCostCategory costCategory,
        @CustomType.Parameter("dimension") @Nullable CostCategoryRuleRuleOrDimension dimension,
        @CustomType.Parameter("tags") @Nullable CostCategoryRuleRuleOrTags tags) {
        this.costCategory = costCategory;
        this.dimension = dimension;
        this.tags = tags;
    }

    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleOrCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<CostCategoryRuleRuleOrDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Key-value mapping of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<CostCategoryRuleRuleOrTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostCategoryRuleRuleOr defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CostCategoryRuleRuleOrCostCategory costCategory;
        private @Nullable CostCategoryRuleRuleOrDimension dimension;
        private @Nullable CostCategoryRuleRuleOrTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CostCategoryRuleRuleOr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        public Builder costCategory(@Nullable CostCategoryRuleRuleOrCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }
        public Builder dimension(@Nullable CostCategoryRuleRuleOrDimension dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder tags(@Nullable CostCategoryRuleRuleOrTags tags) {
            this.tags = tags;
            return this;
        }        public CostCategoryRuleRuleOr build() {
            return new CostCategoryRuleRuleOr(costCategory, dimension, tags);
        }
    }
}