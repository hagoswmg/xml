package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder( {
        "sender",
        "override",
        "gpid",
        "label",
        "preorderPreview",
        "ogrd",
        "security",
        "timedRelease",
        "earliestPermittedStreetDate",
        "bundleOnly"
})
@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
public class ReleaseSchedule {

    private String sender;

    private String override;

    private String gpid;

    private String label;

    private YesNoEnumType preorderPreview;

    private String ogrd;

    private BigInteger security;

    private YesNoEnumType timedRelease;

    private XMLGregorianCalendar earliestPermittedStreetDate;

    private YesNoEnumType bundleOnly;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<CommentsType> comments;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TerritoriesType> territories;

    // custom getters - override lombok getters
    public List<CommentsType> getComments() {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        return this.comments;
    }

    public List<TerritoriesType> getTerritories() {
        if (territories == null)  {
            territories = new ArrayList<>();
        }
        return this.territories;
    }
}
