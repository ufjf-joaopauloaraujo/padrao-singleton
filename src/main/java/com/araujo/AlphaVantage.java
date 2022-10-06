package com.araujo;

// AlphaVantage is a stock data API.
// The main goal is to encapsulate
// its main functionalities (mock)
// on a Singleton class

import com.araujo.model.StockMockRepository;

import java.math.BigDecimal;

public class AlphaVantage {

    private static AlphaVantage instance = new AlphaVantage();

    private AlphaVantage() {}

    public static AlphaVantage getInstance() {
        return instance;
    }

    public String getCompanyName(String ticker) {
        return StockMockRepository.findByTicker(ticker).getCompanyName();
    }

    public BigDecimal getCurrentPrice(String ticker) {
        return StockMockRepository.findByTicker(ticker).getCurrentPrice();
    }
}
