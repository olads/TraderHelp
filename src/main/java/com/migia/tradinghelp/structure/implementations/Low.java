package com.migia.tradinghelp.structure.implementations;

import com.migia.tradinghelp.structure.Structure;
import com.migia.tradinghelp.types.candle.Candle;
import com.migia.tradinghelp.types.series.MultivariateSeries;
import com.migia.tradinghelp.types.series.VariableSeries;

import java.util.ArrayList;
import java.util.List;

public class Low implements Structure, MultivariateSeries {
    public MultivariateSeries candles;
    private List<Double> lows;

    public Low(MultivariateSeries candles){

        this.candles = candles;
        this.lows = getLowsFromCandle(candles.getCandles());
    }

    public  List<Double> getNextLow(){
        List<Double> candleList = lows;
        if(candleList.size() == 0)
            return null;
        List<Double> low = new ArrayList<>();
        for (int i = 1; i < candleList.size() -1 ; i++) {
            if(candleList.get(i) < candleList.get(i-1)
                    && candleList.get(i) < candleList.get(i+1)){

                low.add(candleList.get(i));
            }
        }

        return low;
    }

    public List<Candle> getCandles() {
        return null;
    }

    private List<Double> getLowsFromCandle(List<Candle> candles){
        List<Double> lows = (List<Double>) candles.stream().map(e -> {
            return e.getLow();
        }).toList();
        return lows;
    }

    @Override
    public int size() {
        return candles.getCandles().size();
    }


    public boolean checkCondition(VariableSeries series) {
        return false;
    }

    public boolean evaluate() {
        return false;
    }



}
