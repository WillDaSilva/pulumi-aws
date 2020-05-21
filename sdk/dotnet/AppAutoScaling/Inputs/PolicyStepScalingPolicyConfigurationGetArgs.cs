// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppAutoScaling.Inputs
{

    public sealed class PolicyStepScalingPolicyConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
        /// </summary>
        [Input("adjustmentType")]
        public Input<string>? AdjustmentType { get; set; }

        /// <summary>
        /// The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
        /// </summary>
        [Input("cooldown")]
        public Input<int>? Cooldown { get; set; }

        /// <summary>
        /// The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
        /// </summary>
        [Input("metricAggregationType")]
        public Input<string>? MetricAggregationType { get; set; }

        /// <summary>
        /// The minimum number to adjust your scalable dimension as a result of a scaling activity. If the adjustment type is PercentChangeInCapacity, the scaling policy changes the scalable dimension of the scalable target by this amount.
        /// </summary>
        [Input("minAdjustmentMagnitude")]
        public Input<int>? MinAdjustmentMagnitude { get; set; }

        [Input("stepAdjustments")]
        private InputList<Inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs>? _stepAdjustments;

        /// <summary>
        /// A set of adjustments that manage scaling. These have the following structure:
        /// </summary>
        public InputList<Inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs> StepAdjustments
        {
            get => _stepAdjustments ?? (_stepAdjustments = new InputList<Inputs.PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs>());
            set => _stepAdjustments = value;
        }

        public PolicyStepScalingPolicyConfigurationGetArgs()
        {
        }
    }
}