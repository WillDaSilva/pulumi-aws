// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Outputs
{

    [OutputType]
    public sealed class DistributionDefaultCacheBehaviorForwardedValues
    {
        /// <summary>
        /// The forwarded values cookies
        /// that specifies how CloudFront handles cookies (maximum one).
        /// </summary>
        public readonly Outputs.DistributionDefaultCacheBehaviorForwardedValuesCookies Cookies;
        /// <summary>
        /// Specifies the Headers, if any, that you want
        /// CloudFront to vary upon for this cache behavior. Specify `*` to include all
        /// headers.
        /// </summary>
        public readonly ImmutableArray<string> Headers;
        /// <summary>
        /// Indicates whether you want CloudFront to forward
        /// query strings to the origin that is associated with this cache behavior.
        /// </summary>
        public readonly bool QueryString;
        /// <summary>
        /// When specified, along with a value of
        /// `true` for `query_string`, all query strings are forwarded, however only the
        /// query string keys listed in this argument are cached. When omitted with a
        /// value of `true` for `query_string`, all query string keys are cached.
        /// </summary>
        public readonly ImmutableArray<string> QueryStringCacheKeys;

        [OutputConstructor]
        private DistributionDefaultCacheBehaviorForwardedValues(
            Outputs.DistributionDefaultCacheBehaviorForwardedValuesCookies cookies,

            ImmutableArray<string> headers,

            bool queryString,

            ImmutableArray<string> queryStringCacheKeys)
        {
            Cookies = cookies;
            Headers = headers;
            QueryString = queryString;
            QueryStringCacheKeys = queryStringCacheKeys;
        }
    }
}