package com.jocdedaus.repository;

import com.jocdedaus.model.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends MongoRepository<Jugador, Integer> {
}
