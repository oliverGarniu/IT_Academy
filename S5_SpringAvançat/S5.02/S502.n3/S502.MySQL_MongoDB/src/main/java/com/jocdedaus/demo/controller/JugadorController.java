package com.jocdedaus.demo.controller;

import com.jocdedaus.demo.entity.Jugador;
import com.jocdedaus.demo.model.JugadorModel;
import com.jocdedaus.demo.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/players")
public class JugadorController {

    private final JugadorService jugadorService;

    @Autowired
    public JugadorController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @PostMapping
    public ResponseEntity<JugadorModel> addJugador(@RequestBody final JugadorModel jugadorModel) {
        String jugador = jugadorService.addJugador(jugadorModel);
        return new ResponseEntity<JugadorModel>(jugadorModel, HttpStatus.OK);
    }

    @PostMapping(value = "{jugadorId}/games")
    public ResponseEntity<JugadorModel> jugadorPlayPartida(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.getJugador(jugadorId);
        jugadorService.playPartida(jugador);
        return new ResponseEntity<JugadorModel>((JugadorModel) null, HttpStatus.OK);
    }

    @GetMapping(value = "{jugadorId}")
    public ResponseEntity<JugadorModel> getJugador(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.getJugador(jugadorId);
        return new ResponseEntity<JugadorModel>((MultiValueMap<String, String>) jugador, HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<JugadorDto>> getAllJugadors() {
//        List<Jugador> jugadors = jugadorService.getAllJugadors();
//        List<JugadorDto> jugadorsDto = jugadors.stream().map(JugadorDto::from).collect(Collectors.toList());
//        return new ResponseEntity<>(jugadorsDto, HttpStatus.OK);
//    }

//    @GetMapping(value = "/percentatges")
//    public ResponseEntity<Map<String, Double>> getAllJugadorsAndPercentatges() {
//        List<Jugador> jugadors = jugadorService.getAllJugadors();
//        Map<String, Double> jugadorsAndPercentatge = jugadorService.getAllJugadorsAndPercentatges(jugadors);
//        return new ResponseEntity<Map<String, Double>>(jugadorsAndPercentatge, HttpStatus.OK);
//    }

//    @GetMapping(value = "{jugadorId}/games")
//    public ResponseEntity<List<PartidaModel>> getAllPartidesFromJugador(@PathVariable int jugadorId) {
//        Jugador jugador = jugadorService.getJugador(jugadorId);
//        List<Partida> partides = jugadorService.getAllPartidesFromJugador(jugador);
//        ResponseEntity<Partida> partidaResponseEntity = new ResponseEntity<Partida>(partides, HttpStatus.OK);
//        return partidaResponseEntity;
//    }

//    @DeleteMapping(value = "{jugadorId}")
//    public ResponseEntity<JugadorDto> deleteJugador(@PathVariable final int jugadorId) {
//        Jugador jugador = jugadorService.deleteJugador(jugadorId);
//        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
//    }

    @PutMapping(value = "{jugadorId}")
    public ResponseEntity<JugadorModel> editJugador(@PathVariable final int jugadorId,
                                                  @RequestBody final JugadorModel jugadorModel) {
        Jugador jugador = jugadorService.editJugador(jugadorId, jugadorModel);
        return new ResponseEntity<JugadorModel>(jugadorModel, HttpStatus.OK);
    }

//    @PostMapping(value = "{jugadorId}/games/{partidaId}/add")
//    public ResponseEntity<JugadorDto> addPartidaToJugador(@PathVariable final int jugadorId,
//                                                          @PathVariable final int partidaId) {
//        Jugador jugador = jugadorService.addPartidaToJugador(jugadorId, partidaId);
//        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
//    }

//    @DeleteMapping(value = "{jugadorId}/games/{partidaId}")
//    public ResponseEntity<JugadorDto> removePartidaFromJugador(@PathVariable final int jugadorId,
//                                                               @PathVariable final int partidaId) {
//        Jugador jugador = jugadorService.removePartidaFromJugador(jugadorId, partidaId);
//        return new ResponseEntity<>(JugadorDto.from(jugador), HttpStatus.OK);
//    }

    @DeleteMapping(value = "{jugadorId}/games")
    public ResponseEntity<JugadorModel> removeAllPartidesFromJugador(@PathVariable final int jugadorId) {
        Jugador jugador = jugadorService.removeAllPartidesFromJugador(jugadorId);
        return new ResponseEntity<JugadorModel>((MultiValueMap<String, String>) jugador, HttpStatus.OK);
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
