package com.satkuru.springboot.springbootdemo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/quotes")
public class MarketQuoteController {

    @GetMapping("/{name}")
    public HistoricalQuote getMarketQuote(@PathVariable String name) throws IOException {
        Stock stock = YahooFinance.get(name);
        Optional<HistoricalQuote> quote = stock
                .getHistory()
                .stream()
                .sorted((s1,s2)->s2.getDate().compareTo(s1.getDate()))
                .findFirst();
        return quote.get();
    }
}
