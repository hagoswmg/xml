package com.hagos.xml.controller;

import com.hagos.xml.Utils;
import com.hagos.xml.model.asset.CatalogAsset;
import com.hagos.xml.model.asset.CatalogAssetList;
import com.hagos.xml.model.asset.CatalogAudioAsset;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Tag(name = "Catalog Asset")
@RequestMapping("catalog")
public class CatalogAssetController {

    // catalog-asset
    @PostMapping(path="/catalog-asset", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCatalogAsset(@RequestBody String assetStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(assetStr, CatalogAsset.class));
    }

    // catalog-audio-asset
    @PostMapping(path="/catalog-audio-asset", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCatalogAudioAsset(@RequestBody String assetStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(assetStr, CatalogAudioAsset.class));
    }

    // catalog-asset-list
    @PostMapping(path="/catalog-asset-list", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getCatalogAssetList(@RequestBody String assetStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(assetStr, CatalogAssetList.class));
    }
}
