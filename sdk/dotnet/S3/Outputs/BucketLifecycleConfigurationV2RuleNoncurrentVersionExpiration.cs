// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Outputs
{

    [OutputType]
    public sealed class BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration
    {
        /// <summary>
        /// The number of noncurrent versions Amazon S3 will retain. Must be a non-zero positive integer.
        /// </summary>
        public readonly int? NewerNoncurrentVersions;
        /// <summary>
        /// The number of days an object is noncurrent before Amazon S3 can perform the associated action. Must be a positive integer.
        /// </summary>
        public readonly int? NoncurrentDays;

        [OutputConstructor]
        private BucketLifecycleConfigurationV2RuleNoncurrentVersionExpiration(
            int? newerNoncurrentVersions,

            int? noncurrentDays)
        {
            NewerNoncurrentVersions = newerNoncurrentVersions;
            NoncurrentDays = noncurrentDays;
        }
    }
}