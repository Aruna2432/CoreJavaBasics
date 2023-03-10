package com.classesAndObjects;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberSampleCurrency {

	public static void main(String[] args) {
		
		Double currency = new Double(9876543.21);
		NumberFormat currencyFormatter;
		String currencyOut;
		
		currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		currencyOut = currencyFormatter.format(currency);
		System.out.println(currencyOut);

	}

}
