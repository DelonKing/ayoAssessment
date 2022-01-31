package com.ayo.api.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayo.api.service.AyoConversionService;

 
@RestController
@RequestMapping("api")
public class AyoController {
	
	Logger logger = LoggerFactory.getLogger(AyoController.class);
	
	@Autowired
	AyoConversionService conversionService;

	
	@GetMapping(path = "/{fromUnit}/{toUnit}/{amount}")
	public ResponseEntity<Double> getbalance(@PathVariable String fromUnit,
			@PathVariable String toUnit,@PathVariable Double amount) {

		logger.info("call convert from " + fromUnit + " to " + toUnit + " with amount " +  amount);

		return conversionService.convert( fromUnit, toUnit, amount);
	}
	
	@GetMapping(path = "/getconversions")
	public String getConversions() {
		return conversionService.getConversions();
		
	}
	

}
