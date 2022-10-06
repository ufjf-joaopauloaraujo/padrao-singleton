package com.araujo.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class StockMockRepository {

    private static Map<String, Stock> stocksData;

    public static Stock findByTicker(String ticker) {
        if (null == stocksData) {
            seedStocksData();
        }
        return stocksData.get(ticker);
    }

    private static void seedStocksData() {
        stocksData = new HashMap<>();
        stocksData.put("AAPL", new Stock("AAPL", "Apple", new BigDecimal("142.48")));
        stocksData.put("AMZN", new Stock("AMZN", "Amazon", new BigDecimal("114.80")));
        stocksData.put("MSFT", new Stock("MSFT", "Microsoft", new BigDecimal("237.50")));
        stocksData.put("XOM", new Stock("XOM", "Exxon Mobil", new BigDecimal("88.68")));
        stocksData.put("JNJ", new Stock("JNJ", "Johnson & Johnson", new BigDecimal("164.53")));
    }
}
