// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Adds an IoT Thing to an IoT Thing Group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iot"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := iot.NewThingGroupMembership(ctx, "example", &iot.ThingGroupMembershipArgs{
// 			OverrideDynamicGroup: pulumi.Bool(true),
// 			ThingGroupName:       pulumi.String("example-group"),
// 			ThingName:            pulumi.String("example-thing"),
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
// IoT Thing Group Membership can be imported using the thing group name and thing name.
//
// ```sh
//  $ pulumi import aws:iot/thingGroupMembership:ThingGroupMembership example thing_group_name/thing_name
// ```
type ThingGroupMembership struct {
	pulumi.CustomResourceState

	// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
	OverrideDynamicGroup pulumi.BoolPtrOutput `pulumi:"overrideDynamicGroup"`
	// The name of the group to which you are adding a thing.
	ThingGroupName pulumi.StringOutput `pulumi:"thingGroupName"`
	// The name of the thing to add to a group.
	ThingName pulumi.StringOutput `pulumi:"thingName"`
}

// NewThingGroupMembership registers a new resource with the given unique name, arguments, and options.
func NewThingGroupMembership(ctx *pulumi.Context,
	name string, args *ThingGroupMembershipArgs, opts ...pulumi.ResourceOption) (*ThingGroupMembership, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ThingGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ThingGroupName'")
	}
	if args.ThingName == nil {
		return nil, errors.New("invalid value for required argument 'ThingName'")
	}
	var resource ThingGroupMembership
	err := ctx.RegisterResource("aws:iot/thingGroupMembership:ThingGroupMembership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetThingGroupMembership gets an existing ThingGroupMembership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetThingGroupMembership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ThingGroupMembershipState, opts ...pulumi.ResourceOption) (*ThingGroupMembership, error) {
	var resource ThingGroupMembership
	err := ctx.ReadResource("aws:iot/thingGroupMembership:ThingGroupMembership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ThingGroupMembership resources.
type thingGroupMembershipState struct {
	// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
	OverrideDynamicGroup *bool `pulumi:"overrideDynamicGroup"`
	// The name of the group to which you are adding a thing.
	ThingGroupName *string `pulumi:"thingGroupName"`
	// The name of the thing to add to a group.
	ThingName *string `pulumi:"thingName"`
}

type ThingGroupMembershipState struct {
	// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
	OverrideDynamicGroup pulumi.BoolPtrInput
	// The name of the group to which you are adding a thing.
	ThingGroupName pulumi.StringPtrInput
	// The name of the thing to add to a group.
	ThingName pulumi.StringPtrInput
}

func (ThingGroupMembershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*thingGroupMembershipState)(nil)).Elem()
}

type thingGroupMembershipArgs struct {
	// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
	OverrideDynamicGroup *bool `pulumi:"overrideDynamicGroup"`
	// The name of the group to which you are adding a thing.
	ThingGroupName string `pulumi:"thingGroupName"`
	// The name of the thing to add to a group.
	ThingName string `pulumi:"thingName"`
}

// The set of arguments for constructing a ThingGroupMembership resource.
type ThingGroupMembershipArgs struct {
	// Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
	OverrideDynamicGroup pulumi.BoolPtrInput
	// The name of the group to which you are adding a thing.
	ThingGroupName pulumi.StringInput
	// The name of the thing to add to a group.
	ThingName pulumi.StringInput
}

func (ThingGroupMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*thingGroupMembershipArgs)(nil)).Elem()
}

type ThingGroupMembershipInput interface {
	pulumi.Input

	ToThingGroupMembershipOutput() ThingGroupMembershipOutput
	ToThingGroupMembershipOutputWithContext(ctx context.Context) ThingGroupMembershipOutput
}

func (*ThingGroupMembership) ElementType() reflect.Type {
	return reflect.TypeOf((**ThingGroupMembership)(nil)).Elem()
}

func (i *ThingGroupMembership) ToThingGroupMembershipOutput() ThingGroupMembershipOutput {
	return i.ToThingGroupMembershipOutputWithContext(context.Background())
}

func (i *ThingGroupMembership) ToThingGroupMembershipOutputWithContext(ctx context.Context) ThingGroupMembershipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingGroupMembershipOutput)
}

// ThingGroupMembershipArrayInput is an input type that accepts ThingGroupMembershipArray and ThingGroupMembershipArrayOutput values.
// You can construct a concrete instance of `ThingGroupMembershipArrayInput` via:
//
//          ThingGroupMembershipArray{ ThingGroupMembershipArgs{...} }
type ThingGroupMembershipArrayInput interface {
	pulumi.Input

	ToThingGroupMembershipArrayOutput() ThingGroupMembershipArrayOutput
	ToThingGroupMembershipArrayOutputWithContext(context.Context) ThingGroupMembershipArrayOutput
}

type ThingGroupMembershipArray []ThingGroupMembershipInput

func (ThingGroupMembershipArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThingGroupMembership)(nil)).Elem()
}

func (i ThingGroupMembershipArray) ToThingGroupMembershipArrayOutput() ThingGroupMembershipArrayOutput {
	return i.ToThingGroupMembershipArrayOutputWithContext(context.Background())
}

func (i ThingGroupMembershipArray) ToThingGroupMembershipArrayOutputWithContext(ctx context.Context) ThingGroupMembershipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingGroupMembershipArrayOutput)
}

// ThingGroupMembershipMapInput is an input type that accepts ThingGroupMembershipMap and ThingGroupMembershipMapOutput values.
// You can construct a concrete instance of `ThingGroupMembershipMapInput` via:
//
//          ThingGroupMembershipMap{ "key": ThingGroupMembershipArgs{...} }
type ThingGroupMembershipMapInput interface {
	pulumi.Input

	ToThingGroupMembershipMapOutput() ThingGroupMembershipMapOutput
	ToThingGroupMembershipMapOutputWithContext(context.Context) ThingGroupMembershipMapOutput
}

type ThingGroupMembershipMap map[string]ThingGroupMembershipInput

func (ThingGroupMembershipMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThingGroupMembership)(nil)).Elem()
}

func (i ThingGroupMembershipMap) ToThingGroupMembershipMapOutput() ThingGroupMembershipMapOutput {
	return i.ToThingGroupMembershipMapOutputWithContext(context.Background())
}

func (i ThingGroupMembershipMap) ToThingGroupMembershipMapOutputWithContext(ctx context.Context) ThingGroupMembershipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThingGroupMembershipMapOutput)
}

type ThingGroupMembershipOutput struct{ *pulumi.OutputState }

func (ThingGroupMembershipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ThingGroupMembership)(nil)).Elem()
}

func (o ThingGroupMembershipOutput) ToThingGroupMembershipOutput() ThingGroupMembershipOutput {
	return o
}

func (o ThingGroupMembershipOutput) ToThingGroupMembershipOutputWithContext(ctx context.Context) ThingGroupMembershipOutput {
	return o
}

type ThingGroupMembershipArrayOutput struct{ *pulumi.OutputState }

func (ThingGroupMembershipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThingGroupMembership)(nil)).Elem()
}

func (o ThingGroupMembershipArrayOutput) ToThingGroupMembershipArrayOutput() ThingGroupMembershipArrayOutput {
	return o
}

func (o ThingGroupMembershipArrayOutput) ToThingGroupMembershipArrayOutputWithContext(ctx context.Context) ThingGroupMembershipArrayOutput {
	return o
}

func (o ThingGroupMembershipArrayOutput) Index(i pulumi.IntInput) ThingGroupMembershipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ThingGroupMembership {
		return vs[0].([]*ThingGroupMembership)[vs[1].(int)]
	}).(ThingGroupMembershipOutput)
}

type ThingGroupMembershipMapOutput struct{ *pulumi.OutputState }

func (ThingGroupMembershipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThingGroupMembership)(nil)).Elem()
}

func (o ThingGroupMembershipMapOutput) ToThingGroupMembershipMapOutput() ThingGroupMembershipMapOutput {
	return o
}

func (o ThingGroupMembershipMapOutput) ToThingGroupMembershipMapOutputWithContext(ctx context.Context) ThingGroupMembershipMapOutput {
	return o
}

func (o ThingGroupMembershipMapOutput) MapIndex(k pulumi.StringInput) ThingGroupMembershipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ThingGroupMembership {
		return vs[0].(map[string]*ThingGroupMembership)[vs[1].(string)]
	}).(ThingGroupMembershipOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ThingGroupMembershipInput)(nil)).Elem(), &ThingGroupMembership{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingGroupMembershipArrayInput)(nil)).Elem(), ThingGroupMembershipArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThingGroupMembershipMapInput)(nil)).Elem(), ThingGroupMembershipMap{})
	pulumi.RegisterOutputType(ThingGroupMembershipOutput{})
	pulumi.RegisterOutputType(ThingGroupMembershipArrayOutput{})
	pulumi.RegisterOutputType(ThingGroupMembershipMapOutput{})
}