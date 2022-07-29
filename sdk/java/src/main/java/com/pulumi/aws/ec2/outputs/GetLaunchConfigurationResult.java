// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLaunchConfigurationEbsBlockDevice;
import com.pulumi.aws.ec2.outputs.GetLaunchConfigurationEphemeralBlockDevice;
import com.pulumi.aws.ec2.outputs.GetLaunchConfigurationMetadataOption;
import com.pulumi.aws.ec2.outputs.GetLaunchConfigurationRootBlockDevice;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLaunchConfigurationResult {
    /**
     * @return The Amazon Resource Name of the launch configuration.
     * 
     */
    private final String arn;
    /**
     * @return Whether a Public IP address is associated with the instance.
     * 
     */
    private final Boolean associatePublicIpAddress;
    /**
     * @return The EBS Block Devices attached to the instance.
     * 
     */
    private final List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices;
    /**
     * @return Whether the launched EC2 instance will be EBS-optimized.
     * 
     */
    private final Boolean ebsOptimized;
    /**
     * @return Whether Detailed Monitoring is Enabled.
     * 
     */
    private final Boolean enableMonitoring;
    /**
     * @return The Ephemeral volumes on the instance.
     * 
     */
    private final List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices;
    /**
     * @return The IAM Instance Profile to associate with launched instances.
     * 
     */
    private final String iamInstanceProfile;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The EC2 Image ID of the instance.
     * 
     */
    private final String imageId;
    /**
     * @return The Instance Type of the instance to launch.
     * 
     */
    private final String instanceType;
    /**
     * @return The Key Name that should be used for the instance.
     * 
     */
    private final String keyName;
    /**
     * @return The metadata options for the instance.
     * 
     */
    private final List<GetLaunchConfigurationMetadataOption> metadataOptions;
    /**
     * @return The Name of the launch configuration.
     * 
     */
    private final String name;
    /**
     * @return The Tenancy of the instance.
     * 
     */
    private final String placementTenancy;
    /**
     * @return The Root Block Device of the instance.
     * 
     */
    private final List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices;
    /**
     * @return A list of associated Security Group IDS.
     * 
     */
    private final List<String> securityGroups;
    /**
     * @return The Price to use for reserving Spot instances.
     * 
     */
    private final String spotPrice;
    /**
     * @return The User Data of the instance.
     * 
     */
    private final String userData;
    /**
     * @return The ID of a ClassicLink-enabled VPC.
     * 
     */
    private final String vpcClassicLinkId;
    /**
     * @return The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
     * 
     */
    private final List<String> vpcClassicLinkSecurityGroups;

    @CustomType.Constructor
    private GetLaunchConfigurationResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("associatePublicIpAddress") Boolean associatePublicIpAddress,
        @CustomType.Parameter("ebsBlockDevices") List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices,
        @CustomType.Parameter("ebsOptimized") Boolean ebsOptimized,
        @CustomType.Parameter("enableMonitoring") Boolean enableMonitoring,
        @CustomType.Parameter("ephemeralBlockDevices") List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices,
        @CustomType.Parameter("iamInstanceProfile") String iamInstanceProfile,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("keyName") String keyName,
        @CustomType.Parameter("metadataOptions") List<GetLaunchConfigurationMetadataOption> metadataOptions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("placementTenancy") String placementTenancy,
        @CustomType.Parameter("rootBlockDevices") List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices,
        @CustomType.Parameter("securityGroups") List<String> securityGroups,
        @CustomType.Parameter("spotPrice") String spotPrice,
        @CustomType.Parameter("userData") String userData,
        @CustomType.Parameter("vpcClassicLinkId") String vpcClassicLinkId,
        @CustomType.Parameter("vpcClassicLinkSecurityGroups") List<String> vpcClassicLinkSecurityGroups) {
        this.arn = arn;
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.enableMonitoring = enableMonitoring;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.id = id;
        this.imageId = imageId;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.metadataOptions = metadataOptions;
        this.name = name;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevices = rootBlockDevices;
        this.securityGroups = securityGroups;
        this.spotPrice = spotPrice;
        this.userData = userData;
        this.vpcClassicLinkId = vpcClassicLinkId;
        this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
    }

    /**
     * @return The Amazon Resource Name of the launch configuration.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Whether a Public IP address is associated with the instance.
     * 
     */
    public Boolean associatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }
    /**
     * @return The EBS Block Devices attached to the instance.
     * 
     */
    public List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices() {
        return this.ebsBlockDevices;
    }
    /**
     * @return Whether the launched EC2 instance will be EBS-optimized.
     * 
     */
    public Boolean ebsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * @return Whether Detailed Monitoring is Enabled.
     * 
     */
    public Boolean enableMonitoring() {
        return this.enableMonitoring;
    }
    /**
     * @return The Ephemeral volumes on the instance.
     * 
     */
    public List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices() {
        return this.ephemeralBlockDevices;
    }
    /**
     * @return The IAM Instance Profile to associate with launched instances.
     * 
     */
    public String iamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The EC2 Image ID of the instance.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The Instance Type of the instance to launch.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The Key Name that should be used for the instance.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return The metadata options for the instance.
     * 
     */
    public List<GetLaunchConfigurationMetadataOption> metadataOptions() {
        return this.metadataOptions;
    }
    /**
     * @return The Name of the launch configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Tenancy of the instance.
     * 
     */
    public String placementTenancy() {
        return this.placementTenancy;
    }
    /**
     * @return The Root Block Device of the instance.
     * 
     */
    public List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices() {
        return this.rootBlockDevices;
    }
    /**
     * @return A list of associated Security Group IDS.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return The Price to use for reserving Spot instances.
     * 
     */
    public String spotPrice() {
        return this.spotPrice;
    }
    /**
     * @return The User Data of the instance.
     * 
     */
    public String userData() {
        return this.userData;
    }
    /**
     * @return The ID of a ClassicLink-enabled VPC.
     * 
     */
    public String vpcClassicLinkId() {
        return this.vpcClassicLinkId;
    }
    /**
     * @return The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
     * 
     */
    public List<String> vpcClassicLinkSecurityGroups() {
        return this.vpcClassicLinkSecurityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean associatePublicIpAddress;
        private List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices;
        private Boolean ebsOptimized;
        private Boolean enableMonitoring;
        private List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices;
        private String iamInstanceProfile;
        private String id;
        private String imageId;
        private String instanceType;
        private String keyName;
        private List<GetLaunchConfigurationMetadataOption> metadataOptions;
        private String name;
        private String placementTenancy;
        private List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices;
        private List<String> securityGroups;
        private String spotPrice;
        private String userData;
        private String vpcClassicLinkId;
        private List<String> vpcClassicLinkSecurityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.enableMonitoring = defaults.enableMonitoring;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.name = defaults.name;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.securityGroups = defaults.securityGroups;
    	      this.spotPrice = defaults.spotPrice;
    	      this.userData = defaults.userData;
    	      this.vpcClassicLinkId = defaults.vpcClassicLinkId;
    	      this.vpcClassicLinkSecurityGroups = defaults.vpcClassicLinkSecurityGroups;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder associatePublicIpAddress(Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Objects.requireNonNull(associatePublicIpAddress);
            return this;
        }
        public Builder ebsBlockDevices(List<GetLaunchConfigurationEbsBlockDevice> ebsBlockDevices) {
            this.ebsBlockDevices = Objects.requireNonNull(ebsBlockDevices);
            return this;
        }
        public Builder ebsBlockDevices(GetLaunchConfigurationEbsBlockDevice... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }
        public Builder ebsOptimized(Boolean ebsOptimized) {
            this.ebsOptimized = Objects.requireNonNull(ebsOptimized);
            return this;
        }
        public Builder enableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = Objects.requireNonNull(enableMonitoring);
            return this;
        }
        public Builder ephemeralBlockDevices(List<GetLaunchConfigurationEphemeralBlockDevice> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Objects.requireNonNull(ephemeralBlockDevices);
            return this;
        }
        public Builder ephemeralBlockDevices(GetLaunchConfigurationEphemeralBlockDevice... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }
        public Builder iamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder metadataOptions(List<GetLaunchConfigurationMetadataOption> metadataOptions) {
            this.metadataOptions = Objects.requireNonNull(metadataOptions);
            return this;
        }
        public Builder metadataOptions(GetLaunchConfigurationMetadataOption... metadataOptions) {
            return metadataOptions(List.of(metadataOptions));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder placementTenancy(String placementTenancy) {
            this.placementTenancy = Objects.requireNonNull(placementTenancy);
            return this;
        }
        public Builder rootBlockDevices(List<GetLaunchConfigurationRootBlockDevice> rootBlockDevices) {
            this.rootBlockDevices = Objects.requireNonNull(rootBlockDevices);
            return this;
        }
        public Builder rootBlockDevices(GetLaunchConfigurationRootBlockDevice... rootBlockDevices) {
            return rootBlockDevices(List.of(rootBlockDevices));
        }
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder spotPrice(String spotPrice) {
            this.spotPrice = Objects.requireNonNull(spotPrice);
            return this;
        }
        public Builder userData(String userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }
        public Builder vpcClassicLinkId(String vpcClassicLinkId) {
            this.vpcClassicLinkId = Objects.requireNonNull(vpcClassicLinkId);
            return this;
        }
        public Builder vpcClassicLinkSecurityGroups(List<String> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = Objects.requireNonNull(vpcClassicLinkSecurityGroups);
            return this;
        }
        public Builder vpcClassicLinkSecurityGroups(String... vpcClassicLinkSecurityGroups) {
            return vpcClassicLinkSecurityGroups(List.of(vpcClassicLinkSecurityGroups));
        }        public GetLaunchConfigurationResult build() {
            return new GetLaunchConfigurationResult(arn, associatePublicIpAddress, ebsBlockDevices, ebsOptimized, enableMonitoring, ephemeralBlockDevices, iamInstanceProfile, id, imageId, instanceType, keyName, metadataOptions, name, placementTenancy, rootBlockDevices, securityGroups, spotPrice, userData, vpcClassicLinkId, vpcClassicLinkSecurityGroups);
        }
    }
}