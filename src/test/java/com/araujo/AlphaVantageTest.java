package com.araujo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AlphaVantageTest {

    public static final String MSFT = "MSFT";
    public static final String MICROSOFT = "Microsoft";
    public static final BigDecimal MSFT_CURRENT_PRICE = new BigDecimal("237.50");

    @Test
    void validateStocksData() {
        AlphaVantage api = AlphaVantage.getInstance();
        assertNotNull(api);
    }

    @Test
    void validateStockCompanyName() {
        AlphaVantage api = AlphaVantage.getInstance();
        assertEquals(MICROSOFT, api.getCompanyName(MSFT));
    }

    @Test
    void validateStockCurrentPrice() {
        AlphaVantage api = AlphaVantage.getInstance();
        assertEquals(MSFT_CURRENT_PRICE, api.getCurrentPrice(MSFT));
    }
}