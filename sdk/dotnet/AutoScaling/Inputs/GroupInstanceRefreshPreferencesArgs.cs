// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class GroupInstanceRefreshPreferencesArgs : Pulumi.ResourceArgs
    {
        [Input("instanceWarmup")]
        public Input<string>? InstanceWarmup { get; set; }

        /// <summary>
        /// The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
        /// </summary>
        [Input("minHealthyPercentage")]
        public Input<int>? MinHealthyPercentage { get; set; }

        public GroupInstanceRefreshPreferencesArgs()
        {
        }
    }
}