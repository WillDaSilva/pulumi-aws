// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Shield
{
    /// <summary>
    /// Creates a grouping of protected resources so they can be handled as a collective.
    /// This resource grouping improves the accuracy of detection and reduces false positives. For more information see
    /// [Managing AWS Shield Advanced protection groups](https://docs.aws.amazon.com/waf/latest/developerguide/manage-protection-group.html)
    /// 
    /// ## Example Usage
    /// ### Create protection group for all resources
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Shield.ProtectionGroup("example", new Aws.Shield.ProtectionGroupArgs
    ///         {
    ///             Aggregation = "MAX",
    ///             Pattern = "ALL",
    ///             ProtectionGroupId = "example",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Create protection group for arbitrary number of resources
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var currentRegion = Output.Create(Aws.GetRegion.InvokeAsync());
    ///         var currentCallerIdentity = Output.Create(Aws.GetCallerIdentity.InvokeAsync());
    ///         var exampleEip = new Aws.Ec2.Eip("exampleEip", new Aws.Ec2.EipArgs
    ///         {
    ///             Vpc = true,
    ///         });
    ///         var exampleProtection = new Aws.Shield.Protection("exampleProtection", new Aws.Shield.ProtectionArgs
    ///         {
    ///             ResourceArn = Output.Tuple(currentRegion, currentCallerIdentity, exampleEip.Id).Apply(values =&gt;
    ///             {
    ///                 var currentRegion = values.Item1;
    ///                 var currentCallerIdentity = values.Item2;
    ///                 var id = values.Item3;
    ///                 return $"arn:aws:ec2:{currentRegion.Name}:{currentCallerIdentity.AccountId}:eip-allocation/{id}";
    ///             }),
    ///         });
    ///         var exampleProtectionGroup = new Aws.Shield.ProtectionGroup("exampleProtectionGroup", new Aws.Shield.ProtectionGroupArgs
    ///         {
    ///             ProtectionGroupId = "example",
    ///             Aggregation = "MEAN",
    ///             Pattern = "ARBITRARY",
    ///             Members = 
    ///             {
    ///                 Output.Tuple(currentRegion, currentCallerIdentity, exampleEip.Id).Apply(values =&gt;
    ///                 {
    ///                     var currentRegion = values.Item1;
    ///                     var currentCallerIdentity = values.Item2;
    ///                     var id = values.Item3;
    ///                     return $"arn:aws:ec2:{currentRegion.Name}:{currentCallerIdentity.AccountId}:eip-allocation/{id}";
    ///                 }),
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleProtection,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Create protection group for a type of resource
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Shield.ProtectionGroup("example", new Aws.Shield.ProtectionGroupArgs
    ///         {
    ///             Aggregation = "SUM",
    ///             Pattern = "BY_RESOURCE_TYPE",
    ///             ProtectionGroupId = "example",
    ///             ResourceType = "ELASTIC_IP_ALLOCATION",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Shield protection group resources can be imported by specifying their protection group id.
    /// 
    /// ```sh
    ///  $ pulumi import aws:shield/protectionGroup:ProtectionGroup example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:shield/protectionGroup:ProtectionGroup")]
    public partial class ProtectionGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
        /// </summary>
        [Output("aggregation")]
        public Output<string> Aggregation { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<string>> Members { get; private set; } = null!;

        /// <summary>
        /// The criteria to use to choose the protected resources for inclusion in the group.
        /// </summary>
        [Output("pattern")]
        public Output<string> Pattern { get; private set; } = null!;

        /// <summary>
        /// The ARN (Amazon Resource Name) of the protection group.
        /// </summary>
        [Output("protectionGroupArn")]
        public Output<string> ProtectionGroupArn { get; private set; } = null!;

        /// <summary>
        /// The name of the protection group.
        /// </summary>
        [Output("protectionGroupId")]
        public Output<string> ProtectionGroupId { get; private set; } = null!;

        /// <summary>
        /// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
        /// </summary>
        [Output("resourceType")]
        public Output<string?> ResourceType { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a ProtectionGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProtectionGroup(string name, ProtectionGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:shield/protectionGroup:ProtectionGroup", name, args ?? new ProtectionGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProtectionGroup(string name, Input<string> id, ProtectionGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:shield/protectionGroup:ProtectionGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProtectionGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProtectionGroup Get(string name, Input<string> id, ProtectionGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ProtectionGroup(name, id, state, options);
        }
    }

    public sealed class ProtectionGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
        /// </summary>
        [Input("aggregation", required: true)]
        public Input<string> Aggregation { get; set; } = null!;

        [Input("members")]
        private InputList<string>? _members;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
        /// </summary>
        public InputList<string> Members
        {
            get => _members ?? (_members = new InputList<string>());
            set => _members = value;
        }

        /// <summary>
        /// The criteria to use to choose the protected resources for inclusion in the group.
        /// </summary>
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        /// <summary>
        /// The name of the protection group.
        /// </summary>
        [Input("protectionGroupId", required: true)]
        public Input<string> ProtectionGroupId { get; set; } = null!;

        /// <summary>
        /// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ProtectionGroupArgs()
        {
        }
    }

    public sealed class ProtectionGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
        /// </summary>
        [Input("aggregation")]
        public Input<string>? Aggregation { get; set; }

        [Input("members")]
        private InputList<string>? _members;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
        /// </summary>
        public InputList<string> Members
        {
            get => _members ?? (_members = new InputList<string>());
            set => _members = value;
        }

        /// <summary>
        /// The criteria to use to choose the protected resources for inclusion in the group.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// The ARN (Amazon Resource Name) of the protection group.
        /// </summary>
        [Input("protectionGroupArn")]
        public Input<string>? ProtectionGroupArn { get; set; }

        /// <summary>
        /// The name of the protection group.
        /// </summary>
        [Input("protectionGroupId")]
        public Input<string>? ProtectionGroupId { get; set; }

        /// <summary>
        /// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public ProtectionGroupState()
        {
        }
    }
}