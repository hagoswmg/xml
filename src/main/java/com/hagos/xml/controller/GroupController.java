package com.hagos.xml.controller;

import com.hagos.xml.Utils;
import com.hagos.xml.model.group.TaskDetail;
import com.hagos.xml.model.group.TaskHeader;
import com.hagos.xml.model.group.Tasks;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Group Processing")
@RequestMapping("group")
public class GroupController {
    /**
     * <task-detail>...</task-detail> in xml
     */
    @PostMapping(path="/task-detail", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getTaskDetail(@RequestBody String taskDetailStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(taskDetailStr, TaskDetail.class));
    }

    /**
     * <task_header>
     *     <task_detail>...</task_detail>
     *     ...
     * </task_header> in xml or json
     */
    @PostMapping (path="/task-header", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getTaskHeader(@RequestBody String taskHeaderStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(taskHeaderStr, TaskHeader.class));
    }

    /**
     * <tasks>
     *     <task_header>...</task_header>
     * </tasks>
     * in xml or json
     */
    @PostMapping (path="/tasks", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getTasks(@RequestBody String taskStr) {
        return ResponseEntity.ok(Utils.getObject4StringPayload(taskStr, Tasks.class));
    }
}
