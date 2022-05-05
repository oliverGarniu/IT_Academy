package com.jocdedaus.demo.service;

import com.jocdedaus.demo.model.Jugador;
import com.jocdedaus.demo.model.Partida;
import com.jocdedaus.demo.repository.JugadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class JugadorServiceTest {

    @Autowired
    JugadorService jugadorService;

    @MockBean
    JugadorRepository jugadorRepository;

    Partida partida1, partida2, partida3, partida4, partida5;

    @Test
    void testAddJugador() {

        //given
        Jugador jugador1 = new Jugador("Aleix");
        Jugador jugador2 = new Jugador("Aina");
        Jugador jugador3 = new Jugador("Jordi");

        //when
        when(jugadorRepository.save(jugador1)).thenReturn(jugador1);

        //then
        String expectedJugador = "Aleix";
        String actualJugador = jugadorService.addJugador(jugador1).getName();
        assertEquals(expectedJugador, actualJugador, "El mètode addJugador(jugador1) hauria de tornar com a resultat Aleix.");
    }

    @Test
    void testGetAllJugadors() {

        //given
        Jugador jugador1 = new Jugador("Aleix");
        Jugador jugador2 = new Jugador("Aina");
        Jugador jugador3 = new Jugador("Jordi");

        //when
        when(jugadorRepository.findAll()).thenReturn(Stream.of(jugador1, jugador2, jugador3)
                .collect(Collectors.toList()));

        //then
        int expectedResult = 3;
        int actualResult = jugadorService.getAllJugadors().size();
        assertEquals(expectedResult, actualResult, "El mètode getAllJugadors(size) hauria de tornar com a resultat 3.");
    }

    @Test
    void testGetJugador() {

        //given
        Jugador jugador1 = new Jugador(1, "Aleix");
        Jugador jugador2 = new Jugador(2, "Aina");
        Jugador jugador3 = new Jugador(3, "Jordi");

        //when
        when(jugadorRepository.findById(2)).thenReturn(Optional.of(jugador2));

        //then
        Jugador expectedResult = jugador2;
        Jugador actualResult = jugadorService.getJugador(2);
        assertEquals(expectedResult, actualResult, "El mètode getJugador(1) hauria de tornar com a resultat jugador1.");
    }

    @Test
    void testGetAllPartidesFromJugador() {

        Jugador jugador1 = new Jugador(1, "Aleix");
        Jugador jugador2 = new Jugador(2, "Aina");
        Jugador jugador3 = new Jugador(3, "Jordi");
        partida1 = new Partida(1, 2, 5, true, jugador1);
        partida2 = new Partida(2, 3, 5, false, jugador1);
        partida3 = new Partida(3, 4, 5, false, jugador2);
        partida4 = new Partida(4, 5, 2, true, jugador3);
        partida5 = new Partida(5, 4, 3, true, jugador3);
        jugador1.addPartida(partida1);
        jugador1.addPartida(partida2);
        jugador2.addPartida(partida3);
        jugador3.addPartida(partida4);
        jugador3.addPartida(partida5);

        List<Partida> expectedResult = jugadorService.getAllPartidesFromJugador(jugador3);
        List<Partida> actualResult = jugador3.getPartides();
        assertEquals(expectedResult, actualResult);
    }
}
