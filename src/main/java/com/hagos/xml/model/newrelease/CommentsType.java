package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder( {
        "comment",
        "type"
})

@Data
public class CommentsType {

    private String comment;

    private String type;
}
