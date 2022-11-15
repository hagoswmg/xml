package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hagos.xml.model.newrelease.ReleaseSchedule;
import com.hagos.xml.model.newrelease.ReleaseScheduleWrapper;
import com.hagos.xml.model.product.Product;
import com.hagos.xml.util.Utils;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class NewReleaseController {

    /**
     * {
     *   "ReleaseSchedule": {
     *     "sender": "WMG",
     *     "override": "N",
     *     "gpid": "9781937655037",
     *     "label": "Warner Records",
     *     "preorderPreview": "N",
     *     "ogrd": "2008-09-30Z",
     *     "timedRelease": "N",
     *     "bundleOnly": "N",
     *     "comments": [
     *       {
     *         "comment": "Amazon Kindle Version.",
     *         "type": "Common Schedule Comment"
     *       },
     *       {
     *         "comment": "Amazon Kindle Version.",
     *         "type": "Label Schedule Comment"
     *       }
     *     ]
     *   }
     * }
     */
    @PostMapping(path="newreleaseinfo/{gpid}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getNewReleasePayload(@RequestBody String payload, @PathVariable String gpid) {
        log.info(String.format("[/newreleaseinfo/%s] POST endpoint invoked", gpid));
        try {
            final ReleaseScheduleWrapper releaseScheduleWrapper = Utils.getObject4JsonPayload(payload, ReleaseScheduleWrapper.class);
            final ReleaseSchedule releaseSchedule = releaseScheduleWrapper.getReleaseSchedule();
            return ResponseEntity.ok(releaseSchedule);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
