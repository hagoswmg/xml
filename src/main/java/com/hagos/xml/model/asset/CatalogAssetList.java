package com.hagos.xml.model.asset;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

@JacksonXmlRootElement(localName = "list")
public class CatalogAssetList {

    @JacksonXmlElementWrapper(useWrapping = false)
    List<CatalogAsset> catalogAssets = new ArrayList<>();
}
