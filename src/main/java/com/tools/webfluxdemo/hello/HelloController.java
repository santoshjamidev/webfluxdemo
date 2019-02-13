package com.tools.webfluxdemo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tools.webfluxdemo.dto.TESrchRequestResponse;
import com.tools.webfluxdemo.service.TaxService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private TaxService taxService;
	
	@GetMapping
	public Mono<String> sayHello(){
		return Mono.just("Please pass a path variable to see hello ");
	}

	@GetMapping
	@RequestMapping(value="/{name}")
	public Mono<String> sayHello(@PathVariable String name){
		return Mono.just("Hello "+name);
	}
	
	@GetMapping
	@RequestMapping(value="/{customerName}/{postalCode}/{storeNumber}/{todayDate}", produces = {MediaType.APPLICATION_XML_VALUE})
	public @ResponseBody TESrchRequestResponse searchTax(@PathVariable String customerName,@PathVariable String postalCode,@PathVariable String storeNumber,@PathVariable String todayDate){
		return taxService.searchTaxExempt(customerName, postalCode, storeNumber, todayDate);
	}
}
