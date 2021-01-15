package com.truelogic.challenge.kafkacode.repository;

import com.truelogic.challenge.kafkacode.entity.Players;
import org.springframework.data.repository.CrudRepository;

public interface PlayersRepository extends CrudRepository<Players, Integer> {
}
