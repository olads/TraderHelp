package com.migia.tradinghelp;


import com.migia.tradinghelp.structure.implementations.High;
import com.migia.tradinghelp.structure.implementations.Low;
import com.migia.tradinghelp.types.candle.Candle;
import com.migia.tradinghelp.types.series.SimpleSeries;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HighLowTest {

    private final static List<Candle> candles = Generator.getCandles(20);
    @Test
    public void testHigh(){

        SimpleSeries series = new SimpleSeries(candles);
        High high = new High(series);
        Low low = new Low(series);
        System.out.println(candles.stream().map(e -> e.getHigh()).toList());
        System.out.println("High and Low");
        System.out.println(high.getNextHigh());
        System.out.println("High and Low");
        System.out.println(candles.stream().map(e -> e.getLow()).toList());
        System.out.println(low.getNextLow());
       // System.out.println();
    }


}
