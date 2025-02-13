package com.migia.tradinghelp.types.series;

import com.migia.tradinghelp.types.candle.Candle;

public interface UnivariateSeries extends VariableSeries {

    public Candle getCandle();
}
