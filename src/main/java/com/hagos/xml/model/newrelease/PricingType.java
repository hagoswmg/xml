package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonPropertyOrder( {
    "priceCode",
    "startDateTime",
    "endDateTime",
    "type"
})

@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
public class PricingType {

    private String priceCode;

    private XMLGregorianCalendar startDateTime;

    private XMLGregorianCalendar endDateTime;

    private String type;

}
