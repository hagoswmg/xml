package com.hagos.xml.model.asset;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "asset")
public class FullGraphicAsset {

    @JacksonXmlProperty(localName = "catalog_asset")
    private CatalogAsset catalogAsset;

    @JacksonXmlProperty(localName = "catalog_graphic_asset")
    private CatalogGraphicAsset catalogGraphicAsset;
}
