package com.migia.tradinghelp;

import java.util.List;

public class TrendAnalyzer {

    // Method to check if the prices form a trend line

    public boolean isTrend(List<Double> prices) {
        if (prices == null || prices.size() < 2) {
            return false;
        }

        // Calculate the slope of the trend line
        double slope = calculateSlope(prices);

        // Check if the prices align with the trend line
        for (int i = 0; i < prices.size(); i++) {
            double expectedPrice = prices.get(0) + slope * i;
            if (Math.abs(prices.get(i) - expectedPrice) > getTolerance()) {
                return false;
            }
        }

        return true;
    }

    // Method to extend the trend line and predict future support/resistance
    public double extendTrend(List<Double> prices, int futureIndex) {
        if (prices == null || prices.size() < 2) {
            throw new IllegalArgumentException("Prices list must contain at least two elements.");
        }

        // Calculate the slope of the trend line
        double slope = calculateSlope(prices);

        // Extend the trend line to the future index
        return prices.get(0) + slope * (prices.size() + futureIndex - 1);
    }

    // Helper method to calculate the slope of the trend line
    public double calculateSlope(List<Double> prices) {
        int n = prices.size();
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += i;
            sumY += prices.get(i);
            sumXY += i * prices.get(i);
            sumX2 += i * i;
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        return slope;
    }

    // Helper method to get the tolerance for trend line alignment
    private double getTolerance() {
        return 0.01; // Adjust this value based on your requirements
    }

    public static void main(String[] args) {
        TrendAnalyzer analyzer = new TrendAnalyzer();

        // Example usage
        List<Double> prices = List.of(100.0, 101.0, 102.0, 103.0, 104.0);
        boolean isTrend = analyzer.isTrend(prices);
        System.out.println("Is trend: " + isTrend);

        double futureSupport = analyzer.extendTrend(prices, 2);
        System.out.println("Future support/resistance: " + futureSupport);
    }
}