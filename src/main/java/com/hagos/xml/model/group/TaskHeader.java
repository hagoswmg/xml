package com.hagos.xml.model.group;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 *     <task_header>
 *         <group_id>20220325010419334</group_id>
 *         <task_type>ASPERA_UPLOAD</task_type>
 *         <status>NEW</status>
 *         <userid>GetachewHagos</userid>
 *         <email>Getachew.Hagos@wmg.com</email>
 *         <task_detail>
 *             <object_name>075679758620_USAT22200353_44_16.wav</object_name>
 *             <status>NEW</status>
 *             <status_reason>uploaded</status_reason>
 *         </task_detail>
 *         <task_detail>
 *             <object_name>075679758620_USAT22200353_44_16.wav</object_name>
 *             <status>OLD</status>
 *             <status_reason>uploaded</status_reason>
 *         </task_detail>
 *     </task_header>
 */
@Data

@JacksonXmlRootElement(localName = "task_header")
public class TaskHeader {
    @JacksonXmlProperty(localName = "group_id")
    private String groupId;

    @JacksonXmlProperty(localName = "task_type")
    private String taskType;

    private String status;

    private String userid;

    private String email;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "task_detail")
    private List<TaskDetail> taskDetailList;
}
