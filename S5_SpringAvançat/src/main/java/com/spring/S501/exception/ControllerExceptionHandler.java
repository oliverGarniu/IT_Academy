package com.spring.S501.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import java.time.ZonedDateTime;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(EmptyShopListException.class)
	public ResponseEntity<String> handleEmptyShopList(EmptyShopListException emptyShopListException) {

		return new ResponseEntity<String>("No hi ha cap botiga per mostrar.", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmptyPictureListException.class)
	public ResponseEntity<String> handleEmptyPictureList(EmptyPictureListException emptyPictureListException) {
		
		return new ResponseEntity<String>("No hi ha cap quadre per mostrar.", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(PictureNotFoundException.class)
	public ResponseEntity<String> handleShopNotFound(PictureNotFoundException pictureNotFoundException) {

		return new ResponseEntity<String>("No hi ha cap quadre amb aquest id.", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ShopNotFoundException.class)
	public ResponseEntity<String> handleShopNotFound(ShopNotFoundException shopNotFoundException) {

		return new ResponseEntity<String>("No hi ha cap botiga amb aquest id.", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(PictureAlreadyAssignedException.class)
	public ResponseEntity<String> handlePictureAlreadyAssigned(
			PictureAlreadyAssignedException pictureAlreadyAssignedException) {

		return new ResponseEntity<String>("Aquest quadre ja està assignat a una altra botiga.", HttpStatus.BAD_REQUEST);
	}

//	@ExceptionHandler(EmptyInputStringException.class)
//	// Torna un String (missatge i Http status)
//	public ResponseEntity<String> handleStringEmptyInput(EmptyInputStringException emptyInputException) {
//
//		return new ResponseEntity<String>(
//				"El camp corresponent al nom i/o capacitat està en blanc, afegeix el nom i la capacitat de la nova botiga.",
//				HttpStatus.BAD_REQUEST);
//	}
//

}
