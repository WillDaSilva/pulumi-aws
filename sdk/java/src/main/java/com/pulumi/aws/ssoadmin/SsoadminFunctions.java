// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssoadmin.inputs.GetPermissionSetArgs;
import com.pulumi.aws.ssoadmin.inputs.GetPermissionSetPlainArgs;
import com.pulumi.aws.ssoadmin.outputs.GetInstancesResult;
import com.pulumi.aws.ssoadmin.outputs.GetPermissionSetResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class SsoadminFunctions {
    /**
     * Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances.
     * 
     */
    public static Output<GetInstancesResult> getInstances() {
        return getInstances(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances.
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstancesPlain() {
        return getInstancesPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances.
     * 
     */
    public static Output<GetInstancesResult> getInstances(InvokeArgs args) {
        return getInstances(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances.
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstancesPlain(InvokeArgs args) {
        return getInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances.
     * 
     */
    public static Output<GetInstancesResult> getInstances(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ssoadmin/getInstances:getInstances", TypeShape.of(GetInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances.
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstancesPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssoadmin/getInstances:getInstances", TypeShape.of(GetInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get a Single Sign-On (SSO) Permission Set.
     * 
     */
    public static Output<GetPermissionSetResult> getPermissionSet(GetPermissionSetArgs args) {
        return getPermissionSet(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get a Single Sign-On (SSO) Permission Set.
     * 
     */
    public static CompletableFuture<GetPermissionSetResult> getPermissionSetPlain(GetPermissionSetPlainArgs args) {
        return getPermissionSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get a Single Sign-On (SSO) Permission Set.
     * 
     */
    public static Output<GetPermissionSetResult> getPermissionSet(GetPermissionSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ssoadmin/getPermissionSet:getPermissionSet", TypeShape.of(GetPermissionSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get a Single Sign-On (SSO) Permission Set.
     * 
     */
    public static CompletableFuture<GetPermissionSetResult> getPermissionSetPlain(GetPermissionSetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssoadmin/getPermissionSet:getPermissionSet", TypeShape.of(GetPermissionSetResult.class), args, Utilities.withVersion(options));
    }
}
