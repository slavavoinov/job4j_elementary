package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To1Then100() {
        int left = 100;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int left = 1;
        int right = 2;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To1To2Then100() {
        int left = 100;
        int right = 1;
        int third = 2;
        int result = Max.max(left, right, third);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5To5Then5() {
        int left = 5;
        int right = 5;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(left, right, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To1To2To3Then100() {
        int left = 100;
        int right = 1;
        int third = 2;
        int fourth = 3;
        int result = Max.max(left, right, third, fourth);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5To5To5Then5() {
        int left = 5;
        int right = 5;
        int third = 5;
        int fourth = 5;
        int result = Max.max(left, right, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}