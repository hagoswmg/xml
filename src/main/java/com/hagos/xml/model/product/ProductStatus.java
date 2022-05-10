package com.hagos.xml.model.product;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

@JacksonXmlRootElement(localName = "dmdstatus")
public class ProductStatus {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Product> product = new ArrayList<>();
}
