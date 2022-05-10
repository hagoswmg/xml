package com.hagos.xml.controller;

import com.hagos.xml.Utils;
import com.hagos.xml.model.product.Product;
import com.hagos.xml.model.product.ProductStatus;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product Status")
@RequestMapping("product")
public class ProductStatusController {

    /**
     * <product>...</product> in xml
     */
    @PostMapping (path="/product-xml", produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getProductXml(@RequestBody String productStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(productStr, Product.class));
    }

    /**
     * <product>...</product> in xml or json
     */
    @PostMapping (path="/product-xml-or-json", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getProductBoth(@RequestBody String productStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(productStr, Product.class));
    }

    /**
     * <productStatus>
     *     <product>...</product>
     *     <product>...</product>
     *     ...
     * </productStatus>
     * in xml or json
     */
    @PostMapping (path="/product-status", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getProductStatus(@RequestBody String productStatusStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(productStatusStr, ProductStatus.class));
    }
}
