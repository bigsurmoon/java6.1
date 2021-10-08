package ru.netology.stats;

public class StatsService {

    public long summary(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {

        long summary = summary(sales);
        long result = summary / sales.length;
        return result;
    }

    public long highestSale(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSale(long[] sales) {

        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) {

        long averageUnder = average(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale < averageUnder) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

    public int aboveAverage(long[] sales) {

        long averageAbove = average(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale > averageAbove) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }
}