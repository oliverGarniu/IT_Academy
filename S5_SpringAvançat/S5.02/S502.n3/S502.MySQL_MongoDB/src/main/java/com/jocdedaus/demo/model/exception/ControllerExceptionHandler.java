package com.jocdedaus.demo.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(EmptyJugadorListException.class)
    public ResponseEntity<String> handleEmptyJugadorList(EmptyJugadorListException emptyJugadorListException) {

        return new ResponseEntity<String>("No hi ha cap jugador per mostrar.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmptyPartidaListException.class)
    public ResponseEntity<String> handleEmptyPartidaList(EmptyPartidaListException emptyPartidaListException) {

        return new ResponseEntity<String>("Aquest jugador encara no ha fet cap tirada de daus.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PartidaNotFoundException.class)
    public ResponseEntity<String> handlePartidaNotFound(PartidaNotFoundException partidaNotFoundException) {

        return new ResponseEntity<String>("No hi ha cap partida amb aquest id.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(JugadorNotFoundException.class)
    public ResponseEntity<String> handleJugadorNotFound(JugadorNotFoundException jugadorNotFoundException) {

        return new ResponseEntity<String>("No hi ha cap jugador amb aquest id.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PercentatgeWinnerNullException.class)
    public ResponseEntity<String> handlePercentatgeWinnerNullException(PercentatgeWinnerNullException percentatgeWinnerNullException){
        return new ResponseEntity<String>("Aquest jugador encara no ha jugat cap partida", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SameJugadorNameInListException.class)
    public ResponseEntity<String> handleSameJugadorNameInListException(SameJugadorNameInListException sameJugadorNameInListException) {

        return new ResponseEntity<String>("Ja hi ha un jugador amb aquest mateix nom, prova d´afegir un nom diferent.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmptyInputStringException.class)
    // Torna un String (missatge i Http status)
    public ResponseEntity<String> handleStringEmptyInput(EmptyInputStringException emptyInputException) {

        return new ResponseEntity<String>("El camp corresponent al nom està en blanc, afegeix el nom del nou jugador.",
                HttpStatus.BAD_REQUEST);
    }
}
