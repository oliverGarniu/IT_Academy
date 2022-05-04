package com.spring.S501.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.S501.exception.PictureAlreadyAssignedException;
import com.spring.S501.exception.ShopNotFoundException;
import com.spring.S501.model.WhiteCollarPicture;
import com.spring.S501.model.WhiteCollarShop;
import com.spring.S501.repository.WhiteCollarShopRepository;

@Service
public class WhiteCollarShopService {

	private final WhiteCollarShopRepository whiteCollarShopRepository;
	private final WhiteCollarPictureService whiteCollarPictureService;

	@Autowired
	public WhiteCollarShopService(WhiteCollarShopRepository whiteCollarShopRepository,
			WhiteCollarPictureService whiteCollarPictureService) {
		this.whiteCollarShopRepository = whiteCollarShopRepository;
		this.whiteCollarPictureService = whiteCollarPictureService;
	}

	public WhiteCollarShop addWhiteCollarShop(WhiteCollarShop whiteCollarShop) {
		return whiteCollarShopRepository.save(whiteCollarShop);
	}

	public List<WhiteCollarShop> getWhiteCollarShops() {
		return StreamSupport.stream(whiteCollarShopRepository
				.findAll()
				.spliterator(), false)
				.collect(Collectors.toList());
	}

	public WhiteCollarShop getWhiteCollarShopById(Long shopId) {
		return whiteCollarShopRepository.findById(shopId).orElseThrow(() -> new ShopNotFoundException());
	}

	public WhiteCollarShop deleteWhiteCollarShop(Long shopId) {
		WhiteCollarShop whiteCollarShop = getWhiteCollarShopById(shopId);
		whiteCollarShopRepository.delete(whiteCollarShop);
		return whiteCollarShop;
	}

	@Transactional
	public WhiteCollarShop editWhiteCollarShop(Long shopId, WhiteCollarShop whiteCollarShop) {
		WhiteCollarShop whiteCollarShopToEdit = getWhiteCollarShopById(shopId);
		whiteCollarShopToEdit.setShopName(whiteCollarShop.getShopName());
		whiteCollarShopToEdit.setCapacity(whiteCollarShop.getCapacity());
		return whiteCollarShopToEdit;
	}

	@Transactional
	public WhiteCollarShop addPictureToShop(Long shopId, Long pictureId) {
		WhiteCollarShop whiteCollarShop = getWhiteCollarShopById(shopId);
		WhiteCollarPicture whiteCollarPicture = whiteCollarPictureService.getWhiteCollarPictureById(pictureId);
		
		if(Objects.nonNull(whiteCollarPicture.getWhiteCollarShop())) {
			throw new PictureAlreadyAssignedException(pictureId, whiteCollarPicture.getWhiteCollarShop().getShopId());
		}
		
		whiteCollarShop.addWhiteCollarPicture(whiteCollarPicture);
		whiteCollarPicture.setWhiteCollarShop(whiteCollarShop);
		return whiteCollarShop;
	}

	@Transactional
	public WhiteCollarShop removePictureFromShop(Long shopId, Long pictureId) {
		WhiteCollarShop whiteCollarShop = getWhiteCollarShopById(shopId);
		WhiteCollarPicture whiteCollarPicture = whiteCollarPictureService.getWhiteCollarPictureById(pictureId);
		whiteCollarShop.removeWhiteCollarPicture(whiteCollarPicture);
		return whiteCollarShop;
	}
		
	@Transactional
	public WhiteCollarShop removeAllPicturesFromShop(Long shopId) {
		WhiteCollarShop whiteCollarShop = getWhiteCollarShopById(shopId);
		List<WhiteCollarPicture> pictures = whiteCollarShop.getPictures();
		whiteCollarShop.removeAllWhiteCollarPictures(pictures);
		return whiteCollarShop;
	} 
}
