package com.truelogic.challenge.kafkacode.controller;

import com.truelogic.challenge.kafkacode.entity.request.PlayersRequest;
import com.truelogic.challenge.kafkacode.entity.response.PlayersResponse;
import com.truelogic.challenge.kafkacode.service.PlayersManagerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class PlayersController {

    private PlayersManagerService playersManagerService;

    @PostMapping("/players")
    public ResponseEntity<PlayersResponse> managePlayers(@RequestBody PlayersRequest request) {
        PlayersResponse response = playersManagerService.managePlayers(request);

        if (response == null) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(response);
    }
}
