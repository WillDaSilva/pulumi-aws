// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Budgets.Outputs
{

    [OutputType]
    public sealed class BudgetActionDefinition
    {
        /// <summary>
        /// The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
        /// </summary>
        public readonly Outputs.BudgetActionDefinitionIamActionDefinition? IamActionDefinition;
        /// <summary>
        /// The service control policies (SCPs) action definition details. See SCP Action Definition.
        /// </summary>
        public readonly Outputs.BudgetActionDefinitionScpActionDefinition? ScpActionDefinition;
        /// <summary>
        /// The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
        /// </summary>
        public readonly Outputs.BudgetActionDefinitionSsmActionDefinition? SsmActionDefinition;

        [OutputConstructor]
        private BudgetActionDefinition(
            Outputs.BudgetActionDefinitionIamActionDefinition? iamActionDefinition,

            Outputs.BudgetActionDefinitionScpActionDefinition? scpActionDefinition,

            Outputs.BudgetActionDefinitionSsmActionDefinition? ssmActionDefinition)
        {
            IamActionDefinition = iamActionDefinition;
            ScpActionDefinition = scpActionDefinition;
            SsmActionDefinition = ssmActionDefinition;
        }
    }
}