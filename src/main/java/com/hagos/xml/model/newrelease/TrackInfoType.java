package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder( {
    "isrc",
    "trackNumber"
})
@Data
public class TrackInfoType {

    private String isrc;

    private int trackNumber;

}
