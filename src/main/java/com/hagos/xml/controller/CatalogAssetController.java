package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.hagos.xml.model.asset.CatalogAsset;
import com.hagos.xml.model.asset.CatalogAssetList;
import com.hagos.xml.model.asset.CatalogAudioAsset;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Tag(name = "Catalog Asset")

public class CatalogAssetController {

    // catalog-asset
    @PostMapping(path="catalogasset", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCatalogAsset(@RequestBody String assetStr) {
        return ResponseEntity.ok(processPayload(assetStr, CatalogAsset.class));
    }

    // catalog-audio-asset
    @PostMapping(path="catalogaudioasset", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCatalogAudioAsset(@RequestBody String assetStr) {
        return ResponseEntity.ok(processPayload(assetStr, CatalogAudioAsset.class));
    }

    // catalog-asset-list
    @PostMapping(path="catalogassetlist", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCatalogAssetList(@RequestBody String assetStr) {
        return ResponseEntity.ok(processPayload(assetStr, CatalogAssetList.class));
    }

    private <T> T processPayload(String assetStr, Class<T> theClass) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            return xmlMapper.readValue(assetStr, theClass);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
