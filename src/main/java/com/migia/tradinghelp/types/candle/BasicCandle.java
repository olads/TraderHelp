package com.migia.tradinghelp.types.candle;

import java.util.Date;

public class BasicCandle implements Candle {

    private double high;
    private double low;
    private double open;
    private double close;
    private double volume;
    private Date time;

    public BasicCandle(double high, double low, double open, double close, double volume, Date date) {
        this.high = high;
        this.low = low;
        this.open = open;
        this.close = close;
        this.volume = volume;
        this.time = date;
    }



    public BasicCandle(){
        this.high = 0;
        this.low = 0;
        this.open = 0;
        this.close = 0;
        this.volume = 0;
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

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
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

    public double getVolume() {
        return volume;
    }


    public String toString(){
       return "High: " + getHigh() + ", Low: " + getLow() + "] ";
    }
}

