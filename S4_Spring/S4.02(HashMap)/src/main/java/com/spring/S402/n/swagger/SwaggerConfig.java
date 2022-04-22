package com.spring.S402.n.swagger;

//import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.service.ApiInfo;
//import io.swagger.models.Contact;
//import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	http://localhost:8080/swagger-ui/index.html
//	http://localhost:8080/v3/api-docs/
//  http://localhost:8080/v3/api-docs.yaml
		
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
//				.apiInfo(getApiInfo());
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();

	}

//public void addResourceHandler(ResourceHandlerRegistry registry) {
//
//		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//	}
}
