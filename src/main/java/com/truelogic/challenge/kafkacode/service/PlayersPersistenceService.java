package com.truelogic.challenge.kafkacode.service;

import com.truelogic.challenge.kafkacode.entity.Players;
import com.truelogic.challenge.kafkacode.entity.dto.PlayersDTO;
import com.truelogic.challenge.kafkacode.repository.PlayersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayersPersistenceService {

    private final PlayersRepository playersRepository;

    public void savePlayers(PlayersDTO playersDTO) {
        Players players = toPlayers(playersDTO);
        playersRepository.save(players);
    }

    private Players toPlayers(PlayersDTO playersDTO) {
        Players players = new Players();
        players.setPlayerName(playersDTO.getPlayerName());
        players.setPlayerType(playersDTO.getPlayerType());
        return players;
    }
}
