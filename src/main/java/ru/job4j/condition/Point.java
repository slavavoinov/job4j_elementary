package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double deduct1 = (x2 - x1);
        double deduct2 = (y2 - y1);
        double first = Math.pow(deduct1, 2);
        double second = Math.pow(deduct2, 2);
        double sum = first + second;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(0, 0, 5, 5);
        System.out.println("result (0, 0) to (5, 5) " + result1);
    }
}
