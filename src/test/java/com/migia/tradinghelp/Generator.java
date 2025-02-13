package com.migia.tradinghelp;

import com.migia.tradinghelp.types.candle.BasicCandle;
import com.migia.tradinghelp.types.candle.Candle;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;


public class Generator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int length = input.nextInt();

        System.out.println(getCandles(10));

    }

    public static List<Candle> getCandles(int count){
        List<Candle> candles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            candles.add(generateCandle());
        }
        return candles;
    }

    public static Candle generateCandle(){
        Candle candle  = new BasicCandle(getNextDouble(), getNextDouble(),
                getNextDouble(),getNextDouble(),getNextDouble(), new Date());
        return candle;
    }

    public static double getNextDouble() {
        double value = (Math.random() * 1000);
        BigDecimal decimal = BigDecimal.valueOf(value);
        decimal.round(new MathContext(2));
        return decimal.doubleValue();

    }

}
