package com.jocdedaus.demo.controller;

import com.jocdedaus.demo.model.Jugador;
import com.jocdedaus.demo.model.Partida;
import com.jocdedaus.demo.model.dto.JugadorDto;
import com.jocdedaus.demo.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/players")
public class JugadorController {

    private final JugadorService jugadorService;

    @Autowired
    public JugadorController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @PostMapping
    public ResponseEntity<JugadorDto> addJugador(@RequestBody final JugadorDto jugadorDto) {
        Jugador jugador = jugadorService.addJugador(Jugador.from((jugadorDto)));
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

    @PostMapping(value = "{jugadorId}/games")
    public ResponseEntity<JugadorDto> jugadorPlayPartida(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.getJugador(jugadorId);
        jugadorService.playPartida(jugador);
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

    @GetMapping(value = "{jugadorId}")
    public ResponseEntity<JugadorDto> getJugador(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.getJugador(jugadorId);
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<JugadorDto>> getAllJugadors() {
        List<Jugador> jugadors = jugadorService.getAllJugadors();
        List<JugadorDto> jugadorsDto = jugadors.stream().map(JugadorDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(jugadorsDto, HttpStatus.OK);
    }

    @GetMapping(value = "/percentatges")
    public ResponseEntity<Map<String, Double>> getAllJugadorsAndPercentatges() {
        List<Jugador> jugadors = jugadorService.getAllJugadors();
        Map<String, Double> jugadorsAndPercentatge = jugadorService.getAllJugadorsAndPercentatges(jugadors);
        return new ResponseEntity<Map<String, Double>>(jugadorsAndPercentatge, HttpStatus.OK);
    }

    @GetMapping(value = "{jugadorId}/games")
    public ResponseEntity<List<Partida>> getAllPartidesFromJugador(@PathVariable int jugadorId) {
        Jugador jugador = jugadorService.getJugador(jugadorId);
        List<Partida> partides = jugadorService.getAllPartidesFromJugador(jugador);
        return new ResponseEntity<>(partides, HttpStatus.OK);
    }

    @DeleteMapping(value = "{jugadorId}")
    public ResponseEntity<JugadorDto> deleteJugador(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.deleteJugador(jugadorId);
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

    @PutMapping(value = "{jugadorId}")
    public ResponseEntity<JugadorDto> editJugador(@PathVariable final int jugadorId,
                                                  @RequestBody final JugadorDto jugadorDto) {
        Jugador jugador = jugadorService.editJugador(jugadorId, Jugador.from(jugadorDto));
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

//    @PostMapping(value = "{jugadorId}/games/{partidaId}/add")
//    public ResponseEntity<JugadorDto> addPartidaToJugador(@PathVariable final int jugadorId,
//                                                          @PathVariable final int partidaId) {
//        Jugador jugador = jugadorService.addPartidaToJugador(jugadorId, partidaId);
//        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
//    }

    @DeleteMapping(value = "{jugadorId}/games/{partidaId}")
    public ResponseEntity<JugadorDto> removePartidaFromJugador(@PathVariable final int jugadorId,
                                                               @PathVariable final int partidaId) {
        Jugador jugador = jugadorService.removePartidaFromJugador(jugadorId, partidaId);
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

    @DeleteMapping(value = "{jugadorId}/games")
    public ResponseEntity<JugadorDto> removeAllPartidesFromJugador(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.removeAllPartidesFromJugador(jugadorId);
        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
    }

    @GetMapping(value = "/ranking")
    public ResponseEntity<String> getPercentatgeWinnerFromAllJugadors() {
        List<Jugador> jugadors = jugadorService.getAllJugadors();
        String percentageWinnerFromAllPlayers = jugadorService.getPercentatgeFromAllJugadors(jugadors);
        return new ResponseEntity<>(percentageWinnerFromAllPlayers, HttpStatus.OK);
    }

    @GetMapping(value = "/ranking/loser")
    public ResponseEntity<String> getJugadorLoser() {
        List<Jugador> jugadors = jugadorService.getAllJugadors();
        Map<String, Double> jugadorsAndPercentatge = jugadorService.getAllJugadorsAndPercentatges(jugadors);
        String jugadorLoser = jugadorService.getLoserJugador(jugadorsAndPercentatge);
        return new ResponseEntity<>(jugadorLoser, HttpStatus.OK);
    }

    @GetMapping(value = "/ranking/winner")
    public ResponseEntity<String> getJugadorWinner() {
        List<Jugador> jugadors = jugadorService.getAllJugadors();
        Map<String, Double> jugadorsAndPercentatge = jugadorService.getAllJugadorsAndPercentatges(jugadors);
        String jugadorWinner = jugadorService.getWinnerJugador(jugadorsAndPercentatge);
        return new ResponseEntity<>(jugadorWinner, HttpStatus.OK);
    }
}
