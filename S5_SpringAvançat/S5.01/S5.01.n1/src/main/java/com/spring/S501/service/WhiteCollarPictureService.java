package com.spring.S501.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.S501.exception.PictureNotFoundException;
import com.spring.S501.model.WhiteCollarPicture;
import com.spring.S501.repository.WhiteCollarPictureRepository;

@Service
public class WhiteCollarPictureService {

	private final WhiteCollarPictureRepository whiteCollarPictureRepository;

	@Autowired
	public WhiteCollarPictureService(WhiteCollarPictureRepository whiteCollarPictureRepository) {
		this.whiteCollarPictureRepository = whiteCollarPictureRepository;
	}

	public WhiteCollarPicture addWhiteCollarPicture(WhiteCollarPicture whiteCollarPicture) {
		return whiteCollarPictureRepository.save(whiteCollarPicture);
	}

	public List<WhiteCollarPicture> getWhiteCollarPictures() {
		return StreamSupport
				.stream(whiteCollarPictureRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

	public WhiteCollarPicture getWhiteCollarPictureById(Long pictureId) {
		return whiteCollarPictureRepository.findById(pictureId).orElseThrow(() ->
		new PictureNotFoundException(pictureId));
	}
	
	public WhiteCollarPicture deleteWhiteCollarPicture(Long pictureId) {
		WhiteCollarPicture whiteCollarPicture = getWhiteCollarPictureById(pictureId);
		whiteCollarPictureRepository.delete(whiteCollarPicture);
		return whiteCollarPicture;
	}
	
//	public WhiteCollarPicture deleteAllWhiteCollarPictures() {
//	WhiteCollarPicture whiteCollarPicture = (WhiteCollarPicture) getWhiteCollarPictures();
//	whiteCollarPictureRepository.delete(whiteCollarPicture);
//	return whiteCollarPicture;
//}
	
	@Transactional
	public WhiteCollarPicture editWhiteCollarPicture(Long pictureId, WhiteCollarPicture whiteCollarPicture) {
		WhiteCollarPicture whiteCollarPictureToEdit = getWhiteCollarPictureById(pictureId);
		whiteCollarPictureToEdit.setAuthorName(whiteCollarPicture.getAuthorName());
		whiteCollarPictureToEdit.setPictureName(whiteCollarPicture.getPictureName());
		whiteCollarPictureToEdit.setPrice(whiteCollarPicture.getPrice());
		return whiteCollarPictureToEdit;
	}

}
