package com.hagos.xml.model.claims;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReleaseScheduleWrapper {
    @JsonProperty(value = "ReleaseSchedule")
    private ReleaseSchedule releaseSchedule;
}
