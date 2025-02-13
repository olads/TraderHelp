package com.migia.tradinghelp.structure.implementations;

import com.migia.tradinghelp.structure.Structure;
import com.migia.tradinghelp.types.series.MultivariateSeries;
import com.migia.tradinghelp.types.series.VariableSeries;

import java.util.ArrayList;

public class Bullish implements Structure {

    MultivariateSeries candles;
    High highs;
    Low lows;
    public Bullish(MultivariateSeries series){
        this.candles = series;
        highs = new High(candles);
        lows = new Low(candles);
    }


    public boolean trendType(){
       var listOfHighs =  highs.getNextHigh();
       var listOfLows = lows.getNextLow();



        for (int i = 0; i < listOfHighs.size() -1; i++) {
            var highLeft = listOfHighs.get(i);
            var highRight = listOfHighs.get(i+1);

            var lowMid = listOfLows.get(i+1);
            var lowLeft = listOfLows.get(i);
            if( highRight > highLeft && lowMid < lowLeft)
                return true;
        }
        return false;
    }

    @Override
    public boolean checkCondition(VariableSeries series) {
        return false;
    }
}
