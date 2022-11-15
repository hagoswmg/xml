package com.hagos.xml.model.newrelease;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder( {
    "trackInfo",
    "usageTypes",
    "trackLevelStreetDateTime",
    "preorderOnly",
    "forSaleAsTrack",
    "pricing"
})

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TracksType {

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TrackInfoType> trackInfo;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> usageTypes;

    private XMLGregorianCalendar trackLevelStreetDateTime;

    private PreorderEnumType preorderOnly;

    private YesNoEnumType forSaleAsTrack;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PricingType> pricing;

    // custom getters - override Lombok getters
    public List<TrackInfoType> getTrackInfo() {
        if (trackInfo == null) {
            trackInfo = new ArrayList<>();
        }
        return this.trackInfo;
    }

    public List<String> getUsageTypes() {
        if (usageTypes == null) {
            usageTypes = new ArrayList<>();
        }
        return this.usageTypes;
    }

    public List<PricingType> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<>();
        }
        return this.pricing;
    }
}
