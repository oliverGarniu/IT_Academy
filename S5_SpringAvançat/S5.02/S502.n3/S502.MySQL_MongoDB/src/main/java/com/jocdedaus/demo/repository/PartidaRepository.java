package com.jocdedaus.demo.repository;

import com.jocdedaus.demo.document.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaRepository extends MongoRepository<Partida, Integer> {
}
