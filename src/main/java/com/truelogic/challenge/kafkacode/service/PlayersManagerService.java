package com.truelogic.challenge.kafkacode.service;

import com.truelogic.challenge.kafkacode.entity.request.PlayersRequest;
import com.truelogic.challenge.kafkacode.entity.response.PlayersResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PlayersManagerService {

    private PlayersPersistenceService playersPersistenceService;
    private KafkaProducerService kafkaProducerService;

    public PlayersResponse managePlayers(PlayersRequest request) {
        PlayersResponse response = new PlayersResponse();
        List<String> result = new ArrayList<>();
        if (request.getPlayers().size() == 0) {
            return response;
        }

        request.getPlayers()
                .forEach(playersDTO -> {

                        if (playersDTO.getPlayerType().equalsIgnoreCase("expert")) {
                            playersPersistenceService.savePlayers(playersDTO);
                            result.add("player " + playersDTO.getPlayerName() + " stored in DB");
                        } else if (playersDTO.getPlayerType().equalsIgnoreCase("novice")) {
                            kafkaProducerService.sendKafkaMessage(playersDTO);
                            result.add("player " + playersDTO.getPlayerName() + " sent to Kafka topic");
                        } else {
                            result.add("player " + playersDTO.getPlayerName() + " did not fit");
                        }
                        response.setResult(result);
                    });

        return response;

    }
}
