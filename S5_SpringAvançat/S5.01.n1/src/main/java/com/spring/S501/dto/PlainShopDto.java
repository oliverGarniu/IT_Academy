package com.spring.S501.dto;

import com.spring.S501.model.WhiteCollarShop;
import lombok.Data;

@Data
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
}
