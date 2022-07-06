package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to55then7dot07() {
        double expected = 7.07;
        Point a = new Point(0, 0);
        Point b = new Point(5, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to100100then141dot42() {
        double expected = 141.42;
        Point a = new Point(0, 0);
        Point b = new Point(100, 100);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}