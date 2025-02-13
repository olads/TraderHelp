package com.migia.tradinghelp.validator;

import com.migia.tradinghelp.types.series.VariableSeries;

public interface Evaluatable {

    public boolean checkCondition(VariableSeries series);
}
