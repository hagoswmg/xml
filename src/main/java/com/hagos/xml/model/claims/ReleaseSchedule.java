package com.hagos.xml.model.claims;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
    "sender",
    "gpid",
    "itemLabel",
    "accountChannels"
})
@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
public class ReleaseSchedule {
    private String sender;

    private String gpid;

    private String itemLabel;

    @Getter(AccessLevel.NONE)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<AccountChannel> accountChannels;

    // custom getter overwrites Lombok

    public List<AccountChannel> getAccountChannels() {
        if (accountChannels == null) {
            accountChannels = new ArrayList<>();
        }
        return this.accountChannels;
    }
}
