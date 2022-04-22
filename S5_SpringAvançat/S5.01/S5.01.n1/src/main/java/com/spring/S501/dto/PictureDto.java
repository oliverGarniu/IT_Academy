package com.spring.S501.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.spring.S501.model.WhiteCollarPicture;

import lombok.Data;

@Data
public class PictureDto {

	private Long pictureId;
	private String pictureName;
	private String authorName;
	private float price;
	private LocalDate date = LocalDate.now();
	
	private PlainShopDto plainShopDto;
	
	public static PictureDto from(WhiteCollarPicture whiteCollarPicture) {
		PictureDto pictureDto = new PictureDto();
		pictureDto.setPictureId(whiteCollarPicture.getPictureId());
		pictureDto.setPictureName(whiteCollarPicture.getPictureName());
		pictureDto.setAuthorName(whiteCollarPicture.getAuthorName());
		pictureDto.setPrice(whiteCollarPicture.getPrice());
		pictureDto.setDate(whiteCollarPicture.getDate());
		
		if(Objects.nonNull(whiteCollarPicture.getWhiteCollarShop())) {
			pictureDto.setPlainShopDto(PlainShopDto.from(whiteCollarPicture.getWhiteCollarShop()));
		}
		
		return pictureDto;
	}
}
