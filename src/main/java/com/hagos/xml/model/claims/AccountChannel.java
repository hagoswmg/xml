package com.hagos.xml.model.claims;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({
        "accountName",
        "channelDisplayName",
        "visibility",
        "videoId",
        "usagePolicy",
        "enableContentIdMatches",
        "action",
        "xmlType",
        "assetId",
        "goLiveDateTime",
        "timezone",
        "assetNameSuffix",
        "scheduledBy",
        "distributor",
        "streetDate"
})
@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
public class AccountChannel {
    private String accountName;
    private String channelDisplayName;
    private String visibility;
    private String videoId;
    private String usagePolicy;
    private String enableContentIdMatches;
    private String action;
    private String xmlType;
    private String assetId;
    private String goLiveDateTime;
    private String timezone;
    private String assetNameSuffix;
    private String scheduledBy;
    private String distributor;
    private String streetDate;
}
