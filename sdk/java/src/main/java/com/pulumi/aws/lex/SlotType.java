// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lex.SlotTypeArgs;
import com.pulumi.aws.lex.inputs.SlotTypeState;
import com.pulumi.aws.lex.outputs.SlotTypeEnumerationValue;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Lex Slot Type resource. For more information see
 * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lex.SlotType;
 * import com.pulumi.aws.lex.SlotTypeArgs;
 * import com.pulumi.aws.lex.inputs.SlotTypeEnumerationValueArgs;
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
 *         var flowerTypes = new SlotType(&#34;flowerTypes&#34;, SlotTypeArgs.builder()        
 *             .createVersion(true)
 *             .description(&#34;Types of flowers to order&#34;)
 *             .enumerationValues(            
 *                 SlotTypeEnumerationValueArgs.builder()
 *                     .synonyms(                    
 *                         &#34;Lirium&#34;,
 *                         &#34;Martagon&#34;)
 *                     .value(&#34;lilies&#34;)
 *                     .build(),
 *                 SlotTypeEnumerationValueArgs.builder()
 *                     .synonyms(                    
 *                         &#34;Eduardoregelia&#34;,
 *                         &#34;Podonix&#34;)
 *                     .value(&#34;tulips&#34;)
 *                     .build())
 *             .name(&#34;FlowerTypes&#34;)
 *             .valueSelectionStrategy(&#34;ORIGINAL_VALUE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Slot types can be imported using their name.
 * 
 * ```sh
 *  $ pulumi import aws:lex/slotType:SlotType flower_types FlowerTypes
 * ```
 * 
 */
@ResourceType(type="aws:lex/slotType:SlotType")
public class SlotType extends com.pulumi.resources.CustomResource {
    /**
     * Checksum identifying the version of the slot type that was created. The checksum is
     * not included as an argument because the resource will add it automatically when updating the slot type.
     * 
     */
    @Export(name="checksum", type=String.class, parameters={})
    private Output<String> checksum;

    /**
     * @return Checksum identifying the version of the slot type that was created. The checksum is
     * not included as an argument because the resource will add it automatically when updating the slot type.
     * 
     */
    public Output<String> checksum() {
        return this.checksum;
    }
    /**
     * Determines if a new slot type version is created when the initial resource is created and on each
     * update. Defaults to `false`.
     * 
     */
    @Export(name="createVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> createVersion;

    /**
     * @return Determines if a new slot type version is created when the initial resource is created and on each
     * update. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> createVersion() {
        return Codegen.optional(this.createVersion);
    }
    /**
     * The date when the slot type version was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date when the slot type version was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * A description of the slot type. Must be less than or equal to 200 characters in length.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the slot type. Must be less than or equal to 200 characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A list of EnumerationValue objects that defines the values that
     * the slot type can take. Each value can have a list of synonyms, which are additional values that help
     * train the machine learning model about the values that it resolves for a slot. Attributes are
     * documented under enumeration_value.
     * 
     */
    @Export(name="enumerationValues", type=List.class, parameters={SlotTypeEnumerationValue.class})
    private Output<List<SlotTypeEnumerationValue>> enumerationValues;

    /**
     * @return A list of EnumerationValue objects that defines the values that
     * the slot type can take. Each value can have a list of synonyms, which are additional values that help
     * train the machine learning model about the values that it resolves for a slot. Attributes are
     * documented under enumeration_value.
     * 
     */
    public Output<List<SlotTypeEnumerationValue>> enumerationValues() {
        return this.enumerationValues;
    }
    /**
     * The date when the `$LATEST` version of this slot type was updated.
     * 
     */
    @Export(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The date when the `$LATEST` version of this slot type was updated.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Determines the slot resolution strategy that Amazon Lex
     * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
     * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
     * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
     * 
     */
    @Export(name="valueSelectionStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> valueSelectionStrategy;

    /**
     * @return Determines the slot resolution strategy that Amazon Lex
     * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
     * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
     * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
     * 
     */
    public Output<Optional<String>> valueSelectionStrategy() {
        return Codegen.optional(this.valueSelectionStrategy);
    }
    /**
     * The version of the slot type.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the slot type.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SlotType(String name) {
        this(name, SlotTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SlotType(String name, SlotTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SlotType(String name, SlotTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/slotType:SlotType", name, args == null ? SlotTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SlotType(String name, Output<String> id, @Nullable SlotTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/slotType:SlotType", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SlotType get(String name, Output<String> id, @Nullable SlotTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SlotType(name, id, state, options);
    }
}