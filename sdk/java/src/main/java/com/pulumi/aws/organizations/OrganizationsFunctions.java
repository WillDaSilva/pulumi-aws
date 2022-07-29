// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsPlainArgs;
import com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
import com.pulumi.aws.organizations.inputs.GetDelegatedServicesPlainArgs;
import com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsArgs;
import com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsPlainArgs;
import com.pulumi.aws.organizations.inputs.GetResourceTagsArgs;
import com.pulumi.aws.organizations.inputs.GetResourceTagsPlainArgs;
import com.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult;
import com.pulumi.aws.organizations.outputs.GetDelegatedServicesResult;
import com.pulumi.aws.organizations.outputs.GetOrganizationResult;
import com.pulumi.aws.organizations.outputs.GetOrganizationalUnitsResult;
import com.pulumi.aws.organizations.outputs.GetResourceTagsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class OrganizationsFunctions {
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDelegatedAdministratorsResult> getDelegatedAdministrators() {
        return getDelegatedAdministrators(GetDelegatedAdministratorsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedAdministratorsResult> getDelegatedAdministratorsPlain() {
        return getDelegatedAdministratorsPlain(GetDelegatedAdministratorsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDelegatedAdministratorsResult> getDelegatedAdministrators(GetDelegatedAdministratorsArgs args) {
        return getDelegatedAdministrators(args, InvokeOptions.Empty);
    }
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedAdministratorsResult> getDelegatedAdministratorsPlain(GetDelegatedAdministratorsPlainArgs args) {
        return getDelegatedAdministratorsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDelegatedAdministratorsResult> getDelegatedAdministrators(GetDelegatedAdministratorsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:organizations/getDelegatedAdministrators:getDelegatedAdministrators", TypeShape.of(GetDelegatedAdministratorsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list the AWS accounts that are designated as delegated administrators in this organization
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedAdministrators(GetDelegatedAdministratorsArgs.builder()
     *             .servicePrincipal(&#34;SERVICE PRINCIPAL&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedAdministratorsResult> getDelegatedAdministratorsPlain(GetDelegatedAdministratorsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getDelegatedAdministrators:getDelegatedAdministrators", TypeShape.of(GetDelegatedAdministratorsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list the AWS services for which the specified account is a delegated administrator
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedServices(GetDelegatedServicesArgs.builder()
     *             .accountId(&#34;AWS ACCOUNT ID&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDelegatedServicesResult> getDelegatedServices(GetDelegatedServicesArgs args) {
        return getDelegatedServices(args, InvokeOptions.Empty);
    }
    /**
     * Get a list the AWS services for which the specified account is a delegated administrator
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedServices(GetDelegatedServicesArgs.builder()
     *             .accountId(&#34;AWS ACCOUNT ID&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedServicesResult> getDelegatedServicesPlain(GetDelegatedServicesPlainArgs args) {
        return getDelegatedServicesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a list the AWS services for which the specified account is a delegated administrator
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedServices(GetDelegatedServicesArgs.builder()
     *             .accountId(&#34;AWS ACCOUNT ID&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDelegatedServicesResult> getDelegatedServices(GetDelegatedServicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:organizations/getDelegatedServices:getDelegatedServices", TypeShape.of(GetDelegatedServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a list the AWS services for which the specified account is a delegated administrator
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = OrganizationsFunctions.getDelegatedServices(GetDelegatedServicesArgs.builder()
     *             .accountId(&#34;AWS ACCOUNT ID&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDelegatedServicesResult> getDelegatedServicesPlain(GetDelegatedServicesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getDelegatedServices:getDelegatedServices", TypeShape.of(GetDelegatedServicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationResult> getOrganization() {
        return getOrganization(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganizationPlain() {
        return getOrganizationPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationResult> getOrganization(InvokeArgs args) {
        return getOrganization(args, InvokeOptions.Empty);
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganizationPlain(InvokeArgs args) {
        return getOrganizationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationResult> getOrganization(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:organizations/getOrganization:getOrganization", TypeShape.of(GetOrganizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information about the organization that the user&#39;s account belongs to
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationResult> getOrganizationPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getOrganization:getOrganization", TypeShape.of(GetOrganizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationalUnitsResult> getOrganizationalUnits(GetOrganizationalUnitsArgs args) {
        return getOrganizationalUnits(args, InvokeOptions.Empty);
    }
    /**
     * Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationalUnitsResult> getOrganizationalUnitsPlain(GetOrganizationalUnitsPlainArgs args) {
        return getOrganizationalUnitsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetOrganizationalUnitsResult> getOrganizationalUnits(GetOrganizationalUnitsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:organizations/getOrganizationalUnits:getOrganizationalUnits", TypeShape.of(GetOrganizationalUnitsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetOrganizationalUnitsResult> getOrganizationalUnitsPlain(GetOrganizationalUnitsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getOrganizationalUnits:getOrganizationalUnits", TypeShape.of(GetOrganizationalUnitsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get tags attached to the specified AWS Organizations resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetResourceTagsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var account = OrganizationsFunctions.getResourceTags(GetResourceTagsArgs.builder()
     *             .resourceId(&#34;123456123846&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetResourceTagsResult> getResourceTags(GetResourceTagsArgs args) {
        return getResourceTags(args, InvokeOptions.Empty);
    }
    /**
     * Get tags attached to the specified AWS Organizations resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetResourceTagsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var account = OrganizationsFunctions.getResourceTags(GetResourceTagsArgs.builder()
     *             .resourceId(&#34;123456123846&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceTagsResult> getResourceTagsPlain(GetResourceTagsPlainArgs args) {
        return getResourceTagsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get tags attached to the specified AWS Organizations resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetResourceTagsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var account = OrganizationsFunctions.getResourceTags(GetResourceTagsArgs.builder()
     *             .resourceId(&#34;123456123846&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetResourceTagsResult> getResourceTags(GetResourceTagsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:organizations/getResourceTags:getResourceTags", TypeShape.of(GetResourceTagsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get tags attached to the specified AWS Organizations resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.organizations.OrganizationsFunctions;
     * import com.pulumi.aws.organizations.inputs.GetResourceTagsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var account = OrganizationsFunctions.getResourceTags(GetResourceTagsArgs.builder()
     *             .resourceId(&#34;123456123846&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceTagsResult> getResourceTagsPlain(GetResourceTagsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:organizations/getResourceTags:getResourceTags", TypeShape.of(GetResourceTagsResult.class), args, Utilities.withVersion(options));
    }
}