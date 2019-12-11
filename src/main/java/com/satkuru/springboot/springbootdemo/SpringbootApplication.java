package com.satkuru.springboot.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("Started");
//		Stock stock = YahooFinance.get("INTC");
//
//		BigDecimal price = stock.getQuote().getPrice();
//		BigDecimal change = stock.getQuote().getChangeInPercent();
//		BigDecimal peg = stock.getStats().getPeg();
//		BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
//
//		stock.print();
	}

}
