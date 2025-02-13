package com.migia.tradinghelp.types.candle;

import com.migia.tradinghelp.types.BasicType;

import java.util.Date;

public interface Candle extends BasicType {

    public static enum CandleTypes{
        DOJI,

    }
    public double getHigh();
    public double getLow();
    public double getOpen();
    public double getClose();
    public double getVolume();
    public Date getTime();






}
