package com.hagos.xml.model.newrelease;

public enum YesNoEnumType {

    N,
    Y;

    public String value() {
        return name();
    }

    public static YesNoEnumType fromValue(String v) {
        return valueOf(v);
    }

}
