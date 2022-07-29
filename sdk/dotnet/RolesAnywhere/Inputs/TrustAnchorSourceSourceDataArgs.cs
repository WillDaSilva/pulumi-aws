// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RolesAnywhere.Inputs
{

    public sealed class TrustAnchorSourceSourceDataArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of an ACM Private Certificate Authority.
        /// </summary>
        [Input("acmPcaArn")]
        public Input<string>? AcmPcaArn { get; set; }

        [Input("x509CertificateData")]
        public Input<string>? X509CertificateData { get; set; }

        public TrustAnchorSourceSourceDataArgs()
        {
        }
    }
}