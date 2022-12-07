package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int sumOfYear = service.sumSales(sales);
        Assertions.assertEquals(expected, sumOfYear);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        double expected = 15;
        double average = service.averageSum(sales);
        Assertions.assertEquals(expected, average);
    }

    @Test
    public void testMonthOfMaxSale() {
        StatsService service = new StatsService();
        int expected = 8;
        int maxMonth = service.maxSales(sales);
        Assertions.assertEquals(expected, maxMonth);
    }

    @Test
    public void testMonthOfMinSale() {
        StatsService service = new StatsService();
        int expected = 9;
        int minMonth = service.minSales(sales);
        Assertions.assertEquals(expected, minMonth);
    }

    @Test
    public void testMinAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int months = service.minOfAverage(sales);
        Assertions.assertEquals(expected, months);
    }

    @Test
    public void testMaxAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int months = service.maxOfAverage(sales);
        Assertions.assertEquals(expected, months);
    }
}
