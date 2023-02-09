package com.hagos.xml.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hagos.xml.model.newrelease.ReleaseSchedule;
import com.hagos.xml.model.newrelease.ReleaseScheduleWrapper;
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
public class NewReleaseClaimsController {

    /**
     {
         "ReleaseSchedule": {
         "sender": "WMG",
         "gpid": "A10302B00056347472",
         "itemLabel": "Atlantic Records",
                 "accountChannels": {
                 "accountName": "YouTube",
                 "channelDisplayName": "DustyMcFlyTV",
                 "visibility": "NO CHANGE",
                 "videoId": "7UEo0tTo6b0",
                 "usagePolicy": "MONETIZE",
                 "enableContentIdMatches": "BLOCK",
                 "action": "SEND CLAIM ONLY",
                 "xmlType": "MUSIC VIDEO CLAIM",
                 "assetId": "A417470843051404",
                 "goLiveDateTime": "",
                 "scheduledBy": "Hagos, Getachew",
                 "distributor": "ADA US",
                 "streetDate": "05/11/2020"
                 }
         }
     }
     */
    @PostMapping(path="newreleaseinfo/{gpid}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getNewReleasePayload(@RequestBody String payload, @PathVariable String gpid) {
        log.info(String.format("[/newreleaseinfo/%s] POST endpoint invoked", gpid));
        try {
            final ReleaseScheduleWrapper releaseScheduleWrapper = Utils.getObject4JsonPayload(payload, ReleaseScheduleWrapper.class);
            final ReleaseSchedule releaseSchedule = releaseScheduleWrapper.getReleaseSchedule();

            return ResponseEntity.status(201).body(releaseSchedule);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
