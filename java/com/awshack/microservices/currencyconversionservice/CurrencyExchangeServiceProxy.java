package com.awshack.microservices.currencyconversionservice;

import org.springframework.web.bind.annotation.PathVariable;

public interface CurrencyExchangeServiceProxy {
	public CurrencyConversionBean retrieveExchangeValue
		(@PathVariable("from") String from, @PathVariable("to") String to);
}
