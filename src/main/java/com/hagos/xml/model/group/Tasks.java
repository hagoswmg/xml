package com.hagos.xml.model.group;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "tasks")
public class Tasks {
    @JacksonXmlProperty(localName = "task_header")
    private TaskHeader taskHeader;
}
