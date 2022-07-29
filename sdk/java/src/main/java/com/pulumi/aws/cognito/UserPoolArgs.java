// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito;

import com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs;
import com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs;
import com.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs;
import com.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs;
import com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs;
import com.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSchemaArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs;
import com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs;
import com.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs;
import com.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolArgs Empty = new UserPoolArgs();

    /**
     * Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    @Import(name="accountRecoverySetting")
    private @Nullable Output<UserPoolAccountRecoverySettingArgs> accountRecoverySetting;

    /**
     * @return Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    public Optional<Output<UserPoolAccountRecoverySettingArgs>> accountRecoverySetting() {
        return Optional.ofNullable(this.accountRecoverySetting);
    }

    /**
     * Configuration block for creating a new user profile. Detailed below.
     * 
     */
    @Import(name="adminCreateUserConfig")
    private @Nullable Output<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig;

    /**
     * @return Configuration block for creating a new user profile. Detailed below.
     * 
     */
    public Optional<Output<UserPoolAdminCreateUserConfigArgs>> adminCreateUserConfig() {
        return Optional.ofNullable(this.adminCreateUserConfig);
    }

    /**
     * Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    @Import(name="aliasAttributes")
    private @Nullable Output<List<String>> aliasAttributes;

    /**
     * @return Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    public Optional<Output<List<String>>> aliasAttributes() {
        return Optional.ofNullable(this.aliasAttributes);
    }

    /**
     * Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    @Import(name="autoVerifiedAttributes")
    private @Nullable Output<List<String>> autoVerifiedAttributes;

    /**
     * @return Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    public Optional<Output<List<String>>> autoVerifiedAttributes() {
        return Optional.ofNullable(this.autoVerifiedAttributes);
    }

    /**
     * Configuration block for the user pool&#39;s device tracking. Detailed below.
     * 
     */
    @Import(name="deviceConfiguration")
    private @Nullable Output<UserPoolDeviceConfigurationArgs> deviceConfiguration;

    /**
     * @return Configuration block for the user pool&#39;s device tracking. Detailed below.
     * 
     */
    public Optional<Output<UserPoolDeviceConfigurationArgs>> deviceConfiguration() {
        return Optional.ofNullable(this.deviceConfiguration);
    }

    /**
     * Configuration block for configuring email. Detailed below.
     * 
     */
    @Import(name="emailConfiguration")
    private @Nullable Output<UserPoolEmailConfigurationArgs> emailConfiguration;

    /**
     * @return Configuration block for configuring email. Detailed below.
     * 
     */
    public Optional<Output<UserPoolEmailConfigurationArgs>> emailConfiguration() {
        return Optional.ofNullable(this.emailConfiguration);
    }

    /**
     * String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    @Import(name="emailVerificationMessage")
    private @Nullable Output<String> emailVerificationMessage;

    /**
     * @return String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    public Optional<Output<String>> emailVerificationMessage() {
        return Optional.ofNullable(this.emailVerificationMessage);
    }

    /**
     * String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    @Import(name="emailVerificationSubject")
    private @Nullable Output<String> emailVerificationSubject;

    /**
     * @return String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    public Optional<Output<String>> emailVerificationSubject() {
        return Optional.ofNullable(this.emailVerificationSubject);
    }

    /**
     * Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    @Import(name="lambdaConfig")
    private @Nullable Output<UserPoolLambdaConfigArgs> lambdaConfig;

    /**
     * @return Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    public Optional<Output<UserPoolLambdaConfigArgs>> lambdaConfig() {
        return Optional.ofNullable(this.lambdaConfig);
    }

    /**
     * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    @Import(name="mfaConfiguration")
    private @Nullable Output<String> mfaConfiguration;

    /**
     * @return Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    public Optional<Output<String>> mfaConfiguration() {
        return Optional.ofNullable(this.mfaConfiguration);
    }

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the attribute.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    @Import(name="passwordPolicy")
    private @Nullable Output<UserPoolPasswordPolicyArgs> passwordPolicy;

    /**
     * @return Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    public Optional<Output<UserPoolPasswordPolicyArgs>> passwordPolicy() {
        return Optional.ofNullable(this.passwordPolicy);
    }

    /**
     * Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    @Import(name="schemas")
    private @Nullable Output<List<UserPoolSchemaArgs>> schemas;

    /**
     * @return Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    public Optional<Output<List<UserPoolSchemaArgs>>> schemas() {
        return Optional.ofNullable(this.schemas);
    }

    /**
     * String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    @Import(name="smsAuthenticationMessage")
    private @Nullable Output<String> smsAuthenticationMessage;

    /**
     * @return String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    public Optional<Output<String>> smsAuthenticationMessage() {
        return Optional.ofNullable(this.smsAuthenticationMessage);
    }

    /**
     * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    @Import(name="smsConfiguration")
    private @Nullable Output<UserPoolSmsConfigurationArgs> smsConfiguration;

    /**
     * @return Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    public Optional<Output<UserPoolSmsConfigurationArgs>> smsConfiguration() {
        return Optional.ofNullable(this.smsConfiguration);
    }

    /**
     * String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    @Import(name="smsVerificationMessage")
    private @Nullable Output<String> smsVerificationMessage;

    /**
     * @return String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    public Optional<Output<String>> smsVerificationMessage() {
        return Optional.ofNullable(this.smsVerificationMessage);
    }

    /**
     * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    @Import(name="softwareTokenMfaConfiguration")
    private @Nullable Output<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration;

    /**
     * @return Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    public Optional<Output<UserPoolSoftwareTokenMfaConfigurationArgs>> softwareTokenMfaConfiguration() {
        return Optional.ofNullable(this.softwareTokenMfaConfiguration);
    }

    /**
     * Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    @Import(name="userPoolAddOns")
    private @Nullable Output<UserPoolUserPoolAddOnsArgs> userPoolAddOns;

    /**
     * @return Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    public Optional<Output<UserPoolUserPoolAddOnsArgs>> userPoolAddOns() {
        return Optional.ofNullable(this.userPoolAddOns);
    }

    /**
     * Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    @Import(name="usernameAttributes")
    private @Nullable Output<List<String>> usernameAttributes;

    /**
     * @return Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    public Optional<Output<List<String>>> usernameAttributes() {
        return Optional.ofNullable(this.usernameAttributes);
    }

    /**
     * Configuration block for username configuration. Detailed below.
     * 
     */
    @Import(name="usernameConfiguration")
    private @Nullable Output<UserPoolUsernameConfigurationArgs> usernameConfiguration;

    /**
     * @return Configuration block for username configuration. Detailed below.
     * 
     */
    public Optional<Output<UserPoolUsernameConfigurationArgs>> usernameConfiguration() {
        return Optional.ofNullable(this.usernameConfiguration);
    }

    /**
     * Configuration block for verification message templates. Detailed below.
     * 
     */
    @Import(name="verificationMessageTemplate")
    private @Nullable Output<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate;

    /**
     * @return Configuration block for verification message templates. Detailed below.
     * 
     */
    public Optional<Output<UserPoolVerificationMessageTemplateArgs>> verificationMessageTemplate() {
        return Optional.ofNullable(this.verificationMessageTemplate);
    }

    private UserPoolArgs() {}

    private UserPoolArgs(UserPoolArgs $) {
        this.accountRecoverySetting = $.accountRecoverySetting;
        this.adminCreateUserConfig = $.adminCreateUserConfig;
        this.aliasAttributes = $.aliasAttributes;
        this.autoVerifiedAttributes = $.autoVerifiedAttributes;
        this.deviceConfiguration = $.deviceConfiguration;
        this.emailConfiguration = $.emailConfiguration;
        this.emailVerificationMessage = $.emailVerificationMessage;
        this.emailVerificationSubject = $.emailVerificationSubject;
        this.lambdaConfig = $.lambdaConfig;
        this.mfaConfiguration = $.mfaConfiguration;
        this.name = $.name;
        this.passwordPolicy = $.passwordPolicy;
        this.schemas = $.schemas;
        this.smsAuthenticationMessage = $.smsAuthenticationMessage;
        this.smsConfiguration = $.smsConfiguration;
        this.smsVerificationMessage = $.smsVerificationMessage;
        this.softwareTokenMfaConfiguration = $.softwareTokenMfaConfiguration;
        this.tags = $.tags;
        this.userPoolAddOns = $.userPoolAddOns;
        this.usernameAttributes = $.usernameAttributes;
        this.usernameConfiguration = $.usernameConfiguration;
        this.verificationMessageTemplate = $.verificationMessageTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolArgs $;

        public Builder() {
            $ = new UserPoolArgs();
        }

        public Builder(UserPoolArgs defaults) {
            $ = new UserPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountRecoverySetting Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder accountRecoverySetting(@Nullable Output<UserPoolAccountRecoverySettingArgs> accountRecoverySetting) {
            $.accountRecoverySetting = accountRecoverySetting;
            return this;
        }

        /**
         * @param accountRecoverySetting Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder accountRecoverySetting(UserPoolAccountRecoverySettingArgs accountRecoverySetting) {
            return accountRecoverySetting(Output.of(accountRecoverySetting));
        }

        /**
         * @param adminCreateUserConfig Configuration block for creating a new user profile. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder adminCreateUserConfig(@Nullable Output<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig) {
            $.adminCreateUserConfig = adminCreateUserConfig;
            return this;
        }

        /**
         * @param adminCreateUserConfig Configuration block for creating a new user profile. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder adminCreateUserConfig(UserPoolAdminCreateUserConfigArgs adminCreateUserConfig) {
            return adminCreateUserConfig(Output.of(adminCreateUserConfig));
        }

        /**
         * @param aliasAttributes Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder aliasAttributes(@Nullable Output<List<String>> aliasAttributes) {
            $.aliasAttributes = aliasAttributes;
            return this;
        }

        /**
         * @param aliasAttributes Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder aliasAttributes(List<String> aliasAttributes) {
            return aliasAttributes(Output.of(aliasAttributes));
        }

        /**
         * @param aliasAttributes Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder aliasAttributes(String... aliasAttributes) {
            return aliasAttributes(List.of(aliasAttributes));
        }

        /**
         * @param autoVerifiedAttributes Attributes to be auto-verified. Valid values: `email`, `phone_number`.
         * 
         * @return builder
         * 
         */
        public Builder autoVerifiedAttributes(@Nullable Output<List<String>> autoVerifiedAttributes) {
            $.autoVerifiedAttributes = autoVerifiedAttributes;
            return this;
        }

        /**
         * @param autoVerifiedAttributes Attributes to be auto-verified. Valid values: `email`, `phone_number`.
         * 
         * @return builder
         * 
         */
        public Builder autoVerifiedAttributes(List<String> autoVerifiedAttributes) {
            return autoVerifiedAttributes(Output.of(autoVerifiedAttributes));
        }

        /**
         * @param autoVerifiedAttributes Attributes to be auto-verified. Valid values: `email`, `phone_number`.
         * 
         * @return builder
         * 
         */
        public Builder autoVerifiedAttributes(String... autoVerifiedAttributes) {
            return autoVerifiedAttributes(List.of(autoVerifiedAttributes));
        }

        /**
         * @param deviceConfiguration Configuration block for the user pool&#39;s device tracking. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder deviceConfiguration(@Nullable Output<UserPoolDeviceConfigurationArgs> deviceConfiguration) {
            $.deviceConfiguration = deviceConfiguration;
            return this;
        }

        /**
         * @param deviceConfiguration Configuration block for the user pool&#39;s device tracking. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder deviceConfiguration(UserPoolDeviceConfigurationArgs deviceConfiguration) {
            return deviceConfiguration(Output.of(deviceConfiguration));
        }

        /**
         * @param emailConfiguration Configuration block for configuring email. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder emailConfiguration(@Nullable Output<UserPoolEmailConfigurationArgs> emailConfiguration) {
            $.emailConfiguration = emailConfiguration;
            return this;
        }

        /**
         * @param emailConfiguration Configuration block for configuring email. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder emailConfiguration(UserPoolEmailConfigurationArgs emailConfiguration) {
            return emailConfiguration(Output.of(emailConfiguration));
        }

        /**
         * @param emailVerificationMessage String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
         * 
         * @return builder
         * 
         */
        public Builder emailVerificationMessage(@Nullable Output<String> emailVerificationMessage) {
            $.emailVerificationMessage = emailVerificationMessage;
            return this;
        }

        /**
         * @param emailVerificationMessage String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
         * 
         * @return builder
         * 
         */
        public Builder emailVerificationMessage(String emailVerificationMessage) {
            return emailVerificationMessage(Output.of(emailVerificationMessage));
        }

        /**
         * @param emailVerificationSubject String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
         * 
         * @return builder
         * 
         */
        public Builder emailVerificationSubject(@Nullable Output<String> emailVerificationSubject) {
            $.emailVerificationSubject = emailVerificationSubject;
            return this;
        }

        /**
         * @param emailVerificationSubject String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
         * 
         * @return builder
         * 
         */
        public Builder emailVerificationSubject(String emailVerificationSubject) {
            return emailVerificationSubject(Output.of(emailVerificationSubject));
        }

        /**
         * @param lambdaConfig Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConfig(@Nullable Output<UserPoolLambdaConfigArgs> lambdaConfig) {
            $.lambdaConfig = lambdaConfig;
            return this;
        }

        /**
         * @param lambdaConfig Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConfig(UserPoolLambdaConfigArgs lambdaConfig) {
            return lambdaConfig(Output.of(lambdaConfig));
        }

        /**
         * @param mfaConfiguration Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
         * 
         * @return builder
         * 
         */
        public Builder mfaConfiguration(@Nullable Output<String> mfaConfiguration) {
            $.mfaConfiguration = mfaConfiguration;
            return this;
        }

        /**
         * @param mfaConfiguration Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
         * 
         * @return builder
         * 
         */
        public Builder mfaConfiguration(String mfaConfiguration) {
            return mfaConfiguration(Output.of(mfaConfiguration));
        }

        /**
         * @param name Name of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param passwordPolicy Configuration blocked for information about the user pool password policy. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder passwordPolicy(@Nullable Output<UserPoolPasswordPolicyArgs> passwordPolicy) {
            $.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * @param passwordPolicy Configuration blocked for information about the user pool password policy. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder passwordPolicy(UserPoolPasswordPolicyArgs passwordPolicy) {
            return passwordPolicy(Output.of(passwordPolicy));
        }

        /**
         * @param schemas Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
         * 
         * @return builder
         * 
         */
        public Builder schemas(@Nullable Output<List<UserPoolSchemaArgs>> schemas) {
            $.schemas = schemas;
            return this;
        }

        /**
         * @param schemas Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
         * 
         * @return builder
         * 
         */
        public Builder schemas(List<UserPoolSchemaArgs> schemas) {
            return schemas(Output.of(schemas));
        }

        /**
         * @param schemas Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
         * 
         * @return builder
         * 
         */
        public Builder schemas(UserPoolSchemaArgs... schemas) {
            return schemas(List.of(schemas));
        }

        /**
         * @param smsAuthenticationMessage String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
         * 
         * @return builder
         * 
         */
        public Builder smsAuthenticationMessage(@Nullable Output<String> smsAuthenticationMessage) {
            $.smsAuthenticationMessage = smsAuthenticationMessage;
            return this;
        }

        /**
         * @param smsAuthenticationMessage String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
         * 
         * @return builder
         * 
         */
        public Builder smsAuthenticationMessage(String smsAuthenticationMessage) {
            return smsAuthenticationMessage(Output.of(smsAuthenticationMessage));
        }

        /**
         * @param smsConfiguration Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
         * 
         * @return builder
         * 
         */
        public Builder smsConfiguration(@Nullable Output<UserPoolSmsConfigurationArgs> smsConfiguration) {
            $.smsConfiguration = smsConfiguration;
            return this;
        }

        /**
         * @param smsConfiguration Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
         * 
         * @return builder
         * 
         */
        public Builder smsConfiguration(UserPoolSmsConfigurationArgs smsConfiguration) {
            return smsConfiguration(Output.of(smsConfiguration));
        }

        /**
         * @param smsVerificationMessage String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
         * 
         * @return builder
         * 
         */
        public Builder smsVerificationMessage(@Nullable Output<String> smsVerificationMessage) {
            $.smsVerificationMessage = smsVerificationMessage;
            return this;
        }

        /**
         * @param smsVerificationMessage String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
         * 
         * @return builder
         * 
         */
        public Builder smsVerificationMessage(String smsVerificationMessage) {
            return smsVerificationMessage(Output.of(smsVerificationMessage));
        }

        /**
         * @param softwareTokenMfaConfiguration Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder softwareTokenMfaConfiguration(@Nullable Output<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration) {
            $.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
            return this;
        }

        /**
         * @param softwareTokenMfaConfiguration Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder softwareTokenMfaConfiguration(UserPoolSoftwareTokenMfaConfigurationArgs softwareTokenMfaConfiguration) {
            return softwareTokenMfaConfiguration(Output.of(softwareTokenMfaConfiguration));
        }

        /**
         * @param tags Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userPoolAddOns Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolAddOns(@Nullable Output<UserPoolUserPoolAddOnsArgs> userPoolAddOns) {
            $.userPoolAddOns = userPoolAddOns;
            return this;
        }

        /**
         * @param userPoolAddOns Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolAddOns(UserPoolUserPoolAddOnsArgs userPoolAddOns) {
            return userPoolAddOns(Output.of(userPoolAddOns));
        }

        /**
         * @param usernameAttributes Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder usernameAttributes(@Nullable Output<List<String>> usernameAttributes) {
            $.usernameAttributes = usernameAttributes;
            return this;
        }

        /**
         * @param usernameAttributes Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder usernameAttributes(List<String> usernameAttributes) {
            return usernameAttributes(Output.of(usernameAttributes));
        }

        /**
         * @param usernameAttributes Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
         * 
         * @return builder
         * 
         */
        public Builder usernameAttributes(String... usernameAttributes) {
            return usernameAttributes(List.of(usernameAttributes));
        }

        /**
         * @param usernameConfiguration Configuration block for username configuration. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder usernameConfiguration(@Nullable Output<UserPoolUsernameConfigurationArgs> usernameConfiguration) {
            $.usernameConfiguration = usernameConfiguration;
            return this;
        }

        /**
         * @param usernameConfiguration Configuration block for username configuration. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder usernameConfiguration(UserPoolUsernameConfigurationArgs usernameConfiguration) {
            return usernameConfiguration(Output.of(usernameConfiguration));
        }

        /**
         * @param verificationMessageTemplate Configuration block for verification message templates. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder verificationMessageTemplate(@Nullable Output<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate) {
            $.verificationMessageTemplate = verificationMessageTemplate;
            return this;
        }

        /**
         * @param verificationMessageTemplate Configuration block for verification message templates. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder verificationMessageTemplate(UserPoolVerificationMessageTemplateArgs verificationMessageTemplate) {
            return verificationMessageTemplate(Output.of(verificationMessageTemplate));
        }

        public UserPoolArgs build() {
            return $;
        }
    }

}