package com.migia.tradinghelp.structure;

import java.util.List;

public interface TrendLine extends Structure {

    public double isTrend(List<Double> prices);
}
