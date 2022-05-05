package com.spring.S501.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import org.hibernate.action.internal.OrphanRemovalAction;

import com.spring.S501.dto.ShopDto;

@Entity
@Table(name = "shops")
public class WhiteCollarShop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "shop_id")
	private Long shopId;
//	@Column(name = "shop_name")
	private String shopName;
//	@Column(name = "Capacity")
	private int capacity;

	@OneToMany(mappedBy = "whiteCollarShop", cascade = CascadeType.ALL, orphanRemoval = true)

	private List<WhiteCollarPicture> pictures = new ArrayList<>();

	public WhiteCollarShop() {

	}

	public WhiteCollarShop(String shopName, int capacity) {
		this.shopName = shopName;
		this.capacity = capacity;
	}

	public void addWhiteCollarPicture(WhiteCollarPicture whiteCollarPicture) {
		pictures.add(whiteCollarPicture);
	}

	public void removeWhiteCollarPicture(WhiteCollarPicture whiteCollarPicture) {
		pictures.remove(whiteCollarPicture);
	}

	public void removeAllWhiteCollarPictures(List<WhiteCollarPicture> pictures) {
		pictures.removeAll(pictures);
	}

	public static WhiteCollarShop from(ShopDto shopDto) {
		WhiteCollarShop whiteCollarShop = new WhiteCollarShop();
		whiteCollarShop.setShopName(shopDto.getShopName());
		whiteCollarShop.setCapacity(shopDto.getCapacity());
		return whiteCollarShop;
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

	public List<WhiteCollarPicture> getPictures() {
		return pictures;
	}

	public void setPictures(List<WhiteCollarPicture> pictures) {
		this.pictures = pictures;
	}

}
