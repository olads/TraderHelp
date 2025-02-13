package com.migia.tradinghelp.types.series;

import com.migia.tradinghelp.types.BasicType;
import com.migia.tradinghelp.types.candle.Candle;

import java.util.List;


public interface VariableSeries extends BasicType {
    
  public boolean evaluate();
    
}
