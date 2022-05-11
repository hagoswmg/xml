package com.hagos.xml.model.asset;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@JsonPropertyOrder({
        "assetId",
        "graphicsfile",
        "bitDepth",
        "dpi",
        "height",
        "width",
        "printHeight",
        "printWidth",
        "colorType",
        "series",
        "credits"
})

@Data
public class CatalogGraphicAsset {

    @JacksonXmlProperty(localName = "asset_id")
    private String assetId;
    private String graphicsfile;
    @JacksonXmlProperty(localName = "bit_depth")
    private String bitDepth;
    private String dpi;
    private String height;
    private String width;
    @JacksonXmlProperty(localName = "print_height")
    private String printHeight;
    @JacksonXmlProperty(localName = "print_width")
    private String printWidth;
    @JacksonXmlProperty(localName = "color_type")
    private String colorType;
    private String series;
    private String credits;
}