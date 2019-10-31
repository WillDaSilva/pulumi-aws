// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static partial class Invokes
    {
        /// <summary>
        /// Get an existing AWS Customer Gateway.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/d/customer_gateway.html.markdown.
        /// </summary>
        public static Task<GetCustomerGatewayResult> GetCustomerGateway(GetCustomerGatewayArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCustomerGatewayResult>("aws:ec2/getCustomerGateway:getCustomerGateway", args, options.WithVersion());
    }

    public sealed class GetCustomerGatewayArgs : Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetCustomerGatewayFiltersArgs>? _filters;

        /// <summary>
        /// One or more [name-value pairs][dcg-filters] to filter by.
        /// </summary>
        public InputList<Inputs.GetCustomerGatewayFiltersArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetCustomerGatewayFiltersArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the gateway.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public GetCustomerGatewayArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetCustomerGatewayResult
    {
        /// <summary>
        /// (Optional) The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
        /// </summary>
        public readonly int BgpAsn;
        public readonly ImmutableArray<Outputs.GetCustomerGatewayFiltersResult> Filters;
        public readonly string? Id;
        /// <summary>
        /// (Optional) The IP address of the gateway's Internet-routable external interface.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// Map of key-value pairs assigned to the gateway.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCustomerGatewayResult(
            int bgpAsn,
            ImmutableArray<Outputs.GetCustomerGatewayFiltersResult> filters,
            string? id,
            string ipAddress,
            ImmutableDictionary<string, object> tags,
            string type)
        {
            BgpAsn = bgpAsn;
            Filters = filters;
            Id = id;
            IpAddress = ipAddress;
            Tags = tags;
            Type = type;
        }
    }

    namespace Inputs
    {

    public sealed class GetCustomerGatewayFiltersArgs : Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetCustomerGatewayFiltersArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetCustomerGatewayFiltersResult
    {
        public readonly string Name;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetCustomerGatewayFiltersResult(
            string name,
            ImmutableArray<string> values)
        {
            Name = name;
            Values = values;
        }
    }
    }
}