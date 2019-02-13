package com.tools.webfluxdemo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tools.webfluxdemo.dto.TESrchRequestResponse;

import reactor.core.publisher.Mono;

@Service
public class TaxService {

	@Autowired
	RestTemplate restTemplate;
	
	public TESrchRequestResponse searchTaxExempt(String customerName, String postalCode, String storeNumber, String todayDate){
		
		String URI = "http://dc-tndm-qa.homedepot.com/TERest/TESrch.terst?Tax_exmpt_cust_nm= {customerName}&Pstl_cd= {postalCode}&Str_nbr= {storeNumber}&Sls_dt= {todayDate}";
		
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("customerName", customerName);
		vars.put("postalCode", postalCode);
		vars.put("storeNumber", storeNumber);
		vars.put("todayDate", todayDate);
		
		/*
		 * //ResponseEntity<TESrchRequestResponse> response =
		 * restTemplate.getForEntity(URI, TESrchRequestResponse.class);
		 * 
		 * List<HttpMessageConverter<?>> messageConverters = new
		 * ArrayList<HttpMessageConverter<?>>(); //Add the Jackson Message converter
		 * MappingJackson2HttpMessageConverter converter = new
		 * MappingJackson2HttpMessageConverter(); // Note: here we are making this
		 * converter to process any kind of response, // not only application/*json,
		 * which is the default behaviour
		 * converter.setSupportedMediaTypes(Arrays.asList({"applicaiton/xml"}));
		 * 
		 * messageConverters.add(converter);
		 * restTemplate.setMessageConverters(messageConverters);
		 */
		
		
		TESrchRequestResponse response = restTemplate.getForObject(URI, TESrchRequestResponse.class, vars);
		
		System.out.println("The response is "+ response);
		
		return response;
	}
}
