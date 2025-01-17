// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Outputs
{

    [OutputType]
    public sealed class ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings
    {
        /// <summary>
        /// Average bitrate in bits/second.
        /// </summary>
        public readonly double? Bitrate;
        /// <summary>
        /// Mono, Stereo, or 5.1 channel layout.
        /// </summary>
        public readonly string? CodingMode;
        /// <summary>
        /// Sample rate in Hz.
        /// </summary>
        public readonly double? SampleRate;

        [OutputConstructor]
        private ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2Settings(
            double? bitrate,

            string? codingMode,

            double? sampleRate)
        {
            Bitrate = bitrate;
            CodingMode = codingMode;
            SampleRate = sampleRate;
        }
    }
}
