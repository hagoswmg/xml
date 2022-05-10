package com.hagos.xml.model.asset;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CatalogAudioAsset {
    @JacksonXmlProperty(localName = "asset_id")
    private String assetId;
    private String bitrate;
    @JacksonXmlProperty(localName = "sampling_frequency")
    private String samplingFrequency;
    @JacksonXmlProperty(localName = "bit_depth")
    private String bitDepth;
    private String watermark;
    private String channels;
    @JacksonXmlProperty(localName = "header_type")
    private String headerType;
    @JacksonXmlProperty(localName = "audio_mode")
    private String audioMode;
    private String duration;
    @JacksonXmlProperty(localName = "head_zero_gap")
    private String headZeroGap;
    @JacksonXmlProperty(localName = "tail_zero_gap")
    private String tailZeroGap;
    @JacksonXmlProperty(localName = "qc_status")
    private String qcStatus;
    @JacksonXmlProperty(localName = "qc_complete_date")
    private String qcCompleteDate;
    @JacksonXmlProperty(localName = "encoding_type")
    private String encodingType;
    @JacksonXmlProperty(localName = "sbr_interval")
    private String sbrInterval;
    @JacksonXmlProperty(localName = "sbr_offset")
    private String sbrOffset;
    private String mqs;
    @JacksonXmlProperty(localName = "hook_in")
    private String hookIn;
    private String series;
}
