package com.migia.rest;

import java.time.Instant;
import java.util.Date;

import com.migia.tradinghelp.types.candle.Candle;


public class CandleStick implements Candle {
    private double high;
    private double low;
    private double open;
    private double close;
   
    private long time;

    public CandleStick(double high, double low, double open, double close, long time) {
        this.high = high;
        this.low = low;
        this.open = open;
        this.close = close;
       
        this.time = time;
    }



    public CandleStick(){
        this.high = 0;
        this.low = 0;
        this.open = 0;
        this.close = 0;
        
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public void setClose(double close) {
        this.close = close;
    }



    public Date getDate(){
        return Date.from(Instant.now());
    }
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }



    public double getVolume(){
        return 0;
    }
    public String toString(){
       return "High: " + getHigh() + ", Low: " + getLow() + "] ";
    }
}