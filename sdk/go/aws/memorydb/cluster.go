// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package memorydb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a MemoryDB Cluster.
//
// More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/memorydb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := memorydb.NewCluster(ctx, "example", &memorydb.ClusterArgs{
// 			AclName:   pulumi.String("open-access"),
// 			NodeType:  pulumi.String("db.t4g.small"),
// 			NumShards: pulumi.Int(2),
// 			SecurityGroupIds: pulumi.StringArray{
// 				pulumi.Any(aws_security_group.Example.Id),
// 			},
// 			SnapshotRetentionLimit: pulumi.Int(7),
// 			SubnetGroupName:        pulumi.Any(aws_memorydb_subnet_group.Example.Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Use the `name` to import a cluster. For example
//
// ```sh
//  $ pulumi import aws:memorydb/cluster:Cluster example my-cluster
// ```
type Cluster struct {
	pulumi.CustomResourceState

	// The name of the Access Control List to associate with the cluster.
	AclName pulumi.StringOutput `pulumi:"aclName"`
	// The ARN of the cluster.
	// * `clusterEndpoint`
	Arn pulumi.StringOutput `pulumi:"arn"`
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrOutput              `pulumi:"autoMinorVersionUpgrade"`
	ClusterEndpoints        ClusterClusterEndpointArrayOutput `pulumi:"clusterEndpoints"`
	Description             pulumi.StringPtrOutput            `pulumi:"description"`
	// Patch version number of the Redis engine used by the cluster.
	EnginePatchVersion pulumi.StringOutput `pulumi:"enginePatchVersion"`
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName pulumi.StringPtrOutput `pulumi:"finalSnapshotName"`
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn pulumi.StringPtrOutput `pulumi:"kmsKeyArn"`
	// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow pulumi.StringOutput `pulumi:"maintenanceWindow"`
	// Name of this node.
	// * `endpoint`
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	NodeType pulumi.StringOutput `pulumi:"nodeType"`
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard pulumi.IntPtrOutput `pulumi:"numReplicasPerShard"`
	// The number of shards in the cluster. Defaults to `1`.
	NumShards pulumi.IntPtrOutput `pulumi:"numShards"`
	// The name of the parameter group associated with the cluster.
	ParameterGroupName pulumi.StringOutput `pulumi:"parameterGroupName"`
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port pulumi.IntOutput `pulumi:"port"`
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// Set of shards in this cluster.
	Shards ClusterShardArrayOutput `pulumi:"shards"`
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns pulumi.StringPtrOutput `pulumi:"snapshotArns"`
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName pulumi.StringPtrOutput `pulumi:"snapshotName"`
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit pulumi.IntOutput `pulumi:"snapshotRetentionLimit"`
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow pulumi.StringOutput `pulumi:"snapshotWindow"`
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn pulumi.StringPtrOutput `pulumi:"snsTopicArn"`
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName pulumi.StringOutput `pulumi:"subnetGroupName"`
	// A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled pulumi.BoolPtrOutput `pulumi:"tlsEnabled"`
}

// NewCluster registers a new resource with the given unique name, arguments, and options.
func NewCluster(ctx *pulumi.Context,
	name string, args *ClusterArgs, opts ...pulumi.ResourceOption) (*Cluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AclName == nil {
		return nil, errors.New("invalid value for required argument 'AclName'")
	}
	if args.NodeType == nil {
		return nil, errors.New("invalid value for required argument 'NodeType'")
	}
	var resource Cluster
	err := ctx.RegisterResource("aws:memorydb/cluster:Cluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCluster gets an existing Cluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterState, opts ...pulumi.ResourceOption) (*Cluster, error) {
	var resource Cluster
	err := ctx.ReadResource("aws:memorydb/cluster:Cluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cluster resources.
type clusterState struct {
	// The name of the Access Control List to associate with the cluster.
	AclName *string `pulumi:"aclName"`
	// The ARN of the cluster.
	// * `clusterEndpoint`
	Arn *string `pulumi:"arn"`
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade *bool                    `pulumi:"autoMinorVersionUpgrade"`
	ClusterEndpoints        []ClusterClusterEndpoint `pulumi:"clusterEndpoints"`
	Description             *string                  `pulumi:"description"`
	// Patch version number of the Redis engine used by the cluster.
	EnginePatchVersion *string `pulumi:"enginePatchVersion"`
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion *string `pulumi:"engineVersion"`
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName *string `pulumi:"finalSnapshotName"`
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow *string `pulumi:"maintenanceWindow"`
	// Name of this node.
	// * `endpoint`
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	NodeType *string `pulumi:"nodeType"`
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard *int `pulumi:"numReplicasPerShard"`
	// The number of shards in the cluster. Defaults to `1`.
	NumShards *int `pulumi:"numShards"`
	// The name of the parameter group associated with the cluster.
	ParameterGroupName *string `pulumi:"parameterGroupName"`
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port *int `pulumi:"port"`
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// Set of shards in this cluster.
	Shards []ClusterShard `pulumi:"shards"`
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns *string `pulumi:"snapshotArns"`
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName *string `pulumi:"snapshotName"`
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit *int `pulumi:"snapshotRetentionLimit"`
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow *string `pulumi:"snapshotWindow"`
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn *string `pulumi:"snsTopicArn"`
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName *string `pulumi:"subnetGroupName"`
	// A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled *bool `pulumi:"tlsEnabled"`
}

type ClusterState struct {
	// The name of the Access Control List to associate with the cluster.
	AclName pulumi.StringPtrInput
	// The ARN of the cluster.
	// * `clusterEndpoint`
	Arn pulumi.StringPtrInput
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	ClusterEndpoints        ClusterClusterEndpointArrayInput
	Description             pulumi.StringPtrInput
	// Patch version number of the Redis engine used by the cluster.
	EnginePatchVersion pulumi.StringPtrInput
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion pulumi.StringPtrInput
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName pulumi.StringPtrInput
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn pulumi.StringPtrInput
	// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow pulumi.StringPtrInput
	// Name of this node.
	// * `endpoint`
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	NodeType pulumi.StringPtrInput
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard pulumi.IntPtrInput
	// The number of shards in the cluster. Defaults to `1`.
	NumShards pulumi.IntPtrInput
	// The name of the parameter group associated with the cluster.
	ParameterGroupName pulumi.StringPtrInput
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port pulumi.IntPtrInput
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds pulumi.StringArrayInput
	// Set of shards in this cluster.
	Shards ClusterShardArrayInput
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns pulumi.StringPtrInput
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName pulumi.StringPtrInput
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit pulumi.IntPtrInput
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow pulumi.StringPtrInput
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn pulumi.StringPtrInput
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapInput
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled pulumi.BoolPtrInput
}

func (ClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterState)(nil)).Elem()
}

type clusterArgs struct {
	// The name of the Access Control List to associate with the cluster.
	AclName string `pulumi:"aclName"`
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade *bool   `pulumi:"autoMinorVersionUpgrade"`
	Description             *string `pulumi:"description"`
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion *string `pulumi:"engineVersion"`
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName *string `pulumi:"finalSnapshotName"`
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow *string `pulumi:"maintenanceWindow"`
	// Name of this node.
	// * `endpoint`
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	NodeType string `pulumi:"nodeType"`
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard *int `pulumi:"numReplicasPerShard"`
	// The number of shards in the cluster. Defaults to `1`.
	NumShards *int `pulumi:"numShards"`
	// The name of the parameter group associated with the cluster.
	ParameterGroupName *string `pulumi:"parameterGroupName"`
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port *int `pulumi:"port"`
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns *string `pulumi:"snapshotArns"`
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName *string `pulumi:"snapshotName"`
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit *int `pulumi:"snapshotRetentionLimit"`
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow *string `pulumi:"snapshotWindow"`
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn *string `pulumi:"snsTopicArn"`
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName *string `pulumi:"subnetGroupName"`
	// A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled *bool `pulumi:"tlsEnabled"`
}

// The set of arguments for constructing a Cluster resource.
type ClusterArgs struct {
	// The name of the Access Control List to associate with the cluster.
	AclName pulumi.StringInput
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	Description             pulumi.StringPtrInput
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion pulumi.StringPtrInput
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName pulumi.StringPtrInput
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn pulumi.StringPtrInput
	// Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow pulumi.StringPtrInput
	// Name of this node.
	// * `endpoint`
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	NodeType pulumi.StringInput
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard pulumi.IntPtrInput
	// The number of shards in the cluster. Defaults to `1`.
	NumShards pulumi.IntPtrInput
	// The name of the parameter group associated with the cluster.
	ParameterGroupName pulumi.StringPtrInput
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port pulumi.IntPtrInput
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds pulumi.StringArrayInput
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns pulumi.StringPtrInput
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName pulumi.StringPtrInput
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit pulumi.IntPtrInput
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow pulumi.StringPtrInput
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn pulumi.StringPtrInput
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapInput
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled pulumi.BoolPtrInput
}

func (ClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterArgs)(nil)).Elem()
}

type ClusterInput interface {
	pulumi.Input

	ToClusterOutput() ClusterOutput
	ToClusterOutputWithContext(ctx context.Context) ClusterOutput
}

func (*Cluster) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (i *Cluster) ToClusterOutput() ClusterOutput {
	return i.ToClusterOutputWithContext(context.Background())
}

func (i *Cluster) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutput)
}

// ClusterArrayInput is an input type that accepts ClusterArray and ClusterArrayOutput values.
// You can construct a concrete instance of `ClusterArrayInput` via:
//
//          ClusterArray{ ClusterArgs{...} }
type ClusterArrayInput interface {
	pulumi.Input

	ToClusterArrayOutput() ClusterArrayOutput
	ToClusterArrayOutputWithContext(context.Context) ClusterArrayOutput
}

type ClusterArray []ClusterInput

func (ClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (i ClusterArray) ToClusterArrayOutput() ClusterArrayOutput {
	return i.ToClusterArrayOutputWithContext(context.Background())
}

func (i ClusterArray) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterArrayOutput)
}

// ClusterMapInput is an input type that accepts ClusterMap and ClusterMapOutput values.
// You can construct a concrete instance of `ClusterMapInput` via:
//
//          ClusterMap{ "key": ClusterArgs{...} }
type ClusterMapInput interface {
	pulumi.Input

	ToClusterMapOutput() ClusterMapOutput
	ToClusterMapOutputWithContext(context.Context) ClusterMapOutput
}

type ClusterMap map[string]ClusterInput

func (ClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (i ClusterMap) ToClusterMapOutput() ClusterMapOutput {
	return i.ToClusterMapOutputWithContext(context.Background())
}

func (i ClusterMap) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterMapOutput)
}

type ClusterOutput struct{ *pulumi.OutputState }

func (ClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (o ClusterOutput) ToClusterOutput() ClusterOutput {
	return o
}

func (o ClusterOutput) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return o
}

type ClusterArrayOutput struct{ *pulumi.OutputState }

func (ClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (o ClusterArrayOutput) ToClusterArrayOutput() ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) Index(i pulumi.IntInput) ClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].([]*Cluster)[vs[1].(int)]
	}).(ClusterOutput)
}

type ClusterMapOutput struct{ *pulumi.OutputState }

func (ClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (o ClusterMapOutput) ToClusterMapOutput() ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) MapIndex(k pulumi.StringInput) ClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].(map[string]*Cluster)[vs[1].(string)]
	}).(ClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInput)(nil)).Elem(), &Cluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterArrayInput)(nil)).Elem(), ClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterMapInput)(nil)).Elem(), ClusterMap{})
	pulumi.RegisterOutputType(ClusterOutput{})
	pulumi.RegisterOutputType(ClusterArrayOutput{})
	pulumi.RegisterOutputType(ClusterMapOutput{})
}