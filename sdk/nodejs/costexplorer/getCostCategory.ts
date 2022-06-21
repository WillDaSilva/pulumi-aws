// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides details about a specific CostExplorer Cost Category.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.costexplorer.getCostCategory({
 *     costCategoryArn: "costCategoryARN",
 * }));
 * ```
 */
export function getCostCategory(args: GetCostCategoryArgs, opts?: pulumi.InvokeOptions): Promise<GetCostCategoryResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:costexplorer/getCostCategory:getCostCategory", {
        "costCategoryArn": args.costCategoryArn,
    }, opts);
}

/**
 * A collection of arguments for invoking getCostCategory.
 */
export interface GetCostCategoryArgs {
    /**
     * Unique name for the Cost Category.
     */
    costCategoryArn: string;
}

/**
 * A collection of values returned by getCostCategory.
 */
export interface GetCostCategoryResult {
    readonly costCategoryArn: string;
    /**
     * Effective end data of your Cost Category.
     */
    readonly effectiveEnd: string;
    /**
     * Effective state data of your Cost Category.
     */
    readonly effectiveStart: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Rule schema version in this particular Cost Category.
     */
    readonly ruleVersion: string;
    /**
     * Configuration block for the `Expression` object used to categorize costs. See below.
     */
    readonly rules: outputs.costexplorer.GetCostCategoryRule[];
    /**
     * Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     */
    readonly splitChargeRules: outputs.costexplorer.GetCostCategorySplitChargeRule[];
}

export function getCostCategoryOutput(args: GetCostCategoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCostCategoryResult> {
    return pulumi.output(args).apply(a => getCostCategory(a, opts))
}

/**
 * A collection of arguments for invoking getCostCategory.
 */
export interface GetCostCategoryOutputArgs {
    /**
     * Unique name for the Cost Category.
     */
    costCategoryArn: pulumi.Input<string>;
}