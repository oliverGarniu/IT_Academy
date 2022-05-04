package com.spring.S501.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.spring.S501.model.WhiteCollarShop;

public class ShopDto {
	private Long shopId;
	private String shopName;
	private int capacity;
	private List<PictureDto> picturesDto = new ArrayList<>();

	public static ShopDto from(WhiteCollarShop whiteCollarShop) {
		ShopDto shopDto = new ShopDto();
		shopDto.setShopId(whiteCollarShop.getShopId());
		shopDto.setShopName(whiteCollarShop.getShopName());
		shopDto.setCapacity(whiteCollarShop.getCapacity());
		shopDto.setPicturesDto(
				whiteCollarShop.getPictures().stream().map(PictureDto::from).collect(Collectors.toList()));
		return shopDto;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<PictureDto> getPicturesDto() {
		return picturesDto;
	}

	public void setPicturesDto(List<PictureDto> picturesDto) {
		this.picturesDto = picturesDto;
	}

}
