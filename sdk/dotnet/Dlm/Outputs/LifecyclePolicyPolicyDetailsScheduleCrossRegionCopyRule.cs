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
    public sealed class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption. If this parameter is not specified, the default KMS key for the account is used.
        /// </summary>
        public readonly string? CmkArn;
        /// <summary>
        /// Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
        /// </summary>
        public readonly bool? CopyTags;
        /// <summary>
        /// See the `deprecate_rule` block. Max of 1 per schedule.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRule? DeprecateRule;
        /// <summary>
        /// To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption by default is not enabled.
        /// </summary>
        public readonly bool Encrypted;
        /// <summary>
        /// Specifies the retention rule for cross-Region snapshot copies. See the `retain_rule` block. Max of 1 per action.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule? RetainRule;
        /// <summary>
        /// The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
        /// </summary>
        public readonly string Target;

        [OutputConstructor]
        private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRule(
            string? cmkArn,

            bool? copyTags,

            Outputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRule? deprecateRule,

            bool encrypted,

            Outputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule? retainRule,

            string target)
        {
            CmkArn = cmkArn;
            CopyTags = copyTags;
            DeprecateRule = deprecateRule;
            Encrypted = encrypted;
            RetainRule = retainRule;
            Target = target;
        }
    }
}
