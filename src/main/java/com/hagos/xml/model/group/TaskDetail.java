package com.hagos.xml.model.group;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * <task_detail>
 *  <object_name>075679758620_USAT22200353_44_16.wav</object_name>
 *  <status>NEW</status>
 *  <status_reason>uploaded</status_reason>
 * </task_detail>
 */
@Data
@JacksonXmlRootElement(localName = "task_detail")
public class TaskDetail {
    @JacksonXmlProperty(localName = "object_name")
    private String objectName;
    private String status;
    @JacksonXmlProperty(localName = "status_reason")
    private String statusReason;
}
