package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long findAvg (long [] sales) {
        return calculateSum(sales)/sales.length;
    }

    public int maxSales(long[] sales) {
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

    public int minSales(long[] sales) {
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

    public int belowAvg(long [] sales) {
        int monthBelow = 0;

        for (long sale : sales) {
            if (sale  < findAvg (sales)) {
            monthBelow++;
        }
        }
return monthBelow;
    }

    public int aboveAvg(long [] sales) {
        int monthAbove = 0;

        for (long sale : sales) {
            if (sale > findAvg(sales)) {
                monthAbove++;
            }
        }
        return monthAbove;


    }
}
