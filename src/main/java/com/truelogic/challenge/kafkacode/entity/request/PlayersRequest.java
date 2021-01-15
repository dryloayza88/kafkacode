package com.truelogic.challenge.kafkacode.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.truelogic.challenge.kafkacode.entity.dto.PlayersDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PlayersRequest {
    @JsonProperty("players")
    private List<PlayersDTO> players;
}
