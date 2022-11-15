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
        "isoCodes",
        "distributor",
        "marketingLabel",
        "scheduleType",
        "accountIds",
        "usageTypes",
        "streetDateTime",
        "takedown",
        "pricing",
        "schedBy",
        "preorderDateTime",
        "tracks"
})

@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
public class TerritoriesType {

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ISO3166CountryCode> isoCodes;

    private String distributor;

    private String marketingLabel;

    private ScheduleTypeCode scheduleType;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Long> accountIds;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> usageTypes;

    private XMLGregorianCalendar streetDateTime;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TakedownType> takedown;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PricingType> pricing;

    private String schedBy;

    private XMLGregorianCalendar preorderDateTime;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TracksType> tracks;


    // customer getters
    public List<ISO3166CountryCode> getIsoCodes() {
        if (isoCodes == null) {
            isoCodes = new ArrayList<>();
        }
        return this.isoCodes;
    }

    public List<Long> getAccountIds() {
        if (accountIds == null) {
            accountIds = new ArrayList<>();
        }
        return this.accountIds;
    }

    public List<String> getUsageTypes() {
        if (usageTypes == null) {
            usageTypes = new ArrayList<>();
        }
        return this.usageTypes;
    }

    public List<TakedownType> getTakedown() {
        if (takedown == null) {
            takedown = new ArrayList<>();
        }
        return this.takedown;
    }

    public List<PricingType> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<>();
        }
        return this.pricing;
    }

    public List<TracksType> getTracks() {
        if (tracks == null) {
            tracks = new ArrayList<>();
        }
        return this.tracks;
    }
}
