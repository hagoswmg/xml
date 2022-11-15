package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.xml.datatype.XMLGregorianCalendar;


@JsonPropertyOrder( {
    "dateTime",
    "reason"
})

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TakedownType {

    private XMLGregorianCalendar dateTime;

    private String reason;

}
