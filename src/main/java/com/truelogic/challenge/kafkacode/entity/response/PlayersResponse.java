package com.truelogic.challenge.kafkacode.entity.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PlayersResponse {
    private List<String> result;
}
