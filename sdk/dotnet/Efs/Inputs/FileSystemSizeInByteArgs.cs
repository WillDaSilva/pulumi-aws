// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs.Inputs
{

    public sealed class FileSystemSizeInByteArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The latest known metered size (in bytes) of data stored in the file system.
        /// </summary>
        [Input("value")]
        public Input<int>? Value { get; set; }

        /// <summary>
        /// The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
        /// </summary>
        [Input("valueInIa")]
        public Input<int>? ValueInIa { get; set; }

        /// <summary>
        /// The latest known metered size (in bytes) of data stored in the Standard storage class.
        /// </summary>
        [Input("valueInStandard")]
        public Input<int>? ValueInStandard { get; set; }

        public FileSystemSizeInByteArgs()
        {
        }
    }
}