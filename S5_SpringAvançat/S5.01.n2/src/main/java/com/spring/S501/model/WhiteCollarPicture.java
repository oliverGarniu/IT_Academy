package com.spring.S501.model;

import java.time.LocalDate;

//import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.spring.S501.dto.PictureDto;

@Entity
@Table(name = "pictures")
public class WhiteCollarPicture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "picture_id")
	private Long pictureId;
//	@Column(name = "picture_name")
	private String pictureName;
//	@Column(name = "author_name")
	private String authorName;
//	@Column(name = "Price")
	private float price;
//	@Column(name = "Date of entry")
	private LocalDate date = LocalDate.now();

	@ManyToOne
	@JoinColumn(name = "shopId")

	private WhiteCollarShop whiteCollarShop;

	public WhiteCollarPicture() {

	}
	
	public WhiteCollarPicture(String pictureName, String authorName, float price, LocalDate date,
			WhiteCollarShop whiteCollarShop) {
		this.pictureName = pictureName;
		this.authorName = authorName;
		this.price = price;
		this.date = date;
		this.whiteCollarShop = whiteCollarShop;
	}
	
	public static WhiteCollarPicture from(PictureDto pictureDto) {
		WhiteCollarPicture whiteCollarPicture = new WhiteCollarPicture();
		whiteCollarPicture.setAuthorName(pictureDto.getAuthorName());
		whiteCollarPicture.setPictureName(pictureDto.getPictureName());
//		whiteCollarPicture.setDate(pictureDto.getDate());
		whiteCollarPicture.setPrice(pictureDto.getPrice());
		return whiteCollarPicture;
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

	public WhiteCollarShop getWhiteCollarShop() {
		return whiteCollarShop;
	}

	public void setWhiteCollarShop(WhiteCollarShop whiteCollarShop) {
		this.whiteCollarShop = whiteCollarShop;
	}
	
}
