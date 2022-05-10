package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.hagos.xml.model.product.Product;
import com.hagos.xml.model.product.ProductStatus;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product Status")
public class ProductStatusController {

    /*
    <product>...</product> in xml
     */
    @PostMapping (path="productxml", produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getProductXml(@RequestBody String productStr) {
        Product product = processProdPayload(productStr);
        if (product != null) {
            System.out.println(product.toString());
        }
        return ResponseEntity.ok(product);
    }

    /**
     * <product>...</product> in xml or json
     */
    @PostMapping (path="productboth", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getProductBoth(@RequestBody String productStr) {
        Product product = processProdPayload(productStr);
        if (product != null) {
            System.out.println(product.toString());
        }
        return ResponseEntity.ok(product);
    }

    /**
     * <productStatus>
     *     <product>...</product>
     *     <product>...</product>
     *     ...
     * </productStatus>
     * in xml or json
     */
    @PostMapping (path="productstatus", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getProductStatus(@RequestBody String productStatusStr) {
        ProductStatus productStatus = processProdStatusPayload(productStatusStr);
        if (productStatus != null) {
            System.out.println(productStatus.toString());
        }
        return ResponseEntity.ok(productStatus);
    }

    /**
     * <productStatus>
     *     <product>...</product>
     *     <product>...</product>
     *     ...
     * </productStatus>
     */
    private ProductStatus processProdStatusPayload(String productStatusStr) {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        final ProductStatus productStatus;
        try {
            productStatus = xmlMapper.readValue(productStatusStr, ProductStatus.class);
            return productStatus;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * <product>...</product>
     */
    private Product processProdPayload(String productStr) {
        XmlMapper xmlMapper = new XmlMapper();
//        new XmlMapper().writeValueAsString(object), "utf-8");

        try {
            final Product product = xmlMapper.readValue(productStr, Product.class);
            return product;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
