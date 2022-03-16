// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class HoursOfOperationConfig
    {
        /// <summary>
        /// Specifies the day that the hours of operation applies to.
        /// </summary>
        public readonly string Day;
        /// <summary>
        /// A end time block specifies the time that your contact center closes. The `end_time` is documented below.
        /// </summary>
        public readonly Outputs.HoursOfOperationConfigEndTime EndTime;
        /// <summary>
        /// A start time block specifies the time that your contact center opens. The `start_time` is documented below.
        /// </summary>
        public readonly Outputs.HoursOfOperationConfigStartTime StartTime;

        [OutputConstructor]
        private HoursOfOperationConfig(
            string day,

            Outputs.HoursOfOperationConfigEndTime endTime,

            Outputs.HoursOfOperationConfigStartTime startTime)
        {
            Day = day;
            EndTime = endTime;
            StartTime = startTime;
        }
    }
}