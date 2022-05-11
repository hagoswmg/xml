package com.hagos.xml.model.asset;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@JsonPropertyOrder({
        "assetId",
        "bitrate",
        "samplingFrequency",
        "bitDepth",
        "watermark",
        "channels",
        "duration",
        "headZeroGap",
        "tailZeroGap",
        "qcStatus",
        "qcCompleteDate",
        "audioSamplingFrequency",
        "audioFormat",
        "audioFormatVersion",
        "audioBitrate",
        "videoFrameWidth",
        "videoFrameHeight",
        "videoStreams",
        "audioMode",
        "series",
        "frameRate",
        "encodingType",
        "wide",
        "aspectRatio",
        "aspectRatioWidth",
        "aspectRatioHeight",
        "aviSource",
        "eventDate",
        "interlaced",
        "hd",
        "fileSuffix",
        "hookIn",
        "cropBottom",
        "cropTop",
        "cropLeft",
        "cropRight"
})

@Data
public class CatalogVideoAsset {

    @JacksonXmlProperty(localName = "asset_id")
    protected String assetId;
    protected String bitrate;
    @JacksonXmlProperty(localName = "sampling_frequency")
    protected String samplingFrequency;
    @JacksonXmlProperty(localName = "bit_depth")
    protected String bitDepth;
    protected String watermark;
    protected String channels;
    protected String duration;
    @JacksonXmlProperty(localName = "head_zero_gap")
    protected String headZeroGap;
    @JacksonXmlProperty(localName = "tail_zero_gap")
    protected String tailZeroGap;
    @JacksonXmlProperty(localName = "qc_status")
    protected String qcStatus;
    @JacksonXmlProperty(localName = "qc_complete_date")
    protected String qcCompleteDate;
    @JacksonXmlProperty(localName = "audio_sampling_frequency")
    protected String audioSamplingFrequency;
    @JacksonXmlProperty(localName = "audio_format")
    protected String audioFormat;
    @JacksonXmlProperty(localName = "audio_format_version")
    protected String audioFormatVersion;
    @JacksonXmlProperty(localName = "audio_bitrate")
    protected String audioBitrate;
    @JacksonXmlProperty(localName = "video_frame_width")
    protected String videoFrameWidth;
    @JacksonXmlProperty(localName = "video_frame_height")
    protected String videoFrameHeight;
    @JacksonXmlProperty(localName = "video_streams")
    protected String videoStreams;
    @JacksonXmlProperty(localName = "audio_mode")
    protected String audioMode;
    protected String series;
    @JacksonXmlProperty(localName = "frame_rate")
    protected String frameRate;
    @JacksonXmlProperty(localName = "encoding_type")
    protected String encodingType;
    protected String wide;
    @JacksonXmlProperty(localName = "aspect_ratio")
    protected String aspectRatio;
    @JacksonXmlProperty(localName = "aspect_ratio_width")
    protected String aspectRatioWidth;
    @JacksonXmlProperty(localName = "aspect_ratio_height")
    protected String aspectRatioHeight;
    @JacksonXmlProperty(localName = "avi_source")
    protected String aviSource;
    @JacksonXmlProperty(localName = "event_date")
    protected String eventDate;
    protected String interlaced;
    protected String hd;
    @JacksonXmlProperty(localName = "file_suffix")
    protected String fileSuffix;
    @JacksonXmlProperty(localName = "hook_in")
    protected String hookIn;
    @JacksonXmlProperty(localName = "crop_bottom")
    protected String cropBottom;
    @JacksonXmlProperty(localName = "crop_top")
    protected String cropTop;
    @JacksonXmlProperty(localName = "crop_left")
    protected String cropLeft;
    @JacksonXmlProperty(localName = "crop_right")
    protected String cropRight;
}