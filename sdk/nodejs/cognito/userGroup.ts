// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";

/**
 * Provides a Cognito User Group resource.
 */
export class UserGroup extends pulumi.CustomResource {
    /**
     * Get an existing UserGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserGroupState): UserGroup {
        return new UserGroup(name, <any>state, { id });
    }

    /**
     * The description of the user group.
     */
    public readonly description: pulumi.Output<string | undefined>;
    /**
     * The name of the user group.
     */
    public readonly name: pulumi.Output<string>;
    /**
     * The precedence of the user group.
     */
    public readonly precedence: pulumi.Output<number | undefined>;
    /**
     * The ARN of the IAM role to be associated with the user group.
     */
    public readonly roleArn: pulumi.Output<string | undefined>;
    /**
     * The user pool ID.
     */
    public readonly userPoolId: pulumi.Output<string>;

    /**
     * Create a UserGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserGroupArgs, opts?: pulumi.ResourceOptions)
    constructor(name: string, argsOrState?: UserGroupArgs | UserGroupState, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: UserGroupState = argsOrState as UserGroupState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["precedence"] = state ? state.precedence : undefined;
            inputs["roleArn"] = state ? state.roleArn : undefined;
            inputs["userPoolId"] = state ? state.userPoolId : undefined;
        } else {
            const args = argsOrState as UserGroupArgs | undefined;
            if (!args || args.userPoolId === undefined) {
                throw new Error("Missing required property 'userPoolId'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["precedence"] = args ? args.precedence : undefined;
            inputs["roleArn"] = args ? args.roleArn : undefined;
            inputs["userPoolId"] = args ? args.userPoolId : undefined;
        }
        super("aws:cognito/userGroup:UserGroup", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserGroup resources.
 */
export interface UserGroupState {
    /**
     * The description of the user group.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the user group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The precedence of the user group.
     */
    readonly precedence?: pulumi.Input<number>;
    /**
     * The ARN of the IAM role to be associated with the user group.
     */
    readonly roleArn?: pulumi.Input<string>;
    /**
     * The user pool ID.
     */
    readonly userPoolId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserGroup resource.
 */
export interface UserGroupArgs {
    /**
     * The description of the user group.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the user group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The precedence of the user group.
     */
    readonly precedence?: pulumi.Input<number>;
    /**
     * The ARN of the IAM role to be associated with the user group.
     */
    readonly roleArn?: pulumi.Input<string>;
    /**
     * The user pool ID.
     */
    readonly userPoolId: pulumi.Input<string>;
}