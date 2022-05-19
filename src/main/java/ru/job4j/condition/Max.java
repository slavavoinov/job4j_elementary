package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int num = Max.max(1, 2);
        System.out.println(num);
        int num1 = Max.max(100, 1);
        System.out.println(num1);
        int num2 = Max.max(5, 5);
        System.out.println(num2);
    }
}
