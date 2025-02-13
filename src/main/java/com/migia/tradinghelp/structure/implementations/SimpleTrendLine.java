package com.migia.tradinghelp.structure.implementations;

import com.migia.tradinghelp.structure.TrendLine;
import com.migia.tradinghelp.types.series.MultivariateSeries;
import com.migia.tradinghelp.types.series.VariableSeries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleTrendLine implements TrendLine {

    ArrayList<ArrayList<Double>> trends = new ArrayList<>();
    final static double relative = 1.5;

    @Override
    public double isTrend(List<Double> prices) {

        ArrayList<Double> trendline = new ArrayList<>();
        double percent = 0;

        double difference = 0;
        double prevDiff  = 0;

        for (int i = 0; i < prices.size()-1; i++) {
            for (int j = i+1; j < prices.size() ; j++) {
                difference = prices.get(i) - prices.get(j);
                if(percent == 0){
                    percent = (difference - prevDiff) / difference;
                    prevDiff = difference;
                }
                else  if(((difference - prevDiff) / difference) > (percent * 1.)){

                    }


            }
        }
        return 0;
    }



    @Override
    public boolean checkCondition(VariableSeries series) {
        return false;
    }


}
