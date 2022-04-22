package com.spring.S501.model;

import java.time.LocalDate;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.spring.S501.dto.PictureDto;

import lombok.Data;

@Entity
@Table(name = "pictures")
@Data
public class WhiteCollarPicture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pictureId;
//	@Column(name = "Picture Name")
	private String pictureName;
//	@Column(name = "Author Name")
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
}
