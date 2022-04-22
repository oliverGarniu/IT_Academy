package com.spring.S402.n.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(EmptyInputStringException.class)
	// Torna un String (missatge i Http status)
	public ResponseEntity<String> handleStringEmptyInput(EmptyInputStringException emptyInputException) {

		return new ResponseEntity<String>(
				"El camp corresponent al nom i/o posició està en blanc, afegeix el nom i la posició del nou treballador.",
				HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(EmptyInputObjectException.class)
	// Torna un Objecte (inclou també el missatge, a més de la resta d´info)
	public ResponseEntity<Object> handleObjectEmptyInput(EmptyInputObjectException e) {

		HttpStatus badRequest = HttpStatus.BAD_REQUEST;

		EIOException eIOException = new EIOException(
				"El camp corresponent al nom i/o posició està en blanc, afegeix el nom i la posició del nou treballador.",
//				e.getMessage(),
//				e,
				badRequest, 
				ZonedDateTime.now());

		return new ResponseEntity<>(eIOException, badRequest);

	}

	@ExceptionHandler(IndexOutOfBoundsException.class)
	public ResponseEntity<String> handleIndexOutOfBoundsException(IndexOutOfBoundsException outOfBoundsException) {

		return new ResponseEntity<String>("No existeix cap treballador amb aquest empNo, torna a provar.",
				HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(EmptyListException.class)
	public ResponseEntity<String> handleEmptyList(EmptyListException emptyListtException) {

		return new ResponseEntity<String>("No hi ha cap empleat per mostrar.", HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(NoEmployeeByPositionException.class)
	// Torna un String (missatge i Http status)
	public ResponseEntity<String> handleNoEmployeeByPositionException(NoEmployeeByPositionException noEmployeeByPositionException) {

		return new ResponseEntity<String>(
				"Actualment no hi ha cap treballador ocupant aquesta posició.",
				HttpStatus.NOT_FOUND);

	}
}
