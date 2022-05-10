package com.hagos.xml.model.asset;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;


@Data
public class CatalogAsset {
    @JacksonXmlProperty(localName = "asset_id")
    private String assetId;
    @JacksonXmlProperty(localName = "asset_type")
    private String assetType;
    @JacksonXmlProperty(localName = "asset_identifier")
    private String assetIdentifier;
    @JacksonXmlProperty(localName = "asset_subidentifier")
    private String assetSubidentifier;
    @JacksonXmlProperty(localName = "identifier_type_code")
    private String identifierTypeCode;
    private String description;
    private String format;
    @JacksonXmlProperty(localName = "format_version")
    private String formatVersion;
    @JacksonXmlProperty(localName = "asset_name")
    private String assetName;
    @JacksonXmlProperty(localName = "asset_location")
    private String assetLocation;
    @JacksonXmlProperty(localName = "asset_size")
    private String assetSize;
    @JacksonXmlProperty(localName = "registered_date")
    private String registeredDate;
    @JacksonXmlProperty(localName = "registered_by")
    private String registeredBy;
    @JacksonXmlProperty(localName = "asset_super_type")
    private String assetSuperType;
    @JacksonXmlProperty(localName = "gar_location")
    private String garLocation;
    @JacksonXmlProperty(localName = "gar_location_type")
    private String garLocationType;
    @JacksonXmlProperty(localName = "publicity_usable_flag")
    private String publicityUsableFlag;
    @JacksonXmlProperty(localName = "asset_checksum")
    private String assetChecksum;
    @JacksonXmlProperty(localName = "asset_sec_status")
    private String assetSecStatus;
    @JacksonXmlProperty(localName = "on_tape_update_date")
    private String onTapeUpdateDate;
    @JacksonXmlProperty(localName = "original_registered_date")
    private String originalRegisteredDate;
    @JacksonXmlProperty(localName = "registered_user")
    private String registeredUser;
    @JacksonXmlProperty(localName = "original_registered_user")
    private String originalRegisteredUser;
}

