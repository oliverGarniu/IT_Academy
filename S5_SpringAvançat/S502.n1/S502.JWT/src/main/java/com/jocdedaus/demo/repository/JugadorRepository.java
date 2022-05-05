package com.jocdedaus.demo.repository;

import com.jocdedaus.demo.model.Jugador;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("jugador")
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
}
