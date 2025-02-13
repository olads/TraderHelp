package com.migia.tradinghelp.structure.implementations;

import com.migia.tradinghelp.structure.Structure;
import com.migia.tradinghelp.types.candle.Candle;
import com.migia.tradinghelp.types.series.MultivariateSeries;
import com.migia.tradinghelp.types.series.VariableSeries;

import java.util.ArrayList;
import java.util.List;

public class High implements Structure, MultivariateSeries {
    public MultivariateSeries candles;
    private List<Double> highs;

    public High(MultivariateSeries candles){

        this.candles = candles;
        this.highs = getHighsFromCandle(candles.getCandles());
    }

    public  List<Double> getNextHigh(){
       List<Double> candleList = highs;
        if(candleList.size() == 0)
            return null;
        List<Double> high = new ArrayList<>();
        for (int i = 1; i < candleList.size() -1 ; i++) {
            if(candleList.get(i) > candleList.get(i-1)
                    && candleList.get(i) > candleList.get(i+1)){

                high.add(candleList.get(i));
            }
        }

        return high;
    }

    public List<Candle> getCandles() {
        return null;
    }

    private List<Double> getHighsFromCandle(List<Candle> candles){
        List<Double> highs = (List<Double>) candles.stream().map(e -> {
           return e.getHigh();
        }).toList();
        return highs;
    }

    @Override
    public int size() {
        return candles.getCandles().size();
    }

    private double getHighFromCandle (Candle candle){
        return candle.getHigh();
    }
    public boolean checkCondition(VariableSeries series) {
        return false;
    }

    public boolean evaluate() {
        return false;
    }



}
