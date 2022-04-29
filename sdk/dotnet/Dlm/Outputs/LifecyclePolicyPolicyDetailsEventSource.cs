// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Outputs
{

    [OutputType]
    public sealed class LifecyclePolicyPolicyDetailsEventSource
    {
        /// <summary>
        /// Information about the event. See the `parameters` configuration block.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsEventSourceParameters Parameters;
        /// <summary>
        /// The source of the event. Currently only managed CloudWatch Events rules are supported. Valid values are `MANAGED_CWE`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private LifecyclePolicyPolicyDetailsEventSource(
            Outputs.LifecyclePolicyPolicyDetailsEventSourceParameters parameters,

            string type)
        {
            Parameters = parameters;
            Type = type;
        }
    }
}