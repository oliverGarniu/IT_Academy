package com.spring.S501;

import org.springframework.boot.SpringApplication;
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.List;
//import org.springframework.context.ConfigurableApplicationContext;
//import com.spring.S501.model.WhiteCollarPicture;
//import com.spring.S501.model.WhiteCollarShop;
//import com.spring.S501.repository.WhiteCollarShopRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	public static void main(String[] args) {
//
//		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
//
//		WhiteCollarShopRepository whiteCollarShopRepository = configurableApplicationContext.getBean(WhiteCollarShopRepository.class);
//
//		WhiteCollarShop whiteCollarShop = new WhiteCollarShop("Real Collar Shop", 999);
//		WhiteCollarPicture pic1 = new WhiteCollarPicture("Tramuntana", "Anonymous", 30000F, LocalDate.now(), whiteCollarShop);
//		WhiteCollarPicture pic2 = new WhiteCollarPicture("Collars de colors", "Kai Otton", 99.99F, LocalDate.now(), whiteCollarShop);
//		List<WhiteCollarPicture> pictures = Arrays.asList(pic1, pic2);
//		whiteCollarShop.setPictures(pictures);
//		whiteCollarShopRepository.save(whiteCollarShop);
//	}

}
