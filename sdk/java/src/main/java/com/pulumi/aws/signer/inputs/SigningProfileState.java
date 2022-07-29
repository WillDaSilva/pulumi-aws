// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.aws.signer.inputs.SigningProfileRevocationRecordArgs;
import com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningProfileState extends com.pulumi.resources.ResourceArgs {

    public static final SigningProfileState Empty = new SigningProfileState();

    /**
     * The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    @Import(name="platformDisplayName")
    private @Nullable Output<String> platformDisplayName;

    /**
     * @return A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    public Optional<Output<String>> platformDisplayName() {
        return Optional.ofNullable(this.platformDisplayName);
    }

    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @Import(name="platformId")
    private @Nullable Output<String> platformId;

    /**
     * @return The ID of the platform that is used by the target signing profile.
     * 
     */
    public Optional<Output<String>> platformId() {
        return Optional.ofNullable(this.platformId);
    }

    /**
     * Revocation information for a signing profile.
     * 
     */
    @Import(name="revocationRecords")
    private @Nullable Output<List<SigningProfileRevocationRecordArgs>> revocationRecords;

    /**
     * @return Revocation information for a signing profile.
     * 
     */
    public Optional<Output<List<SigningProfileRevocationRecordArgs>>> revocationRecords() {
        return Optional.ofNullable(this.revocationRecords);
    }

    /**
     * The validity period for a signing job.
     * 
     */
    @Import(name="signatureValidityPeriod")
    private @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    /**
     * @return The validity period for a signing job.
     * 
     */
    public Optional<Output<SigningProfileSignatureValidityPeriodArgs>> signatureValidityPeriod() {
        return Optional.ofNullable(this.signatureValidityPeriod);
    }

    /**
     * The status of the target signing profile.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the target signing profile.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The current version of the signing profile.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The current version of the signing profile.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The signing profile ARN, including the profile version.
     * 
     */
    @Import(name="versionArn")
    private @Nullable Output<String> versionArn;

    /**
     * @return The signing profile ARN, including the profile version.
     * 
     */
    public Optional<Output<String>> versionArn() {
        return Optional.ofNullable(this.versionArn);
    }

    private SigningProfileState() {}

    private SigningProfileState(SigningProfileState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.platformDisplayName = $.platformDisplayName;
        this.platformId = $.platformId;
        this.revocationRecords = $.revocationRecords;
        this.signatureValidityPeriod = $.signatureValidityPeriod;
        this.status = $.status;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.version = $.version;
        this.versionArn = $.versionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningProfileState $;

        public Builder() {
            $ = new SigningProfileState();
        }

        public Builder(SigningProfileState defaults) {
            $ = new SigningProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) for the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) for the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param platformDisplayName A human-readable name for the signing platform associated with the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder platformDisplayName(@Nullable Output<String> platformDisplayName) {
            $.platformDisplayName = platformDisplayName;
            return this;
        }

        /**
         * @param platformDisplayName A human-readable name for the signing platform associated with the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder platformDisplayName(String platformDisplayName) {
            return platformDisplayName(Output.of(platformDisplayName));
        }

        /**
         * @param platformId The ID of the platform that is used by the target signing profile.
         * 
         * @return builder
         * 
         */
        public Builder platformId(@Nullable Output<String> platformId) {
            $.platformId = platformId;
            return this;
        }

        /**
         * @param platformId The ID of the platform that is used by the target signing profile.
         * 
         * @return builder
         * 
         */
        public Builder platformId(String platformId) {
            return platformId(Output.of(platformId));
        }

        /**
         * @param revocationRecords Revocation information for a signing profile.
         * 
         * @return builder
         * 
         */
        public Builder revocationRecords(@Nullable Output<List<SigningProfileRevocationRecordArgs>> revocationRecords) {
            $.revocationRecords = revocationRecords;
            return this;
        }

        /**
         * @param revocationRecords Revocation information for a signing profile.
         * 
         * @return builder
         * 
         */
        public Builder revocationRecords(List<SigningProfileRevocationRecordArgs> revocationRecords) {
            return revocationRecords(Output.of(revocationRecords));
        }

        /**
         * @param revocationRecords Revocation information for a signing profile.
         * 
         * @return builder
         * 
         */
        public Builder revocationRecords(SigningProfileRevocationRecordArgs... revocationRecords) {
            return revocationRecords(List.of(revocationRecords));
        }

        /**
         * @param signatureValidityPeriod The validity period for a signing job.
         * 
         * @return builder
         * 
         */
        public Builder signatureValidityPeriod(@Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            $.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }

        /**
         * @param signatureValidityPeriod The validity period for a signing job.
         * 
         * @return builder
         * 
         */
        public Builder signatureValidityPeriod(SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            return signatureValidityPeriod(Output.of(signatureValidityPeriod));
        }

        /**
         * @param status The status of the target signing profile.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the target signing profile.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param version The current version of the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The current version of the signing profile.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param versionArn The signing profile ARN, including the profile version.
         * 
         * @return builder
         * 
         */
        public Builder versionArn(@Nullable Output<String> versionArn) {
            $.versionArn = versionArn;
            return this;
        }

        /**
         * @param versionArn The signing profile ARN, including the profile version.
         * 
         * @return builder
         * 
         */
        public Builder versionArn(String versionArn) {
            return versionArn(Output.of(versionArn));
        }

        public SigningProfileState build() {
            return $;
        }
    }

}