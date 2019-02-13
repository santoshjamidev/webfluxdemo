package com.tools.webfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebfluxdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxdemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	class TheCustomConverter extends StringHttpMessageConverter {
	    //just an empty custom converter
	}
	
	 @Bean
	    public HttpMessageConverters additionalConverters() {
	        return new HttpMessageConverters(new TheCustomConverter());
	   }	
	

}
