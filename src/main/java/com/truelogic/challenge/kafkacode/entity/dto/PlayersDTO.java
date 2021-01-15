package com.truelogic.challenge.kafkacode.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayersDTO {
    @JsonProperty("name")
    private String playerName;
    @JsonProperty("type")
    private String playerType;
}
