package com.spring.S501.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.spring.S501.model.WhiteCollarPicture;

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

	public Long getPictureId() {
		return pictureId;
	}

	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public PlainShopDto getPlainShopDto() {
		return plainShopDto;
	}

	public void setPlainShopDto(PlainShopDto plainShopDto) {
		this.plainShopDto = plainShopDto;
	}
	
}
