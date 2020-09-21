# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'DomainAdvancedSecurityOptions',
    'DomainAdvancedSecurityOptionsMasterUserOptions',
    'DomainClusterConfig',
    'DomainClusterConfigZoneAwarenessConfig',
    'DomainCognitoOptions',
    'DomainDomainEndpointOptions',
    'DomainEbsOptions',
    'DomainEncryptAtRest',
    'DomainLogPublishingOption',
    'DomainNodeToNodeEncryption',
    'DomainSnapshotOptions',
    'DomainVpcOptions',
    'GetDomainAdvancedSecurityOptionResult',
    'GetDomainClusterConfigResult',
    'GetDomainClusterConfigZoneAwarenessConfigResult',
    'GetDomainCognitoOptionResult',
    'GetDomainEbsOptionResult',
    'GetDomainEncryptionAtRestResult',
    'GetDomainLogPublishingOptionResult',
    'GetDomainNodeToNodeEncryptionResult',
    'GetDomainSnapshotOptionResult',
    'GetDomainVpcOptionResult',
]

@pulumi.output_type
class DomainAdvancedSecurityOptions(dict):
    def __init__(__self__, *,
                 enabled: bool,
                 internal_user_database_enabled: Optional[bool] = None,
                 master_user_options: Optional['outputs.DomainAdvancedSecurityOptionsMasterUserOptions'] = None):
        """
        :param bool enabled: Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        :param bool internal_user_database_enabled: Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
        :param 'DomainAdvancedSecurityOptionsMasterUserOptionsArgs' master_user_options: Credentials for the master user: username and password, or ARN
        """
        pulumi.set(__self__, "enabled", enabled)
        if internal_user_database_enabled is not None:
            pulumi.set(__self__, "internal_user_database_enabled", internal_user_database_enabled)
        if master_user_options is not None:
            pulumi.set(__self__, "master_user_options", master_user_options)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="internalUserDatabaseEnabled")
    def internal_user_database_enabled(self) -> Optional[bool]:
        """
        Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
        """
        return pulumi.get(self, "internal_user_database_enabled")

    @property
    @pulumi.getter(name="masterUserOptions")
    def master_user_options(self) -> Optional['outputs.DomainAdvancedSecurityOptionsMasterUserOptions']:
        """
        Credentials for the master user: username and password, or ARN
        """
        return pulumi.get(self, "master_user_options")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainAdvancedSecurityOptionsMasterUserOptions(dict):
    def __init__(__self__, *,
                 master_user_arn: Optional[str] = None,
                 master_user_name: Optional[str] = None,
                 master_user_password: Optional[str] = None):
        """
        :param str master_user_arn: ARN for the master user. Only specify if `internal_user_database_enabled` is not set or set to `false`)
        :param str master_user_name: The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
        :param str master_user_password: The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
        """
        if master_user_arn is not None:
            pulumi.set(__self__, "master_user_arn", master_user_arn)
        if master_user_name is not None:
            pulumi.set(__self__, "master_user_name", master_user_name)
        if master_user_password is not None:
            pulumi.set(__self__, "master_user_password", master_user_password)

    @property
    @pulumi.getter(name="masterUserArn")
    def master_user_arn(self) -> Optional[str]:
        """
        ARN for the master user. Only specify if `internal_user_database_enabled` is not set or set to `false`)
        """
        return pulumi.get(self, "master_user_arn")

    @property
    @pulumi.getter(name="masterUserName")
    def master_user_name(self) -> Optional[str]:
        """
        The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
        """
        return pulumi.get(self, "master_user_name")

    @property
    @pulumi.getter(name="masterUserPassword")
    def master_user_password(self) -> Optional[str]:
        """
        The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internal_user_database_enabled` is set to `true`.
        """
        return pulumi.get(self, "master_user_password")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainClusterConfig(dict):
    def __init__(__self__, *,
                 dedicated_master_count: Optional[int] = None,
                 dedicated_master_enabled: Optional[bool] = None,
                 dedicated_master_type: Optional[str] = None,
                 instance_count: Optional[int] = None,
                 instance_type: Optional[str] = None,
                 warm_count: Optional[int] = None,
                 warm_enabled: Optional[bool] = None,
                 warm_type: Optional[str] = None,
                 zone_awareness_config: Optional['outputs.DomainClusterConfigZoneAwarenessConfig'] = None,
                 zone_awareness_enabled: Optional[bool] = None):
        """
        :param int dedicated_master_count: Number of dedicated master nodes in the cluster
        :param bool dedicated_master_enabled: Indicates whether dedicated master nodes are enabled for the cluster.
        :param str dedicated_master_type: Instance type of the dedicated master nodes in the cluster.
        :param int instance_count: Number of instances in the cluster.
        :param str instance_type: Instance type of data nodes in the cluster.
        :param int warm_count: The number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
        :param bool warm_enabled: Indicates whether to enable warm storage.
        :param str warm_type: The instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
        :param 'DomainClusterConfigZoneAwarenessConfigArgs' zone_awareness_config: Configuration block containing zone awareness settings. Documented below.
        :param bool zone_awareness_enabled: Indicates whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
        """
        if dedicated_master_count is not None:
            pulumi.set(__self__, "dedicated_master_count", dedicated_master_count)
        if dedicated_master_enabled is not None:
            pulumi.set(__self__, "dedicated_master_enabled", dedicated_master_enabled)
        if dedicated_master_type is not None:
            pulumi.set(__self__, "dedicated_master_type", dedicated_master_type)
        if instance_count is not None:
            pulumi.set(__self__, "instance_count", instance_count)
        if instance_type is not None:
            pulumi.set(__self__, "instance_type", instance_type)
        if warm_count is not None:
            pulumi.set(__self__, "warm_count", warm_count)
        if warm_enabled is not None:
            pulumi.set(__self__, "warm_enabled", warm_enabled)
        if warm_type is not None:
            pulumi.set(__self__, "warm_type", warm_type)
        if zone_awareness_config is not None:
            pulumi.set(__self__, "zone_awareness_config", zone_awareness_config)
        if zone_awareness_enabled is not None:
            pulumi.set(__self__, "zone_awareness_enabled", zone_awareness_enabled)

    @property
    @pulumi.getter(name="dedicatedMasterCount")
    def dedicated_master_count(self) -> Optional[int]:
        """
        Number of dedicated master nodes in the cluster
        """
        return pulumi.get(self, "dedicated_master_count")

    @property
    @pulumi.getter(name="dedicatedMasterEnabled")
    def dedicated_master_enabled(self) -> Optional[bool]:
        """
        Indicates whether dedicated master nodes are enabled for the cluster.
        """
        return pulumi.get(self, "dedicated_master_enabled")

    @property
    @pulumi.getter(name="dedicatedMasterType")
    def dedicated_master_type(self) -> Optional[str]:
        """
        Instance type of the dedicated master nodes in the cluster.
        """
        return pulumi.get(self, "dedicated_master_type")

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> Optional[int]:
        """
        Number of instances in the cluster.
        """
        return pulumi.get(self, "instance_count")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[str]:
        """
        Instance type of data nodes in the cluster.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="warmCount")
    def warm_count(self) -> Optional[int]:
        """
        The number of warm nodes in the cluster. Valid values are between `2` and `150`. `warm_count` can be only and must be set when `warm_enabled` is set to `true`.
        """
        return pulumi.get(self, "warm_count")

    @property
    @pulumi.getter(name="warmEnabled")
    def warm_enabled(self) -> Optional[bool]:
        """
        Indicates whether to enable warm storage.
        """
        return pulumi.get(self, "warm_enabled")

    @property
    @pulumi.getter(name="warmType")
    def warm_type(self) -> Optional[str]:
        """
        The instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warm_type` can be only and must be set when `warm_enabled` is set to `true`.
        """
        return pulumi.get(self, "warm_type")

    @property
    @pulumi.getter(name="zoneAwarenessConfig")
    def zone_awareness_config(self) -> Optional['outputs.DomainClusterConfigZoneAwarenessConfig']:
        """
        Configuration block containing zone awareness settings. Documented below.
        """
        return pulumi.get(self, "zone_awareness_config")

    @property
    @pulumi.getter(name="zoneAwarenessEnabled")
    def zone_awareness_enabled(self) -> Optional[bool]:
        """
        Indicates whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availability_zone_count` within the `zone_awareness_config` must be set to `3`.
        """
        return pulumi.get(self, "zone_awareness_enabled")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainClusterConfigZoneAwarenessConfig(dict):
    def __init__(__self__, *,
                 availability_zone_count: Optional[int] = None):
        """
        :param int availability_zone_count: Number of Availability Zones for the domain to use with `zone_awareness_enabled`. Defaults to `2`. Valid values: `2` or `3`.
        """
        if availability_zone_count is not None:
            pulumi.set(__self__, "availability_zone_count", availability_zone_count)

    @property
    @pulumi.getter(name="availabilityZoneCount")
    def availability_zone_count(self) -> Optional[int]:
        """
        Number of Availability Zones for the domain to use with `zone_awareness_enabled`. Defaults to `2`. Valid values: `2` or `3`.
        """
        return pulumi.get(self, "availability_zone_count")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainCognitoOptions(dict):
    def __init__(__self__, *,
                 identity_pool_id: str,
                 role_arn: str,
                 user_pool_id: str,
                 enabled: Optional[bool] = None):
        """
        :param str identity_pool_id: ID of the Cognito Identity Pool to use
        :param str role_arn: ARN of the IAM role that has the AmazonESCognitoAccess policy attached
        :param str user_pool_id: ID of the Cognito User Pool to use
        :param bool enabled: Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        pulumi.set(__self__, "identity_pool_id", identity_pool_id)
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "user_pool_id", user_pool_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter(name="identityPoolId")
    def identity_pool_id(self) -> str:
        """
        ID of the Cognito Identity Pool to use
        """
        return pulumi.get(self, "identity_pool_id")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        """
        ARN of the IAM role that has the AmazonESCognitoAccess policy attached
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> str:
        """
        ID of the Cognito User Pool to use
        """
        return pulumi.get(self, "user_pool_id")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        return pulumi.get(self, "enabled")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainDomainEndpointOptions(dict):
    def __init__(__self__, *,
                 enforce_https: bool,
                 tls_security_policy: Optional[str] = None):
        """
        :param bool enforce_https: Whether or not to require HTTPS
        :param str tls_security_policy: The name of the TLS security policy that needs to be applied to the HTTPS endpoint. Valid values:  `Policy-Min-TLS-1-0-2019-07` and `Policy-Min-TLS-1-2-2019-07`. This provider will only perform drift detection if a configuration value is provided.
        """
        pulumi.set(__self__, "enforce_https", enforce_https)
        if tls_security_policy is not None:
            pulumi.set(__self__, "tls_security_policy", tls_security_policy)

    @property
    @pulumi.getter(name="enforceHttps")
    def enforce_https(self) -> bool:
        """
        Whether or not to require HTTPS
        """
        return pulumi.get(self, "enforce_https")

    @property
    @pulumi.getter(name="tlsSecurityPolicy")
    def tls_security_policy(self) -> Optional[str]:
        """
        The name of the TLS security policy that needs to be applied to the HTTPS endpoint. Valid values:  `Policy-Min-TLS-1-0-2019-07` and `Policy-Min-TLS-1-2-2019-07`. This provider will only perform drift detection if a configuration value is provided.
        """
        return pulumi.get(self, "tls_security_policy")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainEbsOptions(dict):
    def __init__(__self__, *,
                 ebs_enabled: bool,
                 iops: Optional[int] = None,
                 volume_size: Optional[int] = None,
                 volume_type: Optional[str] = None):
        """
        :param bool ebs_enabled: Whether EBS volumes are attached to data nodes in the domain.
        :param int iops: The baseline input/output (I/O) performance of EBS volumes
               attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
        :param int volume_size: The size of EBS volumes attached to data nodes (in GB).
               **Required** if `ebs_enabled` is set to `true`.
        :param str volume_type: The type of EBS volumes attached to data nodes.
        """
        pulumi.set(__self__, "ebs_enabled", ebs_enabled)
        if iops is not None:
            pulumi.set(__self__, "iops", iops)
        if volume_size is not None:
            pulumi.set(__self__, "volume_size", volume_size)
        if volume_type is not None:
            pulumi.set(__self__, "volume_type", volume_type)

    @property
    @pulumi.getter(name="ebsEnabled")
    def ebs_enabled(self) -> bool:
        """
        Whether EBS volumes are attached to data nodes in the domain.
        """
        return pulumi.get(self, "ebs_enabled")

    @property
    @pulumi.getter
    def iops(self) -> Optional[int]:
        """
        The baseline input/output (I/O) performance of EBS volumes
        attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
        """
        return pulumi.get(self, "iops")

    @property
    @pulumi.getter(name="volumeSize")
    def volume_size(self) -> Optional[int]:
        """
        The size of EBS volumes attached to data nodes (in GB).
        **Required** if `ebs_enabled` is set to `true`.
        """
        return pulumi.get(self, "volume_size")

    @property
    @pulumi.getter(name="volumeType")
    def volume_type(self) -> Optional[str]:
        """
        The type of EBS volumes attached to data nodes.
        """
        return pulumi.get(self, "volume_type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainEncryptAtRest(dict):
    def __init__(__self__, *,
                 enabled: bool,
                 kms_key_id: Optional[str] = None):
        """
        :param bool enabled: Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        :param str kms_key_id: The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
        """
        pulumi.set(__self__, "enabled", enabled)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[str]:
        """
        The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
        """
        return pulumi.get(self, "kms_key_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainLogPublishingOption(dict):
    def __init__(__self__, *,
                 cloudwatch_log_group_arn: str,
                 log_type: str,
                 enabled: Optional[bool] = None):
        """
        :param str cloudwatch_log_group_arn: ARN of the Cloudwatch log group to which log needs to be published.
        :param str log_type: A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS
        :param bool enabled: Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        pulumi.set(__self__, "cloudwatch_log_group_arn", cloudwatch_log_group_arn)
        pulumi.set(__self__, "log_type", log_type)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> str:
        """
        ARN of the Cloudwatch log group to which log needs to be published.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @property
    @pulumi.getter(name="logType")
    def log_type(self) -> str:
        """
        A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS
        """
        return pulumi.get(self, "log_type")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        return pulumi.get(self, "enabled")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainNodeToNodeEncryption(dict):
    def __init__(__self__, *,
                 enabled: bool):
        """
        :param bool enabled: Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Specifies whether Amazon Cognito authentication with Kibana is enabled or not
        """
        return pulumi.get(self, "enabled")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainSnapshotOptions(dict):
    def __init__(__self__, *,
                 automated_snapshot_start_hour: int):
        """
        :param int automated_snapshot_start_hour: Hour during which the service takes an automated daily
               snapshot of the indices in the domain.
        """
        pulumi.set(__self__, "automated_snapshot_start_hour", automated_snapshot_start_hour)

    @property
    @pulumi.getter(name="automatedSnapshotStartHour")
    def automated_snapshot_start_hour(self) -> int:
        """
        Hour during which the service takes an automated daily
        snapshot of the indices in the domain.
        """
        return pulumi.get(self, "automated_snapshot_start_hour")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class DomainVpcOptions(dict):
    def __init__(__self__, *,
                 availability_zones: Optional[Sequence[str]] = None,
                 security_group_ids: Optional[Sequence[str]] = None,
                 subnet_ids: Optional[Sequence[str]] = None,
                 vpc_id: Optional[str] = None):
        """
        :param Sequence[str] security_group_ids: List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
        :param Sequence[str] subnet_ids: List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
        """
        if availability_zones is not None:
            pulumi.set(__self__, "availability_zones", availability_zones)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "availability_zones")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[Sequence[str]]:
        """
        List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[Sequence[str]]:
        """
        List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[str]:
        return pulumi.get(self, "vpc_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetDomainAdvancedSecurityOptionResult(dict):
    def __init__(__self__, *,
                 enabled: bool,
                 internal_user_database_enabled: bool):
        """
        :param bool enabled: Whether node to node encryption is enabled.
        :param bool internal_user_database_enabled: Whether the internal user database is enabled.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "internal_user_database_enabled", internal_user_database_enabled)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether node to node encryption is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="internalUserDatabaseEnabled")
    def internal_user_database_enabled(self) -> bool:
        """
        Whether the internal user database is enabled.
        """
        return pulumi.get(self, "internal_user_database_enabled")


@pulumi.output_type
class GetDomainClusterConfigResult(dict):
    def __init__(__self__, *,
                 dedicated_master_count: int,
                 dedicated_master_enabled: bool,
                 dedicated_master_type: str,
                 instance_count: int,
                 instance_type: str,
                 warm_count: int,
                 warm_type: str,
                 zone_awareness_configs: Sequence['outputs.GetDomainClusterConfigZoneAwarenessConfigResult'],
                 zone_awareness_enabled: bool,
                 warm_enabled: Optional[bool] = None):
        """
        :param int dedicated_master_count: Number of dedicated master nodes in the cluster.
        :param bool dedicated_master_enabled: Indicates whether dedicated master nodes are enabled for the cluster.
        :param str dedicated_master_type: Instance type of the dedicated master nodes in the cluster.
        :param int instance_count: Number of instances in the cluster.
        :param str instance_type: Instance type of data nodes in the cluster.
        :param int warm_count: The number of warm nodes in the cluster.
        :param str warm_type: The instance type for the Elasticsearch cluster's warm nodes.
        :param Sequence['GetDomainClusterConfigZoneAwarenessConfigArgs'] zone_awareness_configs: Configuration block containing zone awareness settings.
        :param bool zone_awareness_enabled: Indicates whether zone awareness is enabled.
        :param bool warm_enabled: Indicates warm storage is enabled.
        """
        pulumi.set(__self__, "dedicated_master_count", dedicated_master_count)
        pulumi.set(__self__, "dedicated_master_enabled", dedicated_master_enabled)
        pulumi.set(__self__, "dedicated_master_type", dedicated_master_type)
        pulumi.set(__self__, "instance_count", instance_count)
        pulumi.set(__self__, "instance_type", instance_type)
        pulumi.set(__self__, "warm_count", warm_count)
        pulumi.set(__self__, "warm_type", warm_type)
        pulumi.set(__self__, "zone_awareness_configs", zone_awareness_configs)
        pulumi.set(__self__, "zone_awareness_enabled", zone_awareness_enabled)
        if warm_enabled is not None:
            pulumi.set(__self__, "warm_enabled", warm_enabled)

    @property
    @pulumi.getter(name="dedicatedMasterCount")
    def dedicated_master_count(self) -> int:
        """
        Number of dedicated master nodes in the cluster.
        """
        return pulumi.get(self, "dedicated_master_count")

    @property
    @pulumi.getter(name="dedicatedMasterEnabled")
    def dedicated_master_enabled(self) -> bool:
        """
        Indicates whether dedicated master nodes are enabled for the cluster.
        """
        return pulumi.get(self, "dedicated_master_enabled")

    @property
    @pulumi.getter(name="dedicatedMasterType")
    def dedicated_master_type(self) -> str:
        """
        Instance type of the dedicated master nodes in the cluster.
        """
        return pulumi.get(self, "dedicated_master_type")

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> int:
        """
        Number of instances in the cluster.
        """
        return pulumi.get(self, "instance_count")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> str:
        """
        Instance type of data nodes in the cluster.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="warmCount")
    def warm_count(self) -> int:
        """
        The number of warm nodes in the cluster.
        """
        return pulumi.get(self, "warm_count")

    @property
    @pulumi.getter(name="warmType")
    def warm_type(self) -> str:
        """
        The instance type for the Elasticsearch cluster's warm nodes.
        """
        return pulumi.get(self, "warm_type")

    @property
    @pulumi.getter(name="zoneAwarenessConfigs")
    def zone_awareness_configs(self) -> Sequence['outputs.GetDomainClusterConfigZoneAwarenessConfigResult']:
        """
        Configuration block containing zone awareness settings.
        """
        return pulumi.get(self, "zone_awareness_configs")

    @property
    @pulumi.getter(name="zoneAwarenessEnabled")
    def zone_awareness_enabled(self) -> bool:
        """
        Indicates whether zone awareness is enabled.
        """
        return pulumi.get(self, "zone_awareness_enabled")

    @property
    @pulumi.getter(name="warmEnabled")
    def warm_enabled(self) -> Optional[bool]:
        """
        Indicates warm storage is enabled.
        """
        return pulumi.get(self, "warm_enabled")


@pulumi.output_type
class GetDomainClusterConfigZoneAwarenessConfigResult(dict):
    def __init__(__self__, *,
                 availability_zone_count: int):
        """
        :param int availability_zone_count: Number of availability zones used.
        """
        pulumi.set(__self__, "availability_zone_count", availability_zone_count)

    @property
    @pulumi.getter(name="availabilityZoneCount")
    def availability_zone_count(self) -> int:
        """
        Number of availability zones used.
        """
        return pulumi.get(self, "availability_zone_count")


@pulumi.output_type
class GetDomainCognitoOptionResult(dict):
    def __init__(__self__, *,
                 enabled: bool,
                 identity_pool_id: str,
                 role_arn: str,
                 user_pool_id: str):
        """
        :param bool enabled: Whether node to node encryption is enabled.
        :param str identity_pool_id: The Cognito Identity pool used by the domain.
        :param str role_arn: The IAM Role with the AmazonESCognitoAccess policy attached.
        :param str user_pool_id: The Cognito User pool used by the domain.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "identity_pool_id", identity_pool_id)
        pulumi.set(__self__, "role_arn", role_arn)
        pulumi.set(__self__, "user_pool_id", user_pool_id)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether node to node encryption is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="identityPoolId")
    def identity_pool_id(self) -> str:
        """
        The Cognito Identity pool used by the domain.
        """
        return pulumi.get(self, "identity_pool_id")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> str:
        """
        The IAM Role with the AmazonESCognitoAccess policy attached.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter(name="userPoolId")
    def user_pool_id(self) -> str:
        """
        The Cognito User pool used by the domain.
        """
        return pulumi.get(self, "user_pool_id")


@pulumi.output_type
class GetDomainEbsOptionResult(dict):
    def __init__(__self__, *,
                 ebs_enabled: bool,
                 iops: int,
                 volume_size: int,
                 volume_type: str):
        """
        :param bool ebs_enabled: Whether EBS volumes are attached to data nodes in the domain.
        :param int iops: The baseline input/output (I/O) performance of EBS volumes
               attached to data nodes.
        :param int volume_size: The size of EBS volumes attached to data nodes (in GB).
        :param str volume_type: The type of EBS volumes attached to data nodes.
        """
        pulumi.set(__self__, "ebs_enabled", ebs_enabled)
        pulumi.set(__self__, "iops", iops)
        pulumi.set(__self__, "volume_size", volume_size)
        pulumi.set(__self__, "volume_type", volume_type)

    @property
    @pulumi.getter(name="ebsEnabled")
    def ebs_enabled(self) -> bool:
        """
        Whether EBS volumes are attached to data nodes in the domain.
        """
        return pulumi.get(self, "ebs_enabled")

    @property
    @pulumi.getter
    def iops(self) -> int:
        """
        The baseline input/output (I/O) performance of EBS volumes
        attached to data nodes.
        """
        return pulumi.get(self, "iops")

    @property
    @pulumi.getter(name="volumeSize")
    def volume_size(self) -> int:
        """
        The size of EBS volumes attached to data nodes (in GB).
        """
        return pulumi.get(self, "volume_size")

    @property
    @pulumi.getter(name="volumeType")
    def volume_type(self) -> str:
        """
        The type of EBS volumes attached to data nodes.
        """
        return pulumi.get(self, "volume_type")


@pulumi.output_type
class GetDomainEncryptionAtRestResult(dict):
    def __init__(__self__, *,
                 enabled: bool,
                 kms_key_id: str):
        """
        :param bool enabled: Whether node to node encryption is enabled.
        :param str kms_key_id: The KMS key id used to encrypt data at rest.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "kms_key_id", kms_key_id)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether node to node encryption is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> str:
        """
        The KMS key id used to encrypt data at rest.
        """
        return pulumi.get(self, "kms_key_id")


@pulumi.output_type
class GetDomainLogPublishingOptionResult(dict):
    def __init__(__self__, *,
                 cloudwatch_log_group_arn: str,
                 enabled: bool,
                 log_type: str):
        """
        :param str cloudwatch_log_group_arn: The CloudWatch Log Group where the logs are published.
        :param bool enabled: Whether node to node encryption is enabled.
        :param str log_type: The type of Elasticsearch log being published.
        """
        pulumi.set(__self__, "cloudwatch_log_group_arn", cloudwatch_log_group_arn)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "log_type", log_type)

    @property
    @pulumi.getter(name="cloudwatchLogGroupArn")
    def cloudwatch_log_group_arn(self) -> str:
        """
        The CloudWatch Log Group where the logs are published.
        """
        return pulumi.get(self, "cloudwatch_log_group_arn")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether node to node encryption is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="logType")
    def log_type(self) -> str:
        """
        The type of Elasticsearch log being published.
        """
        return pulumi.get(self, "log_type")


@pulumi.output_type
class GetDomainNodeToNodeEncryptionResult(dict):
    def __init__(__self__, *,
                 enabled: bool):
        """
        :param bool enabled: Whether node to node encryption is enabled.
        """
        pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Whether node to node encryption is enabled.
        """
        return pulumi.get(self, "enabled")


@pulumi.output_type
class GetDomainSnapshotOptionResult(dict):
    def __init__(__self__, *,
                 automated_snapshot_start_hour: int):
        """
        :param int automated_snapshot_start_hour: Hour during which the service takes an automated daily
               snapshot of the indices in the domain.
        """
        pulumi.set(__self__, "automated_snapshot_start_hour", automated_snapshot_start_hour)

    @property
    @pulumi.getter(name="automatedSnapshotStartHour")
    def automated_snapshot_start_hour(self) -> int:
        """
        Hour during which the service takes an automated daily
        snapshot of the indices in the domain.
        """
        return pulumi.get(self, "automated_snapshot_start_hour")


@pulumi.output_type
class GetDomainVpcOptionResult(dict):
    def __init__(__self__, *,
                 availability_zones: Sequence[str],
                 security_group_ids: Sequence[str],
                 subnet_ids: Sequence[str],
                 vpc_id: str):
        """
        :param Sequence[str] availability_zones: The availability zones used by the domain.
        :param Sequence[str] security_group_ids: The security groups used by the domain.
        :param Sequence[str] subnet_ids: The subnets used by the domain.
        :param str vpc_id: The VPC used by the domain.
        """
        pulumi.set(__self__, "availability_zones", availability_zones)
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> Sequence[str]:
        """
        The availability zones used by the domain.
        """
        return pulumi.get(self, "availability_zones")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        The security groups used by the domain.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Sequence[str]:
        """
        The subnets used by the domain.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The VPC used by the domain.
        """
        return pulumi.get(self, "vpc_id")

