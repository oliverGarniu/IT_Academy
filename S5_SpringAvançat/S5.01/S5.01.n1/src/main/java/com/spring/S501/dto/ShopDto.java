package com.spring.S501.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.spring.S501.model.WhiteCollarShop;
import lombok.Data;

@Data
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
		shopDto.setPicturesDto(whiteCollarShop.getPictures().stream().map(PictureDto::from).collect(Collectors.toList()));
		return shopDto;
	}

}
