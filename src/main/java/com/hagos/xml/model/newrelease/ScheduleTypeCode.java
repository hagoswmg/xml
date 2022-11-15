package com.hagos.xml.model.newrelease;

public enum ScheduleTypeCode {

    SEND_TO_ALL_BUT,
    LIST,
    ALL,
    SEND_ONLY_TO;

    public String value() {
        return name();
    }

    public static ScheduleTypeCode fromValue(String v) {
        return valueOf(v);
    }
}
