package com.hagos.xml.model.asset;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "asset")
public class FullGenericAsset {
    @JacksonXmlProperty(localName = "catalog_asset")
    private CatalogAsset catalogAsset;

    @JacksonXmlProperty(localName = "catalog_audio_asset")
    private CatalogAudioAsset catalogAudioAsset;

    @JacksonXmlProperty(localName = "catalog_video_asset")
    private CatalogVideoAsset catalogVideoAsset;

    @JacksonXmlProperty(localName = "catalog_graphic_asset")
    private CatalogGraphicAsset catalogGraphicAsset;

    public FullGenericAsset() {
    }

    public FullGenericAsset(CatalogAsset catalogAsset, CatalogAudioAsset catalogAudioAsset) {
        this.catalogAsset = catalogAsset;
        this.catalogAudioAsset = catalogAudioAsset;
    }

    public FullGenericAsset(CatalogAsset catalogAsset, CatalogVideoAsset catalogVideoAsset) {
        this.catalogAsset = catalogAsset;
        this.catalogVideoAsset = catalogVideoAsset;
    }

    public FullGenericAsset(CatalogAsset catalogAsset, CatalogGraphicAsset catalogGraphicAsset) {
        this.catalogAsset = catalogAsset;
        this.catalogGraphicAsset = catalogGraphicAsset;
    }
}
