package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public double averageSum(int[] sales) {
        int sum = sumSales(sales);
        int length = sales.length;
        double average = sum * 1.0 / length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int minOfAverage(int[] sales) {
        double average = averageSum(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale < average) {
                months++;
            }
        }
        return months;
    }

    public int maxOfAverage(int[] sales) {
        double average = averageSum(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale > average) {
                months++;
            }
        }
        return months;
    }
}
