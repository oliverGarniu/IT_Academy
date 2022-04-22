package com.spring.S501.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import org.hibernate.action.internal.OrphanRemovalAction;

import com.spring.S501.dto.ShopDto;

import lombok.Data;

@Entity
@Table(name = "shops")
@Data
public class WhiteCollarShop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shopId;
//	@Column(name = "Name")
	private String shopName;
//	@Column(name = "Capacity")
	private int capacity;
	
	@OneToMany(
			mappedBy = "whiteCollarShop", 
			cascade = CascadeType.ALL,
	        orphanRemoval = true
	)
	
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

}
