// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Inputs
{

    public sealed class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
        /// </summary>
        [Input("cmkArn")]
        public Input<string>? CmkArn { get; set; }

        /// <summary>
        /// Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
        /// </summary>
        [Input("copyTags")]
        public Input<bool>? CopyTags { get; set; }

        /// <summary>
        /// The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
        /// </summary>
        [Input("deprecateRule")]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleGetArgs>? DeprecateRule { get; set; }

        /// <summary>
        /// To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
        /// </summary>
        [Input("encrypted", required: true)]
        public Input<bool> Encrypted { get; set; } = null!;

        /// <summary>
        /// The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
        /// </summary>
        [Input("retainRule")]
        public Input<Inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs>? RetainRule { get; set; }

        /// <summary>
        /// The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs()
        {
        }
    }
}