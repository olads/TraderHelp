package com.migia.tradinghelp.types.series;

import com.migia.tradinghelp.types.candle.Candle;

import java.util.List;

public interface MultivariateSeries extends VariableSeries {

    public List<Candle> getCandles();

    public int size();
}
