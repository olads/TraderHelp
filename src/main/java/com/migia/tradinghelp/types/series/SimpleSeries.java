package com.migia.tradinghelp.types.series;

import com.migia.tradinghelp.types.candle.Candle;

import java.util.List;

public class SimpleSeries implements MultivariateSeries {
    List<Candle> candles;
    public SimpleSeries(List<Candle> candles){
        this.candles = candles;
    }
    @Override
    public List<Candle> getCandles() {
        return candles;
    }

    @Override
    public int size() {
        return candles.size();
    }

    @Override
    public boolean evaluate() {
        return false;
    }
}
