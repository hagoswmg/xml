package com.hagos.xml.model.newrelease;

public enum PreorderEnumType {

    N,
    Y,
    I,
    P;

    public String value() {
        return name();
    }

    public static PreorderEnumType fromValue(String v) {
        return valueOf(v);
    }

}
