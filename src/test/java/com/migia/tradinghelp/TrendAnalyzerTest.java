package com.migia.tradinghelp;

import com.migia.tradinghelp.structure.implementations.High;
import com.migia.tradinghelp.types.candle.Candle;
import com.migia.tradinghelp.types.series.SimpleSeries;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TrendAnalyzerTest {

    private final static List<Candle> candles = Generator.getCandles(20);

    @Test
    public void testTrend(){

        List<Double> prices = candles.stream().map(e -> e.getHigh()).toList();
        TrendAnalyzer analyzer = new TrendAnalyzer();
        SimpleSeries series = new SimpleSeries(candles);
        High high = new High(series);
        double slope = analyzer.calculateSlope(prices);
        System.out.println("Data");
        System.out.println(prices);

        System.out.println("Highs");
        System.out.println(high.getNextHigh());
        System.out.println(slope);

        System.out.println("Is trend");
        System.out.println(analyzer.isTrend(prices));

        //analyzer.isTrend()

    }
}
