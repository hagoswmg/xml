package com.hagos.xml.model.product;

import lombok.Data;

/**
 <product>
 <identifier>190296136610</identifier>
 <identifierTypeCode>GPID</identifierTypeCode>
 <statusCode>IN_CAR</statusCode>
 <statusValue>Y</statusValue>
 <createdBy>CAR</createdBy>
 <createDate>2022-05-09 09:53:51.0</createDate>
 <lastUpdatedBy>CAR</lastUpdatedBy>
 <lastUpdateDate>2022-05-09 09:53:51.0</lastUpdateDate>
 </product>
 */
@Data
public class Product {
    private String identifier;
    private String identifierTypeCode;
    private String statusCode;
    private String statusValue;
    private String createdBy;
    private String createDate;
    private String lastUpdatedBy;
    private String lastUpdateDate;
}
