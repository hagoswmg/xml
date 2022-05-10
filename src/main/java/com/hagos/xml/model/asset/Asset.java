package com.hagos.xml.model.asset;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data

public class Asset {
//    @JacksonXmlProperty(localName = "catalog_asset")
//    private CatalogAsset catalogAsset;
//
//    @JacksonXmlProperty(localName = "catalog_audio_asset")
//    private CatalogAudioAsset catalogAudioAsset;

    private String xString;
    private String yString;
}