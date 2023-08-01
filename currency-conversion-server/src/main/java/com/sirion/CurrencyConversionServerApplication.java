package com.sirion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients
public class CurrencyConversionServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServerApplication.class, args);
	}

}
