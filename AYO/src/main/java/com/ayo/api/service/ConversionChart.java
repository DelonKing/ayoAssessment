package com.ayo.api.service;

import java.util.HashMap;

public class ConversionChart {

	public static HashMap<String, String> conversionTable;

	static {

		conversionTable = new HashMap<>();

		conversionTable.put("Kilometers-Miles".toLowerCase(), "X*0.62137");
		conversionTable.put("Miles-Kilometers".toLowerCase(), "X*1.61");
		conversionTable.put("Kilogram-Pound".toLowerCase(), "X*2.2046");
		conversionTable.put("Pound-Kilogram".toLowerCase(), "X*0.45");
		conversionTable.put("Feet-Metres".toLowerCase(), "X*3.2808");
		conversionTable.put("Metres-Feet".toLowerCase(), "X*0.305");
		conversionTable.put("Inches-Centimetres".toLowerCase(), "X*2.54");
		conversionTable.put("Centimetres-Inches".toLowerCase(), "X*0.39370");
		conversionTable.put("Celsius-Fahrenheit".toLowerCase(), "X*1.800 +32.00");
		conversionTable.put("Fahrenheit-Celsius".toLowerCase(), "(X-32)/1.8000");
		conversionTable.put("Celsius-Kelvin".toLowerCase(), "X+273.15");
		conversionTable.put("Kelvin-Celsius".toLowerCase(), "X-273.15");
		conversionTable.put("Fahrenheit-Kelvin".toLowerCase(), "(X-32)*(5/9) + 273.15");
		conversionTable.put("Kelvin-Fahrenheit".toLowerCase(), "(X-273.15)*(9/5) + 32");

	}
}
