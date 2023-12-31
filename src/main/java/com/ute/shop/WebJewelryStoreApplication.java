package com.ute.shop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.ute.shop.config.StorageProperties;
import com.ute.shop.service.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class) //to upload file
public class WebJewelryStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebJewelryStoreApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (argv ->{
			storageService.init();
		});
	}

}
