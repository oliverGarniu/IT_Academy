package com.spring.S402.n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.spring.S402.n.property.FileStorageProperties;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ServletComponentScan
//@ComponentScan
@SpringBootApplication

//nivell 2 
@EnableConfigurationProperties({FileStorageProperties.class})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
