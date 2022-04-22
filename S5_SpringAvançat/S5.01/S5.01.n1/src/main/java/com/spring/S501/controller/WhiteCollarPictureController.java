package com.spring.S501.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.S501.dto.PictureDto;
import com.spring.S501.exception.EmptyPictureListException;
import com.spring.S501.model.WhiteCollarPicture;
import com.spring.S501.service.WhiteCollarPictureService;

@RestController
@RequestMapping("/pictures")
public class WhiteCollarPictureController {

	private final WhiteCollarPictureService whiteCollarPictureService;

	@Autowired
	public WhiteCollarPictureController(WhiteCollarPictureService whiteCollarPictureService) {
		this.whiteCollarPictureService = whiteCollarPictureService;
	}

	@PostMapping
	public ResponseEntity<PictureDto> addPicture(@RequestBody final PictureDto pictureDto) {
		WhiteCollarPicture whiteCollarPicture = whiteCollarPictureService.addWhiteCollarPicture(WhiteCollarPicture.from(pictureDto));
		return new ResponseEntity<>(PictureDto.from(whiteCollarPicture), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<PictureDto>> getPictures() {
		List<WhiteCollarPicture> pictures = whiteCollarPictureService.getWhiteCollarPictures();
		List<PictureDto> picturesDto = pictures.stream().map(PictureDto::from).collect(Collectors.toList());

		if (picturesDto.isEmpty()) throw new EmptyPictureListException();
		
		return new ResponseEntity<>(picturesDto, HttpStatus.OK);
	}

	@GetMapping(value = "{pictureId}")
	public ResponseEntity<PictureDto> getPicture(@PathVariable final Long pictureId) {
		WhiteCollarPicture whiteCollarPicture = whiteCollarPictureService.getWhiteCollarPictureById(pictureId);
		return new ResponseEntity<>(PictureDto.from(whiteCollarPicture), HttpStatus.OK);
	}

	@PutMapping(value = "{pictureId}")
	public ResponseEntity<PictureDto> editPicture(@PathVariable final Long pictureId, @RequestBody final PictureDto pictureDto) {
		WhiteCollarPicture editedWhiteCollarPicture = whiteCollarPictureService.editWhiteCollarPicture(pictureId, WhiteCollarPicture.from(pictureDto));
		return new ResponseEntity<>(PictureDto.from(editedWhiteCollarPicture), HttpStatus.OK);
	}

//	@DeleteMapping
//	public ResponseEntity<PictureDto> deleteAllPictures() {
//		WhiteCollarPicture whiteCollarPicture = whiteCollarPictureService.deleteAllWhiteCollarPictures();
//		return new ResponseEntity<>(PictureDto.from(whiteCollarPicture), HttpStatus.OK);
//	}

}
