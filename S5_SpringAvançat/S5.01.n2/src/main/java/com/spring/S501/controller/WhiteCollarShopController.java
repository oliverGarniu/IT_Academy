package com.spring.S501.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.S501.dto.ShopDto;
import com.spring.S501.exception.EmptyShopListException;
import com.spring.S501.model.WhiteCollarShop;
import com.spring.S501.service.WhiteCollarShopService;

@RestController
@RequestMapping("/shops")
public class WhiteCollarShopController {

	private final WhiteCollarShopService whiteCollarShopService;

	@Autowired
	public WhiteCollarShopController(WhiteCollarShopService whiteCollarShopService) {
		this.whiteCollarShopService = whiteCollarShopService;
	}
	
	@PostMapping
	public ResponseEntity<ShopDto> addShop(@RequestBody final ShopDto shopDto) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.addWhiteCollarShop(WhiteCollarShop.from(shopDto));
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<ShopDto>> getAllShops() {
		List<WhiteCollarShop> shops = whiteCollarShopService.getWhiteCollarShops();
		List<ShopDto> shopsDto = shops.stream().map(ShopDto::from).collect(Collectors.toList());
		
		if(shops.isEmpty()) throw new EmptyShopListException();
		
		return new ResponseEntity<>(shopsDto, HttpStatus.OK);
	}
	
	@GetMapping(value = "{shopId}")
	public ResponseEntity<ShopDto> getShop(@PathVariable final Long shopId) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.getWhiteCollarShopById(shopId);
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{shopId}")
	public ResponseEntity<ShopDto> deleteShop(@PathVariable final Long shopId) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.deleteWhiteCollarShop(shopId);
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
	
	@PutMapping(value = "{shopId}")
	public ResponseEntity<ShopDto> editShop(@PathVariable final Long shopId, @RequestBody final ShopDto shopDto) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.editWhiteCollarShop(shopId, WhiteCollarShop.from(shopDto));
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
	
	@PostMapping(value = "{shopId}/pictures/{pictureId}/add")
	public ResponseEntity<ShopDto> addPictureToShop(@PathVariable final Long shopId, @PathVariable final Long pictureId) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.addPictureToShop(shopId, pictureId);
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{shopId}/pictures/{pictureId}/remove")
	public ResponseEntity<ShopDto> removePictureFromShop(@PathVariable final Long shopId, @PathVariable final Long pictureId) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.removePictureFromShop(shopId, pictureId);
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{shopId}/pictures/burnItAll")
	public ResponseEntity<ShopDto> removeAllPicturesFromShop(@PathVariable final Long shopId) {
		WhiteCollarShop whiteCollarShop = whiteCollarShopService.removeAllPicturesFromShop(shopId);
		return new ResponseEntity<>(ShopDto.from(whiteCollarShop), HttpStatus.OK);
	}
}
