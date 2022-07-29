// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito.Outputs
{

    [OutputType]
    public sealed class RiskConfigurationAccountTakeoverRiskConfiguration
    {
        /// <summary>
        /// The compromised credentials risk configuration actions. See details below.
        /// </summary>
        public readonly Outputs.RiskConfigurationAccountTakeoverRiskConfigurationActions Actions;
        /// <summary>
        /// The notify configuration used to construct email notifications. See details below.
        /// </summary>
        public readonly Outputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfiguration NotifyConfiguration;

        [OutputConstructor]
        private RiskConfigurationAccountTakeoverRiskConfiguration(
            Outputs.RiskConfigurationAccountTakeoverRiskConfigurationActions actions,

            Outputs.RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfiguration notifyConfiguration)
        {
            Actions = actions;
            NotifyConfiguration = notifyConfiguration;
        }
    }
}