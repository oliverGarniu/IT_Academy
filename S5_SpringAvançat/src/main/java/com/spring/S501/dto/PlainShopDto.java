package com.spring.S501.dto;

import com.spring.S501.model.WhiteCollarShop;

public class PlainShopDto {
	private Long shopId;
	private String shopName;
	private int capacity;

	public static PlainShopDto from(WhiteCollarShop whiteCollarShop) {
		PlainShopDto plainShopDto = new PlainShopDto();
		plainShopDto.setShopId(whiteCollarShop.getShopId());
		plainShopDto.setShopName(whiteCollarShop.getShopName());
		plainShopDto.setCapacity(whiteCollarShop.getCapacity());
		return plainShopDto;
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

}
