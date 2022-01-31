package com.ayo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

@Service
public class AyoConversionService {
	
	@Autowired
	Gson gson;

	public ResponseEntity<Double> convert(String fromUnit, String toUnit, double amount) {

		String formula = ConversionChart.conversionTable.get((fromUnit + "-" + toUnit).toLowerCase());

		if (formula != null) {
			
			Expression e = new ExpressionBuilder(formula).variables("X").build().setVariable("X", amount);
			double result = e.evaluate();

			return new ResponseEntity<>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	public String getConversions() {
 
		
		return gson.toJson(ConversionChart.conversionTable) ;
	}

}
